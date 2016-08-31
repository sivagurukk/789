/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package odd;

import java.util.Scanner;

/**
 *
 * @author sindhuraja
 */
public class Odd {

   
     
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter number");
       int n=s.nextInt();
       if( n%2==0)
       {
           System.out.println(n+"is even number");
       }
       else
       {
           System.out.println(n+":is odd number");
       }
       }
    }
    

