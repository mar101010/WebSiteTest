package org.test.advPlatform;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import static com.codeborne.selenide.Selenide.$;

// class contains advertisement categories and items specific data
public class WebSitePage {

    //web browser setup
    public WebSitePage() {
//        System.setProperty("webdriver.chrome.driver", "C:/Users/MarinaPv/Downloads/chromedriver_win32/chromedriver.exe");
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        System.setProperty("selenide.browser", "Chrome");
        Configuration.baseUrl = "https://www.ss.com/en";
    }

    // open web browser
    public WebSitePage open() {
        Selenide.open("/");
        return this;
    }

    // close web browser
    public WebSitePage close() {
        Selenide.close();
        return this;
    }

    // list of advertisement individual Items
    final String memoryCardItemLinkId = "#tr_47451896";
    final String kraslavaItemLinkId = "#tr_46358513";
    final String chainItemLinkId = "#tr_47391481";
    final String tandemFirstItemLinkId = "#tr_46466145";
    final String tandemSecondItemLinkId = "#tr_46027958";

    // access Phones category
    public void clickOnPhonesCategory() {
        final String phonesCategoryLinkId = "#mtd_14025";
        $(phonesCategoryLinkId).click();
    }

    // access Memory Card subcategory
    public void clickOnMemoryCardsSubCategory() {
        final String memoryCardsCategoryLinkId = "#ahc_85711";
        $(memoryCardsCategoryLinkId).click();
    }

    // access Memory Card item individual view
    public void clickOnMemoryCardItem() {
        $(memoryCardItemLinkId).click();
    }

    // access Offices category
    public void clickOnOfficesCategory() {
        final String officesCategoryLinkId = "#mtd_5457";
        $(officesCategoryLinkId).click();
    }

    // access Kraslava subcategory
    public void clickOnKraslavaSubCategory() {
        final String kraslavaCardsCategoryLinkId = "#ahc_19529";
        $(kraslavaCardsCategoryLinkId).click();
    }

    // access Kraslava item individual view
    public void clickOnKraslavaItem() {
        $(kraslavaItemLinkId).click();
    }

    // access Jewelly category
    public void clickOnJewellyCategory() {
        final String jewellyCategoryLinkId = "#mtd_297";
        $(jewellyCategoryLinkId).click();
    }

    // access Chains subcategory
    public void clickOnChainsSubCategory() {
        final String chainsSubCategoryLinkId = "#ahc_26367";
        $(chainsSubCategoryLinkId).click();
    }

    // access Chains item individual view
    public void clickOnChainItem() {
        $(chainItemLinkId).click();
    }

    // access Bicycles category
    public void clickOnBicyclesCategory() {
        final String bicyclesCategoryLinkId = "#mtd_179";
        $(bicyclesCategoryLinkId).click();
    }

    // access Tandem subcategory
    public void clickOnTandemSubCategory() {
        final String tandemSubCategoryLinkId = "#ahc_85394";
        $(tandemSubCategoryLinkId).click();
    }

    // click on web site logo to access main page
    public void goToMainPage(){
        final String logoToMainPage = ".page_header_logo";
        $(logoToMainPage).click();
    }

}

