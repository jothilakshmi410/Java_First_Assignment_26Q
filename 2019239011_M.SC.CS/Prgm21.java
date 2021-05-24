import java.util.*;
public class Prgm21
{
public static void main(String[] args)
{
Scanner s=new Scanner(System.in);
int large=0,n=1;
while (n!=0)
	{   
		System.out.println("Enter 1 to continue and 0 to exit");
		int temp=s.nextInt();
		n=temp;
		switch(temp)
		{
			case 1:
			     System.out.println("Enter an integer number : ");
                 int num=s.nextInt();
				 if (num>large)
					large=num;
				 break;
			case 0:
				break;
		}
    }
System.out.println("the largest of all numbers enterd is : " +large);
}
}



