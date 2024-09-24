import org.junit.BeforeClass;
import org.junit.Test;

import pages.Cenarios_Automation;
import pages.LoginPage;

public class CY0003_Switch_Test extends Cenarios_Automation {

    private static Cenarios_Automation cenariostelas = new Cenarios_Automation();
    private static LoginPage page = new LoginPage();
    
        // ######## LOGAR NO SISTEMA ########
        @BeforeClass
        public static void inicializa() throws InterruptedException {
            page.acessarTelaInicial();
            cenariostelas.clicaInicialSemLogin();
        }
     
        //########## SWITCH TO ALERT ##################
        @Test
        public void Switch_To_Alert() throws InterruptedException {
            cenariostelas.clicaMenu_Switch();
            System.out.print("\n" + "CLICANDO NO MENU Switch To" + "\n");
            cenariostelas.clicaSwitch_Alert();
          //#####
            System.out.print("\n" + "CLICANDO NA OPÇÃO ALERT" + "\n");
            cenariostelas.clica_Alert_With_OK();
            cenariostelas.clica_Display_alert_Box();
            cenariostelas.clicarBotao_OK_popup();
          //#####
            System.out.print("\n" + "CLICANDO - Alert With OK" + "\n");
            cenariostelas.clica_Alert_With_OK_Cancel();
            cenariostelas.clica_buttom_OK_Cancel();
            cenariostelas.clicarBotao_OK_popup();
          //#####
            System.out.print("\n" + "CLICANDO - Alert com Textbox" + "\n");
            cenariostelas.clica_Alert_With_Textbox();
            cenariostelas.clica_Button_Name_Textbox();
        }
}