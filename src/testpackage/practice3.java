package testpackage;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class practice3 {
	@Test
	public void CarLoan() {
		System.out.println("Car Loan");
		
	}
	@BeforeTest
	public void homeLoan() {
		System.out.println("home loan");
		
	}
	

}
