package br.ce.wcaquino.pages;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import br.ce.wcaquino.core.BasePage;
import br.ce.wcaquino.core.DriverFactory;


public class Cenarios_TelasPage extends BasePage {
	
    
    
    // ######## INICIALIZAÇÃO - ENDEREÇO E LOGIN ########
    
    public void acessarTelaInicial(){
        DriverFactory.getDriver().get("https://apptimvendasdev.internal.timbrasil.com.br/28_0_22_UAT1/#/login");
    }
    
    public void setEmail(String matricula) throws InterruptedException {
        escrever("//label[@id='login-input1']/input[1]", matricula);
    }
    
    public void setSenha(String senha) throws InterruptedException {
        escrever("//input[@name='password']", senha);
    }
    
    public void entrar(){
        clicarBotao("btn-login");
    }
    
    public void logar(String email, String senha) throws InterruptedException {
        setEmail(email);
        setSenha(senha);
        entrar();
    }
    
    //########################################################
    
    
        // ######## IDENTIFICAÇÃO DE PDV ########
    public void sendPDV(String pdv) throws InterruptedException {
        Thread.sleep(8000);
        escreverSemTroca("//ion-searchbar[@id='searchbar-pdv']/div/input", pdv);
    }
    
    public void EscolhaPDVDutra() throws InterruptedException{
        clicarXpath("//ion-label[contains(.,'E A DUTRA')]");
    }
    
    public void EscolhaPDVVarejo() throws InterruptedException{
        clicarXpath("//ion-label[contains(.,'VAREJO_LASA_L229')]");
    }
    
    public void EscolhaPDVTimRevendas() throws InterruptedException{
        clicarXpath("//ion-label[contains(.,'TIM REVENDAS')]");
    }
    
    public void EscolhaPDVMagazineluiza() throws InterruptedException{
        clicarXpath("//ion-label[contains(.,'MAGAZINELUIZA_SP_GUA')]");
    }
    
    public void EscolhaPDVMorumbi() throws InterruptedException{
        clicarXpath("ion-label[contains(.,'LP LOJA MORUMBI SHOP')]");
    }
    
    public void confirmaPDV() throws InterruptedException{
        clicarXpath("//button[@id='button-back']/span");
    }
    
    public void fechapopupPDV() throws InterruptedException{
        Thread.sleep(2000);
        clicarXpath("//*[contains(@class,'alert-button-group')]");
    }
    
    //########################################################
    
    
        // ######## AMBIENTE DE ATENDIMENTO ########
    public void clickAntesAtendimento() throws InterruptedException {
        clicarXpath("//ion-select/button/span");
    }
    
    public void clickAtendimento() throws InterruptedException {
        clicarXpath("//span[contains(.,'MESA 03')]");
    }
    
    public void proximoAmbienteAtend() throws InterruptedException{
        clicarXpath("//div[2]/button/span");
    }
    
    //########################################################
    
 // ######## ATENDIMENTO ########
    public void clickOpcao() throws InterruptedException {
        Thread.sleep(10000);
        clicarXpath("//ion-radio/button/span");
    }
    
    public void clickCampoDDD() throws InterruptedException {
        clicarXpath("//ion-select/button/span");
    }
    
    public void clickDDD() throws InterruptedException {
        clicarXpath("//span[contains(.,'15')]");
    }
    
    public void clickTimFlex() throws InterruptedException {
    	Thread.sleep(20000);
    	clicarXpath("//ion-item[contains(.,'TIM')]");
    }
    
    public void proximoAtendimento() throws InterruptedException {
        clicarXpath("//button[@id='button-next']/span");
    }    
    
    public void consultaProtocolo() throws InterruptedException {
    	Thread.sleep(10000);
    	clicarXpath("//ion-label[contains(.,'Consultar')]");
    }
    
    public void btnProximo() throws InterruptedException {
    	clicarXpath("//span[contains(., 'Próximo')]");
    }


    //########################################################
    
    
    // ########## Novo Protocolo ##########################
    
    
    
    public void clickMotivo1() throws InterruptedException {
    	clicarXpath("//button[@class='item-cover item-cover-md item-cover-default item-cover-default-md']");
    }
    
    public void clickNaoInformadoMotivo1() throws InterruptedException {
  
		/*WebElement comboboxElement = ("//button[@class='item-cover item-cover-md item-cover-default item-cover-default-md']");
    	Select combobox = new Select(comboboxElement);
    	combobox.selectByVisibleText("ASIA TELECOM TELEFONIA E COMUNICACAO LTDA ME");*/
    }
   
    //########################################################
    
        // ######## DADOS COMPLEMENTAARES ########
    
    public void migracaoClick() throws InterruptedException {
    	Thread.sleep(10000);
    	clicarXpath("//span[contains(., 'Migração')]");
    }
    
    
    public void clickSexoFeminino() throws InterruptedException { //FEMININO
        clicarXpath("//ion-col[2]/ion-item/div/ion-radio/button/span");
    }
    
    //public void clickSexoMasculino() throws InterruptedException { //MASCULINO
        //clicarXpath("//button[@class='item-cover item-cover-md item-cover-default item-cover-default-md']/span");
    //}



   public void ckickAntesEscolherDoc() throws InterruptedException {
        clicarXpath("//ion-select/button/span");
    }
    
    public void ckicEscolherDocID() throws InterruptedException {
        clicarXpath("//div/div/button[2]/span");
    }
    
    public void setNumeroIdentidade(String numId) throws InterruptedException {
        escreverSemTroca("//input[@type='tel']", numId);
    }



   public void setDataEmissão(String dtemissao) throws InterruptedException {
        escreverSemTroca("//ion-input[@id='date']/input", dtemissao);
    }



   public void setOrgaoEmissor(String orgemissor) throws InterruptedException {
        escreverSemTroca("(//input[@type='text'])[2]", orgemissor);
    }



   public void clickAntesUF() throws InterruptedException {
        clicarXpath("//ion-item[5]/div/div/ion-select/button/span");
    }
    
    public void clickUF() throws InterruptedException {
        clicarXpath("//button[26]/span");
    }
    
    public void setTelContato(String telcont) throws InterruptedException {
        Thread.sleep(2000);
        escreverSemTroca("(//input[@type='tel'])[3]", telcont);
    }



   public void proximoDadosComplementares() throws InterruptedException {
        clicarXpath("//div[2]/button[2]");
    }
    
    
    //########################################################
    
        // ######## DADOS DO CLIENTE ########
   
 
    
    public void setNome(String nome) throws InterruptedException {
        Thread.sleep(20000);
        escreverSemTroca("//input[@type='text']", nome);
    }



   public void setEmailCliente(String email) throws InterruptedException {
        escreverSemTroca("//input[@type='email']", email);
    }
    
    public void confirmaEmail(String confemail) throws InterruptedException {
        escreverSemTroca("(//input[@type='email'])[2]", confemail);
    }
            
    public void validaEmail() throws InterruptedException {
        clicarXpath("//span[contains(.,'Validar')]");
    }        
    
    //public void checkNotEmail(String notemail) throws InterruptedException {
        //escrever("//span[contains(.,'Validar')]", notemail);
    //}



   public void setDataNasc(String dtnascimento) throws InterruptedException {
        escreverSemTroca("//ion-input[@id='client-birthdate']/input", dtnascimento);
    }



   public void setNomeMae(String nomemae) throws InterruptedException {
        escreverSemTroca("(//input[@type='text'])[2]", nomemae);
    }



   public void setCEP(String cep) throws InterruptedException {
        escreverSemTroca("(//input[@type='tel'])[2]", cep);
    }



   public void buscarCEP() throws InterruptedException {
        clicarXpath("//button[@id='postcode-search']/span");
    }



   public void proximoDadosClientes() throws InterruptedException {
        clicarXpath("//div[2]/button[2]");
    }
    
    public void poupupClientes() throws InterruptedException {
        Thread.sleep(2000);
        clicarXpath("//div[3]/button/span");
    }
        
    //########################################################



   
        // ######## ESCOLHA OFERTA ########
    
    public void clickOferta1() throws InterruptedException {
        
        clicarXpath("//p[contains(.,'TIM PRÉ TOP ONE 4.0* (WhatsApp + Deezer Go + Prime Video + Voz ilimitada + internet p/ usar como quiser)')]");        
    }



   public void clickOferta2() throws InterruptedException {
        Thread.sleep(5000);
        clicarXpath("//p[contains(.,'TIM PRÉ TOP MAIS 3.0 (WhatsApp + Deezer Go + Prime Video + Voz ilimitada + internet p/ usar como quiser)')]");        
    }

   public void clickOferta6() throws InterruptedException {
       
       clicarXpath("//p[contains(.,'Pré para TIM Black Multi Fatura)')]");        
   }

   public void fechaPopup() throws InterruptedException {
        clicarXpath("//div[3]/button/span");        
    }
    
    public void proximoOferta() throws InterruptedException {
        clicarXpath("//span[contains(.,'Próximo')]");        
    }
    
    //########################################################
    
// ######## ENDEREÇO DO CLIENTE ########
    
    //public void clickFecharPopup() throws InterruptedException {
        //Thread.sleep(5000);
        //clicarXpath("//*[contains(@class,'alert-button-group')]");
        //}
        
    public void clickAntesLogradouro() throws InterruptedException {
        Thread.sleep(2000);
        clicarXpath("//ion-item[5]/div/div/ion-select/button/span");
    }
        
    public void clickTipoLogradouro() throws InterruptedException {
        clicarXpath("//span[contains(.,'RUA')]");
    }
        
    public void setNomeDaRua(String rua) throws InterruptedException {
        escreverSemTroca("(//input[@type='text'])[3]", rua);
    }    
        
    public void setNumero(String numero) throws InterruptedException {
        escreverSemTroca("(//input[@type='tel'])[2]", numero);
    }



   public void proximoEnderecoClientes() throws InterruptedException {
        clicarXpath("//div[2]/button[2]/span");
    }
    
    //########################################################
    
        // ######## ESCOLHA NUMERO ########
        
    public void clickNumero() throws InterruptedException {
        Thread.sleep(5000);
        clicarXpath("//ion-list/ion-item/div/ion-radio/button/span");
    }
        
    public void proximoEscolhaNum() throws InterruptedException {
        clicarXpath("//div[2]/button[2]/span");
        Thread.sleep(5000);
    }
    
    //########################################################
    
        // ######## ESCOLHA PRODUTO ########
        
    public void escolherProduto() throws InterruptedException{
        clicarXpath("(//button[@id='button-back']/span)[2]");
    }
    
    //########################################################
    
        // ######## ESCOLHA SEGMENTO ########
        
    public void clickPrepago() throws InterruptedException {
        clicarXpath("//span[contains(.,'Pré-Pago')]");
        Thread.sleep(5000);
    }



   public void clickControleExpress() throws InterruptedException {
        clicarXpath("//span[contains(.,'Controle Express')]");    
    }



   public void clickControleFatura() throws InterruptedException {
        clicarXpath("//span[contains(.,'Controle Fatura')]");
    }



   public void clickControleFlex() throws InterruptedException {
        clicarXpath("//span[contains(.,'Controle Flex')]");    
    }



   public void clickPosPagoFatura() throws InterruptedException {
        clicarXpath("//span[contains(.,'Pós-Pago Fatura')]");    
    }



   public void clickPosPagoExpress() throws InterruptedException {
        clicarXpath("//span[contains(.,'Pós-Pago Express')]");    
    }



   public void clickTimBlackMultiFatura() throws InterruptedException {
        clicarXpath("//span[contains(.,'TIM Black Multi Fatura')]");
    }



   public void clickTimBlackMultiExpress() throws InterruptedException {
        clicarXpath("//span[contains(.,'TIM Black Multi Express')]");    
    }
    
    //########################################################
   
// ######## ESCOLHER TITULAR OU DEPENDENTE ########



   public void escolhaTitular() throws InterruptedException {
        clicarXpath("//ion-col[contains(.,'Titular')]");
    }



   public void escolhaDependente() throws InterruptedException {
        clicarXpath("//ion-col[contains(.,'Dependente')]");
    }



   public void numeroTitular(String numtitular) throws InterruptedException {
        escreverSemTroca("//input[@type='tel']", numtitular);
    }



   public void clickBotaoTitDep() throws InterruptedException {
        clicarXpath("//span[contains(.,'Próximo')]");
        Thread.sleep(10000);
    }
    
        
        // ######## FIDELIZAÇÃO DE APARELHO ########
   
    public void escolherTitular() throws InterruptedException {
    	Thread.sleep(10000);
    	clicarXpath("//ion-col[contains(.,'Titular']");
    	
    }
        
    public void escreverIMEI(String imei) throws InterruptedException {
        Thread.sleep(10000);
        escreverSemTroca("//div[2]/ion-item/div[2]/div/ion-label/ion-row[2]/ion-col/p", imei);
    }


       
    public void validarIMEI() throws InterruptedException {
        clicarXpath("//span[contains(.,'Validar')]");
    }
        
    public void clickBotaoFidelAparelho() throws InterruptedException {
        clicarXpath("//span[contains(.,'Próximo')]");
    }
        
  
    //########################################################
        
        
        // ######## INFORMAÇÃO DA FATURA ########
    public void clickDataVencimento() throws InterruptedException {
        Thread.sleep(5000);
        clicarXpath("(//button[@id='undefined']/span)[6]");
    }
        
    public void clickBotaoInfFatura() throws InterruptedException {
        clicarXpath("//span[contains(.,'Próximo')]");
    }    
        
    //########################################################
 
   // ######## INSERIR CHIP ########
    
    //public void inserindochip() {
        //String meuchip = gerarChip();
    //}
            
    public void setCHIP(String chip) throws InterruptedException {
        escreverSemTroca("//ion-input[@id='chip-barcode']/input", chip);
    }



   public void proximoInserirCHIP() throws InterruptedException {
        clicarXpath("//span[contains(.,'Próximo')]");
    }
        
    //########################################################
                
        
        // ######## NOVO ATENDIMENTO ########
        
    public void setCPF(String cpf) throws InterruptedException {
        Thread.sleep(3000);
        escreverSemTroca("//input[@type='tel']", cpf);
    }
            
    public void setTelefone(String telefone) throws InterruptedException {
        Thread.sleep(2000);
        escreverSemTroca("//ion-input[@id='input-tel-protocol']/input", telefone);
    }
            
    public void proximoNovoAtendimento() throws InterruptedException{
        clicarXpath("//div[2]/button/span");
    }
            
        
    //########################################################
        
    
        // ######## PLANO ########
    
    //PLANO TIM CONTROLE GIGA A PROMO EXPRESS 3 1
    public void clickPlano1() throws InterruptedException {
        Thread.sleep(10000);
        clicarXpath("//p[contains(.,'6GB + Ligações Ilimitadas, Roaming Nacional, Whatsapp, Messenger e Telegram, Bancah Light,  Aya Books Light, TIM Segurança Digital e Babbel')]");
    }
    
    //PLANO TIM CONTROLE GIGA B PROMO EXPRESS 3 1
    public void clickPlano2() throws InterruptedException {
        Thread.sleep(10000);
        clicarXpath("");
    }
        
    //PLANO TIM CONTROLE SMART EXPRESS
    public void clickPlano3() throws InterruptedException {
        Thread.sleep(10000);
        clicarXpath("");
    }
    
    //PLANO TIM CONTROLE GIGA C EXPRESS 3 1
        public void clickPlano4() throws InterruptedException {
            Thread.sleep(10000);
            clicarXpath("");
    }    
    
        public void clickPlanoBlackMultiD() throws InterruptedException {
        	Thread.sleep(20000);
        	clicarXpath("//*[@id=\"plan-1-11VJH2E\"]/div[2]/div/ion-label/ion-row[1]/ion-col");
        	
        }
        
        public void clickSemFidelizacao() throws InterruptedException {
        	clicarXpath("//*[@id=\"no-loyalties\"]");
        }
        
    //############################################################
        
        //PLANO TIM CONTROLE REDES SOCIAIS 4 0    
        
    public void clickPlano() throws InterruptedException {
        Thread.sleep(10000);
        clicarXpath("//div[2]/ion-item/div[2]/div/ion-label/ion-row[2]/ion-col/p");
    }
            
    public void clickOpacao1() throws InterruptedException {
        clicarXpath("//"); //SEM FIDELIZAÇÃO
    }
            
    public void clickOpacao2() throws InterruptedException {
        clicarXpath("//ion-item[2]/ion-radio/button/span");
        //FIDELIZAÇÃO DO PLANO
    }
            
    public void clickOpacao3() throws InterruptedException {
        clicarXpath("//ion-item[3]/ion-radio/button/span");
        //FIDELIZAÇÃO DO APARELHO
    }
            
    public void clickOpacao4() throws InterruptedException {
        clicarXpath("//ion-item[4]/ion-radio/button/span");
        //FIDELIZAÇÃO PLANO + APARELHO NÃO FIDELIZADOX
    }
            
    public void clickOpacao5() throws InterruptedException {
        clicarXpath("//ion-item[5]/ion-radio/button/span");
        //FIDELIZAÇÃO PLANO + APARELHO
    }
            
    public void clickOpacao6() throws InterruptedException {
        clicarXpath("//ion-item[6]/ion-radio/button/span");
        //APARELHOS NÃO FIDELIZADOS
    }
    
    //############################################################
            
    public void clickPopup() throws InterruptedException {
        clicarXpath("//button[contains(.,'OK')]");
    }
            
    public void clickBotaoPlano() throws InterruptedException {
        clicarXpath("//span[contains(.,'Próximo')]");
    }    
        
        
    //########################################################
        
        // ######## RESUMO OPERAÇÃO ########
        
    public void checkCiente() throws InterruptedException {
        Thread.sleep(10000);
        clicarXpath("//ion-card[2]/ion-card-content/ion-item/ion-checkbox/button/span");
    }
            
    public void clickCriarPedido() throws InterruptedException {
        clicarXpath("//span[contains(.,'Criar Pedido')]");
    }
    
    public void clickCriarPedidoComDoc() throws InterruptedException {
        clicarXpath("//span[contains(.,'Criar Pedido com Documentação')]");
    }
        
        
    //########################################################
        
        // ######## SERVIÇO ########
    
    public void clickBotaoProsseguir() throws InterruptedException {
        Thread.sleep(10000);
        clicarXpath("//span[contains(.,'Próximo')]");
    }
    
    //########################################################
    
        // ######## CARTÃO DE CRÉDITO ########
        
    public void setNumeroCartao(String numcartao) throws InterruptedException {
        escreverSemTroca("//", numcartao);
    }
    
    public void clickMesValidade() throws InterruptedException {
        clicarXpath("//");
    }
    
    public void escolhaMesValidade(String mes) throws InterruptedException {
        escreverSemTroca("", mes);
    }
    
    public void clickAnoValidade() throws InterruptedException {
        clicarXpath("");
    }
    
    public void escolhaAnoValidade(String ano) throws InterruptedException {
        escreverSemTroca("", ano);
    }
    
    public void setCodSeguranca(String codseg) throws InterruptedException {
        escreverSemTroca("", codseg);
    }    
    
    public void clickConfPagamento() throws InterruptedException {
        clicarXpath("");
    }

    //#######################################################

	//############ POS VENDAS #################

	public void clickNovoProtocolo() throws InterruptedException {
		Thread.sleep(10000);
		clicarXpath("//span[contains(.,'Novo')]");
	}
	
	 public void clickBotaoFinalizarAtendimento() throws InterruptedException {
		 	Thread.sleep(10000);
	        clicarXpath("/html/body/ion-app/ng-component/ion-nav/page-after-sales/ion-content/div[2]/button[2]/span");
	    } 
	
}
    
    
     