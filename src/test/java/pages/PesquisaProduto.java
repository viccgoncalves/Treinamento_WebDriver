package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PesquisaProduto {

    public WebDriver navegador;

    public PesquisaProduto(WebDriver navegador){

        this.navegador = navegador;
    }

    public ValidaPesquisa clickPesquisa(){

        WebElement produto = navegador.findElement(By.name("conteudo"));
        produto.sendKeys("Macbook");

        WebElement clickpesquisa = navegador.findElement(By.id("h_search-btn"));
        clickpesquisa.click();


        return new ValidaPesquisa(navegador);

    }
}
