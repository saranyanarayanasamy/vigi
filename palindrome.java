import java.io.*;
import java.util.*;
public class palindrome
{
static public void main(String args[])
{
Scanner scan=new Scanner(System.in);
int s=scan.nextInt();
int a;
int c=0;
int b=s;
while(b>0)
{
a=b%10;
c=c*10+a;
b=b/10;
}
if(s==c)
{
System.out.print("The given number is Palindrome");
}
else
{
System.out.print("The given number is not a Palindrome");
}
}
}
