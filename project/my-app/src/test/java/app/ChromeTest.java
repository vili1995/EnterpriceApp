package app;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeTest {
    @Test
    public void testGoogleSearch() throws InterruptedException {
        // Optional, if not specified, WebDriver will search your path for chromedriver.
        System.setProperty("webdriver.chrome.driver", "/Users/vilinice/Desktop/chromedriver");

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.jetabroad.com.au/");
        Thread.sleep(5000); // Let the user actually see something!
        WebElement searchBox = driver.findElement(By.name("ctl00$searchPanel$departFromTextBox"));
        searchBox.sendKeys("Bangkok (Suvarnabhumi International), Thailand (BKK)");

        WebElement arrivalBox = driver.findElement(By.name("ctl00$searchPanel$arriveIntoTextBox"));
        arrivalBox.sendKeys("Sydney, NSW, Australia (SYD)");

        WebElement departureDate = driver
                .findElement(By.name("ctl00$searchPanel$departDateUserControl$dayDropDownList"));
        departureDate.sendKeys("10");

        WebElement searchButton = driver.findElement(By.name("ctl00$searchPanel$flightSearchButton"));
        searchButton.click();

        Thread.sleep(20000); // Let the user actually see something!

        WebElement firstPrice = driver.findElement(By.xpath("//*[@id=\"pricePointPriceCell\"]/div[1]/span/span[2]"));
        System.out.println("First Price: " + firstPrice.getText());

        driver.quit();


    }
}