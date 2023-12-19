package com.cactus.testing;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
    features = "src/test/resources",
    glue = {"com.cactus.testing"},
    stepNotifications = true,
    plugin = {"pretty", "html:target/test-report.html"}
)
public class TestRunner {
}
