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
            System.out.print("\n" + "ACESSANDO A TELA DE CADASTRO" + "\n");
            cenariostelas.clicaBT_Rebistro();
            cenariostelas.sendNome("Leonardo");
            cenariostelas.sendSobreNome("Teixeira");
            cenariostelas.sendEndereco("Rua Com. Pinto 516");
            cenariostelas.send_EMAIL("lteixei@hotmail.com");
            cenariostelas.send_TELEFONE("21964171960");
            cenariostelas.clica_MASCULINO();
            cenariostelas.clica_HOBBIES();
            //cenariostelas.clica_OPCOES_LINGUAGENS();
            //cenariostelas.clica_LINGUAGENS();
            cenariostelas.clica_OPCOES_SKILL();
            cenariostelas.clica_SKILL();
            cenariostelas.clica_OPCOES_DATE();
            cenariostelas.clica_DATE();
            cenariostelas.clica_OPCOES_MES();
            cenariostelas.clica_MES();
            cenariostelas.clica_OPCOES_ANO();
            cenariostelas.clica_ANO();
            cenariostelas.send_PASSWORD("Le@lmt0406");
            cenariostelas.send_CONFIRM_PASSWORD("Le@lmt0406");
            cenariostelas.clica_SUBMIT();
                
            
                        
            // ######## INFORME O TIPO DE ACESSO DIGITAL ########
            
            // ########
           
        }
    }