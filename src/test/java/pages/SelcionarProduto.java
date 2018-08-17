package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SelcionarProduto {
    private WebDriver navegador;

    public SelcionarProduto(WebDriver navegador){
        this.navegador = navegador;
    }

public ComprarProduto selectProduto(){
    WebElement selecionarcompra = navegador.findElement(By.xpath("//div[@id='content-middle']/div[5]/div/div/div/div/div/section/a/div[2]/div[3]/div/div[2]/span[2]"));
    selecionarcompra.click();
    return new ComprarProduto(navegador);


}



    }


