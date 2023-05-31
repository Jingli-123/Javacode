//import java.util.*;
//import java.util.Arrays;
public class Rabbitproblem {
    public static void main(String[] agrs){
        int n = 10;
        int i = 0;
        int a = 0;
        int b = 1;
        int c;
        while (i <= n) {
            c = a + b;
            a = b;
            b = c;
            i++;
            System.out.println("The month "+(i+1)+" has "+c+" pair of rabbits.");
        }
       }
       
    }
    

