import org.junit.BeforeClass;
import org.junit.Test;

import pages.Cenarios_Automation;
import pages.LoginPage;

public class CY0023_Modals_Test extends Cenarios_Automation {

    private static Cenarios_Automation cenariostelas = new Cenarios_Automation();
    private static LoginPage page = new LoginPage();
         
        // ######## LOGAR NO SISTEMA ########
        @BeforeClass
        public static void inicializa() throws InterruptedException {
            page.acessarTelaInicial();
            cenariostelas.clicaInicialSemLogin();
        }
        
        @Test
        public void Modals() throws InterruptedException {
            cenariostelas.clica_Menu_More();
            cenariostelas.clica_MODALS();
            cenariostelas.clica_Bootstrap_MODALS();
            //### aqui eu quero mexer na barra de rolagem ###
            cenariostelas.clica_Fechar_Bootstrap_MODALS();
            
          //###   
            cenariostelas.clica_Multiple_MODALS();
            cenariostelas.clica_launch_MODALS();
            cenariostelas.clica_fechar_launch_MODALS();
            cenariostelas.clica_fechar_Primeiro_launch_MODALS();
         }
}