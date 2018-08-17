package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ValidaPesquisa {

    private WebDriver navegador;

    public ValidaPesquisa(WebDriver navegador) {
        this.navegador = navegador;
    }

    public SelcionarProduto validarPesquisa() {
        String valida = navegador.findElement(By.cssSelector(".page-title")).getText();
        Assert.assertEquals("macbook", valida);

        return new SelcionarProduto(navegador);
    }


}
