import org.junit.BeforeClass;
import org.junit.Test;

import pages.Cenarios_Automation;
import pages.LoginPage;

public class CY0007_Widgets_Slider_Test extends Cenarios_Automation {

    private static Cenarios_Automation cenariostelas = new Cenarios_Automation();
    private static LoginPage page = new LoginPage();
        
        // ######## LOGAR NO SISTEMA ########
        @BeforeClass
        public static void inicializa() throws InterruptedException {
            page.acessarTelaInicial();
            cenariostelas.clicaInicialSemLogin();
        }
     
        @Test
        public void Widgets_To_Slider() throws InterruptedException {
            cenariostelas.clicaMenu_Widgets();
            cenariostelas.clicaMenu_Widgets();
            cenariostelas.clica_Widgets_Slider();
            cenariostelas.clica_Slider();
       }        
}
