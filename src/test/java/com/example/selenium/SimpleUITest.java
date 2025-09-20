package com.example.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class SimpleUITest {
    @Test
    public void testHomePageTitle() {
        System.setProperty("webdriver.chrome.driver", "/usr/bin/chromedriver");
        WebDriver driver = new ChromeDriver();

        driver.get("http://<TEST_SERVER_IP>:8081/");
        String title = driver.getTitle();

        assertEquals("Expected Title", title);

        driver.quit();
    }
}

