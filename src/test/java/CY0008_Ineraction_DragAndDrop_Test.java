import org.junit.BeforeClass;
import org.junit.Test;
import pages.Cenarios_Automation;
import pages.LoginPage;

public class CY0008_Ineraction_DragAndDrop_Test extends Cenarios_Automation {

    private static Cenarios_Automation cenariostelas = new Cenarios_Automation();
    private static LoginPage page = new LoginPage();
    
        // ######## LOGAR NO SISTEMA ########
        @BeforeClass
        public static void inicializa() throws InterruptedException {
            page.acessarTelaInicial();
            cenariostelas.clicaInicialSemLogin();
        }
     
        @Test
        public void Interaction() throws InterruptedException {
            cenariostelas.clicaMenu_Interactions();
            cenariostelas.clica_Drag_and_Drop();
            cenariostelas.clica_Static();
            cenariostelas.clica_Static1();
            cenariostelas.clica_Static2();
            cenariostelas.clica_Static3();
            //###
            cenariostelas.clicaMenu_Interactions();
            cenariostelas.clica_Drag_and_Drop();
            cenariostelas.clica_Dynamic();
            cenariostelas.clica_Dynamic1();
            cenariostelas.clica_Dynamic2();
            cenariostelas.clica_Dynamic3();
            }        
}
