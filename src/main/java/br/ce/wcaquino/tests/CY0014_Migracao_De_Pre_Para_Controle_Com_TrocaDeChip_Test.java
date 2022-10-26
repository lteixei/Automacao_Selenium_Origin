package br.ce.wcaquino.tests;

import java.sql.Connection;

import org.junit.BeforeClass;
import org.junit.Test;
import br.ce.wcaquino.pages.Cenarios_TelasPage;
import br.ce.wcaquino.pages.LoginPage;
import br.ce.wcaquino.utils.DataBaseUtils;
import br.ce.wcaquino.utils.DataUtils;
import br.ce.wcaquino.utils.GeraCpfCnpj;

public class CY0014_Migracao_De_Pre_Para_Controle_Com_TrocaDeChip_Test extends Cenarios_TelasPage{
	
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
	public void test1_CY0014_Migracao_De_Pre_Para_Controle_Com_TrocaDeChip_Test() throws InterruptedException{
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
		cenariostelas.setCPF("42451879807");
		cenariostelas.setTelefone("11981217028");
		cenariostelas.proximoNovoAtendimento();
		
		
	// ######## ATENDIMENTO ########
		cenariostelas.clickTimPreTop();
		//cenariostelas.clickOpcao();
		//cenariostelas.clickCampoDDD();
		//cenariostelas.clickDDD();
		cenariostelas.proximoAtendimento();
		
		
	// ######## NO PÓS VENDA ########
		cenariostelas.clickMigracao();
		//cenariostelas.clickTrocaChip();
		//cenariostelas.clickNovoProtocolo();
		//cenariostelas.clickConsultarProtocolos();
			
	
	// ######## DADOS DO CLIENTE ########
		//cenariostelas.setNome("teste");			
		//cenariostelas.setEmailCliente("teste@teste.com");
		//cenariostelas.confirmaEmail("teste@teste.com");
		//cenariostelas.validaEmail();
		//cenariostelas.checkNotEmail("teste@teste.com");
		cenariostelas.setDataNasc("12102000");
		cenariostelas.setNomeMae("maeteste");			
		cenariostelas.setCEP("03178030");
		cenariostelas.buscarCEP();
		cenariostelas.proximoDadosClientes();
		//cenariostelas.poupupClientes();
		
	// ######## MIGRACAO ########
		cenariostelas.clickPre_ControleFatura();
					
				
	// ######## PLANOS ########
		cenariostelas.clickPlano();
		cenariostelas.clickOpacao5();
		cenariostelas.clickPopup();
		cenariostelas.clickBotaoPlano();
					
					
	// ######## SERVIÇOS ########
		cenariostelas.clickBotaoProsseguir();
					
					
	// ######## FIDELIZAÇÃO DE APARELHO ########
		cenariostelas.setIMEI("864669983363950");
		cenariostelas.validarIMEI();
		cenariostelas.clickBotaoFidelAparelho();
	
							
	// ######## INFORMAÇÃO DA FATURA ########
		cenariostelas.clickDataVencimento();
		cenariostelas.clickBotaoInfFatura();
		
					
	// ######## PÓS VENDA ########
		cenariostelas.clickTrocaChip();	
		
		
	// ######## TROCA DE CHIP ########
		cenariostelas.setTrocaCHIP("89550311000172250831");
		cenariostelas.clickMotivoTrocaChip();
		cenariostelas.clickMotivoSemGarantia_TrocaChip();
		//cenariostelas.clickMotivoComGarantia_TrocaChip();
		cenariostelas.proximoTrocaCHIP();
	

	// ######## RESUMO DA OPERAÇÃO ########
		cenariostelas.checkCiente();
		//cenariostelas.clickCriarPedido();
		cenariostelas.clickCriarPedidoComDoc();

	}
}