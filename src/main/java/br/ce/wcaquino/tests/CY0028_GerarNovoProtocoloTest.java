package br.ce.wcaquino.tests;

import org.junit.BeforeClass;
import org.junit.Test;

import br.ce.wcaquino.pages.Cenarios_TelasPage;
import br.ce.wcaquino.pages.LoginPage;

public class CY0028_GerarNovoProtocoloTest extends Cenarios_TelasPage {
	
	private Cenarios_TelasPage cenariostelas = new Cenarios_TelasPage();
    private static LoginPage page = new LoginPage();
    
    @BeforeClass
	public static void inicializa() throws InterruptedException{
		//Abrindo Site/App
		page.acessarTelaInicial();
		//Logando com Matricula e Senha
		page.setEmail("T3313299");
		page.setSenha("Tim@12345");
		page.entrar();
	}
    
    @Test
	public void test1_identificarPDV() throws InterruptedException{
		cenariostelas.sendPDV("MagazineLuiza"); 
		cenariostelas.EscolhaPDVMagazineluiza();
		cenariostelas.confirmaPDV();
		cenariostelas.fechapopupPDV();
		
		// ######## ESCOLHA O PRODUTO ########
		cenariostelas.escolherProduto();
		
		// ######## AMBIENTE DE ATENDIMENTO ########
		cenariostelas.clickAntesAtendimento();
		cenariostelas.clickAtendimento();
		cenariostelas.proximoAmbienteAtend();
		
		// ######## NOVO ATENDIMENTO ########
		cenariostelas.setCPF("02195185805");
		cenariostelas.setTelefone("16981110085");
		cenariostelas.proximoNovoAtendimento();
		
		cenariostelas.clickTimPreTop();
		cenariostelas.proximoAtendimento();
		
		cenariostelas.clickNovoProtocolo();
		
		
		
		cenariostelas.clickMotivo1();
		
		//cenariostelas.clickNaoInformadoMotivo1();
		

		
				
			
    }
}
