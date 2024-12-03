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
            cenariostelas.clica_WYSIWYG();
            cenariostelas.clica_TinyMCE();
            cenariostelas.send_TinyMCE("teste");
            cenariostelas.clica_TinyMCELeiaMais();
            page.fecharAbaAtual();

            //#########################
            cenariostelas.clica_WYSIWYG();
            cenariostelas.clica_SummerNote();
            cenariostelas.select_Text();
            cenariostelas.clica_text_Bold_();
            cenariostelas.clica_text_Font();
            cenariostelas.select_text_Font();
            cenariostelas.clica_text_Color();
            cenariostelas.select_text_Color();
            cenariostelas.clica_text_Centralizar();
            cenariostelas.select_text_Centralizar();
            cenariostelas.clica_Fim();
            //#########################
            cenariostelas.clica_WYSIWYG();
            cenariostelas.clica_CodeMirror();
            cenariostelas.clica_Para_Escrever();
            cenariostelas.escrever_Texto_CodeMirror();
        }         
}
