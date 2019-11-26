package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RealizarComentario {

        private WebDriver navegador;

        public RealizarComentario(WebDriver navegador){

            this.navegador = navegador;
        }

        public void comentar(){
            WebElement formOrderMsg = navegador.findElement(By.xpath("//*[@id=\"ordermsg\"]"));
            formOrderMsg.findElement(By.xpath("//*[@id=\"ordermsg\"]/textarea")).sendKeys("Compra muito satisfatória!");

            //Submeter
            navegador.findElement(By.xpath("//*[@id=\"center_column\"]/form/p/button")).click();
        }

        public void aceitarTermos(){
            WebElement formShiping = navegador.findElement(By.id("form"));

            //Clicar no campo de id "cgv"
            formShiping.findElement(By.id("cgv")).click();

            navegador.findElement(By.xpath("//*[@id=\"form\"]/p/button")).click();

        }

    }
