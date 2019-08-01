package ru.bcs.test.demo.account;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        tags = "@mobile",
        features = "src/test/resources/features",
        glue = {"ru.bcs"}
)
public class RunCukesTest {
}
