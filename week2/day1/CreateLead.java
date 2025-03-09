package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateLead {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s1 = "TestLeafAssignment";
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.partialLinkText("CRM")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Darwin");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Test");
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("SampleLeadCreate");
		driver.findElement(By.id("createLeadForm_generalProfTitle")).sendKeys("TestLeafAssignment");
		driver.findElement(By.name("submitButton")).click();
		String s2 = driver.findElement(By.id("viewLead_generalProfTitle_sp")).getText();
		boolean titleTextVerify = s1.equals(s2);
		if (titleTextVerify==true) {
			System.out.println("The title is displayed correctly");
		}
		else {
			System.out.println("The title is not displayed correctly");
		}
		driver.close();
	}

}
