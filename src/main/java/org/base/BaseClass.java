package org.base;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	private static final String Output = null;
	public static WebDriver driver;
    public static WebDriver chromeDriver() {
    	WebDriverManager.chromedriver().setup();
    	driver=new ChromeDriver();
		return driver;
    }
    public static WebDriver egdeDriver() {
    	WebDriverManager.edgedriver().setup();
    	driver=new EdgeDriver();
    	return driver;
    }
    public static WebDriver browserLaunch(String browsername) {
    	if(browsername.equalsIgnoreCase("chrome")) {
    		WebDriverManager.chromedriver().setup();
        	driver=new ChromeDriver();
    	}
    	else if(browsername.equalsIgnoreCase("edge")){
    		WebDriverManager.edgedriver().setup();
        	driver=new EdgeDriver();
    	}
    	return driver;
    }
    public static void urlLaunch(String url) {
		driver.get(url);
		driver.manage().window().maximize();
		}
    public static void implicitWait(int seconds) {
			driver.manage().timeouts().implicitlyWait(seconds, TimeUnit.SECONDS);
			}
    public static void sendKeys(WebElement e,String value) {
		e.sendKeys(value);
		}
    public static void click(WebElement e) {
			e.click();
			}
    public static  String getCurrentUrl() {
		String text = driver.getCurrentUrl();
		return text;
	//	(OR)
	//	return driver.getCurrentUrl();
	}
    public static  String getTitle() {
		String title = driver.getTitle();
		return title;                            //(or)
		
	//	return driver.getTitle();
		}
    public static  String getText(WebElement e) {
    	return e.getText();
    }
    public static String getAttribute(WebElement e) {
		return e.getAttribute("value");
		}
    public static void quit() {
		driver.quit();
		}
    public static void close(WebElement e) {
		driver.close();
		}
    public static void moveToElement(WebElement e) {
		Actions a=new Actions(driver);
		a.moveToElement(e).perform();
        }
    public static void dragAndDrop(WebElement source,WebElement target) {
		Actions a=new Actions(driver);
		a.dragAndDrop(source, target).perform();
		}
    public static void contextClick(WebElement target) {
		Actions a=new Actions(driver);
		a.contextClick(target).perform();
	
		}
    public static void doubleClick(WebElement target) {
    	Actions a=new Actions(driver);
    	a.doubleClick(target).perform();;
	}
    public static void clicks(WebElement e,String s) {
    	Actions a=new Actions(driver);
    	a.click(e).perform();
    }
    public static void accept() {
		Alert a=driver.switchTo().alert();
		a.accept();
		}
    public static void dismiss(WebElement value) {
    	Alert a=driver.switchTo().alert();
    	a.dismiss();
    	}
    public static void sendKeys1(WebElement e,String value) {
    	Alert a=driver.switchTo().alert();
    	e.sendKeys(value);
		}
    public static String getText() {
    	Alert a=driver.switchTo().alert();
		String text = a.getText();
		return text;
		}
    public static void selectByIndex(WebElement e,int value) {
		Select s= new Select(e );
		s.selectByIndex(value);
		
		
		}
    public static void selectByValue(WebElement e,String value) {
    	Select s= new Select(e );
    	s.selectByValue(value);
    	
    	}
    public static String selectByVisibleText(WebElement e,String value) {
    	Select s= new Select(e );
    	s.selectByVisibleText(value);
    	return value;
    	}
    public static void deselectByIndex(WebElement e,int i) {
     	Select s= new Select(e);
    	s.deselectByIndex(i);
    	
    }
    public static void deselection(WebElement e) {
		Select s=new Select(e);
		s.deselectByValue("e");
		}
    public static void deselects(WebElement e,String value) {
    	Select s=new Select(e);
    	s.deselectByVisibleText(value);
    	}
    public static void deslection(WebElement e) {
		Select s=new Select(e);
		s.deselectAll();
		}
    public static boolean multiple(WebElement e) {
    	Select s=new Select(e);
    	boolean answer = s.isMultiple();
		return answer;
	}
    public static List<WebElement> options(WebElement e,String values) {
    	Select s=new Select(e);
    	List<WebElement> options = s.getOptions();
		return options;
		}
    
    public static List<WebElement> selectedOptions(WebElement e) {
    	 Select s=new Select(e);
    	 List<WebElement> allSelectedOptions = s.getAllSelectedOptions();
    	 return allSelectedOptions;
    }
    public static WebElement firstSelected(WebElement e) {
    	Select s=new Select(e);
    	WebElement firstSelectedOption = s.getFirstSelectedOption();
    	return firstSelectedOption;

	}
    public static File screenShot(String loc) {
		TakesScreenshot ts=(TakesScreenshot)driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File des=new File(loc);
		return src;
		}
    
    
    	 
    	 
    	 
    	 
    	 
    	 
    	 
    	 
    	 
    	 
    	 
    	 
    	 
    	 
    	 
    	 

	}
    
    
    
  
    
    
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	
    	
    	
    	
    	
    	
    	
    	
    	
    

