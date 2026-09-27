package com.banking;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class TransferTest extends BaseTest {

    @Test
    public void transferTest() {

        driver.findElement(By.linkText("Fund Transfer")).click();

        System.out.println("Fund Transfer page opened successfully");
    }
}
