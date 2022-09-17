package a2_gmail;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class gmail {
	public static WebDriverWait wait;
	ChromeDriver driver = null;
	String parentWin = driver.getWindowHandle();
	Set<String> windows = driver.getWindowHandles();
	
	public static void main(String[] args) throws InterruptedException, IOException
	{
		//To launch the application in specified browser
		System.setProperty("webdriver.chrome.driver","C:\\Users\\thanm\\eclipse-workspace\\assignment2\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//Launching the web site
		//driver.get(" https://accounts.google.com/");
		driver.get("https://mail.google.com/");
		Thread.sleep(3000);
		
		//To maximize the screen
		driver.manage().window().maximize();
		
		//To fill the email address
		driver.findElement(By.id("identifierId")).sendKeys("cthanmaya128@gmail.com");
		Thread.sleep(3000);
		
		//To click on sign-in button
		driver.findElement(By.xpath("//*[@id=\"identifierNext\"]/div/button/span")).click();
		Thread.sleep(3000);
		
		//To enter the password
		driver.findElement(By.xpath("//*[@id=\"password\"]/div[1]/div/div[1]/input")).sendKeys("Spring-3-quest");
		Thread.sleep(3000);
		
		//To click on next button
		driver.findElement(By.xpath("//*[@id=\"passwordNext\"]/div/button/span")).click();
		Thread.sleep(3000);
		
		//To click on compose button
		driver.findElement(By.className("aic")).click();
		Thread.sleep(7000);
		
		driver.findElement(By.cssSelector(".aGb div div div input")).sendKeys("thanmayac8@gmail.com");
		Thread.sleep(3000);
		
		//To set a subject
		driver.findElement(By.cssSelector(".aoD.az6 input")).sendKeys("sending a mail");
		Thread.sleep(3000);
		
		//To set a message
		driver.findElement(By.cssSelector(".Ar.Au div")).sendKeys("Good morning");
		Thread.sleep(3000);
		
		//To click on a send button
		driver.findElement(By.cssSelector(".dC div")).click();
		Thread.sleep(5000);
		
		//To logout
		driver.findElement(By.xpath("//*[@id=\"gb\"]/div[2]/div[3]/div[1]/div[2]/div/a/img")).click();
		Thread.sleep(3000);
		driver.close();
		
		
	}

}
