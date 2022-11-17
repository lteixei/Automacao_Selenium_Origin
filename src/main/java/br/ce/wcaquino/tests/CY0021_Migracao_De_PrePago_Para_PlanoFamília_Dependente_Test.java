package br.ce.wcaquino.tests;

import org.junit.BeforeClass;
import org.junit.Test;

import br.ce.wcaquino.pages.Cenarios_TelasPage;
import br.ce.wcaquino.pages.LoginPage;
import br.ce.wcaquino.utils.DataBaseUtils;
import br.ce.wcaquino.utils.DataUtils;
import br.ce.wcaquino.utils.GeraCpfCnpj;

public class CY0021_Migracao_De_PrePago_Para_PlanoFamília_Dependente_Test extends Cenarios_TelasPage{
	
	private Cenarios_TelasPage cenariostelas = new Cenarios_TelasPage();
	private static LoginPage page = new LoginPage();
	private GeraCpfCnpj gerarCpfCnpj = new GeraCpfCnpj();
	private DataUtils dataUtils = new DataUtils();
	private DataBaseUtils database = new DataBaseUtils();
		
	
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
	public void test1_CY0021_MigracaoPrePago_Para_PlanoFamília_Dependente() throws InterruptedException{
		cenariostelas.sendPDV("MORUMBI"); 
		cenariostelas.EscolhaPDVMorumbi();
		cenariostelas.confirmaPDV();
		cenariostelas.fechapopupPDV();


		// ######## ESCOLHA O PRODUTO ########
		cenariostelas.escolherProduto();


		// ######## AMBIENTE DE ATENDIMENTO ########
		cenariostelas.clickAntesAtendimento();
		cenariostelas.clickAtendimento();
		cenariostelas.proximoAmbienteAtend();


		// ######## NOVO ATENDIMENTO ########
		cenariostelas.setCPF("03359372506");
		cenariostelas.setTelefone("11996787820");//11954336341
		cenariostelas.proximoNovoAtendimento();


		// ######## ATENDIMENTO ########
		cenariostelas.clickTimPreTop();
		cenariostelas.proximoAtendimento();


		// ######## NO PÓS VENDA ########
		cenariostelas.clickMigracao();


		// ######## DADOS DO CLIENTE ########
		cenariostelas.setNome("teste");			
		cenariostelas.setEmailCliente("teste@teste.com");
		cenariostelas.checkNotEmail();
		cenariostelas.setDataNasc("12102000");
		cenariostelas.setNomeMae("maeteste");			
		cenariostelas.setCEP("01311000");
		cenariostelas.buscarCEP();
		cenariostelas.proximoDadosClientes();

		// ######## MIGRACAO ########
		cenariostelas.clickPre_TimBlackMultiFatura();


		// ######## ESCOLHER TITULAR OU DEPENDENTE ########
		cenariostelas.escolhaDependente();
		cenariostelas.numeroTitular("11970310066");
		cenariostelas.clickBotaoTitDep();


		// ######## PLANOS ########
		cenariostelas.clickPlanoDependente();
		cenariostelas.clickPlanoSemFidel();
		cenariostelas.clickBotaoBlackDep();


		// ######## SERVIÇOS ########
		cenariostelas.clickBotaoProsseguir();


		// ######## RESUMO DA OPERAÇÃO ########
		cenariostelas.checkCiente();
		cenariostelas.clickCriarPedidoComDoc();				
	}
}
