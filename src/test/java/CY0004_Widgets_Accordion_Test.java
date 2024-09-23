import org.junit.BeforeClass;
import org.junit.Test;

import pages.Cenarios_Automation;
import pages.LoginPage;

public class CY0004_Widgets_Accordion_Test extends Cenarios_Automation {

    private static Cenarios_Automation cenariostelas = new Cenarios_Automation();
    private static LoginPage page = new LoginPage();
    
    
        // ######## LOGAR NO SISTEMA ########
        @BeforeClass
        public static void inicializa() throws InterruptedException {
            page.acessarTelaInicial();
            cenariostelas.clicaInicialSemLogin();
        }
     
        @Test
        public void Widgets_To_Accordion() throws InterruptedException {
            cenariostelas.clicaMenu_Widgets();
            cenariostelas.clica_Widgets_Accordion();
          //###  
            cenariostelas.clica_Grupo_1();
            cenariostelas.clica_Grupo_2();
            cenariostelas.clica_Grupo_2();
            cenariostelas.clica_Grupo_3();
            cenariostelas.clica_Grupo_3();
            cenariostelas.clica_Grupo_4();
            cenariostelas.clica_Grupo_4();
        }
}
