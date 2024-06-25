import org.junit.Test;

import pages.Cenarios_Automation;
import pages.LoginPage;

import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class CY0005_Ineraction_Test extends Cenarios_Automation {

    private static Cenarios_Automation cenariostelas = new Cenarios_Automation();
    private static LoginPage page = new LoginPage();
         
        @Test
        public void DragAndDrop_Static() throws InterruptedException {
            page.acessarTelaInicial();
            cenariostelas.clicaInicialSemLogin();
            cenariostelas.clicaMenu_Interactions();
            cenariostelas.clica_Drag_and_Drop();
            cenariostelas.clica_Static();
            cenariostelas.clica_Static1();
            cenariostelas.clica_Static2();
            cenariostelas.clica_Static3();
            
        }
            
        @Test
        public void DragAndDrop_Dynamic() throws InterruptedException {
            page.acessarTelaInicial();
            cenariostelas.clicaInicialSemLogin();
            cenariostelas.clicaMenu_Interactions();
            cenariostelas.clica_Drag_and_Drop();
            cenariostelas.clica_Dynamic();
            cenariostelas.clica_Dynamic1();
            cenariostelas.clica_Dynamic2();
            cenariostelas.clica_Dynamic3();
            
        }
        
        @Test
        public void SelecTable() throws InterruptedException {
            page.acessarTelaInicial();
            cenariostelas.clicaInicialSemLogin();
            cenariostelas.clicaMenu_Interactions();
            cenariostelas.clica_Selectable();
            cenariostelas.clica_Serialize();
            cenariostelas.clica_SEGUNDO_CTRL();
            cenariostelas.clica_QUARTO_CTRL();
            cenariostelas.clica_SEXTO_CTRL();
            
        }
        
        @Test
        public void Resizable() throws InterruptedException {
            page.acessarTelaInicial();
            cenariostelas.clicaInicialSemLogin();
            cenariostelas.clicaMenu_Interactions();
            cenariostelas.clica_Resizable();
            cenariostelas.clica_Move_Resizable();
            
            
                        
        }        
}
