import org.junit.BeforeClass;
import org.junit.Test;

import pages.Cenarios_Automation;
import pages.LoginPage;

public class CY0022_Loader_Test extends Cenarios_Automation {

    private static Cenarios_Automation cenariostelas = new Cenarios_Automation();
    private static LoginPage page = new LoginPage();
         
        // ######## LOGAR NO SISTEMA ########
        @BeforeClass
        public static void inicializa() throws InterruptedException {
            page.acessarTelaInicial();
            cenariostelas.clicaInicialSemLogin();
        }
        
        @Test
        public void troca_De_Chip_Com_Defeito() throws InterruptedException {
            cenariostelas.clica_Menu_More();
            cenariostelas.clica_LOADER_TEST();
            cenariostelas.clica_Run();
            cenariostelas.clica_Run_Closed();
        }
}