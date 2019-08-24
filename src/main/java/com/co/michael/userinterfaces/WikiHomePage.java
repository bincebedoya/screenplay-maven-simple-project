package com.co.michael.userinterfaces;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("https://es.wikipedia.org/wiki/Wikipedia:Portada")
public class WikiHomePage extends PageObject {

    public static final Target SEARCH_AREA = Target.the("Area to search in Wiki").located(By.id("searchInput"));

    public static final Target SEARCH_BUTTON = Target.the("Button to search in Wiki").located(By.name("go"));

}