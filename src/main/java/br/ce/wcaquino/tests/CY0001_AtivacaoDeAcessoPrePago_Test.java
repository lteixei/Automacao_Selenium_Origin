package br.ce.wcaquino.tests;

import java.sql.Connection;
import java.sql.ResultSet;
import java.util.HashMap;
import java.util.Map;

import org.junit.BeforeClass;
import org.junit.Test;

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


//@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class CY0001_AtivacaoDeAcessoPrePago_Test extends Cenarios_TelasPage{
	
	private Cenarios_TelasPage cenariostelas = new Cenarios_TelasPage();
	private static LoginPage page = new LoginPage();
	private GeraCpfCnpj gerarCpfCnpj = new GeraCpfCnpj();
	private DataUtils dataUtils = new DataUtils();
	private DataBaseUtils database = new DataBaseUtils();
		
	// ######## LOGAR NO SISTEMA ########
	@BeforeClass
	public static void inicializa() throws InterruptedException{
		page.acessarTelaInicial();//Abrindo Site/App
		//Logando com Matricula e Senha
		page.setEmail("T3313299");
		page.setSenha("Tim@12345");
		page.entrar();
	}
	
	
	// ######## IDENTIFICAÇÃO DE PDV ########
	@Test
	public void test1_CY0001_AtivacaoDeAcessoPrePago() throws InterruptedException{
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
		String cpf = gerarCpfCnpj.cpf(false);
		Connection conn = DataBaseUtils.newCrivoConnection();
		//ResultSet insertCrivo = database.executeAndReturnFirstResult("insert into mensagens values (S_MENSAGENS.NEXTVAL,'" + cpf+ "','F','963',sysdate,'Score Interno','500',sysdate)", conn);
		System.out.print("CPF:"+cpf);
		boolean insertCrivo = database.executeInsert("insert into mensagens values (S_MENSAGENS.NEXTVAL,'" + cpf+ "','F','963',sysdate,'Score Interno','500',sysdate)", conn);
		DataBaseUtils.closeConnection(conn);
		cenariostelas.setCPF(cpf);
		cenariostelas.setTelefone("15964738960");
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
		cenariostelas.clickPrepago();			
		
	
	// ######## ESCOLHA A OFERTA ########
		cenariostelas.clickOferta1();
		cenariostelas.fechaPopup();
		cenariostelas.proximoOferta();
		
	
	// ######## INSERIR CHIP ########
        
        conn = DataBaseUtils.newSiebelUAT1Connection();
		boolean resp =  database.executeInsert("UPDATE CX_NUM_INVENT SET X_VOIP_FLG = null, CNL_CODE = null,"
				+ " TAKEN_NUM = 'Available',ORDER_ID = null WHERE ROW_ID in ("
				+ " select ROW_ID from cx_num_invent where 1=1 and DDD = '15' and taken_num = 'Unavailable' and ROWNUM < 5)"
				, conn);
		DataBaseUtils.closeConnection(conn);
		cenariostelas.setCHIP("89550311000172351126");		
		//cenariostelas.setCHIP(simcard);
		cenariostelas.proximoInserirCHIP();
	
	
	// ######## ESCOLHA DE NUMERO ########
		cenariostelas.clickNumero();			
		cenariostelas.proximoEscolhaNum();
	

	// ######## RESUMO DA OPERAÇÃO ########
		cenariostelas.checkCiente();
		cenariostelas.clickCriarPedido();
	}	
}