package com.techproed;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day02_IfElse {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\avumu\\Documents\\selenium dependencies\\drivers\\chromedriver.exe");

        WebDriver driver =new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("http://amazon.com");

        String sayfaBasligi = driver.getTitle(); //Car

        if (sayfaBasligi.contains("Car")){
            System.out.println("Car kelimesi geciyor :"+ sayfaBasligi);
        }else {
            System.out.println("Car kelimesi gecmiyor." + sayfaBasligi);
        }
        driver.quit();
    }
}
