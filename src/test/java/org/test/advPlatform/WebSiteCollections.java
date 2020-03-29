package org.test.advPlatform;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.commands.ScrollTo;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import static org.apache.commons.lang3.RandomStringUtils.*;

import javax.swing.*;
import java.util.Random;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.*;


public class WebSiteCollections {
    public int random(int min, int max) {
        Random r = new Random();
        return r.ints(min, max).findFirst().getAsInt();
    }

    public ElementsCollection advItemsList = $$("tbody tr");

    public int advItemIndex = random(0, advItemsList.size() - 1);

    //String memoryCardItemLinkId = advItemsList.get(advItemIndex).click();

   // public String getAdvItemId() {
     //   //String randomIndex = advItemsList.get(advItemIndex).toString();
       //   return $("tbody tr", advItemIndex).toString();

    //}
}