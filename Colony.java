public class Colony {
    public static void main(String[] agrs){
        int counter = 0;
        int a = 0;
        int b = 1;
        int c = 0;
        while (c <= 5000000) {
            c = a + b;
            a = b;
            b = c;
            counter++;
            
        }
        System.out.println("It takes " + counter + "months to reach the rabbit population of 5000000.");
       }
}
