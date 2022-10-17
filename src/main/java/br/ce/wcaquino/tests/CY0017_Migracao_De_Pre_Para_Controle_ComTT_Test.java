package br.ce.wcaquino.tests;

import org.junit.BeforeClass;
import org.junit.Test;

import br.ce.wcaquino.pages.Cenarios_TelasPage;
import br.ce.wcaquino.pages.LoginPage;
import br.ce.wcaquino.utils.DataBaseUtils;
import br.ce.wcaquino.utils.DataUtils;
import br.ce.wcaquino.utils.GeraCpfCnpj;

public class CY0017_Migracao_De_Pre_Para_Controle_ComTT_Test extends Cenarios_TelasPage{
	
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
	public void test1_CY0012_AtivacaoControleExpress() throws InterruptedException{
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
		//String cpf = gerarCpfCnpj.cpf(false);
		//Connection conn = DataBaseUtils.newCrivoConnection();
		//ResultSet insertCrivo = database.executeAndReturnFirstResult("insert into mensagens values (S_MENSAGENS.NEXTVAL,'" + cpf+ "','F','963',sysdate,'Score Interno','500',sysdate)", conn);
		//System.out.print("CPF:"+cpf);
		//boolean insertCrivo = database.executeInsert("insert into mensagens values (S_MENSAGENS.NEXTVAL,'" + cpf+ "','F','963',sysdate,'Score Interno','500',sysdate)", conn);
		cenariostelas.setCPF("28185517223");
		cenariostelas.setTelefone("11954336341");
		cenariostelas.proximoNovoAtendimento();
		
		
	// ######## ATENDIMENTO ########
		cenariostelas.insertNovoTel("19981110003");
		cenariostelas.proximoAtendimento();
		
		
	// ######## NO PÓS VENDA ########
		cenariostelas.clickMigracaoTT();
		
	
	// ######## DADOS DO CLIENTE ########
		cenariostelas.setNome("teste");			
		cenariostelas.setEmailCliente("teste@teste.com");
		cenariostelas.setDataNasc("12102000");
		cenariostelas.setNomeMae("maeteste");			
		cenariostelas.setCEP("12233002");
		cenariostelas.buscarCEP();
		cenariostelas.proximoDadosClientes();
		
	
	// ######## MIGRACAO TT ########
		cenariostelas.clickPre_ControleFatura();
					
				
	// ######## PLANOS ########
		cenariostelas.clickPlanoTimControleSmart_4();
		cenariostelas.clickSemFidelizacao();
		cenariostelas.clickBotaoPlano();
					
					
	// ######## SERVIÇOS ########
		cenariostelas.clickBotaoProsseguir();
	
							
	// ######## INFORMAÇÃO DA FATURA ########
		cenariostelas.clickDataVencimento();
		cenariostelas.clickBotaoInfFatura();
		
				
	// ######## PÓS VENDA ########
		cenariostelas.clickFinalizar();	
		

	// ######## RESUMO DA OPERAÇÃO ########
		cenariostelas.checkCiente();
		cenariostelas.clickCriarPedidoComDoc();
	}
}