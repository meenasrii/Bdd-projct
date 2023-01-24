package testRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src\\test\\java\\fb\\com\\features\\Facebook.feature",
glue={"fb.com.stepdefination","Hooks"},plugin = {"html:target\\report\\adactin.html",
		"json:target\\report\\adactin_j.json"},
tags="@Adctin-tc102",dryRun=false,publish=true)

public class Runnerclass {

}
