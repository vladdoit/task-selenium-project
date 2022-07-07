package net.passwordsgenerator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GeneratePasswordPage {

    WebDriver driver = new ChromeDriver();

    WebElement generatePasswordButton = driver.findElement(By.className("GenerateBtn"));
    WebElement generatePasswordOutput = driver.findElement(By.className("final_pass"));
    WebElement includeSymbolsCheckbox = driver.findElement(By.id("Symbols"));
    WebElement passwordLengthSelect = driver.findElement(By.id("pgLength"));
    Select passwordLengthSelectObject = new Select(passwordLengthSelect);

    public String generateNewPassword() {
        generatePasswordButton.click();
        return generatePasswordOutput.getAttribute("value");
    }

}
