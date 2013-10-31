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

public class Sliders {
  private WebDriver driver;
  private String baseUrl;
  private boolean acceptNextAlert = true;
  private StringBuffer verificationErrors = new StringBuffer();

  @Before
  public void setUp() throws Exception {
    driver = new FirefoxDriver();
    baseUrl = "http://xyntha.com/";
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  }

  @Test
  public void testUntitled() throws Exception {
    driver.get(baseUrl + "/");
    driver.findElement(By.id("scroll-nav-1")).click();
    try {
		File scrnsht =
		((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(scrnsht, new
		File("D:\\ScreenshotPage.png"));
		} catch (Exception e) {
		e.printStackTrace();
			}
    driver.findElement(By.id("scroll-nav-2")).click();
    driver.findElement(By.id("scroll-nav-3")).click();
    driver.findElement(By.id("scroll-nav-4")).click();
    driver.findElement(By.id("scroll-nav-5")).click();
    driver.findElement(By.id("scroll-nav-6")).click();
    driver.findElement(By.id("scroll-nav-5")).click();
    driver.findElement(By.id("scroll-nav-4")).click();
    driver.findElement(By.id("scroll-nav-3")).click();
    driver.findElement(By.id("scroll-nav-2")).click();
    driver.findElement(By.id("scroll-nav-1")).click();
    driver.findElement(By.id("scroll-nav-1")).click();
    driver.findElement(By.id("scroll-nav-2")).click();
    driver.findElement(By.id("scroll-nav-3")).click();
    driver.findElement(By.id("scroll-nav-2")).click();
    driver.findElement(By.id("scroll-nav-1")).click();
    driver.findElement(By.xpath("//div[@id='top-nav']/div[2]/a")).click();
    driver.findElement(By.cssSelector("map[name=\"purification-buttons\"] > #scroll-nav-2")).click();
    driver.findElement(By.cssSelector("map[name=\"purification-buttons\"] > #scroll-nav-3")).click();
    driver.findElement(By.cssSelector("map[name=\"purification-buttons\"] > #scroll-nav-4")).click();
    driver.findElement(By.cssSelector("map[name=\"purification-buttons\"] > #scroll-nav-5")).click();
    driver.findElement(By.id("scroll-nav-1")).click();
    driver.findElement(By.id("scroll-nav-2")).click();
    driver.findElement(By.id("scroll-nav-3")).click();
    driver.findElement(By.id("scroll-nav-4")).click();
    driver.findElement(By.id("scroll-nav-5")).click();
    driver.findElement(By.id("scroll-nav-4")).click();
    driver.findElement(By.id("scroll-nav-3")).click();
    driver.findElement(By.id("scroll-nav-2")).click();
    driver.findElement(By.id("scroll-nav-1")).click();
    driver.findElement(By.linkText("Efficacy and Safety")).click();
    driver.findElement(By.cssSelector("img[alt=\"Bleed control\"]")).click();
    driver.findElement(By.id("scroll-nav-1")).click();
    driver.findElement(By.cssSelector("img[alt=\"Surgery\"]")).click();
    driver.findElement(By.id("scroll-nav-1")).click();
    driver.findElement(By.cssSelector("img[alt=\"Inhibitor Rate\"]")).click();
    driver.findElement(By.id("scroll-nav-1")).click();
    driver.findElement(By.id("scroll-nav-2")).click();
    driver.findElement(By.id("scroll-nav-3")).click();
    driver.findElement(By.id("scroll-nav-4")).click();
    driver.findElement(By.id("scroll-nav-3")).click();
    driver.findElement(By.id("scroll-nav-2")).click();
    driver.findElement(By.id("scroll-nav-1")).click();
    driver.findElement(By.xpath("//div[@id='top-nav']/div[4]/a")).click();
    driver.findElement(By.id("scroll-nav-2")).click();
    driver.findElement(By.id("scroll-nav-1")).click();
    driver.findElement(By.linkText("Resources")).click();
    driver.findElement(By.id("hemmobile-btn")).click();
    driver.findElement(By.id("scroll-nav-1")).click();
    driver.findElement(By.cssSelector("img.tpp")).click();
    driver.findElement(By.id("scroll-nav-1")).click();
    driver.findElement(By.id("savings-card-btn")).click();
    driver.findElement(By.id("scroll-nav-1")).click();
    driver.findElement(By.cssSelector("img.rsvp")).click();
    driver.findElement(By.id("scroll-nav-1")).click();
    driver.findElement(By.id("scholarship-btn")).click();
    driver.findElement(By.id("scroll-nav-1")).click();
    driver.findElement(By.id("hv-btn")).click();
    driver.findElement(By.id("scroll-nav-1")).click();
    driver.findElement(By.id("amp-btn")).click();
    driver.findElement(By.id("scroll-nav-1")).click();
    driver.findElement(By.id("scroll-nav-2")).click();
    driver.findElement(By.id("scroll-nav-3")).click();
    driver.findElement(By.id("scroll-nav-4")).click();
    driver.findElement(By.id("scroll-nav-5")).click();
    driver.findElement(By.id("scroll-nav-6")).click();
    driver.findElement(By.id("scroll-nav-7")).click();
    driver.findElement(By.id("scroll-nav-8")).click();
    driver.findElement(By.id("scroll-nav-7")).click();
    driver.findElement(By.id("scroll-nav-6")).click();
    driver.findElement(By.id("scroll-nav-5")).click();
    driver.findElement(By.id("scroll-nav-4")).click();
    driver.findElement(By.id("scroll-nav-3")).click();
    driver.findElement(By.id("scroll-nav-2")).click();
    driver.findElement(By.id("scroll-nav-1")).click();
  }

  @After
  public void tearDown() throws Exception {
    driver.quit();
    String verificationErrorString = verificationErrors.toString();
    if (!"".equals(verificationErrorString)) {
      fail(verificationErrorString);
    }
  }

  private boolean isElementPresent(By by) {
    try {
      driver.findElement(by);
      return true;
    } catch (NoSuchElementException e) {
      return false;
    }
  }

  private boolean isAlertPresent() {
    try {
      driver.switchTo().alert();
      return true;
    } catch (NoAlertPresentException e) {
      return false;
    }
  }

  private String closeAlertAndGetItsText() {
    try {
      Alert alert = driver.switchTo().alert();
      String alertText = alert.getText();
      if (acceptNextAlert) {
        alert.accept();
      } else {
        alert.dismiss();
      }
      return alertText;
    } finally {
      acceptNextAlert = true;
    }
  }
}
