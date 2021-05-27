package com.cg.stepdef;

import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.*;

public class RegisterStepDef {
	
	
	WebDriver driver;
	
	@Given("^user is on registration page$")
	public void user_is_on_registration_page() throws Throwable {
		System.setProperty("webdriver.chrome.driver","driver//chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.shoppersstop.com/#login");
	
	
	} 
	
	
	@When("^user enters details$")
	public void user_enters_details(DataTable arg1) throws Throwable {
	Map<String,String> map=arg1.asMap(String.class,String.class);
	System.out.println(map.get("username"));
	System.out.println(map.get("password"));
	System.out.println(map.get("cpassword"));
	System.out.println(map.get("mob"));
	System.out.println(map.get("comp"));
	} @Then("^user is successfully registered$")
	public void user_is_successfully_registered() throws Throwable {
	}

}
