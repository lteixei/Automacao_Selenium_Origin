package br.ce.wcaquino.tests;

import org.junit.BeforeClass;
import org.junit.Test;
import br.ce.wcaquino.pages.Cenarios_TelasPage;
import br.ce.wcaquino.pages.LoginPage;

public class CY0020_Migracao_De_Pre_Pago_Para_Plano_Família_Titular_Com_Troca_De_Chip_Test {
    
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
    public void CY0020_Migracao_De_Pre_Pago_Para_Plano_Família_Titular_Com_Troca_De_Chip_Test() throws InterruptedException{
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
                
     // ####### NOVO ATENDIMENTO ###########
        cenariostelas.setCPF("01484040651");
        cenariostelas.setTelefone("14981118633");
        cenariostelas.proximoNovoAtendimento();
        
        // ####### ATENDIMENTO ###########
        cenariostelas.clickTimPreTop();
        cenariostelas.proximoAtendimento();
                    
        cenariostelas.clickMigracao();
        cenariostelas.setCEP("12233002");
        cenariostelas.buscarCEP();
        cenariostelas.proximoDadosClientes();
        
        cenariostelas.clickTimBlackMultiFatura();
        
        cenariostelas.escolhaTitular();
        cenariostelas.clickBotaoFidelAparelho();
        
        cenariostelas.clickMultiD3_0();
        cenariostelas.clickSemFidelizacao();
        cenariostelas.clickBotaoFidelAparelho();
        cenariostelas.clickBotaoFidelAparelho();
        
        cenariostelas.clickDataVencimento();
        cenariostelas.clickBotaoInfFatura();
        
     // ######## ENCERRA E FECHA JANELA ########
        //cenariostelas.encerra();
        
        }
    }