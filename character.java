import java.io.*;
import java.util.*;
public class character
{
static public void main(String args[])
{
Scanner scan=new Scanner(System.in);
String s=scan.nextLine();
  String b=s.replaceAll(" ","");
char c[]=b.toCharArray();
int count=0;
int len=c.length;
for(int i=0;i<len;i++)
{
count=count+1;
}
System.out.print(count);
}
}
