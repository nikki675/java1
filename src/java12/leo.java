package java12;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class leo

{	 public static String url ="https://www.google.com";
public static void main(String[] args) {
	 System.setProperty("webdriver.chrome.driver","C://Users//91636//chromedriver.exe");
	  WebDriver driver= new ChromeDriver();
driver.get(url);
}
}
