
/*
         bharat
         kumae 
         chari
         panuganti*/

package com.sikuli.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

public class SikuliTestConcept {

	public static void main(String[] args) throws FindFailed {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();//launch the chrome driver
		driver.manage().window().maximize();//maximize window
		driver.manage().deleteAllCookies();// delete all cookies
		//dynamic wait
		driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);

		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
		driver.get("https://www.youtube.com/watch?v=GWWHI7SE0KQ");
		//create an object to the screen class
		Screen sc=new Screen();
		
		//pause icon
		Pattern pauseImg=new Pattern("YT_pause.png");
		sc.wait(pauseImg,2000);
		sc.click();
		sc.click();
		
		//volume icon
		Pattern volume=new Pattern("YT_volume.png");
		sc.wait(volume,2000);
		sc.click();
		sc.click();
		

	}

}
