import org.junit.BeforeClass;
import org.junit.Test;

import pages.Cenarios_Automation;
import pages.LoginPage;

public class CY0018_Dynamic_Data_Test extends Cenarios_Automation {

    private static Cenarios_Automation cenariostelas = new Cenarios_Automation();
    private static LoginPage page = new LoginPage();
         
        // ######## LOGAR NO SISTEMA ########
        @BeforeClass
        public static void inicializa() throws InterruptedException {
            page.acessarTelaInicial();
            cenariostelas.clicaInicialSemLogin();
        }    
         
        @Test
        public void Dynamic_Data() throws InterruptedException {
            cenariostelas.MORE();
            cenariostelas.DYNAMIC();
            cenariostelas.CLICAR_BUTTOM();
            cenariostelas.CLICAR_BUTTOM();
            cenariostelas.CLICAR_BUTTOM();
        }
    }