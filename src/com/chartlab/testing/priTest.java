package com.chartlab.testing;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Created by vinodnayal on 28-01-2018.
 */
public class priTest {
    public static void main(String[] args) {

        WebDriver d = new ChromeDriver();
        d.get("https://google.com");

        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int sum = a+b;
        System.out.println("sum=" + sum);

    }
}
