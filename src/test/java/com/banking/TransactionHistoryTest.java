package com.banking;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class TransactionHistoryTest extends BaseTest {

    @Test
    public void transactionHistoryTest() {

        driver.findElement(By.linkText("Transaction History")).click();

        System.out.println("Transaction History page opened successfully");
    }
}
