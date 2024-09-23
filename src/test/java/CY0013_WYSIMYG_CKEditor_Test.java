import org.junit.BeforeClass;
import org.junit.Test;

import pages.Cenarios_Automation;
import pages.LoginPage;

public class CY0013_WYSIMYG_CKEditor_Test extends Cenarios_Automation {

    private static Cenarios_Automation cenariostelas = new Cenarios_Automation();
    private static LoginPage page = new LoginPage();
    
        // ######## LOGAR NO SISTEMA ########
        @BeforeClass
        public static void inicializa() throws InterruptedException {
            page.acessarTelaInicial();
            cenariostelas.clicaInicialSemLogin();
        }
         
        @Test
        public void WYSIWYG_CKEditor() throws InterruptedException {
            cenariostelas.clica_WYSIWYG();
            cenariostelas.clica_CKEditor();
            //###
            cenariostelas.send_Teste_CKEditor();
            cenariostelas.clica_Bold();
            cenariostelas.clica_Italico();
            //INSERIR IMAGEM
        }         
}
