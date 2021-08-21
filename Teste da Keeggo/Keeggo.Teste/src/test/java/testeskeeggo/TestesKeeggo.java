package testeskeeggo;

import java.io.IOException;

import elementoskeeggo.ElementosKeeggo;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageskeeggo.MetodosKeeggo;

public class TestesKeeggo {
	
	
	MetodosKeeggo metodos = new MetodosKeeggo();
	ElementosKeeggo el = new ElementosKeeggo();
	
	@Given("que eu entre no site {string}")
	public void que_eu_entre_no_site(String Url) throws InterruptedException, IOException {
	    
		metodos.abrirNavegador(Url);
		metodos.pausa(5000);
		metodos.screenshot("Pagina do site");
		
		
	}

	@Given("acesso o formulario de abertura de conta")
	public void acesso_o_formulario_de_abertura_de_conta() throws InterruptedException, IOException {
	  
		
		metodos.pausa(3000);
		metodos.clicar(el.user, ("Clicar em User"));
		metodos.pausa(3000);
		metodos.screenshot("Acessar o User");
	
		metodos.pausa(3000);
		metodos.clicar(el.novaConta, ("acessar o formulario"));
		metodos.pausa(3000);
		metodos.screenshot("Acessando o formulario");	
		
		
		metodos.preencher(el.nomeRegistro, ("Keeggoo"));
		metodos.preencher(el.email, ("testekeeggo@gmail"));
		metodos.preencher(el.password, ("123456Kg"));
		metodos.pausa(5000);
		metodos.preencher(el.confirPassword, ("123456Kg"));
		metodos.screenshot("Nome,senha e email valido");;
		
	}
	@When("enviar o formulario")
	public void enviar_o_formulario() throws InterruptedException {
	    metodos.pausa(3000);
		metodos.clicar(el.registro, ("Clicar em registrar"));
		
		
	}

	@Then("cadastro realizado com sucesso")
	public void cadastro_realizado_com_sucesso() throws InterruptedException, IOException {
	 
		metodos.pausa(1000);
		metodos.screenshot("Cadastro realizado");
		metodos.pausa(3000);
		metodos.fecharNavegador();
	}


}
