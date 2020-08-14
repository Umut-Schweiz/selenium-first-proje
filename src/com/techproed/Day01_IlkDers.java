package com.techproed;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day01_IlkDers {

    public static void main(String[] args) {

        //Java projemize, chromedriver'i tanittik.
        System.setProperty("webdriver.chrome.driver","C:\\Users\\avumu\\Documents\\selenium dependencies\\drivers\\chromedriver.exe");

        //Selenium ile ilgili ilk kodumuz.
        //webDriver nesnesi olusturarak, chrome driver'i kullanabilir hale getirdik
        WebDriver webDriver = new ChromeDriver();

        //driver'imiza google.com'a gitmesini soyledik.
        webDriver.get("http://google.com");

        webDriver.close();

    }
}
