import java.util.Scanner;

public class EmployeeDetails {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int id = scan.nextInt();
        String name = scan.next();
        //scan.next();
		double salary = scan.nextDouble();
		
		
		Employee Raju = new Employee();
		Raju.input(id, name, salary);
		
		Raju.DisplayDetail();
	
  scan.close();
	}

}
