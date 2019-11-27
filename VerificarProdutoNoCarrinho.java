package tests;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class VerificarProdutoNoCarrinho {

    private WebDriver navegador;

    public VerificarProdutoNoCarrinho(WebDriver navegador){

        this.navegador = navegador;

    }

    public void conferirProduto(String produto1, String produto2){
        this.navegador.findElement(By.xpath("//*[@id=\"header\"]/div[3]/div/div/div[3]/div")).click();
        this.navegador.findElement(By.xpath("//*[@id=\"header\"]/div[3]/div/div/div[3]/div/div/div/div/dl/dt/a/img")).click();

        Assert assertEquals = null;
        assertEquals.assertEquals(produto1, navegador.findElement(By.xpath("(//*[@id=\"center_column\"]/div")).getText());

    }

    public void proceedToCheckout(){
        //Identificar onde esta o botão com texto "Proceed to checkout" e clicar no link
        navegador.findElement(By.linkText("Proceed to checkout")).click();
        //Após mudar de tela clicar novamente no botão com texto "Proceed to checkout"
        navegador.findElement(By.xpath("//*[@id=\"center_column\"]/p[2]/a[1]/span")).click();
        //Identificar a popup onde está o formulário de id "create-account_form"
        WebElement formCreateAccount = navegador.findElement(By.id("create-account_form"));
        
    }

}
