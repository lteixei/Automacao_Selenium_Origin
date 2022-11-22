package br.ce.wcaquino.tests;

import static br.ce.wcaquino.core.DriverFactory.getDriver;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;

import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

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
public class CY0007_Ativacao_ControleFatura_Com_BlackList_Test extends Cenarios_TelasPage{
		
    private Cenarios_TelasPage cenariostelas = new Cenarios_TelasPage();
    private static LoginPage page = new LoginPage();
    private GeraCpfCnpj gerarCpfCnpj = new GeraCpfCnpj();
    private DataUtils dataUtils = new DataUtils();
    private DataBaseUtils database = new DataBaseUtils();
		private String ResgataChip = "Select SM6.SM_SERIALNUM From STORAGE_MEDIUM SMIX, "
	            + "SRVEST_ESTOQUE@DB_P2K P2K, "
	            + "STORAGE_MEDIUM@BSCSIX_TO_BSCS6_LINK SM6, "
	            + "PORT PIX, "
	            + "PORT@BSCSIX_TO_BSCS6_LINK P6, "
	            + "HLR_AREA@BSCSIX_TO_BSCS6_LINK HA, "
	            + "MPDHLTAB@BSCSIX_TO_BSCS6_LINK HL, "
	            + "AREA@BSCSIX_TO_BSCS6_LINK A "
	            + "Where SMIX.SM_ID = SM6.SM_ID "
	            + "And PIX.PORT_ID = P6.PORT_ID "
	            + "And SMIX.SM_ID = PIX.SM_ID "
	            + "And SM6.SM_ID = P6.SM_ID "
	            + "And SMIX.SM_STATUS = 'r' "
	            + "And SM6.SM_STATUS = 'r' "
	            + "And PIX.PORT_STATUS = 'r' "
	            + "And P6.PORT_STATUS = 'r' "
	            + "And SM6.SM_SERIALNUM Like '%8955031%' "
	            + "And SM6.SM_SERIALNUM = P2K.ID_PRODUTO "
	            + "And P2K.qtd_estoque_inicial = 1 "
	            + "And P2K.qtd_reservada = 0 "
	            + "And P2K.qtd_vendida = 0 "
	            + "And P2K.cod_loja = 181 "
	            + "And P6.HLCODE = HA.HLCODE "
	            + "And HL.HLCODE = HA.HLCODE "
	            + "And HA.AREA_ID = A.AREA_ID "
	            + "And HL.SWITCH_ID In ('1', '2', '3') "
	            + "And A.AREA_DESC = 'SP_15' and rownum <5 ";
	        
			
		
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
			Connection conn = DataBaseUtils.newCrivoConnection();
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
			// ################################
	        cenariostelas.clickVerificarTIMLIVE();
	        cenariostelas.clickPopup();
	        cenariostelas.clickTipoDeComplemento();
	        cenariostelas.escolhaTipoDeComplemento();
	        cenariostelas.clickComplemento();
	        cenariostelas.setComplemento("401");
	        // ################################
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
			
			
			// ######## BUSCA E INSERE TELEFONE ########
	        conn = DataBaseUtils.newSiebelUAT1Connection();
	        boolean resp =  database.executeInsert("UPDATE CX_NUM_INVENT SET X_VOIP_FLG = null, CNL_CODE = null,"
	                + " TAKEN_NUM = 'Available', ORDER_ID = null WHERE 1=1 and DDD = '15' and taken_num = 'Unavailable' and ROWNUM < 5"
	                , conn);
	        DataBaseUtils.closeConnection(conn);
			

			// ######## INFORMAÇÃO DA FATURA ########
			cenariostelas.clickDataVencimento_P();
			cenariostelas.clickBotaoInfFatura();


			// ######## INSERIR CHIP LOJA PRÓPRIA ########
	        conn = DataBaseUtils.newBSCSIXConnection();
	        ResultSet respChip =  database.executeAndReturnFirstResult(ResgataChip
	                , conn);
	        String chip = "";
	        try {
	            chip = respChip.getString(1);
	        } catch (SQLException e) {
	            // TODO Auto-generated catch block
	            e.printStackTrace();
	        }
	        DataBaseUtils.closeConnection(conn);
	        
	        
	        // ######## CONT...INSERIR CHIP ########
	        cenariostelas.setCHIP(chip);
	        cenariostelas.proximoInserirCHIP();


			// ######## ESCOLHA DE NUMERO ########
			cenariostelas.clickNumero();			
			cenariostelas.proximoEscolhaNum();


			// ######## RESUMO DA OPERAÇÃO ########
			cenariostelas.checkCiente();
			//cenariostelas.clickCriarPedido();
			cenariostelas.clickCriarPedidoComDoc();
			
			
			// ######## ENCERRA E FECHA JANELA ########
	        //cenariostelas.encerra();

		}
}