import java.util.*;
public class Homework4{
	public static void main(String[] args) {
		System.out.println("This program asks for your monthly income and\nexpenses, then tells you your net monthly income.")
		Scanner console = new Scanner(System.in);
		part1(console);
		part2(console);
		part3(console);
		part4(console,sum1,sum2,time);
		part5(console,sum1,sum2);
	}

	public static void part1(Scanner console){
		System.out.print("How many categories of income?");
		int q1 = console.nextInt();

		for(int(i)=1;i<=q1;i++){
			System.out.print("    Next income amount?$");
			count1=count1+console.nextInt();
		}
		sum1=count1;
	}

	public static void part2(Scanner console){
		System.out.print("Enter 1) monthly or 2) daily expenses? ");
		int q2 = console.nextInt();
		if (q2 == 1){
			time = 12;
		}
		else{
			time = 31;
		}
	}

	public static void part3(Scanner console){
		System.out.print("How many categories of income?");
		int q3 = console.nextInt();

		for(int(i)=1;i<=q3;i++){
			System.out.print("    Next income amount?$");
			count2=count2+console.nextInt();
		}
		sum2=count2;
	}

	public static void part4(Scanner console,int sum1,int sum2,int time){
		sum1day=sum1/time;
		sum2day=sum2/time;
		System.out.println("Total income = $"+ sum1+"($"+sum1day+"/day)");
		System.out.println("Total expenses = $"+ sum2+"($"+sum2day+"/day)");
	}

	public static void part5(Scanner console,int sum1,int sum2) {
		subtotal = sum1 - sum2;
		if (subtotal <= -250) {
			subtotal = -subtotal;
			System.out.println("You spent $" + subtotal + " more than you earned this month.");
			System.out.println("You're a big spender.");
			System.out.println("please Safe money");
		}
		else if (subtotal <= 0) {
			subtotal = -subtotal;
			System.out.println("You spent $" + subtotal + " more than you earned this month.");
			System.out.println("You're a spender.");
			System.out.println("please Safe money");
		}
		else if (subtotal <= 250) {
			System.out.println("You spent $" + subtotal + " more than you earned this month.");
			System.out.println("You're a saver.");
			System.out.println("please spend some money");
		}
		else if (subtotal > 250) {
			System.out.println("You spent $" + subtotal + " more than you earned this month.");
			System.out.println("You're a spender.");
			System.out.println("please spend a lot of money");
		}
	}
}
