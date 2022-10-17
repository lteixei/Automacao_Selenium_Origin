package br.ce.wcaquino.tests;

import java.sql.Connection;
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

public class CY0006_AtivacaoControleFatura_Test extends Cenarios_TelasPage{
	
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
	public void test1_CY0006_AtivacaoControleFatura() throws InterruptedException{
		cenariostelas.sendPDV("VAREJO_LASA_L229"); 
		cenariostelas.EscolhaPDVDutra();
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
		//cenariostelas.checkNotEmail("teste@teste.com");
		cenariostelas.setDataNasc("12102000");
		cenariostelas.setNomeMae("maeteste");			
		cenariostelas.setCEP("03178030");
		cenariostelas.buscarCEP();
		cenariostelas.proximoDadosClientes();
		cenariostelas.poupupClientes();
	
	
	// ######## ENDEREÇO DO CLIENTE ########
		//endcliPage.clickFecharPopup();
		//cenariostelas.clickAntesLogradouro();
		//cenariostelas.clickTipoLogradouro();
		//cenariostelas.setNomeDaRua("Itagiba");
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
		//cenariostelas.clickPrepago();			
		cenariostelas.clickControleExpress();
		//cenariostelas.clickControleFatura();
		//cenariostelas.clickControleFlex();			
		//cenariostelas.clickPosPagoFtura();
		//cenariostelas.clickPosPagoExpress();
		//cenariostelas.clickTimBlackMultiFatura();
		//cenariostelas.clickTimBlackMultiExpress();
					
				
	// ######## PLANOS ########
		cenariostelas.clickPlano();
		//cenariostelas.clickOpacao2();
		//cenariostelas.clickPopup();
		cenariostelas.clickBotaoPlano();
					
					
	// ######## SERVIÇOS ########
		cenariostelas.clickBotaoProsseguir();
					
					
		// ######## INSERIR CHIP ########
				String simcard ="";
				String res="";
				String JobName = "Obter_massa";
				JenkinsHelper jk = new JenkinsHelper();
		        jk.init();
		        int lastId=-1;
		        int nextId=-1;
		        Map<String,String> parametros = JenkinsHelper.getParametros();
		        JobWithDetails job2 = jk.getJobByJobName(JobName);

		        lastId = job2.getLastBuild().getNumber();
		        nextId = job2.getNextBuildNumber();
		        System.out.println("salidalast:" + lastId );
		        System.out.println("salidanext:" + nextId );
		        
		        try {
		            QueueReference queue = job2.build(parametros, true);
		            QueueItem queueItem = null;
		            int waitFor = 0;
		            while (job2.details().isInQueue()) {
		                waitFor++;
		                Thread.sleep(5000);
		                if (waitFor > 12) {
		                    break;
		                }
		            }
		            System.out.println("FIMQUEUE1:" + waitFor);
		            waitFor = 0;
		            do {
		                waitFor++;
		                Thread.sleep(5000);
		                if (waitFor > 12) {
		                    break;
		                }
		                queueItem = jk.getJenkins().getQueueItem(queue);
		            } while (queueItem.getExecutable() == null);
		            System.out.println("FIMQUEUE2:" + waitFor);
		            Build build = jk.getJenkins().getBuild(queueItem);
		            waitFor = 0;
		            while(build.details().isBuilding()){
		                waitFor++;
		                Thread.sleep(5000);
		                if (waitFor > 20) {
		                    break;
		                }
		            }
		            System.out.println("FIMQUEUE3:" + waitFor);

		            String x1 = build.details().getConsoleOutputText();
		            int p1 = x1.indexOf("---CHIP");
		            if (p1 > 0) {
		                System.out.println("Respuesta:" + x1.substring(p1+11,p1+31));
		                simcard = x1.substring(p1+11,p1+31);
		            }
		            
		        } catch (Exception e){
		            e.printStackTrace();
		        }
		        
		        conn = DataBaseUtils.newSiebelUAT1Connection();
				boolean resp =  database.executeInsert("UPDATE CX_NUM_INVENT SET X_VOIP_FLG = null, CNL_CODE = null,"
						+ " TAKEN_NUM = 'Available', ORDER_ID = null WHERE 1=1 and DDD = '15' and taken_num = 'Unavailable' and ROWNUM < 5"
						, conn);
				DataBaseUtils.closeConnection(conn);
		//cenariostelas.setCHIP("89550310000003758235");		
		cenariostelas.setCHIP(simcard);			
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