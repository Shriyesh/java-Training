package hacker_rank;

import java.util.Scanner;

public class Exception1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan= new Scanner(System.in);
		int num1=scan.nextInt();
		int num2=scan.nextInt();
		doMath(num1, num2);
		
		

	}

	public static void doMath(int a, int b)
	{
		try {
			int c=a/b;
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Divisor must be a positive no");
			e.printStackTrace();
		
			
		}
		finally {
			System.out.println("This a finally block");
		}
		
	}
	
}
