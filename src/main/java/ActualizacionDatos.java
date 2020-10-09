import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static utils.WebDriverSupliter.getChromeDriver;

public class ActualizacionDatos {
    public static void Actualizacion() {
        WebDriver driver= getChromeDriver();
        driver.findElement(By.cssSelector(".button-medium:nth-child(1) > span")).click();
        driver.findElement(By.cssSelector(".columns-container")).click();
    }
}
