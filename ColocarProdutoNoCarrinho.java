package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ColocarProdutoNoCarrinho {

    private String nomeProduto;
    private WebDriver navegador;

    public ColocarProdutoNoCarrinho(WebDriver navegador){
        this.navegador = navegador;
    }

    public void addProdutoCarrinho(){
//Selecionar a classe que contem a lista de produtos de id "homefeatured"

        //Adicione o produto escolhido ao carrinho.
        navegador.findElement(By.id("add_to_cart"));
        navegador.findElement(By.xpath("//*[@id=\"add_to_cart\"]/button/span")).click();

        //Identificar onde esta o botão com texto "Proceed to checkout" e clicar no link
        navegador.findElement(By.linkText("Proceed to checkout")).click();

    }


    public void proceedToCheckout() {

        //Identificar onde esta o botão com texto "Proceed to checkout" e clicar no link //*[@id="center_column"]/p[2]/a[1]
        navegador.findElement(By.xpath("//*[@id=\"center_column\"]/p[2]/a[1]/span")).click();

    }

}
