package testRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src\\test\\java\\fb\\com\\features",
glue={"fb.com.stepdefination","Hooks"},plugin= {"html:target\\report\\myntra.html"},dryRun =false,publish=true,tags = "@myntra-myn011")
public class Mynrunner {

	
}
