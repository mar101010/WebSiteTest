package org.test.advPlatform;

import static com.codeborne.selenide.Selenide.$;

// class contains data relevant to Favorites (Memo) page
public class WebSitePageFavorites {

    WebSitePage webSitePage = new WebSitePage();

    // set the link of Favorites menu button
    public final String favMenuLinkId = "#main_table span.page_header_menu span .a_menu";

    // get the text on Favorites menu button
    public String getFavMenuLinkText(){
        return $(favMenuLinkId).getText();
    }

    // click on Favorites menu button
    public void clickOnFavMenuLink(){
        $(favMenuLinkId).click();
    }

    // set the link of count of items added to Favorites menu
    public String favoritesCountLinkId = "#mnu_fav_id";

    // get the count of items added to Favorites menu
    public String getFavCountLinkText(){
        final String favoritesCountTextAct=$(favoritesCountLinkId).getText();
        return favoritesCountTextAct;
    }

    // make sure if every single item is added to Favorites

    public boolean isMemCardItemAddedToFav(){
        return $(webSitePage.memoryCardItemLinkId).exists();
    }

    public boolean isKraslavaItemAddedToFav(){
        return $(webSitePage.kraslavaItemLinkId).exists();
    }

    public boolean isChainItemAddedToFav(){
        return $(webSitePage.chainItemLinkId).exists();
    }

    public boolean isTandemFirstItemAddedToFav(){
        return $(webSitePage.tandemFirstItemLinkId).exists();
    }

    public boolean isTandemSecondItemAddedToFav(){
        return $(webSitePage.tandemSecondItemLinkId).exists();
    }
}
