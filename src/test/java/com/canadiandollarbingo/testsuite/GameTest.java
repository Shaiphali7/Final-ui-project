package com.canadiandollarbingo.testsuite;

import com.canadiandollarbingo.customlisteners.CustomListeners;
import com.canadiandollarbingo.pages.GamePage;
import com.canadiandollarbingo.pages.HomePage;
import com.canadiandollarbingo.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(CustomListeners.class)

public class GameTest extends BaseTest {
    HomePage homePage;
    GamePage gamePage;
    @BeforeMethod(groups = {"sanity","smoke"})
    public void inIt()
    {
        homePage=new HomePage();
        gamePage=new GamePage();
    }
    //Checking the game page functionality
    @Test(groups = {"smoke"})
    public void verifyGamePageFunctionality()
    {
        //Mouse hover to game menu
       homePage.mouseHoverToGameMenu();
       //click on Bingo
       homePage.clickOnBingo();
      String actualBingoText= gamePage.getBingoText();
      //Verify text "Bingo"
        Assert.assertEquals(actualBingoText,"Bingo","Not a right page");
//Select Parlay slot in Game page and verify text "Slot"
        gamePage.clickOnParlaySlot();
        String actualParlayText=gamePage.getSlotText();
        Assert.assertEquals(actualParlayText,"Slot","You are not on right page");

    }

}
