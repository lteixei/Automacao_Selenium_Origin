import org.junit.BeforeClass;
import org.junit.Test;

import pages.Cenarios_Automation;
import pages.LoginPage;

public class CY0020_File_Download_Test extends Cenarios_Automation {

    private static Cenarios_Automation cenariostelas = new Cenarios_Automation();
    private static LoginPage page = new LoginPage();
         
        // ######## LOGAR NO SISTEMA ########
        @BeforeClass
        public static void inicializa() throws InterruptedException {
            // Abrindo o App TIM Vendas
            page.acessarTelaInicial();
        }
        
        @Test
        public void troca_De_Chip_Com_Defeito() throws InterruptedException {
            
            cenariostelas.clicaInicialSemLogin();
            cenariostelas.clica_Menu_More();
            cenariostelas.clicar_Menu_File_Download();
          //#####
            cenariostelas.send_Download_File("Fazendo um teste");
            cenariostelas.clicar_Gerar_File_Download();
            cenariostelas.clicar_Download_File_Gerado();
         //#####
            cenariostelas.send_Download_PDF("Fazendo um teste");
            cenariostelas.clicar_Gerar_PDF();
            cenariostelas.clicar_Download_PDF_Gerado();
           
        }
    }