import org.junit.BeforeClass;
import org.junit.Test;

import pages.Cenarios_Automation;
import pages.LoginPage;

public class CY0021_JQuery_ProgressBar_Test extends Cenarios_Automation {

    private static Cenarios_Automation cenariostelas = new Cenarios_Automation();
    private static LoginPage page = new LoginPage();
         
        // ######## LOGAR NO SISTEMA ########
        @BeforeClass
        public static void inicializa() throws InterruptedException {
            page.acessarTelaInicial();
        }
        
        @Test
        public void jquery() throws InterruptedException {
            cenariostelas.clicaInicialSemLogin();
            cenariostelas.clica_Menu_More();
            cenariostelas.clica_JQuery();
            cenariostelas.clica_Iniciar_Barra_Progress();
            cenariostelas.clica_Fechar_Barra_Progress();
        }
}