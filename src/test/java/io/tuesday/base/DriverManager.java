package io.tuesday.base;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class DriverManager {

        WebDriver driver=null;
        public WebDriver getBrowserDriver(String driverName){
            if(driverName.equalsIgnoreCase("chrome")) {//chrome
                WebDriverManager.chromedriver().setup();
                driver = new ChromeDriver();
            }else if(driverName.equalsIgnoreCase("msedge")){//edge
                WebDriverManager.edgedriver().setup();
                driver=new EdgeDriver();
            }
            return driver;
        }
    }


