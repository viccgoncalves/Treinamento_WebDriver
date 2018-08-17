package suporte;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Web {

    public static WebDriver abrirChrome(){

        System.setProperty("WebDriver.chrome.driver", "/chromedriver");
        WebDriver navegador = new ChromeDriver();
        navegador.manage().window().setSize(new Dimension(1280, 800));
        navegador.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS) ;

        navegador.get("https://www.americanas.com.br/");

        return navegador;
    }
}

