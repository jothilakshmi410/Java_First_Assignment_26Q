import java.util.Scanner;
public class A_D_W
{
    public static void main(String[] args) 
{
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any caracter : ");
        char ch = scanner.next().charAt(0);
        if((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) 
{
             System.out.println(ch + " This is an alphabet.");
        } 
else if(ch >= '0' && ch <= '9') 
{
             System.out.println(ch + " This is a digit.");
        } 
else 
{
             System.out.println(ch + " This is a whitespace.");
        }
    
    }
}