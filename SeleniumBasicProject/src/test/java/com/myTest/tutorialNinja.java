package com.myTest;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class tutorialNinja {
	WebDriver driver;
	@Test
	public void tutorialNinjaTest( ) throws InterruptedException {
		try {
		System.out.println("I am Tutorial Ninja Test");
		
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
	
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo/index.php");
		driver.findElement(By.xpath("//*[@id='form-currency']/div/button/i")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@name='EUR']")).click();
		Thread.sleep(2000);
		String currecyText=driver.findElement(By.xpath("//*[@id='form-currency']/div/button/strong")).getText();
		System.out.println("Currency Selected - "+currecyText);
		
		//Assert.assertEquals(currecyText, "€");
		
		if(currecyText.equals("€"))
			System.out.println("Currency Selected is Success to - "+currecyText);
		else
			System.out.println("Currency Selected is Failed  - "+currecyText);
		
		driver.findElement(By.xpath("//*[@name='search']")).sendKeys("canon EOS 5 D camera");
		driver.findElement(By.xpath("//*[@id='search']/span/button")).click();
		
		
		String errorMessage=driver.findElement(By.xpath("//*[@id='content']/p[2]")).getText();
		System.out.println("Error Message - "+errorMessage);
		Thread.sleep(2000);
		
		if(errorMessage.contains("There is no product that matches the search criteria."))
			System.out.println("Error Message Validation is Success to - "+errorMessage);
		else
			System.out.println("Error Message Validation is Failed to - "+errorMessage);
		
			
		
		driver.findElement(By.xpath("//*[@id='logo']/h1/a")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//img[@title='iPhone']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.id("input-quantity")).clear();
		driver.findElement(By.id("input-quantity")).sendKeys("2");
		driver.findElement(By.id("button-cart")).click();
		Thread.sleep(2000);
		String addToCartSuccess = driver.findElement(By.xpath("//*[contains(@class, 'alert-success')]")).getText();
		System.out.println("Add to Cart Success Message - "+addToCartSuccess);
		
		/*
		 * driver.findElement(By.xpath("//*[contains(@class, 'alert-success')]")).
		 * getText();
		 * driver.findElement(By.className("alert alert-success alert-dismissible")).
		 * getText();
		 */
		
		if(addToCartSuccess.contains("Success: You have added iPhone to your shopping cart!"))
			System.out.println("Add to Cart Message Validation is Success to - "+addToCartSuccess);
		else
			System.out.println("Add to Cart Message Validation is Failed to - "+addToCartSuccess);
		
		
		driver.findElement(By.id("cart-total")).click();
		
		driver.findElement(By.xpath("//a[contains(@href,'checkout/cart')]")).click();
		driver.findElement(By.xpath("//input[contains(@name,'quantity')]")).clear();
		driver.findElement(By.xpath("//input[contains(@name,'quantity')]")).sendKeys("3");
		
		driver.findElement(By.xpath("//button[@data-original-title='Update']")).click();
		
		String ECO_Tax=driver.findElement(By.xpath("//table[@class='table table-bordered']/tbody/tr[2]/td[2]")).getText();
		String VAT_Tax=driver.findElement(By.xpath("//table[@class='table table-bordered']/tbody/tr[3]/td[2]")).getText();
		
		System.out.println("ECO TAX - "+ECO_Tax);
		System.out.println("VAT TAX - "+VAT_Tax);
		
		driver.findElement(By.xpath("//*[@id='content']/div[3]/div[2]/a")).click();
		
		
		
		
		
		String prodErrorMessage=driver.findElement(By.xpath("//*[contains(@class,'alert-danger')]")).getText();
		System.out.println("Error Message - "+prodErrorMessage);
		Thread.sleep(2000);
		
		if(prodErrorMessage.contains("Products marked with *** are not available in the desired quantity or not in stock!"))
			System.out.println("Error Message Validation is Success to - "+prodErrorMessage);
		else
			System.out.println("Error Message Validation is Failed to - "+prodErrorMessage);
		
		driver.findElement(By.xpath("//*[@data-original-title='Remove']")).click();
		Thread.sleep(500);
		driver.findElement(By.xpath("//*[@id='logo']/h1/a")).click();
		Thread.sleep(500);
		
		
		driver.findElement(By.xpath("//*[@id='content']/div[2]/div[1]/div/div[1]/a/img")).click();
		Thread.sleep(2000);
		
	
		driver.findElement(By.id("button-cart")).click();
		Thread.sleep(2000);
		String addToCartSuccess1 = driver.findElement(By.xpath("//*[contains(@class, 'alert-success')]")).getText();
		System.out.println("Add to Cart Success Message - "+addToCartSuccess1);
		driver.findElement(By.xpath("//*[@id='cart-total']")).click();
	
	    driver.findElement(By.xpath("//*[@class='text-right']/a[@href='https://tutorialsninja.com/demo/index.php?route=checkout/cart']")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//a[@href='#collapse-coupon']")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.id("input-coupon")).sendKeys("ABCD123");
	    Thread.sleep(7000);
	    driver.findElement(By.xpath("//*[@id='button-coupon']")).click();
	    Thread.sleep(4000);
	    String couponWarningMsg = driver.findElement(By.xpath("//*[contains(@class, 'alert-danger')]")).getText();
		System.out.println("Coupon Warning Message - "+couponWarningMsg);
		
		driver.findElement(By.xpath("//a[@href='#collapse-coupon']")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.id("input-coupon")).sendKeys("ABCD123");
	    Thread.sleep(7000);
	    driver.findElement(By.xpath("//*[@id='button-coupon']")).click();
	    String couponWarningMsg1 = driver.findElement(By.xpath("//*[contains(@class, 'alert-danger')]")).getText();
		System.out.println("Coupon Warning Message - "+couponWarningMsg1);
		
		
		
		
		
		
		System.out.println("******************************************************");
		Thread.sleep(10000);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
		driver.quit();
		}
		catch(Exception e) {
			
			System.out.println("Exception - "+e.toString());
			driver.quit();
		}
	}
	private void click() {
		// TODO Auto-generated method stub
		
	}
	
}
