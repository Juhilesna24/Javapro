
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author my pc
 */
public class recur {
    
  
    public static void main(String args[])
    {
        int a,res,d;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter num");
        a = in.nextInt();
        
        System.out.println(num(a));
       
        
    }
   static int num(int n){
      int sum = n;
       System.out.println(n);
     if(sum > 0 )
     {
          return num(n-5);
          
     }else
        return n+5;
  
     
       
   }
   
   
}
     
        
    

