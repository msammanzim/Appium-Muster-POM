package com.emi.calculator.sereens;

import com.aventstack.extentreports.Status;
//import com.emi.calculator.report.ReportTestManager;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;

public class BaseScreen extends Screen {
    public BaseScreen(AndroidDriver driver) {
        super(driver);
    }

    @Override
    public String getPageTittle() {
        return driver.getTitle().trim();
    }

    @Override
    public WebElement getWebElement(By locator) {

        WebElement element = null;
        try {
            element = driver.findElement(locator);
        } catch (Exception e) {
            System.out.println(locator.toString() + " Select or Locator Not Found");

        }

        return element;
    }

    @Override
    public List<WebElement> getWebElements(By locator) {

        List<WebElement> elements = null;
        try {
            elements = driver.findElements(locator);
        } catch (Exception e) {
            System.out.println(locator.toString() + " Select or Locator Not Found");

        }

        return elements;

    }

    @Override
    public void waitForElement(By locator) {
        try {
            wait.until(ExpectedConditions.presenceOfElementLocated(locator));
        } catch (Exception e) {
            System.out.println(locator.toString() + " Select or Locator Not Found");
        }
    }

//    public void addInfo(String message) {
//        if (ReportTestManager.getTest() != null) {
//            ReportTestManager.getTest().log(Status.INFO, message);
//        }
//
//
//    }
}
