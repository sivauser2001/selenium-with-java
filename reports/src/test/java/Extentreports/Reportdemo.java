
package Extentreports;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class Reportdemo {

    static ExtentReports extent;
    static ExtentSparkReporter spark;

    @BeforeClass
    public static void starttest() {
        extent = new ExtentReports();
        spark = new ExtentSparkReporter("target/spark.html");

        spark.config().setTheme(Theme.DARK);
        spark.config().setDocumentTitle("AutomaticReport");
        spark.config().setReportName("ReportDemo");

        extent.attachReporter(spark);
    }

    @Test
    public void extenttest() {

        // Test 1
        ExtentTest test = extent.createTest("Login test")
                                .assignAuthor("Siva");

        test.pass("Login Test Successful");
        test.info("URL loaded");
        test.fail("Login test failed");

        // Test 2
        ExtentTest test1 = extent.createTest("HomePage test")
                                 .assignAuthor("Siva");

        test1.pass("HomePage Successful");
        test1.info("Value entered");
        test1.fail("Homepage test failed");

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com");

        if (driver.getTitle().equals("Google")) {
            test.log(Status.PASS, "Navigated to Google");
        } else {
            test.log(Status.FAIL, "Navigation failed");
        }

        driver.quit();
    }

    @AfterClass
    public static void endtest() {
        extent.flush();
    }
}
