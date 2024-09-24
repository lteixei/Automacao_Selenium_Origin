import org.junit.BeforeClass;
import org.junit.Test;

import pages.Cenarios_Automation;
import pages.LoginPage;

public class CY0005_Widgets_AutoComplete_Test extends Cenarios_Automation {

    private static Cenarios_Automation cenariostelas = new Cenarios_Automation();
    private static LoginPage page = new LoginPage();
    
        // ######## LOGAR NO SISTEMA ########
        @BeforeClass
        public static void inicializa() throws InterruptedException {
            page.acessarTelaInicial();
            cenariostelas.clicaInicialSemLogin();
        }
     
        @Test
        public void Widgets_To_AutoComplete() throws InterruptedException {
            cenariostelas.clicaMenu_Widgets();
            cenariostelas.clica_Widgets_AUTO_Complete();
            cenariostelas.clica_Campo();
            cenariostelas.send_Name_Sierra("Sie");
            cenariostelas.clica_escolhido();
       }        
}
