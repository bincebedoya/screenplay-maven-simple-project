package com.co.michael.userinterfaces;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class WikiSearchPage {

    public static final Target TITLE_TEXT_SEARCHED = Target.the("Title searched").located(By.id("firstHeading"));

}