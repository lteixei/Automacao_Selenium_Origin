import org.junit.BeforeClass;
import org.junit.Test;

import pages.Cenarios_Automation;
import pages.LoginPage;

public class CY0001_Register_Test extends Cenarios_Automation {

    private static Cenarios_Automation cenariostelas = new Cenarios_Automation();
    private static LoginPage page = new LoginPage();
         
        // ######## LOGAR NO SISTEMA ########
        @BeforeClass
        public static void inicializa() throws InterruptedException {
            // Abrindo o App TIM Vendas
            page.acessarTelaInicial();
        }
        
        @Test
        public void troca_De_Chip_Com_Defeito() throws InterruptedException {
         // ######## INSERIR CPF ########
            
            cenariostelas.clicaBT_Rebistro();
            cenariostelas.sendNome("Leonardo");
            cenariostelas.sendSobreNome("Teixeira");
            cenariostelas.sendEndereco("Rua Com. Pinto 516");
            
            page.acessarTelaInicial_2();

            // ######## AMBIENTE DE ATENDIMENTO ########
            //cenariostelas.sendNome("Leonardo");
            //cenariostelas.clicaTIM_BLACK_MULTI_Fatura();
          //cenariostelas.sendNome("Leonardo");
            //cenariostelas.clicaTIM_BLACK_MULTI_Fatura();
            
            // ######## INFORME O TIPO DE ACESSO DIGITAL ########
            
            // ########
           
        }
    }