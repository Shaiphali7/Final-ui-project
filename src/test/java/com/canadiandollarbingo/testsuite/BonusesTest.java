package com.canadiandollarbingo.testsuite;

import com.canadiandollarbingo.customlisteners.CustomListeners;
import com.canadiandollarbingo.pages.BonusesPage;
import com.canadiandollarbingo.pages.HomePage;
import com.canadiandollarbingo.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(CustomListeners.class)
public class BonusesTest extends BaseTest {
    HomePage homePage;
    BonusesPage bonusesPage;
    @BeforeMethod(groups = {"sanity","smoke"})
    public void inIt()
    {
        homePage=new HomePage();
        bonusesPage=new BonusesPage();
    }
    //Checking the bonuses page functionality
    @Test(groups = {"smoke"})
    public void verifyTheBonusesPageFunctionality()
    {

        //Mouse hover to Bonuses menu
        homePage.mouseHoverBonusesMenu();
        //click on calculate on your bonus
        homePage.clickOnCalculateYourBonus();
       //verify the text of bonus page
        String actualBonusCalculatorText=bonusesPage.getBonusCalculatorText();
        Assert.assertEquals(actualBonusCalculatorText,"Bonus Calculator","Not a right page");

    }

    @Test(groups = {"sanity","smoke"})
    public void verifyThrobackThursdayTextOnPage()
    {
        //Mouse hover to Bonuses menu
        homePage.mouseHoverBonusesMenu();
        //Verify the text of Throwback Thursday
        bonusesPage.clickOnThrowBackThursday();
        String actualText=bonusesPage.getThrowBackThursdayText();
        Assert.assertEquals(actualText,"Throwback Thursday - 20% Back EVERY week!","Not a right page");
    }
}
