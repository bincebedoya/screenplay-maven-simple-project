package com.co.michael.tasks;

import com.co.michael.userinterfaces.WikiHomePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class Search implements Task {

	private String word;

	public Search(String word) {
		this.word = word;
	}

	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Enter.theValue(word).into(WikiHomePage.SEARCH_AREA));
		actor.attemptsTo(Click.on(WikiHomePage.SEARCH_BUTTON));
	}

	public static Search word(String text) {
		return Tasks.instrumented(Search.class, text);
	}

}