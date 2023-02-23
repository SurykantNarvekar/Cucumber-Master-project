package Runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;



@CucumberOptions(features= "Features" , glue="StepDefination", dryRun=true, tags= "@Sanity",
plugin={"pretty" ,"html:Reports/cucmber-reports.html"},monochrome=true)


/*
 *  tags= "@Login and @Sanity"  --> And condition.
 *  tags= "@Login or @Sanity"  --> OR condition.
 */
public class TestRunner extends AbstractTestNGCucumberTests{

}
