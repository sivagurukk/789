 package armstrong;

import java.util.Scanner;

public class Armstrong {

    public static void main(String[] args) {
        int temp=0,m,b;
        Scanner s=new Scanner(System.in);      
       System.out.println("Enter n value");
       int n=s.nextInt();
       b=n;
       while(n!=0)
       {
           m=n%10;
           temp+=m*m*m;
           n=n/10;
       }
       if(temp==b)
        System.out.println("Armstrong number ");
       else
       {
            System.out.println(" The number is not Armstrong number ");
       }
        

    }
    
}
