import java.util.Scanner;
import java.lang.Math;
public class Prgm26
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the value of x: ");
        int xdeg = input.nextInt();
        double xrad = xdeg * (Math.PI / 180);
        System.out.print("Enter the number of terms: ");
        int n = input.nextInt();
        double SineSum = 0;
        int j = 1;
        for(int i =1;i<=n;i++)
        {
			SineSum = SineSum + (Math.pow(xrad,j) / fact(j) * Math.pow(-1,i+1));
			j=j+2;
		}
		System.out.println("Sin value:" + SineSum);
		double CosSum = 1;
		j = 2;
		for(int i =2;i<=n;i++)
		{
			CosSum = CosSum + (Math.pow(xrad,j) / fact(j)) * Math.pow(-1,i+1);
			j=j+2;
		}
		System.out.println("Cos value:" +CosSum);
		double tan = SineSum / CosSum;
		System.out.println("Tan value:" + tan);
		input.close();
	}
	 static int fact(int num)
	{
		if( num == 0 || num == 1)
		{
			return 1;
		}
		else
		{
			return num * fact(num-1);
		}
	}
}





