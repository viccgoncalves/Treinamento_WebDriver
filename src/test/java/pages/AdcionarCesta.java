package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AdcionarCesta {
    static WebDriver navegador;

    public AdcionarCesta(WebDriver navegador) {
        this.navegador = navegador;
    }

    public ValidaProdutoCesta clickAddProduto() {
        WebElement clickcontinue = navegador.findElement(By.id("btn-continue"));
        clickcontinue.click();

        return new ValidaProdutoCesta(navegador);

    }

}