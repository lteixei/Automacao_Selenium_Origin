package br.ce.wcaquino.tests;

import java.sql.Connection;

import org.junit.BeforeClass;
import org.junit.Test;

import br.ce.wcaquino.pages.Cenarios_TelasPage;
import br.ce.wcaquino.pages.LoginPage;
import br.ce.wcaquino.utils.DataBaseUtils;
import br.ce.wcaquino.utils.DataUtils;
import br.ce.wcaquino.utils.GeraCpfCnpj;

public class CY0007_Ativacao_ControleFatura_Com_BlackList_Test extends Cenarios_TelasPage{
		
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
		public void test1_CY0007_Ativacao_Controle_Fatura_Com_Black_List() throws InterruptedException{
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
			//## CPF TEM QUE ESTAR NA BLACK LIST
			cenariostelas.setCPF("00920212980");
			cenariostelas.setTelefone("11982237102");
			cenariostelas.proximoNovoAtendimento();
			
			
		// ######## ATENDIMENTO ########
			cenariostelas.clickOpcaoDemorada();
			cenariostelas.clickCampoDDD();
			cenariostelas.clickDDD();
			cenariostelas.proximoAtendimento();
			
		
		// ######## DADOS DO CLIENTE ########
			//cenariostelas.setNome("teste");			
			//cenariostelas.setEmailCliente("teste@teste.com");
			//cenariostelas.confirmaEmail("teste@teste.com");
			//cenariostelas.validaEmail();
			//cenariostelas.checkNotEmail();
			//cenariostelas.setDataNasc("12102000");
			//cenariostelas.setNomeMae("maeteste");			
			//cenariostelas.setCEPTroca("18320971");
			cenariostelas.buscarCEP();
			cenariostelas.proximoDadosClientes();
			//cenariostelas.poupupClientes();
			
			
		// ######## ENDEREÇO DO CLIENTE ########
			cenariostelas.setNumero("520");
			cenariostelas.proximoEnderecoClientes();
		
			
		// ######## DADOS COMPLEMENTARES ########
			//cenariostelas.clickSexoFeminino();			
			//cenariostelas.ckickAntesEscolherDoc();
			//cenariostelas.ckicEscolherDocID();
			//cenariostelas.setNumeroIdentidade("12345679");			
			//cenariostelas.setDataEmissão("12/10/2000");
			//cenariostelas.setOrgaoEmissor("SSD");
			//cenariostelas.clickAntesUF();
			//cenariostelas.clickUF();
			//cenariostelas.setTelContato("15964738960");
			cenariostelas.proximoDadosComplementares();
			
			
		// ######## ESCOLHA O SEGMENTO ########
			//cenariostelas.clickPrepago();			
			//cenariostelas.clickControleExpress();
			cenariostelas.clickControleFatura();
			//cenariostelas.clickControleFlex();			
			//cenariostelas.clickPosPagoFtura();
			//cenariostelas.clickPosPagoExpress();
			//cenariostelas.clickTimBlackMultiFatura();
			//cenariostelas.clickTimBlackMultiExpress();
			
		// ######## PLANOS ########
			cenariostelas.clickPlano(); // TIM CONTROLE REDES SOCIAIS 4 0 E SEM FIDELIZAÇÃO
			cenariostelas.clickOpacao1();// SEM FIDELIZAÇÃO
			//cenariostelas.clickPopup();
			cenariostelas.clickBotaoPlano();
			

		// ######## SERVIÇOS ########
			cenariostelas.clickBotaoProsseguir();
								
			
		// ######## INFORMAÇÃO DA FATURA ########
			cenariostelas.clickDataVencimento_P();
			cenariostelas.clickBotaoInfFatura();
			
									
		// ######## INSERIR CHIP ########
			cenariostelas.setCHIP("89550311000172253553");	
			//cenariostelas.clickMotivoTrocaChip();
			//cenariostelas.escolhaMotivoTrocaChip();
			cenariostelas.proximoInserirCHIP();
			
			
		// ######## ESCOLHA DE NUMERO ########
			cenariostelas.clickNumero();			
			cenariostelas.proximoEscolhaNum();
					

		// ######## RESUMO DA OPERAÇÃO ########
			cenariostelas.checkCiente();
			//cenariostelas.clickCriarPedido();
			cenariostelas.clickCriarPedidoComDoc();

		}
	}