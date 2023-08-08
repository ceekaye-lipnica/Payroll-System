import java.util.Scanner;

public class Salary {

	public static void main(String[] args) {
		
		System.out.println("Activity 1.2");
		System.out.println("Program by: Chelsea Kate M. Lipnica");
		System.out.println("BSIT 2 - 1");
		
		Scanner employee = new Scanner(System.in);
		int answer;
		
		do {
			
		System.out.println("\n============== Payroll System 1.0 ==============");
		
		System.out.println("Enter Employee's Name: ");
		String name = employee.nextLine(); 
		
		System.out.println("Enter Number of Days Work: ");
		double days = employee.nextDouble();
		
		System.out.println("Enter Rate Per Day: ");
		double rate = employee.nextDouble();
		
		System.out.println("\n================ Payroll Report ================");
		
		double salary = days * rate;
		
		System.out.println("Employee's Name: " + name);
		System.out.println("Number of Days Worked: " + days);
		System.out.println("Rate Per Day: " + rate);
		System.out.println("Total Salary: " + salary);
		
		System.out.println("\n\nCompute again? Type 1 for yes, 0 for no.");
		answer = employee.nextInt();	
		employee.nextLine();
		
		} while (answer == 1);
		
		System.out.println("\n====================================================");
		System.out.println("End of program.");
		System.out.println("Thank you for using my program!");
		
	}

}
