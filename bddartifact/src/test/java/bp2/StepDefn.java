package bp2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.en.*;
import junit.framework.Assert;

public class StepDefn {
	WebDriver driver;
	
	@Given("^Page should be availiable$")
	public void page_should_be_availiable(){
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		 driver = new FirefoxDriver();
	     System.out.println("Firefox driver loaded------------------------------------------");
	}

	@When("^Title is correct$")
	public void title_is_correct(){
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
	}

	@Then("^print title is okay$")
	public void print_title_is_okay(){
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		String titleee=driver.getTitle();
		//Assert.assertEquals("OrangrHRM", titleee);
		System.out.println(titleee);
	}

}
