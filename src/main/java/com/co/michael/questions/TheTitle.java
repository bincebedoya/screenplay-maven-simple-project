package com.co.michael.questions;

import com.co.michael.userinterfaces.WikiSearchPage;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class TheTitle implements Question<String> {

	public static TheTitle ofThePage() {
		return new TheTitle();
	}

	@Override
	public String answeredBy(Actor actor) {

		return Text.of(WikiSearchPage.TITLE_TEXT_SEARCHED).viewedBy(actor).asString();
	}

}