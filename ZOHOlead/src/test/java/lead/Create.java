package lead;
import static org.testng.Assert.assertEquals;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Driver;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.jspecify.annotations.Nullable;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import net.bytebuddy.agent.builder.AgentBuilder.RedefinitionStrategy.DiscoveryStrategy.Explicit;

public class Create implements URL
{
	WebDriver driver;
   @BeforeTest
   public void create() throws InterruptedException
    {
	 driver = new ChromeDriver();
	driver.get(url);	
	String Title= driver.getTitle();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	System.out.println(Title);
	Assert.assertEquals(Title, "Zoho CRM | Top-rated Sales CRM Software by Customers");
	
	driver.findElement(By.className("zgh-login")).click();
	String Title1= driver.getTitle();
	System.out.println(Title1);
	Assert.assertEquals(Title1, "Zoho Accounts");
	
	driver.findElement(By.id("login_id")).sendKeys(UN);
	driver.findElement(By.id("nextbtn")).click();
	
	Thread.sleep(2000);
	driver.findElement(By.id("password")).sendKeys(PWD);
	driver.findElement(By.id("nextbtn")).click();
	String Title2= driver.getTitle();
	System.out.println(Title2);
	Assert.assertEquals(Title2, "Zoho Accounts");
	
	  driver.findElement(By.xpath("//a[@id=\"Visible_Leads\"]")).click();
	  String Title3= driver.getTitle();
	  System.out.println(Title3);
		Assert.assertEquals(Title3, "Home Page - Zoho CRM");
		
		
	}
   
   @Test(enabled = false)
   public void creat(String sheet1 , int r, int c) 
   {
	   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	   
	   //Data Driven Testing
	   try {
	   FileInputStream fis = new FileInputStream("C:\\Users\\gopi\\Desktop\\TestData3.csv");
	  Workbook wb = WorkbookFactory.create(fis);
	 Cell value = wb.getSheet("sheet1").getRow(r).getCell(c);
	   
	 String value1 = value.toString();
	 System.out.println(value1);
	 
	   }
	   catch(Exception e)
	   {
		   e.printStackTrace();
	   }
	   
	  
   }
   @Test
   private void crete() {
		   
	   driver.findElement(By.xpath("//button[@cscript-tag='create']")).click();
	   String title4 = driver.getTitle();
		 Assert.assertEquals(title4, "lead");
	   
	   driver.findElement(By.id("Leads_photo")).click();
	   driver.findElement(By.id("upload_photo")).sendKeys("C:\\Users\\gopi\\Pictures\\Screenshots\\Screenshot.png");
	   	   
	   driver.findElement(By.id("Crm_Leads_FIRSTNAME_LInput")).sendKeys("rahul");
	   driver.findElement(By.id("Crm_Leads_DESIGNATION_LInput")).sendKeys("Associate Engineer");
	   
	   driver.findElement(By.id("Crm_Leads_PHONE_LInput")).sendKeys("9845123567");
	   driver.findElement(By.id("Crm_Leads_MOBILE_LInput")).sendKeys("9495123451");
	   
	   driver.findElement(By.id("Crm_Leads_LEADSOURCE")).click();
	   driver.findElement(By.xpath("//lyte-drop-item[text()='Advertisement']")).click();
	   
	   
	   driver.findElement(By.id("Crm_Leads_ANNUALREVENUE_LInput")).sendKeys("5000");
	  // driver.findElement(By.id("//input[@tabindex=\"21\"]")).click();
	   
	   driver.findElement(By.id("//input[@placeholder=\"Search Users\"]")).sendKeys("sdbjcdsfher");
	   driver.findElement(By.id("Crm_Leads_LASTNAME_LInput")).sendKeys("rathod");
	   
	   driver.findElement(By.id("Crm_Leads_EMAIL_LInput")).sendKeys("rahul@rathod.com");
	   driver.findElement(By.id("Crm_Leads_FAX_LInput")).sendKeys("sdbcwwaf");
	   
	   driver.findElement(By.id("Crm_Leads_WEBSITE")).sendKeys("dsfldncher");
	   driver.findElement(By.id("Crm_Leads_STATUS")).click();
	   driver.findElement(By.id("Lyte_Drop_Item_52")).click();
	   
       driver.findElement(By.id("Crm_Leads_EMPCT_LInput")).sendKeys("wefwefer");
	   
	   driver.findElement(By.id("Crm_Leads_RATING")).click();
	   driver.findElement(By.id("Lyte_Drop_Item_61")).click();
	   
       driver.findElement(By.id("Crm_Leads_SKYPEIDENTITY_LInput")).sendKeys("weiugfer");
	   
	   driver.findElement(By.id("Crm_Leads_ADDN_EMAIL_LInput")).sendKeys("salkshfefwea");
	   driver.findElement(By.id("Crm_Leads_TWITTER_LInput")).sendKeys("tfwajfef");
	   
       driver.findElement(By.id("Crm_Leads_LANE_LInput")).sendKeys("no 4 th cross");
	   
	   driver.findElement(By.id("Crm_Leads_STATE_LInput")).sendKeys("Karnataka");
	   driver.findElement(By.id("inputId")).sendKeys("tfwajfef");
	   
	   
	   driver.findElement(By.id("Crm_Leads_CITY_LInput")).sendKeys("Karnataka");
	   driver.findElement(By.id("Crm_Leads_CODE_LInput")).sendKeys("560022");
	   
	   
	   driver.findElement(By.id("Crm_Leads_DESCRIPTION")).sendKeys("track the parcel");
	   driver.findElement(By.id("crm_create_savebutn")).click();
	   
	   driver.findElement(By.xpath("//button[@class=\"lyte-button lyteDefaultBtn\"]")).click();
	  
	     }
   
   @Test(enabled = false)
   public void edit()
   {
	   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	   //driver.findElement(By.xpath("//button[@cscript-tag='create']")).click();
	   
	   driver.findElement(By.xpath("//crmutil-icon[@id=\"quickActionsOptions_769975000000343402\"]")).click();
	   driver.findElement(By.id("listViewEdit_769975000000343402")).click();
	   
	   driver.findElement(By.id("Crm_Leads_FIRSTNAME_LInput")).sendKeys("keviiiin");
	   driver.findElement(By.id("Crm_Leads_DESIGNATION_LInput")).sendKeys("testengineer");
	   
	   driver.findElement(By.id("Crm_Leads_PHONE_LInput")).sendKeys("9845235343");
	   driver.findElement(By.id("Crm_Leads_MOBILE_LInput")).sendKeys("9495123876");
	   
	   driver.findElement(By.id("Crm_Leads_LEADSOURCE")).click();
	   driver.findElement(By.xpath("//lyte-drop-item[text()='Advertisement']")).click();
	   
	   
	   driver.findElement(By.id("Crm_Leads_ANNUALREVENUE_LInput")).sendKeys("8000");
	  // driver.findElement(By.id("//input[@tabindex=\"21\"]")).click();
	   
	   driver.findElement(By.id("//input[@placeholder=\"Search Users\"]")).sendKeys("testen");
	   driver.findElement(By.id("Crm_Leads_LASTNAME_LInput")).sendKeys("rastro");
	   
	   driver.findElement(By.id("Crm_Leads_EMAIL_LInput")).sendKeys("rastro2@gmail.com");
	   driver.findElement(By.id("Crm_Leads_FAX_LInput")).sendKeys("hjcd");
	   
	   driver.findElement(By.id("Crm_Leads_WEBSITE")).sendKeys("www.hgc.com");
	   driver.findElement(By.id("Crm_Leads_STATUS")).click();
	   driver.findElement(By.id("Lyte_Drop_Item_52")).click();
	   
       driver.findElement(By.id("Crm_Leads_EMPCT_LInput")).sendKeys("sch");
	   
	   driver.findElement(By.id("Crm_Leads_RATING")).click();
	   driver.findElement(By.id("Lyte_Drop_Item_61")).click();
	   
       driver.findElement(By.id("Crm_Leads_SKYPEIDENTITY_LInput")).sendKeys("httpdcjhsaj");
	   
	   driver.findElement(By.id("Crm_Leads_ADDN_EMAIL_LInput")).sendKeys("salks@gmail.com");
	   driver.findElement(By.id("Crm_Leads_TWITTER_LInput")).sendKeys("gopied");
	   
       driver.findElement(By.id("Crm_Leads_LANE_LInput")).sendKeys("no 4 th cross");
	   
	   driver.findElement(By.id("Crm_Leads_STATE_LInput")).sendKeys("Karnataka");
	   driver.findElement(By.id("inputId")).sendKeys("gdcd");
	   
	   
	   driver.findElement(By.id("Crm_Leads_CITY_LInput")).sendKeys("Karnataka");
	   driver.findElement(By.id("Crm_Leads_CODE_LInput")).sendKeys("560010");
	   
	   
	   driver.findElement(By.id("Crm_Leads_DESCRIPTION")).sendKeys("track the parcel");
	   driver.findElement(By.id("crm_create_savebutn")).click();
	   
	   driver.findElement(By.xpath("//button[@class=\"lyte-button lyteDefaultBtn\"]")).click();
	  
   }
  
   
   @Test(priority = 1)
   public void filter()
   {
	   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	   driver.findElement(By.xpath("//lyte-accordion-header[@id=\"lyte_accordion_header_36\"]")).click();
	   driver.findElement(By.xpath("//span[text()='  City  ']")).click();
	 WebElement te= driver.findElement(By.xpath("//input[@class=\"cxBorderBottom \"]"));
	   te.clear();
	   te.sendKeys("chennai");
	   driver.findElement(By.xpath("//button[@class=\"lyte-button maxW250 toEllipsis oH lytePrimaryBtn\"]")).click();
   }
   
  
   
   @Test
   public void delete()
   {
	   
	   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	   driver.findElement(By.xpath("//lyte-yield[@yield-name=\"body-prefix-1\"][1]")).click();
	   driver.findElement(By.xpath("//lyte-menu-item[@data-value=\"mass_delete\"]")).click();
	   
	   driver.findElement(By.xpath("//button[@class=\"lyte-button lyteFailure\"]")).click();
   }

   @AfterTest
   public void close()
    {
	   
	   driver.close();
    }
}