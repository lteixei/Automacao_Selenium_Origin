import org.junit.BeforeClass;
import org.junit.Test;

import pages.Cenarios_Automation;
import pages.LoginPage;

public class CY0010_Ineraction_Selectable_Test extends Cenarios_Automation {

    private static Cenarios_Automation cenariostelas = new Cenarios_Automation();
    private static LoginPage page = new LoginPage();
    
        // ######## LOGAR NO SISTEMA ########
        @BeforeClass
        public static void inicializa() throws InterruptedException {
            page.acessarTelaInicial();
            cenariostelas.clicaInicialSemLogin();
        }
         
        @Test
        public void SelecTable() throws InterruptedException {
            //########## Default ############
            cenariostelas.clicaMenu_Interactions();
            cenariostelas.clica_Selectable();
            cenariostelas.clica_Selectable_Alternado();
            //########## Serialize ############
            cenariostelas.clica_Serialize();
            cenariostelas.clica_SEGUNDO_CTRL();
            cenariostelas.clica_QUARTO_CTRL();
            cenariostelas.clica_SEXTO_CTRL();
        }     
}
