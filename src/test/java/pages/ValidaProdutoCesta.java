package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ValidaProdutoCesta {

    private WebDriver navegador;

    public ValidaProdutoCesta(WebDriver navegador){
        this.navegador = navegador;
    }

    public ValidaProdutoCesta validaCompra(){
        String textoElement = navegador.findElement(By.cssSelector(".basket-productTitle")).getText();
        Assert.assertEquals("MacBook Air MQD32BZ/A com Intel Core i5 Dual Core 8GB 128GB SSD 13'' Prata - Apple", textoElement);

        return new ValidaProdutoCesta(navegador);

    }

}
