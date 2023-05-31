public class Balance {
    public static void main(String[] args) {
        double balance = 25000;
        double year_rate = 0.04;
        int i;
        for (i = 0; i < 11; i++) {
            balance = balance * (1 + year_rate);
            System.out.println("The year " + i + " will be " + balance + ".");
        }   
    }
}