package ru.bcs.test.demo;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        tags = "@api",
        features = "src/test/resources/features",
        glue = {"ru.bcs.at.library.core", "ru.bcs.test.demo"}
)
public class RunCukesTest {
}
