import java.util.Scanner;

public class DailyWager implements BaseEmployee {
	
	public DailyWager() {
		details();
		calculateSalary();
		printing();
	}



	String name;
	int days;
	private double netPay;
	
	Scanner input = new Scanner(System.in);
	
	public void details() {
			System.out.println("Enter your Name: ");
			name = input.nextLine();
	}
	
	public double getNetPay() {
		return netPay;
	}

	public void setNetPay(double netPay) {
		this.netPay = netPay;
	}

	public void calculateSalary(){
		System.out.println("Enter no. of Days: ");
		days = input.nextInt();
		setNetPay(700*days);
	}
	public void printing() {

		System.out.println("____________________COMSATS Non-Employees____________________");
		System.out.println("____________________Salary Slip____________________\n");
		System.out.println("Name: " + name);
		System.out.println("Net Pay: " + getNetPay());
	}
	
	
}
