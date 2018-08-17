package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ComprarProduto {

    private WebDriver navegador;

    public ComprarProduto(WebDriver navegador){
        this.navegador = navegador;

    }
    public ContinuarCompra clickComprar(WebDriver navegador){
        WebElement clickcomprar = navegador.findElement(By.id("btn-buy"));
        clickcomprar.click();

        return new ContinuarCompra(navegador);
    }



}
