import java.io.*;
import java.util.*;
public class repeat
{
static public void main(String args[])
{
Scanner scan=new Scanner(System.in);
String s=scan.nextLine();
int len=s.length();
int r[]=new int[len];
for(int i=0;i<len;i++)
{
r[i]=scan.nextInt();
if(r[i]==r[i+1])
{
System.out.println(r[i]);
}
else
{
break;
}
}
}
}
