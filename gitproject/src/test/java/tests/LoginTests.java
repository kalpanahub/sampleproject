package tests;

import org.openqa.selenium.WebDriver;

public class LoginTests {
	WebDriver driver;
	public void loginPage() {
		System.out.println("This is a login test case");
		System.out.println("Doing changes for login tests for the 2nd time");
		System.out.println("Doing third time changes");
		System.out.println("Doing 4th time changes");
		System.out.println("Created a new branch for login tests");
		
	}
	public void login(String uname, String pwd) {
		driver.get("google.com");
		driver.findElement(By.xpath("")).sendeys(uname);
		driver.findElement(By.xpath("")).sendeys(pwd);
		driver.findElement(By.xpath("")).click;
	}
	
}

