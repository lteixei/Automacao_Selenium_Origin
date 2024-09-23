import org.junit.Test;

import pages.Cenarios_Automation;
import pages.LoginPage;

public class CY0003_Switch_Test extends Cenarios_Automation {

    private static Cenarios_Automation cenariostelas = new Cenarios_Automation();
    private static LoginPage page = new LoginPage();
        
        //################## ALERT ##################
        @Test
        public void Alert() throws InterruptedException {
            page.acessarTelaInicial();
            cenariostelas.clicaInicialSemLogin();
            cenariostelas.clicaMenu_Switch();
            System.out.print("\n" + "CLICANDO NO MENU Switch To" + "\n");
            cenariostelas.clicaSwitch_Alert();
            System.out.print("\n" + "CLICANDO NA OPÇÃO ALERT" + "\n");
            System.out.print("\n" + "CLICANDO - Alert With OK" + "\n");
            System.out.print("\n" + "CLICANDO - Alert com Textbox" + "\n");
            cenariostelas.clica_Alert_With_Textbox();
            cenariostelas.clica_Button_Name_Textbox();
            cenariostelas.send_Popup();
            cenariostelas.clicarBotao_OK_popup();     
        }
        
        @Test
        public void Windows() throws InterruptedException {
            page.acessarTelaInicial();
            cenariostelas.clicaInicialSemLogin();
            cenariostelas.clicaMenu_Switch();
            cenariostelas.clicaSwitch_Alert();
            cenariostelas.clica_Alert_With_OK_Cancel();
            cenariostelas.clica_buttom_OK_Cancel();
            cenariostelas.clicarBotao_OK_popup();
        }
        
        @Test
        public void IFrame() throws InterruptedException {
            page.acessarTelaInicial();
            cenariostelas.clicaInicialSemLogin();
            cenariostelas.clicaMenu_Switch();
            cenariostelas.clicaSwitch_Alert();
            cenariostelas.clica_Alert_With_OK_Cancel();
            cenariostelas.clica_buttom_OK_Cancel();
            cenariostelas.clicarBotao_OK_popup();
        }
    }