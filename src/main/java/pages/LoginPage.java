package pages;

import org.junit.BeforeClass;

import core.DriverFactory;

public class LoginPage extends Cenarios_Automation {
	@BeforeClass
	public void acessarTelaInicial(){
	  DriverFactory.getDriver().get("https://demo.automationtesting.in");
	}
	
	public void acessarTelaInicial_1(){
        DriverFactory.getDriver().get("https://www.globo.com");
    }
	
	public void acessarTelaInicial_2(){
        DriverFactory.getDriver().get("https://www.odia.com.br");
    }
	
	public void setEmail(String matricula) throws InterruptedException {
	    Thread.sleep(10000);
		escrever("/html/body/div/div[2]/div/form/div[3]/input", matricula);
	}
	
	public void setSenha(String senha) throws InterruptedException {
	    Thread.sleep(5000);
		escrever("/html/body/div/div[2]/div/form/div[5]/input", senha);
	}
	
	public void entrar(){
		clicarBotao("/html/body/div/div[2]/div/form/div[6]/span/a");
	}
	
	public void logar(String email, String senha) throws InterruptedException {
		setEmail(email);
		setSenha(senha);
		entrar();
	}
}