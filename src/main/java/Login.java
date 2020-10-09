import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static utils.WebDriverSupliter.getChromeDriver;

public class Login {
public static void authentication(String mail, String password){
        WebDriver driver= getChromeDriver();



        driver.findElement(By.id("email")).sendKeys(mail);
        driver.findElement(By.id("passwd")).sendKeys(password);
        driver.findElement(By.cssSelector("#SubmitLogin > span")).click();
}


}
