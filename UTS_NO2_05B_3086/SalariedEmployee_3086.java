package UTS_NO2_05B_3086;

public class SalariedEmployee_3086 extends Employee_3086 {
    protected String nama_3086;
    protected String nip_3086;
    protected float GajiPokok_3086;
    public SalariedEmployee_3086(){
        
    }
    
    public void TampilData(){
        System.out.println("Salaried Employee");
        Tampil();
        System.out.println("Total Gaji: " + GajiPokok_3086);
    }
}
