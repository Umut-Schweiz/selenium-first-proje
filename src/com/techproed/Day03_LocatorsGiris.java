package com.techproed;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Day03_LocatorsGiris {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","C:\\Users\\avumu\\Documents\\selenium dependencies\\drivers\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(3000, TimeUnit.MILLISECONDS);
        driver.manage().window().maximize();
        driver.get("http://a.testaddressbook.com/");

        //ilk webelement'imizi buluyoruz.
        //Web sayfasindaki tum elemanlar -> WebElement== Non-Primitive Data Type

        //webelement'imize tikladik
        WebElement signInLink  = driver.findElement(By.id("sign-in"));
        signInLink.click();

        //e mail kutusunu bulalim
        WebElement emailKutusu =driver.findElement(By.id("session_email"));
        emailKutusu.sendKeys("testtechproed@gmail.com");

        //password kutusunu bulalim
        WebElement sifreKutusu = driver.findElement(By.id("session_password"));

        //sifre kutusunun icersine yazi gonderiyoruz
        sifreKutusu.sendKeys("Test1234!");

        //sign in butonunu buluyoruz
        WebElement signInButonu = driver.findElement(By.name("commit"));
        signInButonu.click();




        String baslik = driver.getTitle();
        if (baslik.equals("Address Book")){
            System.out.println("Giris Basarili");
        }else {
            System.out.println("Giris Basarisiz");
        }


    driver.quit();

    }
}
