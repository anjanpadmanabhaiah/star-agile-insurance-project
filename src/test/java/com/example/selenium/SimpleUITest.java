package com.example.selenium;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.URL;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SimpleUITest {

    @Test
    public void testHomePageTitle() throws Exception {
        // Connect to Selenium Grid (make sure it's running in Docker on Jenkins host)
        WebDriver driver = new RemoteWebDriver(
                new URL("http://localhost:4444/wd/hub"), 
                DesiredCapabilities.chrome()
        );

        // Use your Test Server IP
        driver.get("http://<TEST_SERVER_IP>:8081/");

        String title = driver.getTitle();

        // Replace with your actual homepage title
        assertEquals("Expected Title", title);

        driver.quit();
    }
}
