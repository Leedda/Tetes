package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class CriarConta {

    private WebDriver navegador;

    public CriarConta(WebDriver navegador){

        this.navegador = navegador;
    }

     public void registrarNovaContaUsuario(){

         WebElement formCreateAccount = navegador.findElement(By.id("create-account_form"));
         //Na combo de name "email_create", digitar um endereço de email
         formCreateAccount.findElement(By.name("email_create")).sendKeys("ledacamposfigueiredo@hotmail.com");

         //Clicar no link de name "Create an account" que está na popup
         formCreateAccount.findElement(By.xpath("//*[@id=\"SubmitCreate\"]/span")).click();

         //Identificar o popup onde está o formulário de id "account-creation_form"
         WebElement popupaccountCreationForm = navegador.findElement(By.id("account-creation_form"));

         //Na combo de name "Title", escolher a opção "Mrs"
         WebElement campoTitle = popupaccountCreationForm.findElement(By.className("account_creation"));
         //new Select(popupaccountCreationForm).selectByVisibleText("Mrs.");
         campoTitle.findElement(By.id("id_gender2")).click();

         //No campo de id "First name" digitar "Leda"
         campoTitle.findElement(By.id("customer_firstname")).sendKeys("Leda");

         //No campo de id "customer_lastname" digitar "Figueiredo"
         campoTitle.findElement(By.id("customer_lastname")).sendKeys("Figueiredo");

         //No campo de id "passwd" digitar "123456"
         campoTitle.findElement(By.id("passwd")).sendKeys("123456");

         //No campo de id "days" selecionar "11"
         WebElement campoDays = campoTitle.findElement(By.id("days"));
         new Select(campoDays).selectByValue("11");

         //No campo de id "months" selecionar "November"
         WebElement campoMonths = campoTitle.findElement(By.id("months"));
         new Select(campoMonths).selectByValue("11");

         //No campo de id "years" selecionar "1979"
         WebElement campoYears = campoTitle.findElement(By.id("years"));
         new Select(campoYears).selectByValue("1979");

         //No campo de id "newsletter" clicar no link
         campoTitle.findElement(By.id("newsletter")).click();

         //No campo de id "optin" clicar no link
         campoTitle.findElement(By.id("optin")).click();
     }

    public void logarContaUsuario(){


        WebElement  campoFormTwo = navegador.findElement(By.xpath("//*[@id=\"login_form\"]"));
        campoFormTwo.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("ledacamposfigueiredo@hotmail.com");

        campoFormTwo.findElement(By.xpath("//*[@id=\"passwd\"]")).sendKeys("123456");
        campoFormTwo.findElement(By.xpath("//*[@id=\"SubmitLogin\"]/span")).click();
    }

}
