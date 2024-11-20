package org.example;

import org.openqa.selenium.UsernameAndPassword;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.CustomerLookupPage;
import pages.CustomerRegistrationPage;
import pages.HomePage;
import pages.UsernameGenerator;

public class Main {
    public static void main(String[] args) {
        System.out.println(UsernameGenerator.generateUsername());
    }
}