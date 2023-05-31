import java.util.ArrayList;

public class DataAnalysis {    
    private ArrayList<Double> data_set;
    private double sum;
    public DataAnalysis(ArrayList<Double> data_set){
        this.data_set = data_set;
        setSum(sum);
    }
    public DataAnalysis(double sum, ArrayList<Double> data_set){
        this.data_set = data_set;
        setSum(sum);
    }

    public void setData_set(ArrayList<Double> data_set) {
        this.data_set = data_set;
    }
    public void setSum(double sum) {
        for (int i = 0; i < data_set.size(); i++){
            sum += data_set.get(i);
        }
        
    }
    
    public ArrayList<Double> getData_set(ArrayList<Double> data_set) {
        return data_set;
    }
    public double getSum() {
        
        return sum;
    }
   
   
    
    public double calculateSD(ArrayList<Double> dataset){
        return Math.pow((sum-(sum / data_set.size())), 2)/data_set.size();
    }
    /* 
    public void setAvarage(double avarage) {
        this.avarage = avarage;
    }
    public void setStandardDeviation(double standardDeviation) {
        StandardDeviation = standardDeviation;
    }
    public void setSum(double sum) {
        this.sum = sum;
    }
    public void setSdSum(double sdSum) {
        this.sdSum = sdSum;
    }
    public void setData_set(ArrayList<Double> data_set) {
        this.data_set = data_set;
    }
    public double getAvarage() {
        avarage = sum/data_set.size();
        return avarage;
    }
    public double getStandardDeviation() {
        
        StandardDeviation = sdSum / data_set.size();
        
        return StandardDeviation;
    }
    public double getSum() {
        for (int i = 0; i < data_set.size(); i++){
            sum += data_set.get(i);
        }
        return sum;
    }
    public double getSdSum() {
        for (int i = 0; i < data_set.size(); i++){
            sdSum += Math.pow((data_set.get(i)-avarage), 2);
            
        }
        return sdSum;
    }
    public ArrayList<Double> getData_set() {
        return data_set;
    }*/
}
