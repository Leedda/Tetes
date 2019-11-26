package tests;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PaginaPrincipal {

    private WebDriver navegador;

    public PaginaPrincipal(WebDriver navegador){
        this.navegador = navegador;
    }

    public void searchProduct(){  //passar o produto na classe teste
        //Selecionar a classe que contem a lista de produtos de id "homefeatured"
        navegador.findElement(By.id("homefeatured")).click();
        WebElement campoProcurarproduto = navegador.findElement(By.id("searchbox"));
        navegador.findElement(By.linkText("Printed Chiffon Dress")).click();
        navegador.findElement(By.xpath("//*[@id=\"add_to_cart\"]/button/span")).click();
    }

}
