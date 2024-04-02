package demo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.logging.LogType;
import org.openqa.selenium.logging.LoggingPreferences;
import java.util.logging.Level;
import io.github.bonigarcia.wdm.WebDriverManager;


public class TestCases {
    ChromeDriver driver;
    @SuppressWarnings("deprecation")
    public TestCases()
    {
        System.out.println("Constructor: TestCases");

        WebDriverManager.chromedriver().timeout(30).setup();
        ChromeOptions options = new ChromeOptions();
        LoggingPreferences logs = new LoggingPreferences();

        // Set log level and type
        logs.enable(LogType.BROWSER, Level.ALL);
        logs.enable(LogType.DRIVER, Level.ALL);
        options.setCapability("goog:loggingPrefs", logs);

        // Set path for log file
        System.setProperty(ChromeDriverService.CHROME_DRIVER_LOG_PROPERTY, "chromedriver.log");

        driver = new ChromeDriver(options);

        // Set browser to maximize and wait
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

    }

    public void endTest()
    {
        System.out.println("End Test: TestCases");
        driver.close();
        driver.quit();

    }

    
    public  void testCase01() throws InterruptedException{
        System.out.println("Start Test case: testCase01");
        driver.get("https://www.google.com");
        Thread.sleep(2000);
        
        WebElement searchBar = driver.findElement(By.xpath("//textarea[@class='gLFyf']"));
        searchBar.sendKeys("calculator");
        searchBar.sendKeys(Keys.ENTER);
        Thread.sleep(2000);
        String currentURL = driver.getCurrentUrl();
        if(currentURL.contains("google")) {
            System.out.println("The URL contains the desired keyword");
        } else {
            System.out.println("The URL does not contains the desired keyword");
        }

        WebElement initialDisplay = driver.findElement(By.xpath("//span[@id='cwos']"));
        String text = initialDisplay.getText();
        if(text.equals("0")) {
            System.out.println("The intial display is 0");
        } else {
            System.out.println("The intial display is not 0");   
        }

        System.out.println("end Test case: testCase01");
    }


    public  void testCase02() throws InterruptedException{
        System.out.println("Start Test case: testCase02");
        driver.get("https://www.google.com");
        Thread.sleep(2000);
        
        WebElement searchBar = driver.findElement(By.xpath("//textarea[@class='gLFyf']"));
        searchBar.sendKeys("calculator");
        searchBar.sendKeys(Keys.ENTER);
        Thread.sleep(2000);

        WebElement firstNumber = driver.findElement(By.xpath("//div[@class='PaQdxb A2W7l']/div[@jsname='Ax5wH']"));
        firstNumber.click();
        WebElement plusButton = driver.findElement(By.xpath("//div[@class='PaQdxb mF5fo']/div[@jsname='XSr6wc']"));
        plusButton.click();
        WebElement secondNumber = driver.findElement(By.xpath("//div[@class='PaQdxb A2W7l']/div[@jsname='rk7bOd']"));
        secondNumber.click();
        WebElement equalButton = driver.findElement(By.xpath("//div[@class='PaQdxb mF5fo G7BHUb']/div[@jsname='Pt8tGc']"));
        equalButton.click();
        WebElement additionResult = driver.findElement(By.xpath("//span[@id='cwos']"));
        String displayedresult = additionResult.getText();
        if(displayedresult.equals("12")) {
            System.out.println("The displayed result is correct");
        } else {
            System.out.println("The displayed result is incorrect");
        }

        WebElement firstNumberFirDigit = driver.findElement(By.xpath("//div[@class='PaQdxb A2W7l']/div[@jsname='N10B9']"));
        firstNumberFirDigit.click();
        WebElement firstNumberSecDigit = driver.findElement(By.xpath("//div[@class='PaQdxb A2W7l']/div[@jsname='Ax5wH']"));
        firstNumberSecDigit.click();
        WebElement minusButton = driver.findElement(By.xpath("//div[@class='PaQdxb mF5fo']/div[@jsname='pPHzQc']"));
        minusButton.click();
        WebElement secondNumberDigit = driver.findElement(By.xpath("//div[@class='PaQdxb A2W7l']/div[@jsname='T7PMFe']"));
        secondNumberDigit.click();
        WebElement equalBtn = driver.findElement(By.xpath("//div[@class='PaQdxb mF5fo G7BHUb']/div[@jsname='Pt8tGc']"));
        equalBtn.click();
        WebElement substractionResult = driver.findElement(By.xpath("//span[@id='cwos']"));
        String displayresult = substractionResult.getText();
        if(displayresult.equals("7")) {
            System.out.println("The displayed result is correct");
        } else {
            System.out.println("The displayed result is incorrect");
        }

        System.out.println("end Test case: testCase02");

    }    

    
    public  void testCase03() throws InterruptedException{
        System.out.println("Start Test case: testCase03");
        driver.get("https://www.google.com");
        Thread.sleep(2000);
        
        WebElement searchBar = driver.findElement(By.xpath("//textarea[@class='gLFyf']"));
        searchBar.sendKeys("calculator");
        searchBar.sendKeys(Keys.ENTER);
        Thread.sleep(2000);

        WebElement firstNoFirDigit = driver.findElement(By.xpath("//div[@class='PaQdxb A2W7l']/div[@jsname='N10B9']"));
        firstNoFirDigit.click();
        WebElement firstNoSecDigit = driver.findElement(By.xpath("//div[@class='PaQdxb A2W7l']/div[@jsname='bkEvMb']"));
        firstNoSecDigit.click();
        WebElement multiplyButton = driver.findElement(By.xpath("//div[@class='PaQdxb mF5fo']/div[@jsname='YovRWb']"));
        multiplyButton.click();
        WebElement secondNoDigit = driver.findElement(By.xpath("//div[@class='PaQdxb A2W7l']/div[@jsname='KN1kY']"));
        secondNoDigit.click();
        WebElement equalBtn = driver.findElement(By.xpath("//div[@class='PaQdxb mF5fo G7BHUb']/div[@jsname='Pt8tGc']"));
        equalBtn.click();
        WebElement multiplicationResult = driver.findElement(By.xpath("//span[@id='cwos']"));
        String displayresult = multiplicationResult.getText();
        if(displayresult.equals("30")) {
            System.out.println("The displayed result is correct");
        } else {
            System.out.println("The displayed result is incorrect");
        }

        WebElement clearButton = driver.findElement(By.xpath("//div[@class='PaQdxb UpZIS']/div[@jsname='SLn8gc']"));
        clearButton.click();
        WebElement clearResult = driver.findElement(By.xpath("//span[@id='cwos']"));
        String clResult = clearResult.getText();
        if(clResult.equals("0")) {
            System.out.println("The display is cleared");
        } else {
            System.out.println("The display is not cleared");
        }
        
        System.out.println("end Test case: testCase03");

    }

    public  void testCase04() throws InterruptedException{
        System.out.println("Start Test case: testCase04");
        driver.get("https://www.google.com");
        Thread.sleep(2000);
        
        WebElement searchBar = driver.findElement(By.xpath("//textarea[@class='gLFyf']"));
        searchBar.sendKeys("calculator");
        searchBar.sendKeys(Keys.ENTER);
        Thread.sleep(2000);

        WebElement firstNumberFirDigit = driver.findElement(By.xpath("//div[@class='PaQdxb A2W7l']/div[@jsname='lVjWed']"));
        firstNumberFirDigit.click();
        WebElement firstNumberSecDigit = driver.findElement(By.xpath("//div[@class='PaQdxb A2W7l']/div[@jsname='bkEvMb']"));
        firstNumberSecDigit.click();
        WebElement divButton = driver.findElement(By.xpath("//div[@class='PaQdxb mF5fo']/div[@jsname='WxTTNd']"));
        divButton.click();
        WebElement secondDigit = driver.findElement(By.xpath("//div[@class='PaQdxb A2W7l']/div[@jsname='xAP7E']"));
        secondDigit.click();
        WebElement equalBtn = driver.findElement(By.xpath("//div[@class='PaQdxb mF5fo G7BHUb']/div[@jsname='Pt8tGc']"));
        equalBtn.click();
        WebElement divisionResult = driver.findElement(By.xpath("//span[@id='cwos']"));
        String displayresult = divisionResult.getText();
        if(displayresult.equals("5")) {
            System.out.println("The displayed result is correct");
        } else {
            System.out.println("The displayed result is incorrect");
        }
        
        System.out.println("end Test case: testCase04"); 
    }
}
