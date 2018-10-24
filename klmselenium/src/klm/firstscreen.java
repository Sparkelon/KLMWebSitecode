package klm;
import java.io.FileInputStream;
import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import jxl.Sheet;
import jxl.Workbook;
public class firstscreen {

	public static void main(String[] args) throws Exception{
		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\admin\\Desktop\\KLM\\SeleniumNew\\drivers\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.klm.com/home/nl/en");
        driver.manage().window().maximize();
        Thread.sleep(5000);
    /* driver.findElement(By.xpath("//*[text()=' Agree ']")).click();
      Thread.sleep(3000);*/
	    String klmfile ="C:\\Users\\admin\\Desktop\\KLM\\Klmm.xls";
				FileInputStream fis = new FileInputStream(klmfile );
		        Workbook wb =Workbook.getWorkbook(fis);
		        Sheet s=wb.getSheet("FromList");
		        int rowCount = s.getRows();
		        int colcount =s.getColumns();
		        Thread.sleep(2000);
		       
		        		//driver.findElement(By.xpath("//div[@class='g-search-form--connections']//div[1]//label[1]//input[1]")).sendKeys(s.getCell(0,1).getContents());
		        int n=4;
		        int i;
		      //  for( i=0;i<n;i++){  //}'
		        /*if (driver.findElement(By.xpath("//*[text()=' Agree ']")).isDisplayed()){
		        	driver.findElement(By.xpath("//*[text()=' Agree ']")).click();
		        }*/
		        driver.findElement(By.xpath("//*[text()=' Agree ']")).click();
			       Thread.sleep(3000);
		       
		      //from text box
		        		WebElement fromtext = driver.findElement(By.xpath("//div[@class='g-search-form--connections']//div[1]//label[1]//input[1]"));
		        		 fromtext.sendKeys(s.getCell(0,1).getContents());
		                Actions action = new Actions(driver);
		         
		                action.moveToElement(fromtext).build().perform();
		                fromtext.sendKeys(Keys.DOWN);
		                fromtext.sendKeys(Keys.RETURN);
		                Thread.sleep(3000);
		       //to text box
		                WebElement totext = driver.findElement(By.xpath("//div[@class='g-search-form--connections']//div[1]//label[2]//input[1]"));
		                totext.sendKeys(s.getCell(1,1).getContents());
		               // Actions action1 = new Actions(driver);
		                action.moveToElement(totext).build().perform();
		                totext.sendKeys(Keys.DOWN);
		                totext.sendKeys(Keys.RETURN);
		              
		               // driver.findElement(By.linkText("Eindhoven - Eindhoven Airport (EIN), Netherlands")).click();
		        		//"//div[@class='g-search-form--connections']//div[1]//label[2]/input"));
		       
		        System.out.println(s.getCell(0,1).getContents()); 
		        System.out.println( s.getCell(1,1).getContents());
		        Thread.sleep(3000);
		        //departure date
			       driver.findElement(By.xpath("//*[@id='est-search-homepage']/div[2]/div[2]/form/div/div[1]/label[3]/input")).click();
			       Thread.sleep(3000);
			       driver.findElement(By.xpath("//*[@aria-label = 'Wednesday 24 October 2018']")).click();
			       /*driver.findElement(By.xpath("//input[@placeholder='Choose your date']")).click();
			       Thread.sleep(3000);
			       driver.findElement(By.xpath("//*[@aria-label = 'Thursday 1 November 2018']")).click();*/
			       
			       Thread.sleep(3000);
			       
			       //passengers
			        driver.findElement(By.xpath("//span[contains(text(),'Passengers')]")).click();
			        
			        driver.findElement(By.xpath("//div[@class='selectorView']//div[3]//div[1]//button[2]")).click();
			        		driver.findElement(By.xpath("//span[contains(text(),'OK')]")).click();
			       Thread.sleep(3000);
			       //travel class dropdown
			       driver.findElement(By.xpath("//select[@class='g-search-form--input g-forms-selectbox']")).click();
			        Thread.sleep(2000);
			        driver.findElement(By.xpath("//option[@value='ECONOMY']")).click();
			      
			        Thread.sleep(2000);
			       
	    	        driver.findElement(By.xpath("//div[@class='g-search-form--footer g-clear']//span")).click();
	    	     WebDriverWait wait=new WebDriverWait(driver, 20);
	    	        
	    	       WebElement deptflightlink= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath( "//span[@class='bf-flight-overview__price-button__amount g-hc-ignore']")));
	    	        deptflightlink.click();
	    	        Thread.sleep(3000);
	    	      //div[@class='bf-fares__fare g-hc-ignore bf-fares__fare--more-day-bars bf-fares__fare--bar']
	    	        WebElement availflightdate= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath( "/html/body/div[5]/div/div[2]/div/div/div/div[3]/div/div[2]/div[3]/div/div[12]")));
	    	        availflightdate.click(); 
	    	        Thread.sleep(3000);
	    	       /* driver.findElement((By.xpath( "//div[@class='bf-flight-overview__flex__price g-hc-ignore bf-flight-overview__flex__price--button']//button[@type='button'])"))).click();
	    	        Thread.sleep(3000);*/
	    	        driver.findElement((By.xpath( "/html/body/div[5]/div/div[2]/div/div/div/div[3]/div[2]/div/ul/li/div[1]/div/div/div[5]/button"))).click();
	    	        Thread.sleep(3000);
	    	        WebElement Continue =driver.findElement((By.xpath( "//*[@id='bf-continue-button']")));
	    	        
	    	        Continue.sendKeys(Keys.DOWN);
	    	        Thread.sleep(3000);
	    	        Continue.click();
	    	        Thread.sleep(9000);
	    	        
	    	        WebElement Continue1 =driver.findElement((By.xpath( "/html/body/div[6]/div/div/div/div[1]/div/div[1]/ul/li[5]/button[1]")));
	    	        Continue1.sendKeys(Keys.DOWN);
	    	        
	    	        Thread.sleep(5000);
	    	        Continue1.click();
	    	        
	    	       //details submission
	    	        Thread.sleep(5000);
	    	        JavascriptExecutor jse = (JavascriptExecutor)driver;
	    	        jse.executeScript("window.scrollBy(0,250)", "");
	    	        WebElement Title = driver.findElement(By.xpath("//select[@id='passengerField_1000_title']"));
	    	        /*JavascriptExecutor js = (JavascriptExecutor) driver;
	    	        
	    	   	  js.executeScript("arguments[0].scrollIntoView();", Title);*/
	    	   	 // Title.sendKeys(Keys.DOWN); 
	    	   	  Select dropdown= new Select(Title);    
	    	   	  dropdown.selectByVisibleText("Mrs") ; 
	    	   	  
	    	   	  jse.executeScript("window.scrollBy(0,250)", "");
	    	   	  
	    	   	 /* String klmfile ="C:\\Users\\admin\\Desktop\\KLM\\Klmm.xls";
	    	   		FileInputStream fis = new FileInputStream(klmfile );
	    	         Workbook wb =Workbook.getWorkbook(fis);
	    	         Sheet s=wb.getSheet("ToList");
	    	         int rowCount = s.getRows();
	    	         int colcount =s.getColumns();*/
	    	         Thread.sleep(2000);
	    	         WebElement firstname = driver.findElement(By.id("passengerField_1000_firstName"));
	    	             //input[@id='passengerField_1001_firstName']
	    	   	  firstname.sendKeys(s.getCell(1,6).getContents());
	    	   	 //firstname.sendKeys("alekkk");
	    	   	   WebElement lastname = driver.findElement(By.id("passengerField_1000_lastName"));
	    	   		//input[@id='passengerField_1001_lastName']
	    	   	   lastname.sendKeys(s.getCell(1,7).getContents());
	    	   	  // lastname.sendKeys("tttt");
	    	   	 //checkout-form-validation-group[@form-name='passengerField_1001_dateOfBirth']//select[@name='year']

	    	   	  // WebElement day =  driver.findElement(By.name("day"));
	    	   	   WebElement day =  driver.findElement(By.xpath("//checkout-form-validation-group[@form-name='passengerField_1000_dateOfBirth']//select[@name='day']"));
	    	   	 
	    	   	  day.sendKeys(s.getCell(1,8).getContents());
	    	   	   //day.sendKeys("20");
	    	   	   WebElement month=  driver.findElement(By.xpath("//checkout-form-validation-group[@form-name='passengerField_1000_dateOfBirth']//select[@name='month']"));
	    	   	   month.sendKeys(s.getCell(2,8).getContents());
	    	   	  // month.sendKeys("January");
	    	   	   WebElement year=  driver.findElement(By.xpath("//checkout-form-validation-group[@form-name='passengerField_1000_dateOfBirth']//select[@name='year']"));
	    	   	   year.sendKeys(s.getCell(3,8).getContents());
	    	   	   //year.sendKeys("1988");
	    	   	     Thread.sleep(4000);
	    	   	     
	    	   	     driver.findElement(By.id("passengerField_1000_emailAddress")).sendKeys(s.getCell(1,10).getContents());
	    	   	     //sendKeys("thumatialekhya@gmail.com");
	    	   	     //sendKeys(s.getCell(1,10).getContents());
	    	   	     Thread.sleep(3000);
	    	   	    driver.findElement(By.id("passengerField_1000_phoneNumberFirst")).sendKeys(s.getCell(1,11).getContents());
	    	   	  //  sendKeys("657764287");
	    	   	    //sendKeys(s.getCell(1,11).getContents());
	    	   	   //adult title
	    	   	   
	    	   	  Thread.sleep(7000);
	    	   	  
	    	   	   WebElement Title1 = driver.findElement(By.id("passengerField_1001_title"));
	    	   	    
	    	   	  // Title1.sendKeys(Keys.DOWN);
	    	   		//  js.executeScript("arguments[0].scrollIntoView();", Title1);
	    	   		   Thread.sleep(2000);
	    	   		  Select dropdown1= new Select(Title1);    
	    	   		  dropdown1.selectByVisibleText("Mr") ; 
	    	   		
	    	   		  Thread.sleep(2000);
	    	   		
	    	   		  WebElement firstname1 = driver.findElement(By.id("passengerField_1001_firstName"));
	    	             //input[@id='passengerField_1001_firstName']
	    	   	 // firstname1.sendKeys(s.getCell(1,10).getContents());
	    	   	  firstname1.sendKeys("manuu");
	    	   	   WebElement lastname1 = driver.findElement(By.id("passengerField_1001_lastName"));
	    	   		//input[@id='passengerField_1001_lastName']
	    	   	   Thread.sleep(2000);
	    	   	   lastname1.sendKeys("madhineni");
	    	   	  // lastname1.sendKeys(s.getCell(1,11).getContents());
	    	   	 //checkout-form-validation-group[@form-name='passengerField_1001_dateOfBirth']//select[@name='day']
	    	   	 //checkout-form-validation-group[@form-name='passengerField_1000_dateOfBirth']//select[@name='day']
	    	   	   WebElement day1 =  driver.findElement(By.xpath("//checkout-form-validation-group[@form-name='passengerField_1001_dateOfBirth']//select[@name='day']"));
	    	   	  // day1.sendKeys(s.getCell(1,12).getContents());
	    	   	   day1.sendKeys("11");
	    	   	   Thread.sleep(2000);
	    	   	   WebElement month1=  driver.findElement(By.xpath("//checkout-form-validation-group[@form-name='passengerField_1001_dateOfBirth']//select[@name='month']"));
	    	   	 //  month1.sendKeys(s.getCell(2,12).getContents());
	    	   	   month1.sendKeys("January");
	    	   	   Thread.sleep(2000);
	    	   	   WebElement year1=  driver.findElement(By.xpath("//checkout-form-validation-group[@form-name='passengerField_1001_dateOfBirth']//select[@name='year']"));
	    	   	   //year1.sendKeys(s.getCell(3,12).getContents());
	    	   	   year1.sendKeys("1988");
	    	   	   Thread.sleep(2000);   
	    	   	   jse.executeScript("window.scrollBy(0,700)", "");
	    	   	 driver.findElement(By.xpath("//h3[contains(text(),'No insurance')]")).click();
	    	   	   Thread.sleep(2000);   
	    	   	   
	    	   	   WebElement submit =driver.findElement(By.xpath("//*[@id='checkout-step-submit']"));
	    	   	   
	    	   	   Thread.sleep(10000); 
	    	   	 submit.click();
	    	   	 
	    	  	   
	    		    	        
	}
}




