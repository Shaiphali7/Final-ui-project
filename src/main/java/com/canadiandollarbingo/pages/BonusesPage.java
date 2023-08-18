package com.canadiandollarbingo.pages;

import com.aventstack.extentreports.Status;
import com.canadiandollarbingo.customlisteners.CustomListeners;
import com.canadiandollarbingo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class BonusesPage extends Utility {
    private static final Logger log= LogManager.getLogger(BonusesPage.class);
    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Bonus Calculator')]")
    WebElement bonusCalculatorText;

    @CacheLookup
    @FindBy(xpath = "//a[contains(text(),'Throwback Thursday - 20% Back')]")
    WebElement throwbackThursday;

    @CacheLookup
    @FindBy(xpath = "//span[contains(text(),'Throwback Thursday - 20% Back EVERY week!')]")
    WebElement throwBackThursdayText;

    public String getBonusCalculatorText()
    {
        String message= getTextFromElement(bonusCalculatorText);
        log.info("Getting text for bonus calculator page ");
        CustomListeners.test.log(Status.PASS,"Get error message");
        return message;
    }
    public void clickOnThrowBackThursday()
    {
        clickOnElement(throwbackThursday);
        log.info("Click on 'Throw back Thursday' link");
        CustomListeners.test.log(Status.PASS, "Click on 'Throw back Thursday' link");
    }

    public String getThrowBackThursdayText()
    {
        String message= getTextFromElement(throwBackThursdayText);
        log.info("Getting text for Throw Back Thursday ");
        CustomListeners.test.log(Status.PASS,"Get error message");
        return message;
    }
}
