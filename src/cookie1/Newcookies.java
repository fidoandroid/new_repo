package cookie1;

import java.util.Iterator;
import java.util.Set;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

    public class Newcookies {
	public static void main(String[] args ) {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\RAHUL\\Desktop\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	String baseurl="https://www.facebook.com/";
	driver.get(baseurl);
	
	
    Set<Cookie>cookies=driver.manage().getCookies();
    Iterator<Cookie> csk= cookies.iterator();
    while(csk.hasNext()) {
    Cookie c=csk.next();
    System.out.println("Domain name:"+c.getDomain());
    
        
    
          }
	 }
 	
	
}
