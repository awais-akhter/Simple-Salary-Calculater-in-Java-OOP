import java.util.Scanner;

public class Employee {
	
	public Employee() {
		details();
	}
	
	String name;
	private String email;
	private int ID;
	private int basicSalary;
	private double netPay;
	private double TA;
	private double DA;
	
	
	final String INSTITUTE;
	{
		INSTITUTE = "COMSATS UNIVERSITY ISLAMABAD";
	}
	
	Scanner input = new Scanner(System.in);
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getID() {
		return ID;
	}
	public double getTA() {
		return TA;
	}
	public void setTA(double tA) {
		TA = tA;
	}
	public void setID(int iD) {
		ID = iD;
	}
	

	
	
	
	public double getDA() {
		return DA;
	}
	public void setDA(double dA) {
		DA = dA;
	}
	public double getNetPay() {
		return netPay;
	}
	public void setNetPay(double netPay) {
		this.netPay = netPay;
	}
	public int getBasicSalary() {
		return basicSalary;
	}
	public void setBasicSalary(int basicSalary) {
		this.basicSalary = basicSalary;
	}
	
	
	
	
	public void details() {
		System.out.println("Enter your Name: ");
		name = input.nextLine();
		System.out.println("Enter you email: ");
		setEmail(input.nextLine());
		System.out.println("Enter your ID: ");
		setID(input.nextInt());
	}
	
	public void calculateSalary() {
		
	}
	
	public void calculateTA() {
		System.out.println("Enter No. of KM: ");
		int km = input.nextInt();
		
		setTA(3*km);
	}
	public void calculateDA() {
		System.out.println("Enter cost of dinner: ");
		int cost = input.nextInt();
		
		setDA(cost);
	}
	
	
	public void printing() {
		System.out.println("____________________________________________________________");
		System.out.println("___________" + INSTITUTE + "___________");
		System.out.println("____________________Salary Slip____________________\n");
		System.out.println("Employee Name: " + name);
		System.out.println("Employee ID: " + getID());
		System.out.println("Employee Email: " + getEmail());
	}
	
	
	
	
	
	
	
}
