import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Fixed fix;
		Faculty faculty;
		Admin admin;
		DailyWager wager;
		
		Scanner input = new Scanner(System.in);
		int type;
		
		System.out.println("Enter your type of Employement: \n1. Fixed Contract\n2. Faculty\n3. Admin\n4. DailyWager");
		type = input.nextInt();
		
		if (type==1) {
			fix = new Fixed();
		}else if (type==2) {
			faculty = new Faculty();
		}else if (type==3) {
			admin = new Admin();
		}else if (type==4) {
			wager = new DailyWager ();
		}

		
		
		
		
	}

}
