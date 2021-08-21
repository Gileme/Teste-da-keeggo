package elementoskeeggo;

import org.openqa.selenium.By;

public class ElementosKeeggo {
	
	
	public By user = By.id("menuUserLink");
	public By nomeUsuario = By.name("username");
	public By senha = By.name("password");
	public By btEntrar = By.id("sign_in_btnundefined");
	public By novaConta = By.cssSelector("body > login-modal > div > div > div.login.ng-scope > a.create-new-account.ng-scope");

	
	//Criar nova conta  
	
	public By nomeRegistro = By.name("usernameRegisterPage");
	public By email = By.name("emailRegisterPage");
	public By password = By.name("passwordRegisterPage");
	public By confirPassword = By.cssSelector("#formCover > div:nth-child(1) > div:nth-child(3) > sec-view:nth-child(2) > div > input");
	public By registro = By.id("register_btnundefined");
	
	
}




