package com.banking;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest {

    protected WebDriver driver;
    protected WebDriverWait wait;

    @BeforeMethod
    public void setUp() {

        driver = new ChromeDriver();

        driver.manage().window().maximize();

        wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        // Open application
        driver.get("http://localhost/Banking_Application/");

        // Enter username
        wait.until(ExpectedConditions.visibilityOfElementLocated(
                By.cssSelector("input[placeholder='Username']")
        )).sendKeys("admin");

        // Enter password
        driver.findElement(
                By.cssSelector("input[placeholder='Password']")
        ).sendKeys("admin123");

        // Click Login
        driver.findElement(
                By.xpath("//button[normalize-space()='Login'] | //input[@type='submit']")
        ).click();

        // Wait for successful login
        wait.until(ExpectedConditions.urlContains("dashboard.php"));
    }

    @AfterMethod
    public void tearDown() {

        if (driver != null) {
            driver.quit();
        }
    }
}