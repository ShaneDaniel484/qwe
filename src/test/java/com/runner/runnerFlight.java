package com.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(tags=" ",features="C:\\BlackSquad_PilotProject\\Thomascook\\src\\test\\resources\\features\\flight.feature",glue ="com.stepDefinitions",plugin= {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"})
public class runnerFlight {

}
