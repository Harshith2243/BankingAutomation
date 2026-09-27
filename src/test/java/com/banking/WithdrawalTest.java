package com.banking;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class WithdrawalTest extends BaseTest {

    @Test
    public void withdrawalTest() {

        driver.findElement(By.linkText("Withdrawal")).click();

        System.out.println("Withdrawal page opened successfully");
    }
}
