package StepDefination;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {
	
	/*
	 * Hooks : 
	 * @Before - execute before Scenario
	 * 
	 * @After -execute after Scenario
	 */
	
	@Before
	public void beforeMethod() {
		System.out.println("Before Method ");
	}
	
	@After
	public void AfterMethod() {
		System.out.println("After Method ");
	}

}
