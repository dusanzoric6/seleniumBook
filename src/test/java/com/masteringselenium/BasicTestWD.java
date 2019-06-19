package com.masteringselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class BasicTestWD extends DriverFactory{

    private void googleExampleThatSearchesFor(final String searchString) throws Exception {

        WebDriver driver = DriverFactory.getDriver();

        driver.get("http://www.google.com");

        WebElement searchField = driver.findElement(By.name("q"));

        searchField.clear();
        searchField.sendKeys(searchString);

        System.out.println("Page title is: " + driver.getTitle());

        searchField.submit();

        (new WebDriverWait(driver, 10)).until(new ExpectedCondition<Boolean>() {
            public Boolean apply(WebDriver driverObject) {
                return driverObject.getTitle().toLowerCase().startsWith(searchString.toLowerCase());
            }
        });

        System.out.println("Page title is: " + driver.getTitle());
    }

    @Test
    public void googleCheeseExample() throws Exception {
        googleExampleThatSearchesFor("Cheese!");
    }

    @Test
    public void googleMilkExample() throws Exception {
        googleExampleThatSearchesFor("Milk!");
    }

    @Test
    public void googleGarlicExample() throws Exception {
        googleExampleThatSearchesFor("Garlic!");
    }

    @Test
    public void googleWaterExample() throws Exception {
        googleExampleThatSearchesFor("Water!");
    }

    @Test
    public void googleCheese2Example() throws Exception {
        googleExampleThatSearchesFor("Cheese2!");
    }

    @Test
    public void googleMilk2Example() throws Exception {
        googleExampleThatSearchesFor("Milk2!");
    }

    @Test
    public void googleGarlic2Example() throws Exception {
        googleExampleThatSearchesFor("Garlic2!");
    }

    @Test
    public void googleWater2Example() throws Exception {
        googleExampleThatSearchesFor("Water2!");
    }


}
