package Debenhams.page_objects;

import Debenhams.drivers.DriverFactory;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Homepage extends DriverFactory {

    @FindBy(css = "#search-1")
   private WebElement searchTextbox;

    public void enterText(String product){
        searchTextbox.sendKeys(product);

    }
}
