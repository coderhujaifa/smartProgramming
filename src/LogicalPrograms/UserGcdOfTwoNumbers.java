package LogicalPrograms;

import java.util.Scanner;

public class UserGcdOfTwoNumbers
{
    public static void main(String[] args)
    {
        Scanner Scanner = new Scanner(System.in);

        System.out.print("Enter no1: ");
        int no1 = Scanner.nextInt();

        System.out.print("Enter no2: ");
        int no2 = Scanner.nextInt();

        int gcd = 1;

        for (int i = 1; i <= no1 && i <= no2; i++)
        {
            if (no1 % i == 0 && no2 % i == 0)
            {
                gcd = i;
            }
        }

        System.out.println("GCD: " + gcd);
    }
}