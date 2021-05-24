public class Prgm20
{
public static void main(String[] args)
{
int num=333;
int r,n=0;
while (num!=0)
 {
	r=num%10;
	n++;
	num=num/10;
 }
System.out.println("The number of digits in the given number is ::"+n);
}
}