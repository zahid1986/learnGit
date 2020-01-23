import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class HomePage {
    static String driverlocation = "browserDriver/chrome-driver";
    static String driverPath ="webdriver.chrome.driver";
    static String url = "https://www.amazon.com/";
    static  WebDriver driver;
    public static void main(String[] args) throws InterruptedException {
        //chrome browser open & nevigate to amazan webpage
//        System.setProperty(driverPath, driverlocation);
//        WebDriver driver = new ChromeDriver();
//        driver.get("https://www.amazon.com/");
//        Thread.sleep(5000);
//        driver.close();

         openBrowser(url);
         burgerMenu();
         searchButton();
         checkCartButton();
         checkTryPrime();
         checkReturnsOrdersButton();
         checkTryPrimeButton();
        todaysDealButton();
        coustomerServiceButton();
        newReleasesButton();
       registryButton();
        findAGiftButton();
        bestSellerButton();
       signInButton();
        checkGlobeSign();
        allDepartmentButton();
   }
    public static void openBrowser(String url){
        System.setProperty(driverPath, driverlocation);
        driver = new ChromeDriver();
        //driver.manage().window().maximize();
        driver.manage().window().fullscreen();
        driver.get(url);
        //driver.navigate().to(url);
        //driver.navigate().back();

    }
    public static void burgerMenu() throws InterruptedException {
        openBrowser(url);
        driver.findElement(By.xpath("//*[@id=\"nav-hamburger-menu\"]/i")).click();
        Thread.sleep(2000);
        driver.close();
    }

    public static void searchButton() throws InterruptedException {
        openBrowser(url);
        driver.findElement(By.xpath("//*[@id=\"nav-search\"]/form/div[2]/div/input")).click();
        Thread.sleep(2000);
        driver.close();
    }

    public static void  checkCartButton() throws InterruptedException {

        openBrowser(url);
        driver.findElement(By.xpath("//*[@id=\"nav-cart\"]/span[2]")).click();
        Thread.sleep(2000);
        driver.close();
    }

    public static void checkTryPrime() throws InterruptedException {

        openBrowser(url);
        driver.findElement(By.xpath("//*[@id=\"nav-link-prime\"]/span[2]")).click();
        Thread.sleep(2000);
        driver.close();
    }
    public static void checkReturnsOrdersButton() throws InterruptedException {
        openBrowser(url);
        driver.findElement(By.xpath("//*[@id=\"nav-orders\"]")).click();
        Thread.sleep(2000);
        driver.close();
    }
    public static void checkTryPrimeButton() throws InterruptedException {
        openBrowser(url);
        driver.findElement(By.xpath("//*[@id=\"nav-logo\"]/a[2]")).click();
        Thread.sleep(2000);
        driver.close();
    }
    public static void todaysDealButton() throws InterruptedException {
        openBrowser(url);
        driver.findElement(By.xpath("//*[@id=\"nav-xshop\"]/a[1]")).click();
        Thread.sleep(2000);
        driver.close();
    }
    public static void coustomerServiceButton() throws InterruptedException {
        openBrowser(url);
        driver.findElement(By.xpath("//*[@id=\"nav-xshop\"]/a[3]")).click();
        Thread.sleep(2000);
        driver.close();
    }
    public static void newReleasesButton() throws InterruptedException {
        openBrowser(url);
        driver.findElement(By.xpath("//*[@id=\"nav-xshop\"]/a[5]")).click();
        Thread.sleep(2000);
        driver.close();
    }
    public static void registryButton() throws InterruptedException {
        openBrowser(url);
        driver.findElement(By.xpath("//*[@id=\"nav-xshop\"]/a[6]")).click();
        Thread.sleep(2000);
        driver.close();
    }
    public static void findAGiftButton() throws InterruptedException {
        openBrowser(url);
        driver.findElement(By.xpath("//*[@id=\"nav-xshop\"]/a[4]")).click();
        Thread.sleep(2000);
        driver.close();
    }
    public static void bestSellerButton() throws InterruptedException {
        openBrowser(url);
        driver.findElement(By.xpath("//*[@id=\"nav-xshop\"]/a[2]")).click();
        Thread.sleep(2000);
        driver.close();
    }
    public static void signInButton() throws InterruptedException {
        openBrowser(url);
        driver.findElement(By.xpath("//*[@id=\"nav-link-accountList\"]/span[2]")).click();
        Thread.sleep(2000);
        driver.close();
    }
    public static void checkGlobeSign() throws InterruptedException {
        openBrowser(url);
        driver.findElement(By.xpath("//*[@id=\"icp-nav-flyout\"]/span/span[1]/span")).click();
        Thread.sleep(2000);
        driver.close();
    }

    public static void allDepartmentButton() throws InterruptedException {
        openBrowser(url);
        driver.findElement(By.xpath("//*[@id=\"searchDropdownBox\"]")).click();
        Thread.sleep(2000);
        driver.close();
    }

}
