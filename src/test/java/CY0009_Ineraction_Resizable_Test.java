import org.junit.BeforeClass;
import org.junit.Test;
import pages.Cenarios_Automation;
import pages.LoginPage;

public class CY0009_Ineraction_Resizable_Test extends Cenarios_Automation {

    private static Cenarios_Automation cenariostelas = new Cenarios_Automation();
    private static LoginPage page = new LoginPage();
         
        // ######## LOGAR NO SISTEMA ########
        @BeforeClass
        public static void inicializa() throws InterruptedException {
            page.acessarTelaInicial();
            cenariostelas.clicaInicialSemLogin();
        }
     
        @Test
        public void Interaction_Resizable() throws InterruptedException {
            cenariostelas.clicaMenu_Interactions();
            cenariostelas.clica_Resizable();
            cenariostelas.clica_Move_Resizable();
       }        
}
