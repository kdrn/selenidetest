package com.test.webpagetest;

import com.codeborne.selenide.ElementsCollection;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.*;

/**
 * Created by kdrn on 19.08.2017.
 */
public class GoogleSearchResults {
     private ElementsCollection results = $$(By.cssSelector(".r>a"));
     private ElementsCollection topPanel = $$(".q.qs");

    public ElementsCollection getResults() {
        return results;
    }

    public GoogleImagesResults navigateToImages() {
        topPanel.find(text("Images")).click();
        return page(GoogleImagesResults.class);
    }
}
