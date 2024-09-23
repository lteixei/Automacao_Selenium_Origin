import org.junit.BeforeClass;
import org.junit.Test;

import pages.Cenarios_Automation;
import pages.LoginPage;

public class CY0012_Video_Youtube_Test extends Cenarios_Automation {

    private static Cenarios_Automation cenariostelas = new Cenarios_Automation();
    private static LoginPage page = new LoginPage();
         
        // ######## LOGAR NO SISTEMA ########
        @BeforeClass
        public static void inicializa() throws InterruptedException {
        page.acessarTelaInicial();
        cenariostelas.clicaInicialSemLogin();
        }    
    
        @Test
        public void Video_youtube() throws InterruptedException {
            cenariostelas.clicaMenu_Video();
            cenariostelas.clica_Youtube();
        }
           
}
