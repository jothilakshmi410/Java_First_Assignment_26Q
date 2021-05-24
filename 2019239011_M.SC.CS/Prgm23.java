import java.util.*;
import java.lang.Math;
public class Prgm23
{
public static void main(String[] args)
{
Scanner s=new Scanner(System.in);
System.out.println("Enter the no of terms in series :: ");
int num=s.nextInt();
System.out.println("Enter the value of x::");
int x=s.nextInt();
double sum=0;
for (int i=1; i<=num;i++)
{
	if ( i%2!=0)
		sum=sum+Math.pow(-x,i);
	else 
		sum=sum+Math.pow(x,i);
}
System.out.println("The sum of the series is :: " + sum);
}
}