package com.banking;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DepositTest extends BaseTest {

    @Test
    public void depositTest() {

        // Already logged in by BaseTest

        // Click Deposit
        driver.findElement(By.linkText("Deposit")).click();

        // Enter amount
        driver.findElement(By.name("amount")).sendKeys("1000");

        // Submit deposit
        driver.findElement(By.xpath("//button[@type='submit']")).click();

        // Verify
        Assert.assertTrue(
                driver.getPageSource().contains("Deposit"),
                "Deposit page/result was not displayed"
        );

        System.out.println("Deposit test passed successfully");
    }
}