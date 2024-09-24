package pages;

import static core.DriverFactory.getDriver;

import java.util.Set;

import org.junit.BeforeClass;

import core.DriverFactory;

public class LoginPage extends Cenarios_Automation {
	@BeforeClass
	public void acessarTelaInicial(){
	  DriverFactory.getDriver().get("https://demo.automationtesting.in");
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
	
	public void fecharAbaAtual() {
	 // Obtém todas as alças (handles) das janelas abertas
        Set<String> janelas = getDriver().getWindowHandles();
 
        // Verifica se existem mais de uma janela
        if (janelas.size() > 1) {
            // Itera sobre as alças (handles) das janelas
            for (String janela : janelas) {
                // Muda para a próxima janela
                getDriver().switchTo().window(janela);
            }
 
            // Fecha a janela atual
            getDriver().close();
 
            // Retorna o foco para a primeira janela (se necessário)
            getDriver().switchTo().window(janelas.iterator().next());
        } else {
            // Se houver apenas uma janela aberta, não há necessidade de fechar
            System.out.println("Apenas uma janela aberta. Não é possível fechar.");
        }
    }
}
