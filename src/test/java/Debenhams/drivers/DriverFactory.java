package Debenhams.drivers;


import io.github.bonigarcia.wdm.ChromeDriverManager;
import io.github.bonigarcia.wdm.FirefoxDriverManager;
import io.github.bonigarcia.wdm.InternetExplorerDriverManager;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

public class DriverFactory {

    private String browser = "";
    public static WebDriver driver;


    public DriverFactory(){
        PageFactory.initElements(driver,this);
    }

    public void openBrowser() {
        switch (browser) {
            case "chrome":
                ChromeDriverManager.chromedriver().setup();
                driver = new ChromeDriver();
                break;
            case "ie":
                InternetExplorerDriverManager.iedriver().setup();
                driver = new InternetExplorerDriver();
                break;
            default:
                FirefoxDriverManager.firefoxdriver().setup();
                driver = new FirefoxDriver();
                break;
        }

    }
      public void closeBrowser(){
        driver.quit();
}
      public void applyImpWait(){
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
}
      public void NavigateTo(String url){
        driver.get(url);
}
//public void handlecookies (){driver.findElement(By.cssSelector("button.pw-button:nth-child(4) > div:nth-child(1)")).click();
      public void handlecookies(){driver.findElement(By.className("pw-button_inner")).click();}
      public void deletecookies(){driver.manage().deleteAllCookies();}



}

