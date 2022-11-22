package br.ce.wcaquino.suites;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import br.ce.wcaquino.core.DriverFactory;
import br.ce.wcaquino.pages.LoginPage;
import br.ce.wcaquino.tests.CY0001_Ativacao_De_Acesso_PrePago_Test;
import br.ce.wcaquino.tests.CY0014_Migracao_De_Pre_Para_Controle_Com_TrocaDeChip_Test;
import br.ce.wcaquino.tests.CY0015_Migracao_De_Pre_Para_Pos_Com_TrocaChip_Test;

@RunWith(Suite.class)
@SuiteClasses({
	CY0001_Ativacao_De_Acesso_PrePago_Test.class,
	//CY0014_Migracao_De_Pre_Para_Controle_Com_TrocaDeChip_Test.class,
	//CY0015_Migracao_De_Pre_Para_Pos_Com_TrocaChip_Test.class
})
public class SuiteGeral {
	private static LoginPage page = new LoginPage();
	
	
}
