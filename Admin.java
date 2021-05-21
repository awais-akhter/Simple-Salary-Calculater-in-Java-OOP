
public class Admin extends Employee{

	public Admin() {
		super();
		super.setBasicSalary(30000);
		super.calculateTA();
		calculateSalary();
		printing();
	}
	
	@Override
	public void calculateSalary() {
		super.setNetPay(getBasicSalary() * (80/100) + getTA());
	}
	
	@Override
	public void printing() {
		super.printing();
		System.out.println("Travel Allowance: " + getTA());
		System.out.println("Dinner Allowance: N/A");
		System.out.println("Net Pay: " + super.getNetPay());
	}
	
	
}
