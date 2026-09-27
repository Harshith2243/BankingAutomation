package com.banking;

import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {

    @Test
    public void validLoginTest() {

        Assert.assertTrue(
                driver.getCurrentUrl().contains("dashboard.php"),
                "Login was not successful"
        );

        System.out.println("Valid Login test passed successfully");
    }
}