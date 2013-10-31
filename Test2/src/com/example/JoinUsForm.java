package com.example;

import java.io.File;
import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.junit.*;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class JoinUsForm {
  private WebDriver driver;
private String baseUrl;
 

  @Before
  public void setUp() throws Exception {
    driver = new FirefoxDriver();
    baseUrl = "http://xyntha.com/registration.aspx?sourcecode=XYNW10026319";

  }

  @Test
  public void testUntitled() throws Exception {
	  driver.get(baseUrl);
	    driver.findElement(By.id("demokit")).click();
	    driver.findElement(By.id("radio_patient")).click();
	    new Select(driver.findElement(By.id("months"))).selectByVisibleText("January");
	    new Select(driver.findElement(By.id("years"))).selectByVisibleText("1987");
	    new Select(driver.findElement(By.id("replacementA"))).selectByVisibleText("ReFacto® Antihemophilic Factor (Recombinant)");
	    driver.findElement(By.id("mild")).click();
	    driver.findElement(By.id("control")).click();
	    driver.findElement(By.id("email")).click();
	    driver.findElement(By.id("fname_field")).clear();
	    driver.findElement(By.id("fname_field")).sendKeys("asdas");
	    driver.findElement(By.id("lname_field")).clear();
	    driver.findElement(By.id("lname_field")).sendKeys("asd");
	    driver.findElement(By.id("address_field")).clear();
	    driver.findElement(By.id("address_field")).sendKeys("asdasd");
	    driver.findElement(By.id("city_field")).clear();
	    driver.findElement(By.id("city_field")).sendKeys("asd");
	    new Select(driver.findElement(By.id("state_field"))).selectByVisibleText("Kansas");
	    driver.findElement(By.id("zip_field")).clear();
	    driver.findElement(By.id("zip_field")).sendKeys("12345");
	    driver.findElement(By.id("email_field")).clear();
	    driver.findElement(By.id("email_field")).sendKeys("sfd@adsad.com");
	    driver.findElement(By.id("BI")).click();
	    driver.findElement(By.cssSelector("img[alt=\"Submit\"]")).click();
		try {
			File scrnsht =
			((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(scrnsht, new
			File("D:\\JoinUs.png"));
			} catch (Exception e) {
			e.printStackTrace();
				}
  }

 
  }

 