package Chull;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;

public class Testcase2 extends TestCase {

	@Test
	public void checkcouponprice() {
		try {
			driver.findElement(By.xpath("//a[@href=\"/login\"]")).click();
			Thread.sleep(2000);

			driver.findElement(By.xpath("//button[normalize-space(.)=\"Login with Email\"]")).click();

			driver.findElement(By.xpath("//input[@placeholder='Enter Email']")).sendKeys("rajnish.kumar@unvii.com");
			driver.findElement(By.xpath("//button[normalize-space()='Send OTP']")).click();
			driver.findElement(By.xpath("//input[@class='otp-input form-control']")).sendKeys("1234");
			driver.findElement(By.xpath("//button[normalize-space()='Verify OTP']")).click();

			wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//img[@class='Movieslogo'])[5]"))).click();
			Thread.sleep(4000);

			WebElement clickonchooseplan = wait.until(ExpectedConditions.elementToBeClickable(
					(By.xpath("(//button[@class=\"subscription_button btn btn-lg btn-block planBtn\"])[1]"))));
			clickonchooseplan.click();

			Thread.sleep(4000);

			wait.until(
					ExpectedConditions.elementToBeClickable(By.xpath("//input[@placeholder=\"Enter coupon code...\"]")))
					.sendKeys("4OefxM");

			WebElement applyOncouponcode = wait
					.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@class=\"apply-button\"]")));
			applyOncouponcode.click();
			Thread.sleep(4000);
			
			WebElement click = driver.findElement(By.xpath("//div[@class=\"text\"]"));
			System.out.println(click.getText());
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	
	@Test
	public void couponPercentage() {
		try {
			driver.findElement(By.xpath("//a[@href=\"/login\"]")).click();
			Thread.sleep(2000);

			driver.findElement(By.xpath("//button[normalize-space(.)=\"Login with Email\"]")).click();

			driver.findElement(By.xpath("//input[@placeholder='Enter Email']")).sendKeys("rajnish.kumar@unvii.com");
			driver.findElement(By.xpath("//button[normalize-space()='Send OTP']")).click();
			driver.findElement(By.xpath("//input[@class='otp-input form-control']")).sendKeys("1234");
			driver.findElement(By.xpath("//button[normalize-space()='Verify OTP']")).click();

			wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//img[@class='Movieslogo'])[5]"))).click();
			Thread.sleep(4000);

			WebElement clickonchooseplan = wait.until(ExpectedConditions.elementToBeClickable(
					(By.xpath("(//button[@class=\"subscription_button btn btn-lg btn-block planBtn\"])[1]"))));
			clickonchooseplan.click();

			Thread.sleep(4000);

			wait.until(
					ExpectedConditions.elementToBeClickable(By.xpath("//input[@placeholder=\"Enter coupon code...\"]")))
					.sendKeys("t7fnlx");

			WebElement applyOncouponcode = wait
					.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@class=\"apply-button\"]")));
			applyOncouponcode.click();
			Thread.sleep(4000);
			
			WebElement click = driver.findElement(By.xpath("//div[@class=\"text\"]"));
			System.out.println(click.getText());
			
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	

}
