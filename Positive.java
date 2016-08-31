/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package positive;

import java.util.Scanner;

/**
 *
 * @author sindhuraja
 */
public class Positive {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic hereimport java.i

Scanner s=new Scanner(System.in);
System.out.println("Enter number");
int n=s.nextInt();
if(n>0)
{
System.out.println(n+"is positive number");
}
else
{
System.out.println(n+"is negative number");

    }
    
}
}