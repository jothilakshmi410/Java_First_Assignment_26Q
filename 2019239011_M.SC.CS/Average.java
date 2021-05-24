import java.util.Scanner;

public class Average
{
public static void main(String[] args) 
{
Scanner in = new Scanner(System.in);
int x, y, i;
float avg = 0;
System.out.println ("Enter the number of elements to calculate average::\n");

 x = in.nextInt();
 System.out.println ("\n\nEnter " + x + " elements one by one\n");
 for(i = 0; i < x; i++) 
{
 y = in.nextInt();
 avg += y;
}
 avg /= x;
 System.out.println ("\nThe average of the entered input numbers is = " + avg);
}
}