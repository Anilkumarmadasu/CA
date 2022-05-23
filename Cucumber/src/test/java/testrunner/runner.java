package testrunner;


import org.junit.runner.RunWith;



import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\anilk\\OneDrive\\Desktop\\Cucumber\\features",
glue="stepdefinitions",monochrome=true,dryRun=false,plugin= {"pretty","html:test-output"})

public class runner {
	
}
