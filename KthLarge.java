import java.util.*;
import java.util.Collections;
import java.io.*;
public class KthLarge
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
int a[]=new int[10];
int n,k,i;
System.out.println("Enter the number of values");
n=s.nextInt();
System.out.println("Enter the k th value");
k=s.nextInt();
System.out.println("Enter the values");
for(i=0;i<n;i++)
{
a[i]=s.nextInt();
}
Arrays.sort(a,Collections.reverseOrder());
System.out.println(a[k-1]);
}
}
