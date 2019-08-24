package com.co.michael.stepdefinitions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import com.co.michael.questions.TheTitle;
import com.co.michael.tasks.Search;
import com.co.michael.userinterfaces.WikiHomePage;
import static org.hamcrest.Matchers.containsString;

public class WikipediaSearchStepDefinition {
    @Managed()
    private WebDriver hisBrowser;
    private Actor michael = Actor.named("Michael");
    private WikiHomePage WikiHomePage;

    @Before
    public void setUp() {
        michael.can(BrowseTheWeb.with(hisBrowser));
    }

    public WikipediaSearchStepDefinition() {
    }

    @Given("^That I am in wikipedia home page$")
    public void thatIAmInWikipediaHomePage() {
        michael.wasAbleTo(Open.browserOn(WikiHomePage));
    }

    @When("^I search the word \"([^\"]*)\"$")
    public void iSearchTheWord(String wordToSearch) {
        michael.attemptsTo(Search.word(wordToSearch));
    }

    @Then("^I hope to see the title \"([^\"]*)\"$")
    public void iHopeToSeeTheTitle(String titleSearched) {
        michael.should(seeThat(TheTitle.ofThePage(), containsString(titleSearched)));
    }
}