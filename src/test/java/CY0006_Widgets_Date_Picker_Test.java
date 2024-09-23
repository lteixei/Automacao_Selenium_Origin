import org.junit.BeforeClass;
import org.junit.Test;
import pages.Cenarios_Automation;
import pages.LoginPage;

public class CY0006_Widgets_Date_Picker_Test extends Cenarios_Automation {

    private static Cenarios_Automation cenariostelas = new Cenarios_Automation();
    private static LoginPage page = new LoginPage();
    
    
        // ######## LOGAR NO SISTEMA ########
        @BeforeClass
        public static void inicializa() throws InterruptedException {
           page.acessarTelaInicial();
            cenariostelas.clicaInicialSemLogin();
        }
              
        @Test
        public void Widgets_To_Date_Picker() throws InterruptedException {
            cenariostelas.clicaMenu_Widgets();
            cenariostelas.clicaMenu_Widgets();
            cenariostelas.clica_teste();
            cenariostelas.clica_Calemdario();
            cenariostelas.clica_8();            
            cenariostelas.clica_Campo_Calemdario();
            cenariostelas.send_Date_Nasc("12/10/1976");
            cenariostelas.clica_Closed_Calend();
       }        
}
