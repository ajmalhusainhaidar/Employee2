package com.greatlearning.java.driver;
import com.greatlearning.java.Employee;
import com.greatlearning.java.service.ICredentialService;
import com.greatlearning.java.service.CredentialService;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ICredentialService service = new CredentialService();
		
		System.out.println("Enter the employee first name");
		String firstName = sc.nextLine();
		
		System.out.println("Enter the employee last name");
		String lastName = sc.nextLine();
		Employee employee = new Employee(firstName,lastName);
		System.out.println("Please select the employee department option");
		System.out.println("1.Technical");
		System.out.println("2.Admin");
		System.out.println("3.Human Resource");
		System.out.println("4.Legal");
		int option = sc.nextInt();
		switch (option) {
		case 1:
			employee.setDepartment("tech");
			break;
		case 2:
			employee.setDepartment("adm");
			break;
		case 3:
			employee.setDepartment("hr");
			break;
		case 4:
			employee.setDepartment("lg");
			break;
		default:
			System.out.println("Please select valid option");
			break;
		}
		
		if(employee.getFirstName() != null && employee.getLastName() != null 
				&& employee.getDepartment() != null) {
			service.generateEmail(employee);
			service.generatePassword(employee);
			service.showCredentials(employee);
		}else {
			System.out.println("Invalid Employee Details");
		}
		
		sc.close();
	}

}