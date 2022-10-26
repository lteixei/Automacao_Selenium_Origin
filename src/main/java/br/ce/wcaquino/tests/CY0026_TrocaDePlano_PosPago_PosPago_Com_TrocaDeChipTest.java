package br.ce.wcaquino.tests;

import org.junit.BeforeClass;
import org.junit.Test;

import br.ce.wcaquino.pages.Cenarios_TelasPage;
import br.ce.wcaquino.pages.LoginPage;
import br.ce.wcaquino.utils.DataBaseUtils;
import br.ce.wcaquino.utils.DataUtils;
import br.ce.wcaquino.utils.GeraCpfCnpj;

public class CY0026_TrocaDePlano_PosPago_PosPago_Com_TrocaDeChipTest extends Cenarios_TelasPage{
	
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
		public void test1_CY0026_TrocaDePlano_PosPago_PosPago_Com_TrocaDeChip() throws InterruptedException{
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
			cenariostelas.setCPF("24450642368");
			cenariostelas.setTelefone("12981111443");//11954336341
			cenariostelas.proximoNovoAtendimento();
						
						
		// ######## ATENDIMENTO ########
			cenariostelas.clickTimControle_RedesSociais_4();
			cenariostelas.proximoAtendimento();
						
						
		// ######## NO PÓS VENDA ########
			cenariostelas.clickTrocaPlano();
						
			
		// ######## PLANOS ########
			cenariostelas.clickPlanoPosPagoFatura();
			cenariostelas.clickPlanoTimBlack_A3();
			cenariostelas.clickPlanoSemFidelizacao();
			cenariostelas.clickBotaoProximoPos();
			cenariostelas.clickPlanoPosPop_Up();
			
					
		// ######## PÓS VENDA ########
			cenariostelas.clickTrocaChip();	
			
						
		// ######## INSERIR CHIP ########
			cenariostelas.setCHIP("89550312999026634737");			
			cenariostelas.clickMotivoTrocaChip();
			cenariostelas.clickMotivoSemGarantia_TrocaChip();
			cenariostelas.proximoTrocaCHIP();	
			
		// ######## PÓS VENDA ########
			//cenariostelas.clickFinalizar();
						

		// ######## RESUMO DA OPERAÇÃO ########
			cenariostelas.checkCiente();
			//cenariostelas.clickCriarPedido();
			cenariostelas.clickCriarPedidoComDoc();
			cenariostelas.clickPopupFim();

		}
	}