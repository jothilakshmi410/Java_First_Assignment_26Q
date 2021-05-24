import java.util.*;
public class Prgm11
{
public static void main(String[] args)
{
Scanner s=new Scanner(System.in);
System.out.println("Rent of new videos per day = Rs. 75 \nRent of old movies per day = Rs. 50");
System.out.println("Enter the number of new videos :: ");
int new_videos =s.nextInt();
System.out.println("Enter the number of old movies :: ");
int old_movies =s.nextInt();
float Amount = (new_videos*75) + (old_movies*50);
System.out.println("Amount is : "+Amount);
}
}