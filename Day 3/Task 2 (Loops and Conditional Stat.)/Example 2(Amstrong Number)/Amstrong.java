import java.util.*;
class Amstrong
{
public static int P(int a,int b)
{
int i=0,s=1;
for (i=0;i<a;i++)
{
s=s*b;
}
return s;
}
public static void main(String args[])
{
int i=0,j=0,y;
Scanner sc= new Scanner(System.in);
System.out.println("Enter your number");
int n=sc.nextInt();
int p=n;
while(n!=0)
{
n=n/10;
i=i+1;
}
int m=0;
n=p;
while (j<i)
{
    y=p%10;
    m=m+(P(j,10)*y);
    System.out.println("m:"+m); 
    p=p/10;
    j=j+1;
}
if(m==n)
{
System.out.println("Amstrong Number");
}
else
{
System.out.println("Not an Amstrong Number");
}
}
}