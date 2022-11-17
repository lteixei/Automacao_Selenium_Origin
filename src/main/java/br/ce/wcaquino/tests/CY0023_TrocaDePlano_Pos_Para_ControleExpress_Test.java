package br.ce.wcaquino.tests;

import org.junit.BeforeClass;
import org.junit.Test;

import br.ce.wcaquino.pages.Cenarios_TelasPage;
import br.ce.wcaquino.pages.LoginPage;
import br.ce.wcaquino.utils.DataBaseUtils;
import br.ce.wcaquino.utils.DataUtils;
import br.ce.wcaquino.utils.GeraCpfCnpj;

public class CY0023_TrocaDePlano_Pos_Para_ControleExpress_Test extends Cenarios_TelasPage{
	
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
	public void test1_CY0023_TrocaDePlano_PosParaControleExpress() throws InterruptedException{
		cenariostelas.sendPDV("E A DUTRA"); 
		cenariostelas.EscolhaPDVDutra();
		cenariostelas.confirmaPDV();
		cenariostelas.fechapopupPDV();


		// ######## ESCOLHA O PRODUTO ########
		cenariostelas.escolherProduto();


		// ######## AMBIENTE DE ATENDIMENTO ########
		cenariostelas.clickAntesAtendimento();
		cenariostelas.clickAtendimento();
		cenariostelas.proximoAmbienteAtend();


		// ######## NOVO ATENDIMENTO ########
		cenariostelas.setCPF("99643957365");
		cenariostelas.setTelefone("48996012110");
		cenariostelas.proximoNovoAtendimento();


		// ######## ATENDIMENTO ########
		cenariostelas.clickBasicoPosPagoMovel();
		cenariostelas.proximoAtendimento();


		// ######## NO PÓS VENDA ########
		cenariostelas.clickTrocaPlano();


		// ######## PLANOS ########
		cenariostelas.clickPlano4();
		cenariostelas.clickPlano4_A();
		cenariostelas.clickBotaoPlano();


		// ######## SERVIÇOS ########
		cenariostelas.clickBotaoProsseguir();


		// ######## CARTÃO DE CRÉDITO ########
		cenariostelas.setNumeroCartao("5506597606713371");
		cenariostelas.clickMesValidade();
		cenariostelas.escolhaMesValidade();
		cenariostelas.clickAnoValidade();
		cenariostelas.escolhaAnoValidade();
		cenariostelas.setCodSeguranca("397");
		cenariostelas.clickConfPagamento();	


		// ######## PÓS VENDA ########
		cenariostelas.clickFinalizar();	


		// ######## RESUMO DA OPERAÇÃO ########
		cenariostelas.checkCiente();
		cenariostelas.clickCriarPedido();
		cenariostelas.clickPopup();
	}
}