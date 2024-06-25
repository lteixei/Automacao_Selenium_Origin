package pages;

import core.BasePage;

public class Cenarios_Automation extends BasePage {
		
	
    // ############################################################# //
    // ##################### ENDEREÇO E LOGIN ###################### //
    // ############################################################# //
    
    
    
    public void sendUsuario() throws InterruptedException {
        abrirLinkAba("//*[@id=\"username\"]");
    }
	
	public void sendUsuario(String usuario) throws InterruptedException {
        Thread.sleep(2000);
        escreverSemTroca("//*[@id=\"username\"]", usuario);
    }
	
	public void sendSenha(String senha) throws InterruptedException {
        escreverSemTroca("//*[@id=\"password\"]", senha);
    }

	public void clicaBT_Rebistro() throws InterruptedException {
	    clicarXpath("//*[@id=\"btn2\"]");
		//Thread.sleep(12000);
	}

	public void sendNome(String nome) throws InterruptedException {
	    escreverSemTroca("/html/body/section/div/div/div[2]/form/div[1]/div[1]/input", nome);
        //Thread.sleep(12000);
    }
	
	public void sendSobreNome(String lastname) throws InterruptedException {
        escreverSemTroca("/html/body/section/div/div/div[2]/form/div[1]/div[2]/input", lastname);
        //Thread.sleep(12000);
    }
	
	public void sendEndereco(String endereço) throws InterruptedException {
        escreverSemTroca("/html/body/section/div/div/div[2]/form/div[2]/div/textarea", endereço);
        //Thread.sleep(12000);
    }
	
	public void clicaInicialSemLogin() throws InterruptedException {
        clicarXpath("/html/body/div[2]/div/div/div[2]/span/a/img");
    } 
	
	public void clicaMenu_Switch() throws InterruptedException {
        clicarXpath("/html/body/header/nav/div/div[2]/ul/li[4]/a");
    }    
	
	
	// ########################################################
    // ######## SWITCH TO IFRAME ########
    // ########################################################

	public void clicaUMA_Frame() throws InterruptedException {
	    clicarXpath("//input[@type='text']");
    }
		
	public void sendNome_1Frame(String lastname) throws InterruptedException {
        escrever("//input", lastname);
    }
	
	public void clicaDUAS_Frame() throws InterruptedException {
        clicarXpath("/html/body/section/div[1]/div/div/div/div[1]/div/ul/li[2]/a");
    }
	
	public void sendNome_2Frame(String twolastname) throws InterruptedException {
        escreverComDoisIframes("//input[@type='text']", twolastname);
    }
	
	public void clicaSwitch_Frame() throws InterruptedException {
        clicarXpath("/html/body/header/nav/div/div[2]/ul/li[4]/ul/li[3]/a");
    }
    
    public void clicaSwitch_Frame2() throws InterruptedException {
        clicarXpath("/html/body/section/div[1]/div/div/div/div[1]/div/ul/li[2]/a");
    }
	
	// ########################################################
    // ######## SWITCH TO ALERT ########
    // ########################################################
	
	
	public void clicaSwitch_Alert() throws InterruptedException {
	    clicarXpath("/html/body/header/nav/div/div[2]/ul/li[4]/ul/li[1]/a");
        //Thread.sleep(12000);
    }
	
	public void clica_Alert_With_Textbox() throws InterruptedException {
        clicarXpath("/html/body/div[1]/div/div/div/div[1]/ul/li[3]/a");
        //Thread.sleep(12000);
    }
	
	public void clica_Button_Name_Textbox() throws InterruptedException {
        clicarXpath("/html/body/div[1]/div/div/div/div[2]/div[3]/button");
        //Thread.sleep(12000);
    }
	
	public void sendName(String name) throws InterruptedException {
	    escreverSemTroca("demo1", name);
        //Thread.sleep(12000);
    }
		
	public void clica_Alert_With_OK() throws InterruptedException {
        clicarXpath("/html/body/div[1]/div/div/div/div[1]/ul/li[1]/a");
        //Thread.sleep(12000);
    }
	
	public void send_Popup() throws InterruptedException {
	    escrever_No_Popup();
    }
	
	public void clica_Alert_With_OK_Cancel() throws InterruptedException {
        clicarXpath("/html/body/div[1]/div/div/div/div[1]/ul/li[2]/a");
        //Thread.sleep(12000);
    }
	
	public void clica_buttom_OK_Cancel() throws InterruptedException {
        clicarXpath("/html/body/div[1]/div/div/div/div[2]/div[2]/button");
        //Thread.sleep(12000);
    }
	
	// CLICAR NO BOTÃO OK DO POPUP
	public void clicarBotao_OK_popup() throws InterruptedException {
	    clicarBotao_OK();
    }
	
	// ########################################################
    // ######## SWITCH TO WINDOWS ########
    // ########################################################
	
	public void clicaSwitch_Windows() throws InterruptedException {
        clicarXpath("/html/body/header/nav/div/div[2]/ul/li[4]/ul/li[2]/a");
    }
	
	public void clicaOPEN_NEW_TABBED() throws InterruptedException {
        clicarXpath("/html/body/div[1]/div/div/div/div[1]/ul/li[1]/a");
    }
	public void clicaButton_Tabbed() throws InterruptedException {
        clicarXpath("/html/body/div[1]/div/div/div/div[2]/div[1]/a/button");
    }
	
	public void clicaOPEN_NEW_SEPERATE() throws InterruptedException {
        clicarXpath("/html/body/div[1]/div/div/div/div[1]/ul/li[2]/a");
    }
	public void clicaButton_Seperate() throws InterruptedException {
        clicarXpath("/html/body/div[1]/div/div/div/div[2]/div[2]/button");
    }
	
	public void clicaOPEN_SEPERATE_MULTIPLE() throws InterruptedException {
        clicarXpath("/html/body/div[1]/div/div/div/div[1]/ul/li[3]/a");
    }
	public void clicaButton_Multiple() throws InterruptedException {
        clicarXpath("/html/body/div[1]/div/div/div/div[2]/div[3]/button");
    }
	public void fechar_Janela() throws InterruptedException {
	    fechar_Janela();
    }
	
	
	// ########################################################
    // ######## WIDGETS - ACCORDION ########
    // ########################################################
	
	public void clicaMenu_Widgets() throws InterruptedException {
        clicarXpath("/html/body/header/nav/div/div[2]/ul/li[5]/a");
    } 
	
	public void clica_Widgets_Accordion() throws InterruptedException {
        clicarXpath("/html/body/header/nav/div/div[2]/ul/li[5]/ul/li[1]/a");
    }
	
	public void clica_Grupo_1() throws InterruptedException {
	    clicarXpath("/html/body/div[1]/div/div/div/div/div/div[1]/div/div/div/div[1]/div[1]/h4");
    }
	
	public void clica_Grupo_2() throws InterruptedException {
        clicarXpath("/html/body/div[1]/div/div/div/div/div/div[1]/div/div/div/div[2]/div[1]/h4");
    }
	
	public void clica_Grupo_3() throws InterruptedException {
        clicarXpath("/html/body/div[1]/div/div/div/div/div/div[1]/div/div/div/div[3]/div[1]/h4");
    }
	
	public void clica_Grupo_4() throws InterruptedException {
        clicarXpath("/html/body/div[1]/div/div/div/div/div/div[1]/div/div/div/div[4]/div[1]/h4");
    }
	
	
	// ########################################################
    // ######## WIDGETS - AUTO COMPLETE ########
    // ########################################################
	
	public void clica_Widgets_AUTO_Complete() throws InterruptedException {
        clicarXpath("/html/body/header/nav/div/div[2]/ul/li[5]/ul/li[2]/a");
    }
    
    public void clica_Campo() throws InterruptedException {
        clicarXpath("/html/body/section/div[1]/div[2]/div[1]/div");
    }
    
    public void send_Name_Sierra(String lugar) throws InterruptedException {
        escreverSemTroca("/html/body/section/div[1]/div[2]/div[1]/div/input", lugar);
    }
    
    public void clica_escolhido() throws InterruptedException {
        clicarXpath("/html/body/section/div[1]/div[2]/div[2]/ul/li/a");
    }
    
    
    // ########################################################
    // ######## WIDGETS - DATE PICKER ########
    // ########################################################
    
    
    public void clica_Widgets_Date_Picker() throws InterruptedException {
        clicarXpath("/html/body/header/nav/div/div[2]/ul/li[5]/ul/li[3]/a");
    }
    
    public void clica_Calemdario() throws InterruptedException {
        clicarXpath("/html/body/section/div[1]/div/div/form/div[2]/div[2]/img");
    }
    
    public void clica_8() throws InterruptedException {
        clicarXpath("/html/body/div/table/tbody/tr[2]/td[2]/a");
    }
    
    public void clica_Campo_Calemdario() throws InterruptedException {
        clicarXpath("/html/body/section/div[1]/div/div/form/div[2]/div[3]/input");
    }
    
    public void send_Date_Nasc(String date) throws InterruptedException {
        escreverSemTroca("/html/body/section/div[1]/div/div/form/div[2]/div[3]/input", date);
    }
	
    public void clica_Closed_Calend() throws InterruptedException {
        clicarXpath("/html/body/div[2]/div/div[3]/a[2]");
    }
	
    
    // ########################################################
    // ######## WIDGETS - SLIDER ########
    // ########################################################
    
    public void clica_Widgets_Slider() throws InterruptedException {
        clicarXpath("/html/body/header/nav/div/div[2]/ul/li[5]/ul/li[4]/a");
    }
    
    public void clica_Slider() throws InterruptedException {
        clicarXpath("(//a[contains(@href, '#')])[2]");
    }
    
    
    // ########################################################
    // ######## INTERACTION ########
    // ########################################################
    
    public void clicaMenu_Interactions() throws InterruptedException {
        clicarXpath("/html/body/header/nav/div/div[2]/ul/li[6]/a");
    }
    
    public void clica_Drag_and_Drop() throws InterruptedException {
        clicarXpath("/html/body/header/nav/div/div[2]/ul/li[6]/ul/li[1]/a");
    }
    
    public void clica_Dynamic() throws InterruptedException {
        clicarXpath("//a[contains(.,'Dynamic')]");
    }
    
    public void clica_Dynamic1() throws InterruptedException {
        obter_DRAG("//div[@id='droparea']/img");
    }
    
    public void clica_Dynamic2() throws InterruptedException {
        obter_DRAG("//div[@id='droparea']/img[2]");
    }
    
    public void clica_Dynamic3() throws InterruptedException {
        obter_DRAG("//div[@id='droparea']/img[3]");
    }
    //###############
    
    public void clica_Static() throws InterruptedException {
        clicarXpath("//a[contains(.,'Static')]");
    }
    
    public void clica_Static1() throws InterruptedException {
        obter_DROP("//div[@id='droparea']/img");
    }
    
    public void clica_Static2() throws InterruptedException {
        clicarXpath("//div[@id='droparea']/img[2]");
    }
    
    public void clica_Static3() throws InterruptedException {
        clicarXpath("//div[@id='droparea']/img[3]");
    }
    
    //###############
    public void clica_Selectable() throws InterruptedException {
        clicarXpath("/html/body/header/nav/div/div[2]/ul/li[6]/ul/li[2]/a");
    }
    
    public void clica_Serialize() throws InterruptedException {
        clicarXpath("/html/body/div[1]/div/div/div/div[1]/ul/li[2]/a");
    }
    
    public void clica_SEGUNDO_CTRL() throws InterruptedException {
        clicarXpath("//div[@id='Serialize']/ul/li[2]/b");
    }
    
    public void clica_QUARTO_CTRL() throws InterruptedException {
        clicarXpath("//div[@id='Serialize']/ul/li[4]/b");
    }
    
    public void clica_SEXTO_CTRL() throws InterruptedException {
        clicarXpath("//div[@id='Serialize']/ul/li[6]/b");
    }
    
      
    public void clica_Resizable() throws InterruptedException {
        clicarXpath("/html/body/header/nav/div/div[2]/ul/li[6]/ul/li[3]/a");
    }
    
    public void clica_Move_Resizable() throws InterruptedException {
        clicarXpath("//section/div/div/div/div");
    }
    
    
    // ########################################################
    // ######## WIDGETS - SLIDER ########
    // ########################################################
    
    public void clicaMenu_Video() throws InterruptedException {
        clicarXpath("/html/body/header/nav/div/div[2]/ul/li[7]/a");
    }
    
    public void clica_Youtube() throws InterruptedException {
        clicarXpath("/html/body/header/nav/div/div[2]/ul/li[5]/ul/li[4]/a");
    }
    
    public void clica_Vimeo() throws InterruptedException {
        clicarXpath("(//a[contains(@href, '#')])[2]");
    }
    
    // ########################################################
    // ######## GLOBO ########
    // ########################################################
    
    public void clicaMenu_GE() throws InterruptedException {
        clicarXpath("/html/body/header/div[2]/div[4]/div[1]/ul/li[4]/a");
    }
    
    public void clica_Tocha() throws InterruptedException {
        clicarXpath("/html/body/div[2]/main[3]/div[2]/div/div/div/div/div[2]/div/a/ul/li[4]/div/div/span");
    }
    
    public void passe_o_Mouse() throws InterruptedException {
        clicarXpath("/html/body/div[2]/div[1]/header/div[2]/div/div/span/div[1]/div[1]");
    }
    
    public void clica_Mengo() throws InterruptedException {
        clicarXpath("/html/body/div[2]/div[1]/header/div[2]/div/div/span/div[2]/div[1]/div/div[11]/a/img");
    }
    
    // ########################################################
    // ######## ODIA ########
    // ########################################################
    
    public void clicaMenu_Esporte_dia() throws InterruptedException {
        clicarXpath("/html/body/header/div[3]/div/nav/ul/li[5]/a");
    }
    
    public void clica_Flamengo_dia() throws InterruptedException {
        clicarXpath("/html/body/div[2]/div/div[2]/div/ul/li[5]/ul/li[4]/a");
    }
    
    public void clica_Flamengo() throws InterruptedException {
        clicarXpath("/html/body/header/div[3]/div/nav/ul/li[5]");
    }
    
    public void clica_Fechar() throws InterruptedException {
        Thread.sleep(5000);
        clicarXpath("/html/body/c-wiz/div/div/div[1]/div[3]/div/div");
    }
    
    
        
}