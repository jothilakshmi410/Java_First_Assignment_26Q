public class Odd_num_sum
{
public static void main(String args[]) 
{
int i, sum = 0;
for(i = 0; i <= 100; i++)
{
if((i%2) == 1)
{
 sum += i;
}
}
System.out.print("Sum of all odd numbers from 1 to 100" +sum);
}
}