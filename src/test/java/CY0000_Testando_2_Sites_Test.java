import org.junit.Test;

import pages.Cenarios_Automation;
import pages.LoginPage;

public class CY0000_Testando_2_Sites_Test extends Cenarios_Automation {

    private static Cenarios_Automation cenariostelas = new Cenarios_Automation();
    private static LoginPage page = new LoginPage();
         
        // ######## LOGAR NO SISTEMA ########
        
        
        @Test
        public void troca_De_Site() throws InterruptedException {
         // ######## INSERIR CPF ########
            
         
            
         // ##### O DIA
            page.acessarTelaInicial_2();
            
            cenariostelas.clicaMenu_Esporte_dia();
            cenariostelas.clica_Flamengo();
            
            
         // ##### GLOBO
            page.acessarTelaInicial_1();
            cenariostelas.clicaMenu_GE();
            cenariostelas.passe_o_Mouse();
            cenariostelas.clica_Mengo();
            
            
            
            
          }
    }