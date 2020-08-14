package com.techproed;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day02_TitleUrlTest {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","C:\\Users\\avumu\\Documents\\selenium dependencies\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("http://youtube.com");

        String title = driver.getTitle();

        if (title.contains("Video")){
            System.out.println(title + " sayfa basligi 'Video' kelimesini Iceriyor");
        }else {
            System.out.println(title +" sayfa basligi 'Video' kelimesini Icermiyor");
        }

        driver.close();//driver.quit()
    }
}
