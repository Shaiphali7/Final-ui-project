package com.canadiandollarbingo.pages;

import com.aventstack.extentreports.Status;
import com.canadiandollarbingo.customlisteners.CustomListeners;
import com.canadiandollarbingo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class GamePage extends Utility {
    private static final Logger log= LogManager.getLogger(HomePage.class);
    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Bingo')]")
    WebElement bingoText;

    @CacheLookup
    @FindBy(xpath = "//body/div[@id='wrapper']/div[@id='wide-column-lobby']/div[2]/div[1]/div[1]/div[2]/button[1]/span[1]")
WebElement parlaySlot;
    @CacheLookup
    @FindBy(xpath = "//h1[contains(text,slots)]")
    WebElement slotText;
    public String getBingoText()
    {
        String message= getTextFromElement(bingoText);
        log.info("Getting text for Bingo page ");
        CustomListeners.test.log(Status.PASS,"Get error message");
        return message;
    }
    public void clickOnParlaySlot()
    {
        clickOnElement(parlaySlot);
        log.info("Click on paralay link");
        CustomListeners.test.log(Status.PASS, "Click on paralay link");
    }
      public String getSlotText()
    {
    String message= getTextFromElement(slotText);
        log.info("Getting text for Slot page ");
        CustomListeners.test.log(Status.PASS,"Get error message");
        return message;
    }
}
