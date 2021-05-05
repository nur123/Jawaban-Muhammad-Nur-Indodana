package cermatiregister;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CermatiRegister {

 public static void main(String[] args) {
 
  WebDriver driver=new ChromeDriver();
  String URL="https://www.cermati.com/";

  driver.get(URL);
  driver.manage().timeouts().implicitlyWait(2000, TimeUnit.MILLISECONDS);
  driver.manage().window().maximize();
  
  // Click on Sign in
  driver.findElement(By.linkText("Daftar")).click();
  
  // Positive Testcase registration
  driver.findElement(By.id("email")).sendKeys("satiabajaitam123@gmail.com");
  driver.findElement(By.id("password")).sendKeys("satria123");
  driver.findElement(By.id("confirm-password")).sendKeys("satria123");
  driver.findElement(By.id("first-name")).sendKeys("Muhammad");
  driver.findElement(By.id("last-name")).sendKeys("Nur");
  driver.findElement(By.id("mobile-phone")).sendKeys("081517428677");
  driver.findElement(By.id("residence-city")).sendKeys("KOTA JAKARTA TIMUR");
  
  driver.findElement(By.id("join-container")).click();
  
  driver.findElement(By.xpath("//button[@id='']")).click();
  
  }

 }