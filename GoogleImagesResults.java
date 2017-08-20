package com.test.webpagetest;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$$;
import static com.codeborne.selenide.Selenide.page;

/**
 * Created by kdrn on 19.08.2017.
 */
public class GoogleImagesResults {
    private ElementsCollection topPanel = $$(".q.qs");

    public GoogleSearchResults navigateToAll() {
        topPanel.findBy(text("All")).click();
        return page(GoogleSearchResults.class);
    }
}
