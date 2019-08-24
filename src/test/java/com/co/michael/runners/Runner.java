package com.co.michael.runners;
import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features="src/test/java/com/co/michael/resources/features",
        glue="com.co.michael.stepdefinitions",
        snippets=SnippetType.CAMELCASE,
        monochrome = true,
        dryRun = false,
        plugin = {"json:reportJson/cucumber.json"})
public class Runner {

}