

import org.junit.BeforeClass;
import org.junit.Test;
import br.ce.wcaquino.pages.Cenarios_TelasPage;
import br.ce.wcaquino.pages.LoginPage;

public class CY0019_Migracao_De_Pre_Pago_Para_Plano_Família_Titular_Test {
    
    private Cenarios_TelasPage cenariostelas = new Cenarios_TelasPage();
    private static LoginPage page = new LoginPage();
    
    @BeforeClass
    public static void inicializa() throws InterruptedException{
        //Abrindo Site/App
        page.acessarTelaInicial();
        //Logando com Matricula e Senha
        page.setEmail("T3313299");
        page.setSenha("Tim@12345");
        page.entrar();
    }
    
    @Test
    public void test1_identificarPDV() throws InterruptedException{
        cenariostelas.sendPDV("MagazineLuiza");
        cenariostelas.EscolhaPDVMagazineluiza();
        cenariostelas.confirmaPDV();
        cenariostelas.fechapopupPDV();
        
        // ######## ESCOLHA O PRODUTO ########
        cenariostelas.escolherProduto();
        
        // ######## AMBIENTE DE ATENDIMENTO ########
        cenariostelas.clickAntesAtendimento();
        cenariostelas.clickAtendimento();
        cenariostelas.proximoAmbienteAtend();
        
     // ######## NOVO ATENDIMENTO ########
        cenariostelas.setCPF("26111272128");
        cenariostelas.setTelefone("19993000199");
        cenariostelas.proximoNovoAtendimento();
        
     // ####### ATENDIMENTO ###########
        cenariostelas.clickTimPreTop();
        cenariostelas.proximoAtendimento();
        
     // ######## NO PÓS VENDA ########
        cenariostelas.clickMigracao();
        
     // ######## DADOS DO CLIENTE ########
        cenariostelas.buscarCEP();
        cenariostelas.proximoDadosClientes();
        
     // ######## MIGRACAO TT ########
        cenariostelas.clickTimBlackMultiFatura();
        
     // ######## MIGRACAO TT ########
        cenariostelas.escolhaTitular();
        
        
        cenariostelas.clickBotaoFidelAparelho();
    
        cenariostelas.clickTimBlackMultiB3();
        cenariostelas.clickSemFidelizacao();
        cenariostelas.clickBotaoFidelAparelho();
        cenariostelas.clickBotaoFidelAparelho();
        
        cenariostelas.clickDataVencimento();
        cenariostelas.clickBotaoInfFatura();
        
        //cenariostelas.clickBotaoFinalizarAtendimento();
        
        
     // ######## ENCERRA E FECHA JANELA ########
        cenariostelas.encerra();
        
        
        }
}