package studentAPI;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import io.restassured.RestAssured;


public class CreateStudAPI 
	{
	public void getMethod0()
	{
		RestAssured.given().baseUri("http://localhost:8082").when().log().all().get("/students").then()
		.log().all();
	}	
	public void createMethod() throws FileNotFoundException
	{
		RestAssured.given().baseUri("http://localhost:8082")
		.body(getFileContent("C:\\Users\\SANTANAY\\eclipse-workspace\\API_Testing\\src\\test\\resources\\body.txt"))
		.header("Accept","application/json").header("Content-Type","application/json")
		.when().log().all().post("/student").then().log().all();
	}
	public void putMethod() throws FileNotFoundException
	{
		RestAssured.given().baseUri("http://localhost:8082")
		.body(getFileContent("C:\\Users\\SANTANAY\\eclipse-workspace\\API_Testing\\src\\test\\resources\\body.txt"))
		.header("Accept","application/json").header("Content-Type","application/json")
		.when().log().all().put("/student/101").then().log().all();
	}

	public void deleteMethod()
	{
		RestAssured.given().baseUri("http://localhost:8082")
		.headers("Authorization","Basic YWRtaW46cGFzc3dvcmQxMjM=").when().log().all().delete("/student/101").then().log().all();
	}
	public static String getFileContent(String filePath) throws FileNotFoundException 
	{
		File file = new File(filePath);
		Scanner sc = new Scanner(file);
		sc.useDelimiter("\\Z");
		return sc.next();

}
	}
