/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg18.pkg01.pkg19;

import java.util.Scanner;

/**
 *
 * @author my pc
 */
public class Substring {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int i,j,c=0,l,d=0;
        String s;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter string");
        s = in.next();
        l= s.length();
       for(i=0;i<s.length();i++)
       {
           for(j=i+1;j<s.length();j++)
           {
               if(s.charAt(i) == s.charAt(j))
               {
                   c = c+1;
                   //System.out.println(c);
               }
           }
           if(c>0)
           {
               d = d+1;
           }
           c=0;
       }
        System.out.println(d);
        
    }
    
}
