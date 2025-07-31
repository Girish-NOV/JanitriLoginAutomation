package com.janitri.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.testng.annotations.*;

import java.time.Duration;

public class LoginTest {

    WebDriver driver;

    @BeforeClass
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @Test
    public void testLogin() throws Exception {
    driver.get("https://dashboard.janitri.in/");

    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

    WebElement emailField = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("formEmail")));
    WebElement passwordField = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("formPassword")));
    WebElement loginButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@type='submit']")));

    emailField.sendKeys("girishbhanu8@gmail.com");
    passwordField.sendKeys("Girish@2003");
    loginButton.click();

    wait.until(ExpectedConditions.urlContains("dashboard"));
    System.out.println("🟢 Logged in. Press ENTER to close the browser...");
    System.in.read();
    }
}



