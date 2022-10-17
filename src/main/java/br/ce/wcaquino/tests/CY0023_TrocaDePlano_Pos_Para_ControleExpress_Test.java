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
			cenariostelas.setCPF("43443095291");
			cenariostelas.setTelefone("11981213483");//11954336341
			cenariostelas.proximoNovoAtendimento();
			
			
		// ######## ATENDIMENTO ########
			//cenariostelas.insertNovoTel("19981110003");
			cenariostelas.clickTimControle_A_Plus();
			//cenariostelas.clickTimPreTop();
			//cenariostelas.clickOpcao();
			//cenariostelas.clickCampoDDD();
			//cenariostelas.clickDDD();
			cenariostelas.proximoAtendimento();
			
			
		// ######## NO PÓS VENDA ########
			//cenariostelas.insertNovoTel("19981110003");
			//cenariostelas.clickMigracao();
			//cenariostelas.clickMigracaoTT();
			//cenariostelas.clickTrocaChip();
			cenariostelas.clickTrocaPlano();
			//cenariostelas.clickNovoProtocolo();
			//cenariostelas.clickConsultarProtocolos();
				
		
		// ######## DADOS DO CLIENTE ########
			cenariostelas.setNome("teste");			
			//cenariostelas.setEmailCliente("teste@teste.com");
			//cenariostelas.confirmaEmail("teste@teste.com");
			//cenariostelas.validaEmail();
			cenariostelas.checkNotEmail();
			cenariostelas.setDataNasc("12102000");
			cenariostelas.setNomeMae("maeteste");			
			cenariostelas.setCEP("01311000");
			cenariostelas.buscarCEP();
			cenariostelas.proximoDadosClientes();
			cenariostelas.poupupClientes();
						
					
		// ######## PLANOS ########
			cenariostelas.clickPlanoTimBlackA3();
			cenariostelas.clickFidelPlano_Apar();
			cenariostelas.clickBotaoPlano();
			cenariostelas.clickPopup();
						
						
		// ######## SERVIÇOS ########
			cenariostelas.clickBotaoProsseguir();
			
			
		// ######## PÓS VENDA ########
			cenariostelas.clickFinalizar();	
			

		// ######## RESUMO DA OPERAÇÃO ########
			//cenariostelas.checkCiente();
			cenariostelas.clickCriarPedidoComDoc();

		}
	}