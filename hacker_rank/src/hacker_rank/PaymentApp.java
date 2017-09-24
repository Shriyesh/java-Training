package hacker_rank;

import java.util.Scanner;

public class PaymentApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("Enter the payment ");
Scanner scan= new Scanner(System.in);
int amount=scan.nextInt();
try{
	if(amount<0)
{
	throw new NegativePaymentException();
}

}
catch (NegativePaymentException e) {
	// TODO: handle exception
	System.out.println(e.toString());
}
	}

}
