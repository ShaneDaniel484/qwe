package com.runner;
import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\BlackSquad_PilotProject\\Thomascook\\src\\test\\resources\\features\\holiday.feature",glue ="com.stepDefinitions",plugin= {"pretty","html:target/test-reports/cucumber.html","pretty","json:target/cucmber-reports/cucumber.json"})

public class runnerholiday {

}
