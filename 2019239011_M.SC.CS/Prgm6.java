import java.util.*;
public class Prgm6
{
public static void main(String[] args)
{
Scanner s=new Scanner(System.in);
System.out.println("Enter a number between 1 to 12 : ");
int a=s.nextInt();
switch (a)
{
	case 1:
	case 8:
	     System.out.println("It is MONDAY");
		 break;
	case 2:
	case 9:
	     System.out.println("It is TUESDAY");
		 break;
	case 3:
	case 10:
		 System.out.println("It is WEDNESDAY");
		 break;
	case 4:
	case 11:
		 System.out.println("It is THURSDAY");
		 break;
	case 5:
	case 12:
		 System.out.println("It is FRIDAY");
		 break;
	case 6:
		 System.out.println("It is SATURDAY");
		 break;
	case 7:
		 System.out.println("It is SUNDAY");
		 break;
	default:
		 System.out.println("wrong input!!! Enter a number between 1 to 12");	
}
}
}