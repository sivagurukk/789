
package natural;

import java.util.Scanner;


public class Natural {

   
    public static void main(String[] args) {
        int i,sum=0;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter number");
        int n=s.nextInt();
        for(i=0;i<n;i++)
        {
            sum+=i;
            System.out.println(sum);
        }
        
    }
    
}
