import java.util.*;
public class Prgm24
{
public static void main(String[] args)
{
Scanner s=new Scanner(System.in);
System.out.println("Enter the number of terms in series : ");
int n=s.nextInt();
int sum=0;
for (int i=1; i<=n; i++)
{
	for (int j=1; j<=i; j++)
		sum=sum+j;
}
System.out.println(sum);
}
}
	