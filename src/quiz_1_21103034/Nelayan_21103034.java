package quiz_1_21103034;

public class Nelayan_21103034 extends Penduduk_21103034 {

    int jmlBeratIkan;
    int jmlSolar;
    double totalPendapatNelayan;

    public double totalPendapatNelayan() {
        return totalPendapatNelayan = (jmlBeratIkan * 8.000) + (jmlSolar + 10.000);
    }
    
    public void DataNelayan(){
        System.out.println("Jumlah Berat Ikan : " + jmlBeratIkan);
        System.out.println("Jumlah Pakai Solar : " + jmlSolar);
    }
}
