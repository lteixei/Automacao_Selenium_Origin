import org.junit.BeforeClass;
import org.junit.Test;

import pages.Cenarios_Automation;
import pages.LoginPage;

public class CY0024_ProgressBar_Test extends Cenarios_Automation {

    private static Cenarios_Automation cenariostelas = new Cenarios_Automation();
    private static LoginPage page = new LoginPage();
         
        // ######## LOGAR NO SISTEMA ########
        @BeforeClass
        public static void inicializa() throws InterruptedException {
            page.acessarTelaInicial();
            cenariostelas.clicaInicialSemLogin();
        }
        
        @Test
        public void PROGRESS_BAR() throws InterruptedException {
            cenariostelas.clica_Menu_More();
            cenariostelas.clica_PROGRESS_BAR();
            cenariostelas.clica_Start_PROGRESS_BAR();
        }
}