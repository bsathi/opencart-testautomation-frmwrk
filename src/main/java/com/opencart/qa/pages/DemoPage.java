package com.opencart.qa.pages;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

public class DemoPage {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = null;
//        ChromeOptions co = new ChromeOptions();
//        co.addArguments("--no-sandbox");
//        co.addArguments("--disable-dev-shm-usage");
//        co.addArguments("--disable-gpu");
//        co.addArguments("--remote-allow-origins=*");
//        co.addArguments("--window-size=1920,1080");
        
        FirefoxOptions fo = new FirefoxOptions();
        fo.setCapability("browserName", "firefox");

        try {
            driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), fo);
            driver.get("https://www.google.com");
            Thread.sleep(10000);
            System.out.println(driver.getTitle());
            driver.quit();
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
    }
}