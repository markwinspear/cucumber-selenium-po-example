package com.the_internet;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"pretty", "html:target/cucumber-html-report"},
        format = {"json:target/cucumber.json"},
        features = "src/test/resources"
)
public class TestRunner {
}
