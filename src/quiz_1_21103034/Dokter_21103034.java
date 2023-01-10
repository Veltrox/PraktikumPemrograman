
package quiz_1_21103034;

public class Dokter_21103034 extends Penduduk_21103034 {
    int jmlPasien;
    int jmlObat;
    double totalPendapatanDokter;
    
    public void DataDokter(){
        System.out.println("Jumlah Pasien : " + jmlPasien);
        System.out.println("Jumlah Obat : " + jmlObat);
    }
    
    public double totalPendapatanDokter (){
        return totalPendapatanDokter = (jmlPasien * 50.000) + (jmlObat * 10.000);
    }
}
