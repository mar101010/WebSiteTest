package org.test.advPlatform;

import org.testng.annotations.Test;
import org.testng.Assert;
import org.testng.annotations.*;
import org.testng.asserts.SoftAssert;

public class WebSiteTest {

    private WebSitePage webSitePage = new WebSitePage();
    private WebSitePageAddToFavorites webSitePageAdd = new WebSitePageAddToFavorites();
    private WebSitePageFavorites webSitePageFav = new WebSitePageFavorites();
    private SoftAssert softAssert = new SoftAssert();

    @BeforeTest
    public void chromeBrowserOpen(){
        webSitePage.open();
    }

    // test #1
    @Test
    public void userCanAddOneItemToFavorites() {
        //given
        webSitePage.clickOnPhonesCategory();
        webSitePage.clickOnMemoryCardsSubCategory();
        webSitePage.clickOnMemoryCardItem();
        webSitePageAdd.clickOnAddToFavOneItemLink();
        webSitePageAdd.clickOnAddToFavOkBtn();
        //when
        webSitePageFav.clickOnFavMenuLink();
        //then
        Assert.assertTrue(webSitePageFav.isMemCardItemAddedToFav());
        webSitePage.goToMainPage();
        //driver.quit();
    }


    // test #2
    @Test
    public void userSeesCorrectTextsAddingOneItem() {
        //given
        webSitePage.clickOnFemClothesCategory();
        webSitePage.clickOnShortsSubCategory();
        webSitePage.clickOnShortsItem();
        String addToFavOneItemLinkTextActual = webSitePageAdd.getAddToFavOneItemLinkText();
        webSitePageAdd.clickOnAddToFavOneItemLink();
        String addedToFavAlertTextActual = webSitePageAdd.getAddedToFavAlertText();
        //when
        webSitePageAdd.clickOnAddToFavOkBtn();
        String favMenuLinkTextActual = webSitePageFav.getFavMenuLinkText();
        String favCountTextActual = webSitePageFav.getFavCountLinkText();
        //then
        softAssert.assertEquals(addToFavOneItemLinkTextActual,"Add to favorites", "Wrong add to favorites text: ");
        softAssert.assertEquals(addedToFavAlertTextActual, "Advertisement added to favorites.", "Wrong added to favorites message: ");
        softAssert.assertEquals(favMenuLinkTextActual, "Memo", "Wrong favorites menu text: ");
        softAssert.assertEquals(favCountTextActual, " (1)", "wrong favorites count: ");
        softAssert.assertAll();
        webSitePage.goToMainPage();
    }

    // test #3
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
        webSitePage.goToMainPage();
    }

    // test #4
    @Test
    public void userCanAddFewItemsToFavorites() {
        //given
        webSitePage.clickOnBicyclesCategory();
        webSitePage.clickOnTandemSubCategory();
        webSitePageAdd.checkTandemFirstItemBox();
        webSitePageAdd.checkTandemSecondItemBox();
        webSitePageAdd.clickOnAddToFavItemsListLink();
        webSitePageAdd.clickOnAddToFavOkBtn();
        //when
        webSitePageFav.clickOnFavMenuLink();
        //then
        Assert.assertTrue(webSitePageFav.isTandemFirstItemAddedToFav());
        Assert.assertTrue(webSitePageFav.isTandemSecondItemAddedToFav());
        webSitePageAdd.checkTandemFirstItemBox();
        webSitePageAdd.checkTandemSecondItemBox();
        webSitePage.goToMainPage();
    }

    // test #5
    @Test
    public void userSeesCorrectTextsAddingFewItems() {
        //given
        webSitePage.clickOnRodendantsCategory();
        webSitePage.clickOnRatsSubCategory();
        webSitePageAdd.checkRatFirstItemBox();
        webSitePageAdd.checkRatSecondItemBox();
        //when
        String addToFavItemsListLinkTextActual = webSitePageAdd.getAddToFavItemsListLinkText();
        webSitePageAdd.clickOnAddToFavItemsListLink();
        String addedToFavAlertTextActual = webSitePageAdd.getAddedToFavAlertText();
        webSitePageAdd.clickOnAddToFavOkBtn();
        String favCountTextActual = webSitePageFav.getFavCountLinkText();
        webSitePageAdd.checkRatFirstItemBox();
        webSitePageAdd.checkRatSecondItemBox();
        //then
        softAssert.assertEquals(addToFavItemsListLinkTextActual,"Add to favorites", " ");
        softAssert.assertEquals(addedToFavAlertTextActual, "Advertisement added to favorites.", " ");
        softAssert.assertEquals(favCountTextActual, " (2)");
        softAssert.assertAll();
        webSitePage.goToMainPage();
    }
}
