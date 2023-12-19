package com.epam.ta.pageobjects;

import com.epam.ta.helper.WebDriverFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.springframework.stereotype.Component;


import java.util.List;

@Component
public class VideosPage {


    @FindBy(css = ".evnt-search-filter .evnt-text-fields.evnt-search")
    private WebElement searchField;

    @FindBy(css = ".evnt-talk-card")
    private List<WebElement> eventCards;

    @FindBy(id = "filter_tag")
    private WebElement filterTag;

    @FindBy(id = "filter_language")
    private WebElement filterLanguage;

    private final WebDriver webDriver;

    public VideosPage(WebDriverFactory factory) {
        this.webDriver = factory.getDriver();
        PageFactory.initElements(webDriver, this);
    }

    public void searchFor(String text) {
        searchField.sendKeys(text);

    }

    public List<WebElement> getEventCards() {
        return eventCards;
    }

    public void clickFilterTag(){
        filterTag.click();
    }

    public boolean checkFilterPanelIsOpened(){
        return filterTag.getAttribute("aria-expanded").equalsIgnoreCase("true");
    }
    public void clickFilterLanguage(){
        filterLanguage.click();
    }

    public boolean checkLanguageFilterPanelIsOpened(){
        return filterLanguage.getAttribute("aria-expanded").equalsIgnoreCase("true");
    }
}
