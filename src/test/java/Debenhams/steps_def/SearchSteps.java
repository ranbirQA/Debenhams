package Debenhams.steps_def;

import Debenhams.page_objects.Homepage;
import cucumber.api.java.en.Given;

public class SearchSteps {

    private Homepage homepage = new Homepage();

    @Given("^i am on home page$")
    public void i_am_on_home_page() {
        homepage.enterText("nike");

    }


}


