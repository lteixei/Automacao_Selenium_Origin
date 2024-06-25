import org.junit.Test;

import pages.Cenarios_Automation;
import pages.LoginPage;

public class CY0004_Widgets_Test extends Cenarios_Automation {

    private static Cenarios_Automation cenariostelas = new Cenarios_Automation();
    private static LoginPage page = new LoginPage();
         
        @Test
        public void Widgets_To_Accordion() throws InterruptedException {
            page.acessarTelaInicial();
            cenariostelas.clicaInicialSemLogin();
            cenariostelas.clicaMenu_Widgets();
            cenariostelas.clica_Widgets_Accordion();
            cenariostelas.clica_Grupo_2(); 
            cenariostelas.clica_Grupo_3();
            cenariostelas.clica_Grupo_4(); 
            cenariostelas.clica_Grupo_4();
            cenariostelas.clica_Grupo_3(); 
            cenariostelas.clica_Grupo_2(); 
            cenariostelas.clica_Grupo_1();
        }
            
        @Test
        public void Widgets_To_AutoComplete() throws InterruptedException {
            page.acessarTelaInicial();
            cenariostelas.clicaInicialSemLogin();
            cenariostelas.clicaMenu_Widgets();
            cenariostelas.clica_Widgets_AUTO_Complete();
            cenariostelas.clica_Campo();
            cenariostelas.send_Name_Sierra("Sierra Leone");
            cenariostelas.clica_escolhido();
        }
        
        @Test
        public void Widgets_To_DatePicker() throws InterruptedException {
            page.acessarTelaInicial();
            cenariostelas.clicaInicialSemLogin();
            cenariostelas.clicaMenu_Widgets();
            cenariostelas.clica_Widgets_Date_Picker();
            cenariostelas.clica_Calemdario();
            cenariostelas.clica_8();            
            cenariostelas.clica_Campo_Calemdario();
            cenariostelas.send_Date_Nasc("12/10/1976");
            cenariostelas.clica_Closed_Calend();
            
        }
        
        @Test
        public void Widgets_To_Slider() throws InterruptedException {
            page.acessarTelaInicial();
            cenariostelas.clicaInicialSemLogin();
            cenariostelas.clicaMenu_Widgets();
            cenariostelas.clica_Widgets_Slider();
            cenariostelas.clica_Slider();
                        
        }        
}
