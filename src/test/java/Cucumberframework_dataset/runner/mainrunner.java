package Cucumberframework_dataset.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)

@CucumberOptions(
		features = {"src/test/java/Cucumberframework_dataset/features/"},
		glue = {"Cucumberframework_dataset.steps"},
		monochrome = true,
		tags = {},
		plugin = {"pretty","html:target/cucumber","json:target/cucumber.json","com.cucumber.listener.ExtentCucumberFormatter:target/report.html"}
		)

public class mainrunner {

}


