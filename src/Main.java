import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Create a program that reads in a dollar amount for the cost of an item
		 * Read in a second amount for how much was paid
		 * Print out how to break it into change
		 * How many 100s,50s,20s,10s,5s,2s,1s,0.25s,0.10s,0.05s.
		 * If it does not end in a 5 or 0, you must round the number appropriately.
		 * If the payment doesn't cover the cost, output the amount still owing.
		 */
		Scanner in=new Scanner(System.in);
		System.out.println("How much is the cost?");
		double cost=in.nextDouble();
		System.out.println("How much was paid?");
		double payment=in.nextDouble();
		//TODO: Here is where your code goes
		double change=payment-cost;
		int num100s;
		int num50s;
		int num20s;
		int num10s;
		//How many 100 dollar bills?
		System.out.println("Your change is "+change);
		num100s=(int)(change/100);
		//Fund out how much money is left
		change=change%100;
		//How many 50 dollar bills?
		System.out.println("100s = "+num100s);
		num100s=(int)(change/50);
		//Fund out how much money is left
		change=change%50;
		//How many 20 dollar bills?
		System.out.println("$50s= "+num100s);
		//Fund out how much money is left
		change=change%20;
		//How many 10 dollar bills?
		System.out.println("$20= "+num100s);
		num100s=(int)(change/10);
		//Fund out how much money is left
		change=change%10;
		//How many 5 dollar bills?
		System.out.println("$10= "+num100s);
		num100s=(int)(change/5);
		//Fund out how much money is left
		change=change%5;
		//How many 2 dollar bills?
		System.out.println("$5= "+num100s);
		num100s=(int)(change/2);
		//Fund out how much money is left
		change=change%2;
		//How many 1 dollar bills?
		System.out.println("$2= "+num100s);
		num100s=(int)(change/1);
		//Fund out how much money is left
		change=change%1;
		//How many 0.25 dollar bills?
		System.out.println("$1= "+num100s);
		num100s=(int)(change/.25);
		//Fund out how much money is left
		change=change%.25;
		//How many 0.10 dollar bills?
		System.out.println("$0.25= "+num100s);
		num100s=(int)(change/.10);
		//Fund out how much money is left
		change=change%.1;
		//How many 0.05 dollar bills?
		System.out.println("$0.10 "+num100s);
		num100s=(int)(change/0.05);
		//Fund out how much money is left
		change=change%0.05;
		System.out.println("$0.05 "+num100s);		
		
		
	}
}