package ControlStatementsPrograms;

public class LargerThreeNum {
	public static void main(String[] args) {
		int a = 10 , b = 20 , c = 30 ;
		
		if (a > b && a > c) 
		{
			System.out.println("A Greater Then");
		}
		else if (b > a && b > c)
		{
			System.out.println("B Greater Then");
		}
		else 
		{
			System.out.println("C Greater Then");
		}
	}
}
