/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg18.pkg01.pkg19;

/**
 *
 * @author my pc
 */
import java.util.*;
public class sa{
    Scanner in=new Scanner(System.in);
void d()
{
int n,i=0,j,sum=0;
int b[]=new int[10];
int a[]=new int[]{1,2,4,8,16,32,64,128};
int c[]=new int[10];

System.out.println("Enter the number");
 n=in.nextInt();
while(n!=1)
{
  b[i]=n%2;
  n=n/2;
  i++;
}
b[i]=1;
i++;
for(j=i;j<8;j++)
b[j]=0;

/*for(i=0;i<8;i++)
printf("%d",b[i]);
printf("\n");
*/
i=0;
for(j=1;j<8;)
{
c[i]=b[j];
i++;
c[i]=b[j-1];
i++;
j=j+2;
}
/*for(i=0;i<8;i++)
printf("%d",c[i]);*/
for(i=7;i>=0;i--)
if(c[i]==1)
sum=sum+a[i];
System.out.println(sum);
}
}
class bit{
    public static void main(String args[]){
        sa da=new sa();
        da.d();
    }
}
