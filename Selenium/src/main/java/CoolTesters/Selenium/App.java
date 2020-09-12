package CoolTesters.Selenium;

import java.io.File;
import java.nio.file.Paths;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" ); //Abajo exePath es el nombre de la variable
        String exePath = Paths.get("").toAbsolutePath().toString() + File.separator + "driver" + File.separator;// Tomando el Path de nuestro Driver en el sistema 
        System.setProperty("webdriver.chrome.driver", exePath + "chromedriver.exe");//Establecer la propiedad del .exe
        WebDriver driver = new ChromeDriver(); //inicializando el driver
        driver.get("https://www.cooltesters.com/tienda-de-cursos/selenium-con-java"); //Iniciar chrome en la URL especificada
    }
}
