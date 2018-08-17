package tests;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import pages.*;
import suporte.Web;

public class RealizarCompraTest {

    private WebDriver navegador;

    @Before
    public void setUp(){

        navegador = Web.abrirChrome();
    }

    @Test
    public void RealizarCompra () {
        new PesquisaProduto(navegador)
                .clickPesquisa();

        new ValidaPesquisa(navegador)
                .validarPesquisa();

        new SelcionarProduto(navegador)
                .selectProduto();

        new ComprarProduto(navegador)
                .clickComprar(navegador);

        new ContinuarCompra(navegador)
                .clickContinuar(navegador);

        new ValidaProdutoCesta(navegador)
                .validaCompra();




    }


    @After
    public void tearDown (){
        navegador.quit();


    }


}
