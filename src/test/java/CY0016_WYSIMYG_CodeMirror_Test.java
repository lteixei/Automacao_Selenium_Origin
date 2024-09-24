import org.junit.BeforeClass;
import org.junit.Test;

import pages.Cenarios_Automation;
import pages.LoginPage;

public class CY0016_WYSIMYG_CodeMirror_Test extends Cenarios_Automation {

    private static Cenarios_Automation cenariostelas = new Cenarios_Automation();
    private static LoginPage page = new LoginPage();
         
        // ######## LOGAR NO SISTEMA ########
        @BeforeClass
        public static void inicializa() throws InterruptedException {
           page.acessarTelaInicial();
           cenariostelas.clicaInicialSemLogin();
        }
       
        @Test
        public void WYSIWYG_CodeMirror() throws InterruptedException {
            cenariostelas.clica_WYSIWYG();
            cenariostelas.clica_CodeMirror();
            cenariostelas.clica_Para_Escrever();
            cenariostelas.escrever_Texto_CodeMirror();
        }
}
