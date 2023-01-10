package UTS_NO2_05B_3086;

public class CommissionEmployee_3086 extends Employee_3086 {
    public float komisi_3086;
    public float TotalPenjualan_3086;
    public float TotalGaji_3086;
    
    public CommissionEmployee_3086(){
        
    }
    
    public float TotalGaji(){
        TotalGaji_3086 = GajiPokok_3086 + (komisi_3086 * TotalPenjualan_3086);
        return TotalGaji_3086;
    }
    
    public void TampilData(){
        System.out.println("Commission Employee");
        Tampil();
        System.out.println("Total Gaji: " + TotalGaji_3086);
    }
}
