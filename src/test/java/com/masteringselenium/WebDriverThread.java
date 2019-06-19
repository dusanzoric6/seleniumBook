package com.masteringselenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

public class WebDriverThread {

    private WebDriver webdriver;

    private final String operatingSystem = System.getProperty("os.name").toUpperCase();
    private final String systemArchitecture = System.getProperty("os.arch");

    public WebDriver getDriver() throws Exception {
        if (webdriver == null) {
            System.out.println(" ");
            System.out.println("Current Operating System: " + operatingSystem);
            System.out.println("Current Architecture: " + systemArchitecture);
            System.out.println("Current Browser Selection: Firefox");
            System.out.println(" ");
            webdriver = new FirefoxDriver(new FirefoxOptions());
        }

        return webdriver;
    }

    public void quitDriver() {
        if (webdriver != null) {
            webdriver.quit();
            webdriver = null;
        }
    }
}
