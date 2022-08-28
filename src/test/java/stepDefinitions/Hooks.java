package stepDefinitions;

import java.io.IOException;

import io.cucumber.java.After;
import utils.TestContainerSetup;

public class Hooks {
	
	TestContainerSetup testcontext;

	public Hooks(TestContainerSetup testcontext) {
		this.testcontext=testcontext;
	}
	
	
	@After
	public void AfterScenarioclosebrowser() throws IOException {
		
		testcontext.testBase.WebDriverManager().quit();
		
		
	}
}
