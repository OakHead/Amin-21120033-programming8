package Final;
import java.util.Scanner;
public class ProceduralProgramming
{
	public static void main(String[] args)
	{
		
		int loop = 1;
		
		while (loop == 1)
		{
			String name = nameInput();
			int age = ageCheck(name);
			if (age < 18)
			{
				break;
			}
			int salary = salaryCheck();
			if (salary < 1000)
			{
				break;
			}
			int loan = loanAmount();
			Thanks(loan);
			loop++;
		}
	}
	static String nameInput()
	{
		String name;
		
		System.out.println("Hello, what's your name? ");
		name = new Scanner(System.in).next();
		return name;
	}
	static int ageCheck(String name)
	{
		int age;
		
		System.out.println("Welcome " + name + "! How old are you? ");
		age = new Scanner(System.in).nextInt();
		
		if (age < 18)
		{
			System.out.println("Sorry, you can't take a loan, you're too young!");
		}
		return age;
	}
	static int salaryCheck()
	{
		int salary;
		
		System.out.println("Great!, how much is your salary? ");
		salary = new Scanner(System.in).nextInt();
		
		if (salary < 1000)
		{
			System.out.println("Oh no, We are terribly sorry! You can only take a loan if your salary is above 1,000!");
		}
		return salary;
	}
	static int loanAmount()
	{
		int loan;
		
		System.out.println("Wonderful! How much are you planning to loan?  ");
		do
		{
			loan = new Scanner(System.in).nextInt();
			
			if (loan >= 10000 || loan <= 50000)
			{
				break;
			}
			
			System.out.println("Loan must be between 10,000 & 50,000!");
		} 
		while (loan < 10000 || loan > 50000);
		
		return loan;
	}
	static void Thanks(int loan)
	{
		System.out.println("Done!");
		System.out.println("Your request for '"+ loan +"' has been submitted.");
		System.out.println("Please return after your loan has been processed.");
	}

}