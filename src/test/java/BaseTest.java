import org.junit.jupiter.api.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class BaseTest {

    protected WebDriver driver;




    @BeforeAll
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        System.out.println("Test Initialized");
    }



    @BeforeEach
    public void beforeMethod(){
        driver = new ChromeDriver();
        driver.manage().window().maximize();

    }

    @AfterEach
    public void afterMethod() {
        driver.quit();
        }


    }

//    @AfterAll
//    public void tearDown(){
//        driver.quit();
//        System.out.println("Test Finished");
//
//    }

