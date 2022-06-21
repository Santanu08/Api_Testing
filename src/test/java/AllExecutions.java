import java.io.FileNotFoundException;

import org.testng.annotations.Test;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import studentAPI.CreateStudAPI;

public class AllExecutions {
	CreateStudAPI  s;
	@Given("Get Method")
	public  void VerifyGet()  {
		s=new CreateStudAPI();
		s.getMethod0();
		}
	@And("Post Method")
	public void VerifyPost() throws FileNotFoundException {
		s=new CreateStudAPI();
		s.createMethod();
	}
	@And("Put Method")
	public void VerifyPut() throws FileNotFoundException {
		s=new CreateStudAPI();
		s.putMethod();
	}
	@Then("Delete Method")
	public void VerifyDelete() {
		s=new CreateStudAPI();
		s.deleteMethod();
	}
}
