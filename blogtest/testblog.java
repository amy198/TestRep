package blogtest;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class testblog {
	@Given("user is in blog page")
	public void userInBlogPage() {
		System.out.println("given section");;
	}
	@When("user enters data in search field")
	public void userEnterdata() {
		System.out.println("when section");
	}
	@Then("data should appear in search field")
	public void appearData() {
		System.out.println("Then section");
	}

}
