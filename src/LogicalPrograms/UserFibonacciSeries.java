package LogicalPrograms;

import java.util.Scanner;

public class UserFibonacciSeries
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of terms: ");
        int n = sc.nextInt();

        int no1 = 0, no2 = 1;

        if (n >= 1)
            System.out.print("Fibonacci Series: " + no1);

        if (n >= 2)
            System.out.print(", " + no2);

        for (int i = 2; i < n; i++)
        {
            int sum = no1 + no2;
            System.out.print(", " + sum);
            no1 = no2;
            no2 = sum;
        }

        sc.close();
    }
}
