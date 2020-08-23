package com.techproed;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Day06_Facebook {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\avumu\\Documents\\selenium dependencies\\drivers\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("https://facebook.com");

        //1. email kutusuna techproed@gmail.com yazdiralim
        WebElement emailKutusu = driver.findElement(By.id("email"));
        emailKutusu.sendKeys("techproed@gmail.com");

        //2. sifre kutusuna Test1234 yazdiralim
        WebElement sifreKutusu = driver.findElement(By.id("pass"));
        sifreKutusu.sendKeys("Test1234");
        //xpath ile WebElement sifreKutusu = driver.findElement(By.xpath("//input[@type='password']"));

        //3. adim login butonunu bulalim
        WebElement loginButonu = driver.findElement(By.xpath("//*[@name='login']"));//xpath ile
        //WebElement loginButonu = driver.findElement(By.cssSelector("#u_0_d")) // (By.xpath("//button"));
        loginButonu.click();//oder  loginButonu.submit();

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
        }

        //https://www.facebook.com/login/

        String url = driver.getCurrentUrl();

        if (url.contains("facebook.com/login/")) {
            System.out.println("Giris Basarisiz!!");
        }else {
            System.out.println("Giris Basarili");
        }

        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
        }

        driver.quit();

    }
}
