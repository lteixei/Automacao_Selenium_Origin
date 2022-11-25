

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.junit.BeforeClass;
import org.junit.Test;

import br.ce.wcaquino.pages.Cenarios_TelasPage;
import br.ce.wcaquino.pages.LoginPage;
import br.ce.wcaquino.utils.DataBaseUtils;

public class CY0029_TrocaDeChip_Com_Chave_de_2a_Biometria_Ligada extends Cenarios_TelasPage{
	
	private Cenarios_TelasPage cenariostelas = new Cenarios_TelasPage();
	private static LoginPage page = new LoginPage();
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
		cenariostelas.setCPF("05228265635");
		cenariostelas.setTelefone("11987510089");
		cenariostelas.proximoNovoAtendimento();


		// ######## ATENDIMENTO ########
		cenariostelas.clickTimPre();
		cenariostelas.proximoAtendimento();


		// ######## NO PÓS VENDA ########
		cenariostelas.clickTrocaChip();


		// ######## BUSCA E INSERE TELEFONE ########
		Connection conn = DataBaseUtils.newSiebelUAT1Connection();
        boolean resp =  database.executeInsert("UPDATE CX_NUM_INVENT SET X_VOIP_FLG = null, CNL_CODE = null,"
                + " TAKEN_NUM = 'Available', ORDER_ID = null WHERE 1=1 and DDD = '15' and taken_num = 'Unavailable' and ROWNUM < 5"
                , conn);
        DataBaseUtils.closeConnection(conn);


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
        cenariostelas.clickMotivoTrocaChip();
        cenariostelas.clickMotivoSemGarantia_TrocaChip();
        cenariostelas.proximoInserirCHIP(); 
        
        cenariostelas.proximoDadosClientes();
        cenariostelas.proximoDadosClientes();


		// ######## PÓS VENDA ########
		cenariostelas.clickFinalizar();	


		// ######## RESUMO DA OPERAÇÃO ########
		cenariostelas.checkCiente();
		cenariostelas.clickCriarPedido();
		
		
		// ######## ENCERRA E FECHA JANELA ########
        //cenariostelas.encerra();

	}
}