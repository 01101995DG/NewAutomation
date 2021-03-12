package com.sgtesting.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignments1 {

	public static WebDriver oBrowser=null;
	public static void main(String[] args) {
     LaunchBrowser();
     navigate();
     login();
     minimizeFlyOutWindow();
     createuser1();
     deleteuser1();
     logout();
     closeApplication();
	}

	public static void LaunchBrowser()
	{
		try
		{ 
			String path=System.getProperty("user.dir");
			System.setProperty("webdriver.chrome.driver",path+"\\Library\\drivers\\chromedriver.exe");
			oBrowser=new ChromeDriver();

		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	public static void navigate()
	{
		try
		{
			oBrowser.get("http://localhost/login.do");
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	public static void login()
	{
		try
		{
			oBrowser.findElement(By.id("username")).sendKeys("admin");
   			oBrowser.findElement(By.name("pwd")).sendKeys("manager");
   			oBrowser.findElement(By.xpath("//*[@id='loginButton']/div")).click();
   			Thread.sleep(5000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void minimizeFlyOutWindow()
   	{
   		try
   		{
   			oBrowser.findElement(By.id("gettingStartedShortcutsPanelId")).click();
   			Thread.sleep(2000);
   		}catch(Exception e)
   		{
   			e.printStackTrace();
   		}
}      
	public static void createuser1()  
	{
		try
		{
			oBrowser.findElement(By.xpath(" //*[@id=\'topnav\']/tbody/tr[1]/td[5]/a/div[2]")).click();
		    oBrowser.findElement(By.xpath("//*[@id='createUserDiv']/div/div[2]")).click();
   	        oBrowser.findElement(By.name("firstName")).sendKeys("User");
			oBrowser.findElement(By.name("lastName")).sendKeys("1");
			oBrowser.findElement(By.name("email")).sendKeys("user1@gamil.com");
			oBrowser.findElement(By.name("username")).sendKeys("User_1");
			oBrowser.findElement(By.name("password")).sendKeys("User1111");
			oBrowser.findElement(By.name("passwordCopy")).sendKeys("User1111");
			oBrowser.findElement(By.xpath("//*[@id=\'userDataLightBox_commitBtn\']/div/span ")).click();
			Thread.sleep(5000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	public static void deleteuser1()
	{
		try
		{
			oBrowser.findElement(By.xpath("//*[@id=\'userListTableContainer\']/table/tbody/tr[2]/td[1]")).click();
			oBrowser.findElement(By.xpath("//*[@id=\'userDataLightBox_deleteBtn\']")).click();
			Thread.sleep(5000);
			oBrowser.switchTo().alert().accept();
			Thread.sleep(5000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void logout()
   	{
   		try
   		{
   			oBrowser.findElement(By.linkText("Logout")).click();
   			Thread.sleep(5000);
   		}catch(Exception e)
   		{
   			e.printStackTrace();
   		}
   	}
   	
   	static void closeApplication()
   	{
   		try
   		{
   			oBrowser.close();
   		}catch(Exception e)
   		{
   			e.printStackTrace();
   		}
   	}
}
