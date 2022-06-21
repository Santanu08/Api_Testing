package testAllMethod;
import java.io.FileNotFoundException;
import org.testng.annotations.Test;

import studentAPI.CreateStudAPI;

public class AllExecutionDetails extends CreateStudAPI {
	CreateStudAPI  s;
	@Test(priority=1)
	public  void VerifyGet()  {
		s=new CreateStudAPI();
		s.getMethod0();
		}
	@Test(priority=1)
	public void VerifyPost() throws FileNotFoundException {
		s=new CreateStudAPI();
		s.createMethod();
	}
	@Test(priority=2)
	public void VerifyPut() throws FileNotFoundException {
		s=new CreateStudAPI();
		s.putMethod();
	}
	@Test(priority=3)
	public void VerifyDelete() {
		s=new CreateStudAPI();
		s.deleteMethod();
	}
}
