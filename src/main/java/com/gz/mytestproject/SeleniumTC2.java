package com.gz.mytestproject;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;


public class SeleniumTC2 {

	public static void main(String[] args){
		SeleniumTC2 stc=new SeleniumTC2();
		stc.login();
	}

	public void login() {
		System.setProperty("webdriver.gecko.driver","E:\\myspace\\mytestproject\\src\\test\\java\\com\\gz\\testdata\\geckodriver.exe");
		WebDriver driver =new FirefoxDriver();
		driver.get("https://wordpress.com/wp-login.php?redirect_to=https%3A%2F%2Fwordpress.com%2F");
		WebElement element=driver.findElement(By.id("usernameOrEmail"));
		element.sendKeys("test@gmail.com");
		WaitHelper.waitSec();
		element.sendKeys(" ");
		driver.quit();
	}
	

}
