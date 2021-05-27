package com.cg.stepdef;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



import io.cucumber.java.en.*;




public class LoginStepDef {

WebDriver driver;

@Given("^User is on the login page$")
public void User_is_on_the_login_page() throws Throwable {
System.setProperty("webdriver.chrome.driver","driver//chromedriver.exe");
driver=new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://www.shoppersstop.com/#login");

}



//@When("user enters {string} & {string}")
//public void user_enters_un_pw(String str1, String str2) throws Throwable {
//driver.findElement(By.xpath("//input[@id='j_username']")).sendKeys(str1);
//driver.findElement(By.xpath("//input[@id='j_password']")).sendKeys(str2);
//driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
//}

@When("user enters {string} & {string}")
public void user_enters(String string, String string2) {
    // Write code here that turns the phrase above into concrete actions
    driver.findElement(By.xpath("//input[@id='j_username']")).sendKeys(string);
    driver.findElement(By.xpath("//input[@id='j_password']")).sendKeys(string2);
    driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);

}

@When("^user clicks on submit btn$")
public void user_clicks_on_submit_btn() throws Throwable {
driver.findElement(By.xpath("//button[@id='loginajax']")).click();
}



@Then("^user is on home page$")
public void user_is_on_home_page() throws Throwable {
Assert.assertTrue(driver.getTitle().contains("Online Shopping India"));
}


@Then("user is on same page")
public void user_is_on_same_page() {
    // Write code here that turns the phrase above into concrete actions
    //throw new io.cucumber.java.PendingException();
}



}