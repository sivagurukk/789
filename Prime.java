 
package prime;

import java.util.Scanner;

 
public class Prime {

     
    public static void main(String[] args) { 
        int i;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the number");
        int n=s.nextInt();
        for(i=2;i<=n/2;i++)
        {
            if(n%i!=0)
            continue;
            else
                break;
        }
        if(n/2+1==i)
            System.out.println("The given number is prime number");
        else
            System.out.println("The given number is not a prime number");
        
            
                
            
                
        }
        
        
    }
    

