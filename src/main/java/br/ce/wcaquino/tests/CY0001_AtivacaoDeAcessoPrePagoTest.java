package br.ce.wcaquino.tests;

import org.junit.BeforeClass;
import org.junit.Test;


import br.ce.wcaquino.pages.CY0001_AtivacaoDeAcessoPrePagoPage;
import br.ce.wcaquino.pages.Cenarios_TelasPage;
import br.ce.wcaquino.pages.LoginPage;


//@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class CY0001_AtivacaoDeAcessoPrePagoTest extends Cenarios_TelasPage {
	
	private Cenarios_TelasPage cenariostelas = new Cenarios_TelasPage();
    private static LoginPage page = new LoginPage();
	
	
	// ######## LOGAR NO SISTEMA ########
	@BeforeClass
	public static void inicializa() throws InterruptedException{
		//Abrindo Site/App
		page.acessarTelaInicial();
		//Logando com Matricula e Senha
		page.setEmail("T3313299");
		page.setSenha("Tim@12345");
		page.entrar();
	}
	
	
	// ######## IDENTIFICAÇÃO DE PDV ########
	@Test
	public void test1_identificarPDV() throws InterruptedException{
		cenariostelas.sendPDV("Tim Revendas"); 
		cenariostelas.EscolhaPDVTimRevendas();
		cenariostelas.confirmaPDV();
		cenariostelas.fechapopupPDV();
	
	
	
	// ######## ESCOLHA O PRODUTO ########
		cenariostelas.escolherProduto();
	
	
	
	// ######## AMBIENTE DE ATENDIMENTO ########
		cenariostelas.clickAntesAtendimento();
		cenariostelas.clickAtendimento();
		cenariostelas.proximoAmbienteAtend();
	
	
	
	// ######## NOVO ATENDIMENTO ########
		cenariostelas.setCPF("62212545584");
		cenariostelas.setTelefone("13964276985");
		cenariostelas.proximoNovoAtendimento();
	
	
	// ######## ATENDIMENTO ########
		cenariostelas.clickOpcao();
		cenariostelas.clickCampoDDD();
		cenariostelas.clickDDD();
	
	
	// ######## DADOS DO CLIENTE ########
		cenariostelas.setNome("teste");			
		cenariostelas.setEmail("teste@teste.com");
		cenariostelas.setDataNasc("12102000");
		cenariostelas.setNomeMae("maeteste");			
		cenariostelas.setCEP("rb-101-0");
		cenariostelas.buscarCEP();
		cenariostelas.proximoDadosClientes();
	
	
	// ######## ENDEREÇO DO CLIENTE ########
		cenariostelas.setNumero("rb-101-0");
		cenariostelas.proximoEnderecoClientes();
	
	
	
	// ######## DADOS COMPLEMENTARES ########
		cenariostelas.clickSexoFeminino();            
        cenariostelas.ckickAntesEscolherDoc();
        cenariostelas.ckicEscolherDocID();
        cenariostelas.setNumeroIdentidade("12345679");            
        cenariostelas.setDataEmissão("12/10/2000");
        cenariostelas.setOrgaoEmissor("SSD");
        cenariostelas.clickAntesUF();
        cenariostelas.clickUF();
        cenariostelas.setTelContato("15964738960");
        cenariostelas.proximoDadosComplementares();

	
	
	// ######## ESCOLHA O SEGMENTO ########
		cenariostelas.clickPrepago();			
		cenariostelas.clickControleExpress();
		cenariostelas.clickControleFatura();
		cenariostelas.clickControleFlex();			
		cenariostelas.clickPosPagoFatura();
		cenariostelas.clickPosPagoExpress();
		cenariostelas.clickTimBlackMultiFatura();
		cenariostelas.clickTimBlackMultiExpress();
	
	
	// ######## ESCOLHA A OFERTA ########
		cenariostelas.clickOferta1();			
		cenariostelas.proximoOferta();
	
	
	// ######## INSERIR CHIP ########
		cenariostelas.setCHIP("rb-101-0");			
		cenariostelas.proximoInserirCHIP();

}
}
