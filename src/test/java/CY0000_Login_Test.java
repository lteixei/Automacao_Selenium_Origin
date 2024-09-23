import org.junit.Test;

import pages.Cenarios_TelasPage2;
import pages.LoginPage;

public class CY0000_Login_Test {

    private Cenarios_TelasPage2 cenariostelas = new Cenarios_TelasPage2();
    private LoginPage page = new LoginPage();

    @Test
    public void CY0000_Login_Test() throws InterruptedException {

        // ######## LOGAR NO SISTEMA ########
        page.acessarTela_Globo();

        // ######## ENCERRA E FECHA JANELA ########
        System.out.println("FIM");
        cenariostelas.encerra();

    }
}
