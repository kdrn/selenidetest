package com.test.webpagetest;

import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Condition.*;

import java.util.List;

public class GoogleMainPage {

    public GoogleSearchResults searchGooglePage(String searchQuery) {
        if (searchQuery == null || searchQuery.isEmpty()) {
            throw new IllegalArgumentException("Bad searchQuery");
        }

        $(By.name("q")).setValue(searchQuery).pressEnter();
        return page(GoogleSearchResults.class);

    }

}
