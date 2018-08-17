package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ContinuarCompra {

    private WebDriver navegador;

    public ContinuarCompra(WebDriver navegador){
        this.navegador = navegador;

    }

    public ValidaProdutoCesta clickContinuar(WebDriver navegador) {

        WebElement clickcontinue = navegador.findElement(By.id("btn-continue"));
        clickcontinue.click();

        return new ValidaProdutoCesta(navegador);

    }

    }

