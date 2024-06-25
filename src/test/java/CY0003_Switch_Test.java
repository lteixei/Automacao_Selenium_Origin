import org.junit.Test;

import pages.Cenarios_Automation;
import pages.LoginPage;

public class CY0003_Switch_Test extends Cenarios_Automation {

    private static Cenarios_Automation cenariostelas = new Cenarios_Automation();
    private static LoginPage page = new LoginPage();
        
        //################## ALERT ##################
        @Test
        public void Video_Youtube() throws InterruptedException {
            page.acessarTelaInicial();
            cenariostelas.clicaInicialSemLogin();
            cenariostelas.clicaMenu_Switch();
            cenariostelas.clicaSwitch_Alert();
            cenariostelas.clica_Alert_With_Textbox();
            cenariostelas.clica_Button_Name_Textbox();
            cenariostelas.send_Popup();
            cenariostelas.clicarBotao_OK_popup();     
        }
        
        @Test
        public void Video_Vimeo() throws InterruptedException {
            page.acessarTelaInicial();
            cenariostelas.clicaInicialSemLogin();
            cenariostelas.clicaMenu_Switch();
            cenariostelas.clicaSwitch_Alert();
            cenariostelas.clica_Alert_With_OK_Cancel();
            cenariostelas.clica_buttom_OK_Cancel();
            cenariostelas.clicarBotao_OK_popup();
        }
    }