public class Prgm1
{
public static void main(String[] args)
{
int num=-3;
if (num<0)
 { 
   System.out.println(num +" is negative." +"\nThe new number is :");
   while (num<0)
   {
	   System.out.println(num);
	   num=num+1;
   }
 }
else if (num>0)
 {
	 System.out.println(num +" The num is positive");
 }
else 
	System.out.println(num +" The num is neither positive nor negative");
}
}
