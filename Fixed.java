import java.util.Scanner;

public class Fixed extends Employee {
	
	public Fixed() {
		super();
		calculateSalary();
		printing();
		
		
	}

	int lectures;
	
	Scanner input = new Scanner(System.in);
	
	@Override
	public void calculateSalary() {
		System.out.println("Enter No. of Lectures: ");
		lectures = input.nextInt();
		super.setNetPay(lectures * 1800);
	}

	
	@Override
	public void printing() {
		super.printing();
		System.out.println("Travel Allowance: N/A" );
		System.out.println("Dinner Allowance: N/A" );
		System.out.println("Net Pay: " + super.getNetPay());
	}
}
