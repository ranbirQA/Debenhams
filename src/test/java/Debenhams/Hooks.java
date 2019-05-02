package Debenhams;

import Debenhams.drivers.DriverFactory;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks {
private DriverFactory driverFactory = new DriverFactory();


 @Before
 public void setup(){
  driverFactory.openBrowser();
  driverFactory.NavigateTo("https://www.debenhams.com/");
  driverFactory.applyImpWait();
 }

 @After
 public void tearDown(){
  driverFactory.closeBrowser();
 }

}
