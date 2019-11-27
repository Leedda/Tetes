package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class PreenchendoInfoUser {
    private WebDriver navegador;

    public PreenchendoInfoUser(WebDriver navegador){

        this.navegador = navegador;
    }

    public void usuario(){
        //Identificar o popup onde está o formulario de xpath "//*[@id="account-creation_form"]/div[2]"

        WebElement  campoFormTwo = navegador.findElement(By.xpath("//*[@id=\"account-creation_form\"]/div[2]"));

        //No campo de id "company" digitar "Airbnb"
        campoFormTwo.findElement(By.id("company")).sendKeys("DBserver");

        //No campo de id "address1" digitar " 888 Brannan St"
        campoFormTwo.findElement(By.id("address1")).sendKeys("888 Brannan St");

        //No campo de id "city" digitar "San Francisco"
        ((WebElement) campoFormTwo).findElement(By.id("city")).sendKeys("San Francisco");

        //No campo de id "id_state" selecionar "California"
        WebElement campoId_State = campoFormTwo.findElement(By.id("id_state"));
        new Select(campoId_State).selectByValue("5");

        //No campo de id "postcode" digitar "94103"
        campoFormTwo.findElement(By.id("postcode")).sendKeys("94103");

        //No campo de id "id_country" selecionar "United States"
        WebElement campoId_Country = campoFormTwo.findElement(By.id("id_country"));
        new Select(campoId_Country).selectByValue("21");

        //No campo de id "other" digitar "Testando"
        campoFormTwo.findElement(By.id("other")).sendKeys("Testando");

        //No campo de id "phone_mobile" digitar "+1 855-424-7262"
        campoFormTwo.findElement(By.id("phone_mobile")).sendKeys("+1 855-424-7262");

        //Limpando o campo de id "alias"
        campoFormTwo.findElement(By.id("alias")).clear();
        //No campo de id "alias" digitar "ledacamposfigueiredo@gmail.com"
        campoFormTwo.findElement(By.id("alias")).sendKeys("ledacamposfigueiredo@gmail.com");

        //No link de id "submitAccount" clicar em
        campoFormTwo.findElement(By.xpath("//*[@id=\"submitAccount\"]")).click();
    }
}
