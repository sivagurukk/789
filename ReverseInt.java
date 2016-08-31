 
package reverseint;

import java.util.Scanner;

 
public class ReverseInt {

    
    public static void main(String[] args) {
        int a;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the  number");
int n=s.nextInt();
        while(n>0)
        {
            a=n%10;
            System.out.println(a);
            n=n/10;
            
        }
        
        
        
    }
    
}
