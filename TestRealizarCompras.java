package tests;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class TestRealizarCompras {
    private WebDriver navegador;

    @Before
    public void setUp() {
        //abrindo o navegador
        System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\drivers\\chromedriver.exe");
        navegador = new ChromeDriver();
        navegador.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        //Navegando para página da Task
        navegador.get("http://www.automationpractice.com");

    }

    @Test
    public void testEscolherUmProdutoQualquerDaLoja() {

        PaginaPrincipal pagina = new PaginaPrincipal(navegador);
        pagina.searchProduct();

        ColocarProdutoNoCarrinho detail = new ColocarProdutoNoCarrinho(navegador);
        detail.addProdutoCarrinho();
        detail.proceedToCheckout();

        // String email = "ledacamposfigueiredo@hotmail.com";
        CriarConta criarConta = new CriarConta(navegador);
        //criarConta.registrarNovaContaUsuario();
        //Caso a conta de email já exista, o sistema realiza o login
        criarConta.logarContaUsuario();

        RealizarComentario relatarcomentario = new RealizarComentario(navegador);
        relatarcomentario.comentar();
        relatarcomentario.aceitarTermos();

        EscolherFormaPagamento escolherFormaPagamento = new EscolherFormaPagamento(navegador);
        escolherFormaPagamento.pagar();


//Obs.1: a entrega deve ser feita via repositório de versionamento Git.
//
//Obs.2: faça um read-me com instruções de configuração e execução do seu script.”


    }
}
