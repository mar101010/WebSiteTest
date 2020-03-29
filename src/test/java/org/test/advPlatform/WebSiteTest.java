package org.test.advPlatform;

import org.testng.annotations.Test;
import org.testng.Assert;
import org.testng.annotations.*;

public class WebSiteTest {

    WebSitePage webSitePage = new WebSitePage();
    WebSitePageAddToFavorites webSitePageAdd = new WebSitePageAddToFavorites();
    WebSitePageFavorites webSitePageFav = new WebSitePageFavorites();

    @BeforeClass
    public void chromeBrowserOpen(){
        webSitePage.open();
    }

    @Test
    public void userCanAddOneItemToFavorites() {
        //given
        webSitePage.clickOnPhonesCategory();
        webSitePage.clickOnMemoryCardsSubCategory();
        webSitePage.clickOnMemoryCardItem();
        webSitePageAdd.clickOnAddToFavOneItemLink();
        webSitePageAdd.clickOnAddToFavOkBtn();
        String favCountTextActual = webSitePageFav.getFavCountLinkText();
        //when
        webSitePageFav.clickOnFavMenuLink();
        //then
        Assert.assertTrue(webSitePageFav.isMemCardItemAddedToFav());
        Assert.assertEquals(favCountTextActual, " (1)");
    }

    @AfterClass
    public void closeBrowser() {
        webSitePage.close();
    }

    @Test
    public void userSeesCorrectTextsAddingOneItem() {
        //given
        webSitePage.clickOnPhonesCategory();
        webSitePage.clickOnMemoryCardsSubCategory();
        webSitePage.clickOnMemoryCardItem();
        String addToFavOneItemLinkTextActual = webSitePageAdd.getAddToFavOneItemLinkText();
        webSitePageAdd.clickOnAddToFavOneItemLink();
        String addedToFavAlertTextActual = webSitePageAdd.getAddedToFavAlertText();
        //when
        webSitePageAdd.clickOnAddToFavOkBtn();
        String favMenuLinkTextActual = webSitePageFav.getFavMenuLinkText();
        //then
        Assert.assertEquals(addToFavOneItemLinkTextActual,"Add to favorites");
        Assert.assertEquals(addedToFavAlertTextActual, "Advertisement added to favorites.");
        Assert.assertEquals(favMenuLinkTextActual, "Memo");
    }

    @Test
    public void userCanAddOneByOneItemsToFavorites() {
        //given
        webSitePage.clickOnOfficesCategory();
        webSitePage.clickOnKraslavaSubCategory();
        webSitePage.clickOnKraslavaItem();
        webSitePageAdd.clickOnAddToFavOneItemLink();
        webSitePageAdd.clickOnAddToFavOkBtn();
        webSitePageFav.clickOnFavMenuLink();
        webSitePage.goToMainPage();
        webSitePage.clickOnJewellyCategory();
        webSitePage.clickOnChainsSubCategory();
        webSitePage.clickOnChainItem();
        webSitePageAdd.clickOnAddToFavOneItemLink();
        webSitePageAdd.clickOnAddToFavOkBtn();
        //when
        webSitePageFav.clickOnFavMenuLink();
        //then
        Assert.assertTrue(webSitePageFav.isKraslavaItemAddedToFav());
        Assert.assertTrue(webSitePageFav.isChainItemAddedToFav());
    }

    @Test
    public void userCanAddFewItemsToFavorites() {
        //given
        webSitePage.clickOnBicyclesCategory();
        webSitePage.clickOnTandemSubCategory();
        webSitePageAdd.checkTandemFirstItemBox();
        webSitePageAdd.checkTandemSecondItemBox();
        webSitePageAdd.clickOnAddToFavItemsListLink();
        webSitePageAdd.clickOnAddToFavOkBtn();
        String favCountTextActual = webSitePageFav.getFavCountLinkText();
        //when
        webSitePageFav.clickOnFavMenuLink();
        //then
        Assert.assertTrue(webSitePageFav.isTandemFirstItemAddedToFav());
        Assert.assertTrue(webSitePageFav.isTandemSecondItemAddedToFav());
        Assert.assertEquals(favCountTextActual, " (2)");
    }

    @Test
    public void userSeesCorrectTextsAddingFewItems() {
        //given
        webSitePage.clickOnBicyclesCategory();
        webSitePage.clickOnTandemSubCategory();
        webSitePageAdd.checkTandemFirstItemBox();
        webSitePageAdd.checkTandemSecondItemBox();
        //when
        String addToFavItemsListLinkTextActual = webSitePageAdd.getAddToFavItemsListLinkText();
        webSitePageAdd.clickOnAddToFavItemsListLink();
        String addedToFavAlertTextActual = webSitePageAdd.getAddedToFavAlertText();
        webSitePageAdd.clickOnAddToFavOkBtn();
        //then
        Assert.assertEquals(addToFavItemsListLinkTextActual,"Add to favorites");
        Assert.assertEquals(addedToFavAlertTextActual, "Advertisement added to favorites.");
    }
}
