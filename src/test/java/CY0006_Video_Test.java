import org.junit.Test;

import pages.Cenarios_Automation;
import pages.LoginPage;

public class CY0006_Video_Test extends Cenarios_Automation {

    private static Cenarios_Automation cenariostelas = new Cenarios_Automation();
    private static LoginPage page = new LoginPage();
         
        @Test
        public void Video_Youtube() throws InterruptedException {
            page.acessarTelaInicial();
            cenariostelas.clicaInicialSemLogin();
            cenariostelas.clicaMenu_Interactions();
            cenariostelas.clica_Drag_and_Drop();
            cenariostelas.clica_Static();
            cenariostelas.clica_Static1();
            cenariostelas.clica_Static2();
            cenariostelas.clica_Static3();
            
        }
            
        @Test
        public void Video_Vimeo() throws InterruptedException {
            page.acessarTelaInicial();
            cenariostelas.clicaInicialSemLogin();
            cenariostelas.clicaMenu_Interactions();
            cenariostelas.clica_Drag_and_Drop();
            cenariostelas.clica_Dynamic();
            cenariostelas.clica_Dynamic1();
            cenariostelas.clica_Dynamic2();
            cenariostelas.clica_Dynamic3();
            
        }
           
}
