
public class Faculty extends Employee{
	
	
	public Faculty() {
		super();
		super.setBasicSalary(40000);
		super.calculateDA();
		super.calculateTA();
		calculateSalary();
		printing();
	}
	
	@Override
	public void calculateSalary() {
		super.setNetPay((getBasicSalary() * (80/100)) + getTA() + getDA());
	}
	@Override
	public void printing() {
		super.printing();
		System.out.println("Travel Allowance: " + getTA());
		System.out.println("Dinner Allowance: " + getDA());
		System.out.println("Net Pay: " + super.getNetPay());
	}

}
