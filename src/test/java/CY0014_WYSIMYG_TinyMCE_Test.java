import org.junit.BeforeClass;
import org.junit.Test;

import pages.Cenarios_Automation;
import pages.LoginPage;

public class CY0014_WYSIMYG_TinyMCE_Test extends Cenarios_Automation {

    private static Cenarios_Automation cenariostelas = new Cenarios_Automation();
    private static LoginPage page = new LoginPage();
    
        // ######## LOGAR NO SISTEMA ########
        @BeforeClass
        public static void inicializa() throws InterruptedException {
            page.acessarTelaInicial();
            cenariostelas.clicaInicialSemLogin();
    }
             
        @Test
        public void WYSIWYG() throws InterruptedException {
            cenariostelas.clica_WYSIWYG();
            cenariostelas.clica_TinyMCE();
            cenariostelas.send_TinyMCE("teste");
            cenariostelas.clica_TinyMCELeiaMais();
            page.fecharAbaAtual();
       }           
}
