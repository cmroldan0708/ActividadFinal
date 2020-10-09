import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.WebDriverSupliter;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UpdatePersonalInformation {
    private WebDriver driver;

    @BeforeEach
    public void setUp() {
        driver = WebDriverSupliter.getChromeDriver();
    }

    @AfterEach
    public void tearDown() {
        WebDriverSupliter.quitDriver();
    }

    @Test
    public void adasd() {
        driver.get("http://automationpractice.com/index.php?controller=authentication&back=my-account");

       /*Se inicia sesión en la aplicación*/
       Login.authentication("fernandocotrena@gmail.com", "admin123456");

        /*Se accede a la vista 'My personal information' realizando clic en la tarjeta*/
        AccesoInformacion.AccesoInfo();

        /*driver.findElement(By.cssSelector("li:nth-child(4) span:nth-child(2)")).click();*/

        /*Se actualizan los datos personales del usuario*/
        DatosPersonales.infopersonal("Pedro", "Gonzalez", "admin123456", "admin123456","admin123456");


        /*Se actualizan los datos personales del usuario*/
        ActualizacionDatos.Actualizacion();

        /*Se valida el mensaje del sistema luego de guardar los cambios*/
        assertEquals("Your personal information has been successfully updated.", driver.findElement(By.cssSelector(".alert")).getText());
    }
}
