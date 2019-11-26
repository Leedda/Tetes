package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class EscolherFormaPagamento {

    private WebDriver navegador;

    public EscolherFormaPagamento(WebDriver navegador) {
        this.navegador = navegador;
    }

    public void pagar(){

        //Criando variável que irá identificar o container onde está o link das formas de pagamento
        WebElement formPayment = navegador.findElement(By.id("HOOK_PAYMENT"));
        formPayment.findElement(By.xpath("//*[@id=\"HOOK_PAYMENT\"]/div[1]/div/p")).click();
        navegador.findElement(By.xpath("//*[@id=\"cart_navigation\"]/button/span")).click();
    }

}
