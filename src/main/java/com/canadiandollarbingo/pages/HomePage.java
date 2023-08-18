package com.canadiandollarbingo.pages;

import com.aventstack.extentreports.Status;
import com.canadiandollarbingo.customlisteners.CustomListeners;
import com.canadiandollarbingo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;


public class HomePage extends Utility {
    private static final Logger log= LogManager.getLogger(HomePage.class);

    @CacheLookup
    @FindBy(xpath = "//a[@id='games']")
    WebElement gameMenu;

    @CacheLookup
    @FindBy(xpath = "//a[text()='Bingo']")
    WebElement bingo;

    @CacheLookup
    @FindBy(xpath = "//a[@id='bonuses']")
    WebElement bonuses;

    @CacheLookup
    @FindBy(xpath="//a[contains(text(),'Calculate your Bonus!')]")
    WebElement calculateYourBonus;

    public void mouseHoverToGameMenu()
    {
        mouseHoverToElement(gameMenu);
        log.info("Mouse hover in game menu");
        CustomListeners.test.log(Status.PASS, "Mouse hover in game menu");
    }
    public void clickOnBingo()
    {
        clickOnElement(bingo);
        log.info("Click on Bingo in game category");
        CustomListeners.test.log(Status.PASS, "Click on Bingo in game category");
    }
    public void mouseHoverBonusesMenu()
    {
        mouseHoverToElement(bonuses);
        log.info("Mouse hover in Bonuses menu");
        CustomListeners.test.log(Status.PASS, "Mouse hover in Bonuses menu");
    }
public void clickOnCalculateYourBonus()
{
    clickOnElement(calculateYourBonus);
    log.info("Click on calculate your bonus in bonuses category");
    CustomListeners.test.log(Status.PASS, "Click on calculate your bonus in bonuses category");
}

}
