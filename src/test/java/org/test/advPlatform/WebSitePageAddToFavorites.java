package org.test.advPlatform;

import static com.codeborne.selenide.Selenide.*;

// class contains data relevant to adding items to Favorites
public class WebSitePageAddToFavorites {

    // set the link for "add to favorites" on item individual view
    public final String addToFavOneItemLinkId = "#a_fav" ;

    // get text of "add to favorites" on item individual view
    public String getAddToFavOneItemLinkText(){
        return $(addToFavOneItemLinkId).getText();
    }

    // click on "add to favorite"s on item individual view
    public void clickOnAddToFavOneItemLink() {
        $(addToFavOneItemLinkId).click();
    }

    // set links for checkboxes near some Tandem items in the list
    String tandemFirstItemCheckboxId = "#c46466145";
    String tandemSecondItemCheckboxId = "#c46027958";

    // check the box near some Tandem items in the list
    public void checkTandemFirstItemBox() {
        $(tandemFirstItemCheckboxId).click();
    }
    public void checkTandemSecondItemBox() {
        $(tandemSecondItemCheckboxId).click();
    }

    // set the link for "add to favorites" on items list
    public final String addToFavItemsListLinkId = "#a_fav_sel" ;

    // get text of "add to favorites" on items list
    public String getAddToFavItemsListLinkText(){
        return $(addToFavItemsListLinkId).getText();
    }

    // click on "add to favorite"s on items list
    public void clickOnAddToFavItemsListLink() {
        $(addToFavItemsListLinkId).click();
    }

    // set the link of added to favorites alert message
    public final String addedToFavItemAlertId = "#alert_msg";

    // get text of "add to favorites" alert message
    public String getAddedToFavAlertText(){
        return $(addedToFavItemAlertId).getText();
    }

    // set the link of Ok button
    public final String addedToFavoritesAlertOkButton = "#alert_ok";

    // click on Ok button on "added to favorites" alert message
    public void clickOnAddToFavOkBtn(){
        $(addedToFavoritesAlertOkButton).click();
    }
}

