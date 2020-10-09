import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static utils.WebDriverSupliter.getChromeDriver;

public class DatosPersonales {

    public static void infopersonal(String name, String lastname, String oldpass, String pass, String confir){
        WebDriver driver= getChromeDriver();


        driver.findElement(By.id("firstname")).sendKeys(name);
        driver.findElement(By.id("lastname")).sendKeys(lastname);
        driver.findElement(By.id("old_passwd")).sendKeys(oldpass);
        driver.findElement(By.id("passwd")).sendKeys(pass);
        driver.findElement(By.id("confirmation")).sendKeys(confir);
        driver.findElement(By.id("newsletter")).click();
}
}

