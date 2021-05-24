import java.util.*;
public class Prgm10
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter your Grade::");
char ch=sc.next().charAt(0);
if (ch =='O')
	System.out.println("Outstanding");
else if (ch =='A')
	System.out.println("Very Good");
 else if (ch =='B')
	System.out.println("Good");
else if (ch =='C')
	System.out.println("Average");
else
	System.out.println("Fail");
}
}
