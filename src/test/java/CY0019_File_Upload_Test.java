import org.junit.BeforeClass;
import org.junit.Test;

import pages.Cenarios_Automation;
import pages.LoginPage;

public class CY0019_File_Upload_Test extends Cenarios_Automation {

    private static Cenarios_Automation cenariostelas = new Cenarios_Automation();
    private static LoginPage page = new LoginPage();
         
        // ######## LOGAR NO SISTEMA ########
        @BeforeClass
        public static void inicializa() throws InterruptedException {
            // Abrindo o App TIM Vendas
            page.acessarTelaInicial();
        }
        
        @Test
        public void fazer_UpLoad() throws InterruptedException {
            cenariostelas.clicaInicialSemLogin();
            cenariostelas.clica_Menu_More();
            cenariostelas.clica_UpLoad();
            cenariostelas.clicaFileUpload();
            cenariostelas.remover_UpLoad();
          }
    }