/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg18.pkg01.pkg19;

import static java.lang.Math.pow;
import java.math.BigInteger;
import java.util.Scanner;

/**
 *
 * @author my pc
 */
public class fact {
    public static void main(String args[]) throws java.lang.Exception
    {
        int a,i;
        BigInteger fact = BigInteger.ONE;
        BigInteger d = BigInteger.ONE;
          BigInteger b = BigInteger.ONE;
        Scanner in = new Scanner(System.in);
        a = in.nextInt();
        b = in.nextBigInteger();
        for(i=2;i<=a;i++)
        {
            fact = fact.multiply(new BigInteger(String.valueOf(i)));
        }
        //System.out.println(fact);
       //i = (int) Math.pow(2, 10);
       for(i=2;;i++)
       {
           d = b.pow(i);
           
           if(fact.compareTo(d) == 0)
           {
             
           }
           else if(fact.compareTo(d) == -1)
           {
               //System.out.println(d);
                System.out.println(i);
              
               break; 
               
              
           }else if(fact.compareTo(d) == 1){
               
           }
       }
       
     
    }

   
}
