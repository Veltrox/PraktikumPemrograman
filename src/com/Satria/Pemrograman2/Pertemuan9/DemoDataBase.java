package com.Satria.Pemrograman2.Pertemuan9;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;

public class DemoDataBase extends JFrame {
    private JTabbedPane PilihTab;
    private JPanel mainpanel;
    private JPanel addDataTab;
    private JPanel seeDataTab;
    private JLabel labelNim;
    private JLabel labelNilai;
    private JLabel labelNama;
    private JTextField namafield;
    private JTextField nimfield;
    private JButton submitButton;
    private JScrollPane scrollseedata;
    private JTable tabelsee;
    private JButton editdata;
    private JButton clearbutton;
    private JButton DeleteData;
    private JButton clearaddButton;
    private JSpinner spinnernilai;

    private DefaultTableModel model;

    // Komponen2 GUI
    private static Connection c;
    private static Statement s;
    private static ResultSet rs;

    // Komponen2
    public DemoDataBase() {
        super("Demo Database");

        this.setContentPane(mainpanel);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setSize(400, 400);

        //Sumbit Botton Costum
        submitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nama = namafield.getText();
                String nim = nimfield.getText();
                int nilai = (int) spinnernilai.getValue();
                if (nama.equals("") || nim.equals("")) {
                    JOptionPane.showMessageDialog(null, "Data Tidak Boleh Kosong");
                } else {
                    try {
                        //Buka akses database
                        openDB();

                        //Query  INSERT untuk menambahkan data ke database
                        s.executeUpdate("INSERT INTO mahasiswa VALUES ('" + nama + "', '" + nim + "', '" + nilai + "')");

                        //Untuk tabahan data ke aplikasi
                        Object[] row = {nama, nim, nilai};
                        model.addRow(row);

                        //Tampilan peringatan penambahan data berhasil
                        JOptionPane.showMessageDialog(null, "Data Berhasil Ditambahkan");
                    } catch (SQLException | ClassNotFoundException ex) {
                        ex.printStackTrace();

                    } finally {
                        //Menutup akses database
                        closeDB();
                    }
                }
            }
        });
        clearbutton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                model.setRowCount(0);
                JOptionPane.showMessageDialog(null, "Data Berhasil Dihapus");
            }
        });
        editdata.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int row = tabelsee.getSelectedRow();
                String nama = tabelsee.getValueAt(row, 0).toString();
                String nim = tabelsee.getValueAt(row, 1).toString();
                int nilai = Integer.parseInt(tabelsee.getValueAt(row, 2).toString());

                try {
                    openDB();
                    s.executeUpdate("UPDATE mahasiswa SET nama = '" + nama + "', nim = '" + nim + "', nilai = '" + nilai + "' WHERE nim = '" + nim + "'");

                    JOptionPane.showMessageDialog(null, "Data Berhasil Diubah");
                } catch (SQLException | ClassNotFoundException ex) {
                    ex.printStackTrace();
                    JOptionPane.showMessageDialog(null, ex.getLocalizedMessage());
                }finally {
                    closeDB();
                }
            }
        });
        DeleteData.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int row = tabelsee.getSelectedRow();
                String nama = tabelsee.getValueAt(row, 0).toString();

                try {
                    openDB();
                    s.executeUpdate("DELETE FROM mahasiswa WHERE nama = '" + nama + "'");

                    model.removeRow(row);
                    JOptionPane.showMessageDialog(null, "Data Berhasil Dihapus");
                } catch (SQLException | ClassNotFoundException ex) {
                    ex.printStackTrace();
                    JOptionPane.showMessageDialog(null, ex.getLocalizedMessage());
                }finally {
                closeDB();
            }
            }
        });
        clearaddButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                namafield.setText("");
                nimfield.setText("");
                spinnernilai.setValue(0);
                JOptionPane.showMessageDialog(null, "Data Berhasil Dihapus");
            }
        });
    }

    //Untuk Listener
    public static void main(String[] args) {
        JFrame mainFrame = new DemoDataBase();
        mainFrame.setVisible(true);
    }

    /**
     * Method untuk mengambil akses dari database
     */
    private static void openDB() throws ClassNotFoundException, SQLException {
        String URL = "jdbc:mysql://localhost:3306/dbdemo";
        String Username = "root";
        String Password = "";

        Class.forName("com.mysql.cj.jdbc.Driver");
        c = DriverManager.getConnection(URL, Username, Password);
        s = c.createStatement();

    }

    /**
     * Method untuk menutup akses dari database
     */
    private static void closeDB() {
        try {
            rs.close();
            s.close();
            c.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private void createUIComponents() {
        //Ngatur Model Tabel
        model = new DefaultTableModel();
        tabelsee = new JTable(model);

        //Atur Kolom
        model.addColumn("Nama");
        model.addColumn("NIM");
        model.addColumn("Nilai");

        //Ambil nilai untuk dimasukkan ke dalam tabel saat program pertama kali dijalankan
        try {

            //Buka koneksi ke database
            openDB();

            //Querry ambil data dari database
            rs = s.executeQuery("SELECT * FROM mahasiswa");

            //Jabarkan data yang diperoleh dari querry masuk ke dalam tabel app
            while (rs.next()) {
                Object[] row = {
                        rs.getString("nama"),
                        rs.getString("nim"),
                        rs.getInt("nilai")
                };
                //Tabel yang ada didalam aplikasi
                model.addRow(row);
            }

            //Menjaga ketika ada error
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();

            //Tutup Database ketika proses selesai
        } finally {
            closeDB();
        }
    }
}

