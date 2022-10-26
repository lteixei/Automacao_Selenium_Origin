package br.ce.wcaquino.tests;

import java.sql.Connection;
import java.util.Map;

import org.junit.BeforeClass;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.offbytwo.jenkins.model.Build;
import com.offbytwo.jenkins.model.JobWithDetails;
import com.offbytwo.jenkins.model.QueueItem;
import com.offbytwo.jenkins.model.QueueReference;

import br.ce.wcaquino.pages.Cenarios_TelasPage;
import br.ce.wcaquino.pages.LoginPage;
import br.ce.wcaquino.utils.DataBaseUtils;
import br.ce.wcaquino.utils.DataUtils;
import br.ce.wcaquino.utils.GeraCpfCnpj;
import br.ce.wcaquino.utils.JenkinsHelper;

public class CY0009_Ativacao_De_BlackFamilia_Test extends Cenarios_TelasPage{
	
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
	@SuppressWarnings("static-access")
	@Test
	public void test1_CY0009_Ativacao_De_BlackFamilia() throws InterruptedException{
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
		
		
		String cpf = gerarCpfCnpj.cpf(false);
		Connection conn = DataBaseUtils.newCrivoConnection();
		//ResultSet insertCrivo = database.executeAndReturnFirstResult("insert into mensagens values (S_MENSAGENS.NEXTVAL,'" + cpf+ "','F','963',sysdate,'Score Interno','500',sysdate)", conn);
		System.out.print("CPF:"+cpf);
		boolean insertCrivo = database.executeInsert("insert into mensagens values (S_MENSAGENS.NEXTVAL,'" + cpf+ "','F','963',sysdate,'Score Interno','500',sysdate)", conn);
		cenariostelas.setCPF(cpf);
		//cenariostelas.setCPF("17003153823");
		cenariostelas.setTelefone("12981110910");
		cenariostelas.proximoNovoAtendimento();
		
		
		// ######## ATENDIMENTO ########
		cenariostelas.clickOpcao();
		cenariostelas.clickCampoDDD();
		cenariostelas.clickDDD();
		cenariostelas.proximoAtendimento();
					
			
		// ######## DADOS DO CLIENTE ########
		cenariostelas.setNome("teste");			
		cenariostelas.setEmailCliente("teste@teste.com");
		cenariostelas.confirmaEmail("teste@teste.com");
		cenariostelas.validaEmail();
		cenariostelas.setDataNasc("12102000");
		cenariostelas.setNomeMae("maeteste");			
		cenariostelas.setCEP("18320971");
		cenariostelas.buscarCEP();
		cenariostelas.proximoDadosClientes();
			
			
		// ######## ENDEREÇO DO CLIENTE ########
		cenariostelas.clickAntesLogradouro();
		cenariostelas.clickTipoLogradouro();
		cenariostelas.setNomeDaRua("Itagiba");
		cenariostelas.setNumero("520");
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
		cenariostelas.clickTimBlackMultiFatura();
							
		// ######## ESCOLHER TITULAR OU DEPENDENTE ########
		cenariostelas.escolhaTitular();
		cenariostelas.clickBotaoTitDep();		
				
				
		// ######## PLANOS ########
		cenariostelas.clickMultiD3_0();
		cenariostelas.clickMultiD3_0SemFid();
		cenariostelas.clicBotaoTimBlackMulti();
							
							
		// ######## SERVIÇOS ########
		cenariostelas.clickBotaoHBO();
		cenariostelas.clickBotaoProsseguir();
							
							
		// ######## INFORMAÇÃO DA FATURA ########
		cenariostelas.clickDataVencimento();
		cenariostelas.clickBotaoInfFatura();
									
		
		// ######## INSERIR CHIP ########			
		cenariostelas.setCHIP("89550311000172302152");			
		cenariostelas.proximoInserirCHIP();
			
			
		// ######## ESCOLHA DE NUMERO ########
		cenariostelas.clickNumero();			
		cenariostelas.proximoEscolhaNum();
	
		// ######## UPLOAD DE ARQUIVO - DADOS DA ALÇADA ########
		cenariostelas.anexarIdentFrente();
		cenariostelas.anexarIdentVerso();
		cenariostelas.anexarCPF();
		cenariostelas.anexarComprovanteRes();
		cenariostelas.clickBotaoAlcada();
			

		// ######## RESUMO DA OPERAÇÃO ########
		//cenariostelas.checkCiente();
		cenariostelas.clickCriarPedido();
		//cenariostelas.clickCriarPedidoComDoc();
	}	
}