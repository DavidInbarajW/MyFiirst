package com.cts.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features= {"src/test/resources/FacebookFeautures"},glue= {"com.cts.stepdef"},monochrome=true,tags="@Sanity",plugin={"pretty","html:src/test/resources/report/r.html","json:src/test/resources/report/r.json"})



public class TestRunner {

}
