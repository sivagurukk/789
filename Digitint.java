
package digitint;

import java.util.Scanner;


public class Digitint {

    
    public static void main(String[] args) {
        int a,digit;
        a=digit=0;
        Scanner s= new Scanner(System.in);
        System.out.println("Enter the number");
        int n=s.nextInt();
        while(n>0)
        {
            a=n%10;
            digit++;
            n=n/10;
        }
        System.out.println("\n the number of digits in the integer is" +digit);
        
    }
        
        
        
        
        
        
        
        
        
        
        
    }
    
}
