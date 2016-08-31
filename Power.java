package power;

import java.util.Scanner;
public class Power {


    public static void main(String[] args) {
    
        
        Scanner s=new Scanner(System.in);
        System.out.println("Enter n vallue");
        int n=s.nextInt();
        System.out.println("Enter m value");
        int m=s.nextInt();
        double d=Math.pow(n,m);
        System.out.println("power is"+d);
         
        
   }

   

    
}
