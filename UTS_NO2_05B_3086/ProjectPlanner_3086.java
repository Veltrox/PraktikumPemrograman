package UTS_NO2_05B_3086;

public class ProjectPlanner_3086 extends Employee_3086 {
    public float komisi_3086;
    public float TotalHslProyek_3086;
    public double TotalGaji_3086;
    
    public ProjectPlanner_3086(){
        
    }
            
    public double TotalGaji(){
        TotalGaji_3086 = GajiPokok_3086 + (komisi_3086 * TotalHslProyek_3086) - (GajiPokok_3086*5/100);
        return TotalGaji_3086;
    }
    
    public void TampilData(){
        System.out.println("Project Plannner");
        Tampil();
        System.out.println("Total Gaji: " + TotalGaji_3086);
    } 
}
