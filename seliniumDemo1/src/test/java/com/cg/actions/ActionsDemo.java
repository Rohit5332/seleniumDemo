package com.cg.actions;


import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;



public class ActionsDemo {

WebDriver driver;
WebElement mens;
Actions action;
public ActionsDemo ()
{
System.setProperty("webdriver.chrome.driver", "driver//chromedriver.exe");
driver=new ChromeDriver();
action=new Actions(driver);
}

public void loadUrl()
{
driver.get("https://www.myntra.com/");
driver.manage().window().maximize();
driver.navigate().refresh();
driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);


}
public void getTitle() throws InterruptedException
{
System.out.println(driver.getTitle());

}

public void hoverMouse()
{
mens=driver.findElement(By.xpath("//header/div[2]/nav[1]/div[1]/div[1]/div[1]/a[1]"));
action.moveToElement(mens).perform();
}
}
