package com.Satria.Pemrograman2.Pertemuan7;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Enumeration;

public class Registration extends JFrame {
    private JTextField namaTextField;
    private JPasswordField traxxis89PasswordField;
    private JRadioButton lakiLakiRadioButton;
    private JRadioButton perempuanRadioButton;
    private JComboBox comboBox1;
    private JCheckBox bahasaIndonesiaCheckBox;
    private JCheckBox lainnyaCheckBox;
    private JTextField textField1;
    private JTextArea textArea1;
    private JSlider slider1;
    private JTextField textField2;
    private JSpinner spinner1;
    private JComboBox comboBox2;
    private JSpinner spinner2;
    private JButton submitButton;
    private JCheckBox bahasaInggrisCheckBox;
    private JLabel jabatanLabel;
    private JCheckBox bahasaMandarinCheckBox;
    private JLabel skillLabel;
    private JLabel bahasaLabel;
    private JLabel namaLengkapLabel;
    private JLabel alamatLabel;
    private JLabel jenisKelaminLabel;
    private JLabel passwordLabel;
    private JLabel TTLLabel;

    private JPanel mainPanel;
    private ButtonGroup jenisKelaminGroup;

    public Registration() {
        super("Registration");

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setContentPane(mainPanel);
        this.setSize(800, 500);
        submitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //Mengambil nilai dari textfield
                String namaLengkap = namaTextField.getText();

                //Mengambil nilai dari Radio Button
                String jenisKelamin = "";
                Enumeration<AbstractButton> buttons = jenisKelaminGroup.getElements();

                for (int i = 0; i < jenisKelaminGroup.getButtonCount(); i++) {
                    AbstractButton button = buttons.nextElement();
                    if (button.isSelected()) {
                        jenisKelamin = button.getText();
                    }
                }

                //Mengambil nilai dari checkbox
                boolean isBahasaIndonesia = bahasaIndonesiaCheckBox.isSelected();

                //Mengambil nilai dari Combo Box / Dropdown
                String jabatan = (String) comboBox1.getSelectedItem();

                //Mengambil nilai dari spinner
                int tahunLahir = (int) spinner1.getValue();

                //Mengatur nilai min dan max dari slider (default: min 0, max 100)
                slider1.setMinimum(50);
                slider1.setMaximum(100);

                //Menampilkan Pesan
                JOptionPane.showMessageDialog(null, " Data" + jenisKelamin + "Tersimpan ");
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new Registration();
        frame.setVisible(true);
    }
}
