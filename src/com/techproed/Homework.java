package com.techproed;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Homework {


    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","C:\\Users\\avumu\\Documents\\selenium dependencies\\drivers\\chromedriver.exe");

        WebDriver webDriver = new ChromeDriver();

        webDriver.get("http://facebook.com");

        String titleFacebook  = webDriver.getTitle();

        if (titleFacebook.contains("facebook")){
            System.out.println(titleFacebook + "sayfa basligi 'facebook' kelimesini iceriyor");
        }else {
            System.out.println(titleFacebook);
        }

        String url = webDriver.getCurrentUrl();
        if (url.contains("facebook")){
            System.out.println(url + "sayfa basligi 'facebook' kelimesini iceriyor");
        }else {
            System.out.println(url);
        }

        webDriver.navigate().to("http://www.walmart.com");

        String titleWalmart  = webDriver.getTitle();
        if (titleWalmart.contains("Walmart.com")){
            System.out.println(titleWalmart + "sayfa basligi 'Walmart.com' kelimesini iceriyor");
        }else {
            System.out.println(titleWalmart);
        }
        webDriver.navigate().back();

        webDriver.navigate().refresh();

        webDriver.manage().window().maximize();

        webDriver.close();

    }
}
