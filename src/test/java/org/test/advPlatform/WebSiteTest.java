package org.test.advPlatform;

import com.codeborne.selenide.ElementsCollection;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.Random;

import static com.codeborne.selenide.Condition.id;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;

public class WebSiteTest {
    private final String baseURL = "https://www.ss.com/en";
    private int favoritesCounter;
//    private ElementsCollection advItemsList = $$("tbody .main_category a");

    public WebSiteTest() {
        System.setProperty("webdriver.chrome.driver", "C:/Users/MarinaPv/Downloads/chromedriver_win32/chromedriver.exe");
        System.setProperty("selenide.browser", "Chrome");
    }

    @BeforeTest
    public void openBrowser(){
        open(baseURL);
    }

    @Test
    public void userCanAddSingleAdvertiseItemToFavorites() {
    /*    do {
            int advItemIndex = random(0, advItemsList.size() - 1);
            advItemsList.get(advItemIndex).click();
        }
        while ();*/
        //given
        String advCategoryId = "#mtd_14025";
        $(advCategoryId).click();
        String advSubCategoryId = "#ahc_85711";
        $(advSubCategoryId).click();
        String itemIdUniqueValue = "47468173";
        String itemIdOnIndvidualView = "#dm_" + itemIdUniqueValue;
        $(itemIdOnIndvidualView).click();
        //when
        String addToFavoritesOnIndividualView = "#a_fav" ; //maybe combine but I don't think so
        String addToFavoritesTextExpected = "Add to favorites"; //maybe combine but I don't think so
        $(addToFavoritesOnIndividualView).shouldHave(text(addToFavoritesTextExpected)).click();
        String addedToFavoritesAlert = "#alert_msg"; //maybe combine?
        String addedToFavoritesAlertTextExpected = "Advertisement added to favorites"; //maybe combine?
        $(addedToFavoritesAlert).shouldHave(text(addedToFavoritesAlertTextExpected));
        String addedToFavoritesAlertOkButton = "#alert_ok"; //maybe combine?
        $(addedToFavoritesAlertOkButton).click();
        //then
        String favoritesMenu = "#main_table span.page_header_menu span .a_menu"; //maybe combine?
        String favoritesMenuTextExpected = "Memo";
        $(favoritesMenu).shouldHave(text(favoritesMenuTextExpected)).click();
        String itemIdElementsOnFavoritesMenu = "#filter_frm table"; //maybe combine?
        String itemIdTagOnFavoritesMenu = "tr"; //maybe combine?
        String itemIdOnFavoritesMenu = "tr_" + itemIdUniqueValue;
        //$$should have? >the same rework in multiple case
        //$$(itemIdElementsOnFavoritesMenu "tr").shouldHave(itemFirstIdOnFavoritesMenu)
//all asserts should be here
// $(itemIdElementsOnFavoritesMenu,0).$(itemIdTagOnFavoritesMenu, 1).shouldHave(id(itemIdOnFavoritesMenu));
    }

    @AfterTest
    public void GoToMainPage(){
        $(".page_header_logo").click();
    }


    @Test
    public void userCanAddMultipleAdvertiseItemToFavorites() {
        //given
        String advCategoryId = "#mtd_13";
        $(advCategoryId).click();
        String advSubCategoryId = "#ahc_4926";
        $(advSubCategoryId).click();
        String itemFirstIdUniqueValue = "46942411";
        String itemSecondIdUniqueValue = "47078675";
        String itemFirstIdOnIndvidualView = "#c" + itemFirstIdUniqueValue;
        String itemSecondIdOnIndvidualView = "#c" + itemSecondIdUniqueValue;
        $(itemFirstIdOnIndvidualView).click();
        //implement scroll
        $(itemSecondIdOnIndvidualView).click();
        //when
        String addToFavoritesOnIndividualView = "#a_fav_sel" ;
        String addToFavoritesTextExpected = "Add to favorites"; //maybe combine
      //  $(addToFavoritesOnIndividualView).shouldHave(text(addToFavoritesTextExpected)).click();
        String addedToFavoritesAlert = "#alert_msg"; //maybe combine
        String addedToFavoritesAlertTextExpected = "Advertisement added to favorites"; //maybe combine
        // $(addedToFavoritesAlert).shouldHave(text(addedToFavoritesAlertTextExpected));
        String addedToFavoritesAlertOkButton = "#alert_ok"; //maybe combine?
        $(addedToFavoritesAlertOkButton).click();
        //then
        String favoritesMenu = "#main_table span.page_header_menu span .a_menu"; //combine!
        String favoritesMenuTextExpected = "Memo";//combine!
        $(favoritesMenu).shouldHave(text(favoritesMenuTextExpected)).click();//general function
        String itemIdElementsOnFavoritesMenu = "#filter_frm table"; //maybe combine?
        String itemIdTagOnFavoritesMenu = "tr"; //maybe combine?
        String itemFirstIdOnFavoritesMenu = "tr_" + itemFirstIdUniqueValue;
        String itemSecondIdOnFavoritesMenu = "tr_" + itemSecondIdUniqueValue;
        //$$should have? >the same rework in single case
        //$$(itemIdElementsOnFavoritesMenu "tr").shouldHave(itemFirstIdOnFavoritesMenu)
//all asserts should be here
        $(itemIdElementsOnFavoritesMenu,0).$(itemIdTagOnFavoritesMenu, 1).shouldHave(id(itemFirstIdOnFavoritesMenu));
        $(itemIdElementsOnFavoritesMenu,0).$(itemIdTagOnFavoritesMenu, 2).shouldHave(id(itemSecondIdOnFavoritesMenu));

    }


    //counter
    //add to favorites - I don't think so
    //checked unchecked and uncheck checked - TEST
    //go to favorites
    // check in favorites


/*    private int random (int min, int max){
        Random r = new Random();
        return r.ints(min, max).findFirst().getAsInt();
    }*/

}
