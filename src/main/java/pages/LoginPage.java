package pages;

import static core.DriverFactory.getDriver;

import java.util.Set;

import org.openqa.selenium.JavascriptExecutor;

import core.DriverFactory;

public class LoginPage extends Cenarios_TelasPage {
    
    public void acessarTela_Globo(){
        DriverFactory.getDriver().get("https://www.globo.com");
    }
    
    public void acessarTelaInicial(){
        DriverFactory.getDriver().get("https://apptimvendasdev.internal.timbrasil.com.br/45_0_09_UAT1//#/login");
    }	            
	    
	public void acessarTelaInicial1(){
	  //################ AQUI EU ABRO OUTRA ABA - ABRINDO OUTRO SISTEMA NELA #########
	    ((JavascriptExecutor) getDriver()).executeScript("window.open()");
	    Set<String> janelas = getDriver().getWindowHandles();     
	    for (String janela : janelas) {         
	    getDriver().switchTo().window(janela); } 
	  	    
	  //###########################################################################  	    
	    DriverFactory.getDriver().get("https://siebelposfqa01.oci.internal.timbrasil.com.br/siebel/app/crc/ptb/");
	    //Thread.sleep(2000);
	}
	
	public void acessarAbaJenkins(){
	      //################ AQUI EU ABRO OUTRA ABA - ABRINDO OUTRO SISTEMA NELA #########
	        ((JavascriptExecutor) getDriver()).executeScript("window.open()");
	        Set<String> janelas = getDriver().getWindowHandles();     
	        for (String janela : janelas) {         
	        getDriver().switchTo().window(janela); } 
	            
	      //###########################################################################         
	        DriverFactory.getDriver().get("http://10.171.30.103:8080/job/LimpaMassa_Movel/");
	        //Thread.sleep(2000);
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
	
	
	public void voltarParaPrimeiraAba() {
        // Obtém todas as alças de janela ativas
        for (String handle : getDriver().getWindowHandles()) {
            // Troca para a primeira alça de janela
            getDriver().switchTo().window(handle);
            break; // Sai do loop após voltar para a primeira aba
        }
    }
	
	public void acessarTelaInicial_2(){
        DriverFactory.getDriver().get("https://www.globo.com");
        }
	
	public void setEmail(String matricula) throws InterruptedException {
	    Thread.sleep(5000);
		escrever("//label[@id='login-input1']/input[1]", matricula);
	}
	
	public void setSenha(String senha) throws InterruptedException {
	    //Thread.sleep(5000);
		escrever("//input[@name='password']", senha);
	}
	
	public void entrar(){
		clicarBotao("btn-login");
	}
	
	public void logar(String email, String senha) throws InterruptedException {
		setEmail(email);
		setSenha(senha);
		entrar();
	}
}