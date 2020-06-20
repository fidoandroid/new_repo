package cookie;

import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Cookies {
	public static void main(String[] args ) {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\RAHUL\\Desktop\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	String baseurl="https://www.facebook.com/";
	driver.get(baseurl);
	
	Set<Cookie> allcookies=driver.manage().getCookies();
	System.out.println("list of all cookies:"+allcookies.size());
	
	for (Cookie cookies:allcookies) {
		System.out.println("Domain"+cookies.getDomain());
		System.out.println("Name"+cookies.getName());
		System.out.println("Name"+cookies.getPath());
		System.out.println("Name"+cookies.getValue());
		System.out.println("Name"+cookies.getExpiry());
	}
	driver.manage().deleteAllCookies();
	
	}

}
