import java.io.*;
import java.util.*;
public class prime
{
static public void main(String args[])
{
Scanner scan=new Scanner(System.in);
int a=scan.nextInt();
int flag=0;
for(int i=0;i<n/2;i++)
{
if(a%2==0)
{
flag=1;
break;
}
}
if(flag==0)
{
System.out.print("the given number is a prime number");
}
else
{
System.out.print("the given number is not a prime number");
}
}
}
