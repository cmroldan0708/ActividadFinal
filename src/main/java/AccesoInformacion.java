import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static utils.WebDriverSupliter.getChromeDriver;

public class AccesoInformacion {
    public static void AccesoInfo(){
        WebDriver driver= getChromeDriver();
        driver.findElement(By.cssSelector("li:nth-child(4) span:nth-child(2)")).click();


    }
}
