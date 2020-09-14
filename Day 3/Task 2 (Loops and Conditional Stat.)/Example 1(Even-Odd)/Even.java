import java.util.*;
public class Even
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter Your Number");
int s=sc.nextInt();
int i=0;
for(i=0;i<=s;i++)
{
if (i%2==0)
{
System.out.println(i);
}
}
}
}
