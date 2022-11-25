

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.junit.BeforeClass;
import org.junit.Test;

import br.ce.wcaquino.pages.Cenarios_TelasPage;
import br.ce.wcaquino.pages.LoginPage;
import br.ce.wcaquino.utils.DataBaseUtils;
import br.ce.wcaquino.utils.DataUtils;
import br.ce.wcaquino.utils.GeraCpfCnpj;

public class CY0018_Migracao_De_Pre_Para_Pos_ComTT_TrocaDeChip_Test extends Cenarios_TelasPage{
	
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
	public void test1_CY0018_MigracaoDePreParaPosComTT_TrocaDeChip() throws InterruptedException{
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
		cenariostelas.setCPF("42392352003");
		cenariostelas.setTelefone("11954336341");
		cenariostelas.proximoNovoAtendimento();


		// ######## ATENDIMENTO ########
		cenariostelas.insertNovoTel("19981110003");
		cenariostelas.proximoAtendimento();


		// ######## NO PÓS VENDA ########
		cenariostelas.clickMigracaoTT();


		// ######## DADOS DO CLIENTE ########		
		cenariostelas.setCEPTroca("01311000");
		cenariostelas.buscarCEP();
		cenariostelas.proximoDadosClientes();
	

		// ######## MIGRACAO TT ########
		cenariostelas.clickPre_PosPago_Fatura();


		// ######## PLANOS ########
		cenariostelas.clickPlanoTimBlackA3();
		cenariostelas.clickFidelPlano_Apar();
		cenariostelas.clickPopup();
		cenariostelas.clickBotaoPlano();


		// ######## SERVIÇOS ########
		cenariostelas.clickBotaoProsseguir();


		// ######## FIDELIZAÇÃO DE APARELHO ########
		cenariostelas.clickPopupIMEI();
		cenariostelas.setIMEI("440915761313482");
		cenariostelas.validarIMEI();
		cenariostelas.clickBotaoFidelAparelho();
		
		
		// ######## DADOS DA ALÇADA ########
        cenariostelas.clickBotaoAlcada();


		// ######## INFORMAÇÃO DA FATURA ########
		cenariostelas.clickDataVencimento();
		cenariostelas.clickBotaoInfFatura();


		// ######## PÓS VENDA ########
		cenariostelas.clickTrocaChip();		


		// ######## INSERIR CHIP LOJA PRÓPRIA ########
		Connection conn = DataBaseUtils.newBSCSIXConnection();
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
		cenariostelas.clickMotivoTrocaChip();
		cenariostelas.clickMotivoComGarantia_TrocaChip();
		cenariostelas.proximoInserirCHIP();


		// ######## RESUMO DA OPERAÇÃO ########
		cenariostelas.checkCiente();
		cenariostelas.clickCriarPedidoComDoc();
		
		
		// ######## ENCERRA E FECHA JANELA ########
        //cenariostelas.encerra();

	    }
	}