import java.util.*;
import java.io.*;
public class Palindrome
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
Stack st=new Stack();
System.out.println("Enter a string");
String str=s.nextLine();
int n=str.length;
for(int i=n;i>0;i--)
{
st.push(str.charAt(i));
}
if(str.equals(st))
{
System.out.println("Palindrome");
}
else
{
System.out.println(" not a Palindrome");
}
}
}
