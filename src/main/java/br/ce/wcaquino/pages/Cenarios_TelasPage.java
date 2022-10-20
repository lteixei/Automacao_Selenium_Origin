package br.ce.wcaquino.pages;

import static br.ce.wcaquino.core.DriverFactory.getDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import br.ce.wcaquino.core.BasePage;
import br.ce.wcaquino.core.DriverFactory;

public class Cenarios_TelasPage extends BasePage {
	
	
	
	// ######## INICIALIZAÇÃO - ENDEREÇO E LOGIN ########

	public void acessarTelaInicial() {
		DriverFactory.getDriver().get("https://apptimvendasdev.internal.timbrasil.com.br/28_0_22_UAT1/#/login");
	}

	public void setEmail(String matricula) throws InterruptedException {
		escrever("//label[@id='login-input1']/input[1]", matricula);
	}

	public void setSenha(String senha) throws InterruptedException {
		escrever("//input[@name='password']", senha);
	}

	public void entrar() {
		clicarBotao("btn-login");
	}

	public void logar(String email, String senha) throws InterruptedException {
		setEmail(email);
		setSenha(senha);
		entrar();
	}

	// ########################################################
	

	// ######## IDENTIFICAÇÃO DE PDV ########
	

	public void sendPDV(String pdv) throws InterruptedException {
		Thread.sleep(8000);
		escreverSemTroca("//ion-searchbar[@id='searchbar-pdv']/div/input", pdv);
	}

	public void EscolhaPDVDutra() throws InterruptedException {
		clicarXpath("//ion-label[contains(.,'E A DUTRA')]");
	}

	public void EscolhaPDVVarejo() throws InterruptedException {
		clicarXpath("//ion-label[contains(.,'VAREJO_LASA_L229')]");
	}

	public void EscolhaPDVMagazineluiza() throws InterruptedException {
		clicarXpath("//ion-label[contains(.,'MAGAZINELUIZA_SP_GUA')]");
	}

	public void EscolhaPDVMorumbi() throws InterruptedException {
		clicarXpath("//ion-label[contains(.,'LP LOJA MORUMBI SHOP')]");
	}

	public void EscolhaPDVTIM_REVENDAS() throws InterruptedException {
		clicarXpath("//ion-label[contains(.,'TIM REVENDAS')]");
	}

	public void confirmaPDV() throws InterruptedException {
		clicarXpath("//button[@id='button-back']/span");
	}

	public void fechapopupPDV() throws InterruptedException {
		Thread.sleep(2000);
		clicarXpath("//*[contains(@class,'alert-button-group')]");
	}

	// ########################################################
	

	// ######## AMBIENTE DE ATENDIMENTO ########
	

	public void clickAntesAtendimento() throws InterruptedException {
		clicarXpath("//ion-select/button/span");
	}

	public void clickAtendimento() throws InterruptedException {
		clicarXpath("//span[contains(.,'MESA 03')]");
	}

	public void proximoAmbienteAtend() throws InterruptedException {
		clicarXpath("//div[2]/button/span");
	}

	// ########################################################
	

	// ######## ATENDIMENTO ########
	

	public void insertNovoTel(String newtel) throws InterruptedException {
		Thread.sleep(10000);
		escreverSemTroca("//input[@type='tel']", newtel);
	}

	public void clickTimPreTop() throws InterruptedException {
		Thread.sleep(10000);
		clicarXpath("//p[contains(.,'TIM PRÉ TOP')]");
	}
	

	public void clickTimControle_A_Plus() throws InterruptedException {
		Thread.sleep(10000);
		clicarXpath("//p[contains(.,'TIM Controle A Plus 4 0')]");
	}

	public void clickTimControle_RedesSociais_4() throws InterruptedException {
		Thread.sleep(5000);
		clicarXpath("//p[contains(.,'TIM Controle Redes Sociais 4 0')]");
	}

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

	public void proximoAtendimento() throws InterruptedException {
		clicarXpath("//button[@id='button-next']/span");
		Thread.sleep(8000);
	}

	// ########################################################
	
	

	// ######## NO PÓS VENDA ########
	

	public void clickMigracao() throws InterruptedException {
		clicarXpath("//span[contains(.,'Migração')]");
		Thread.sleep(12000);
	}

	public void clickMigracaoTT() throws InterruptedException {
		clicarXpath("//span[contains(.,'Migração com TT')]");
		Thread.sleep(10000);
	}

	public void clickTrocaChip() throws InterruptedException {
		Thread.sleep(8000);
		clicarXpath("//span[contains(.,'Troca de Chip')]");
	}

	public void clickTrocaPlano() throws InterruptedException {
		clicarXpath("//span[contains(.,'Troca de Plano')]");
	}

	public void clickFinalizar() throws InterruptedException {
		Thread.sleep(10000);
		clicarXpath("//span[contains(.,'Finalizar Atendimento')]");
	}

	public void clickNovoProtocolo() throws InterruptedException {
		clicarXpath("//span[contains(.,'Novo Protocolo')]");
	}

	public void clickConsultarProtocolos() throws InterruptedException {
		Thread.sleep(10000);
		clicarXpath("//ion-label[contains(.,'Consultar Protocolos')]");
	}

	// ########################################################
	
	

	// ######## MIGRAÇÃO ########
	

	public void clickPre_ControleFatura() throws InterruptedException {
		Thread.sleep(10000);
		clicarXpath("//span[contains(.,'Pré para Controle Fatura')]");
	}

	public void clickPre_ControleExpress() throws InterruptedException {
		clicarXpath("//span[contains(.,'Pré para Express')]");
		Thread.sleep(15000);
	}

	public void clickPre_ControleFlex() throws InterruptedException {
		clicarXpath("/span[contains(.,'Pré para Controle Flex')]");
		Thread.sleep(15000);
	}

	public void clickPre_PosPago_Fatura() throws InterruptedException {
		Thread.sleep(10000);
		clicarXpath("//span[contains(.,'Pré para Pós-Pago Fatura')]");

	}

	public void clickPre_PosPago_Express() throws InterruptedException {
		clicarXpath("//span[contains(.,'Pré para Pós-Pago Express')]");
		Thread.sleep(15000);
	}

	public void clickPre_TimBlackMultiExpress() throws InterruptedException {
		clicarXpath("");
		Thread.sleep(15000);
	}

	public void clickPre_TimBlackMultiFatura() throws InterruptedException {
		clicarXpath("//span[contains(.,'Pré para TIM Black Multi Fatura')]");
		Thread.sleep(15000);
	}

	// ########################################################
	
	

	// ######## DADOS COMPLEMENTAARES ########
	

	public void clickSexoFeminino() throws InterruptedException { // FEMININO
		clicarXpath("//ion-col[2]/ion-item/div/ion-radio/button/span");
	}

	public void clickSexoMasculino() throws InterruptedException { //MASCULINO
	clicarXpath("//ion-col[1]/ion-item/div/ion-radio/button/span");
	}

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

	// ########################################################
	
	

	// ######## DADOS DO CLIENTE ########
	

	public void setNome(String nome) throws InterruptedException {
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

	public void checkNotEmail() throws InterruptedException {
		clicarXpath("//ion-checkbox/button/span");
	}

	public void setDataNasc(String dtnascimento) throws InterruptedException {
		escreverSemTroca("//ion-input[@id='client-birthdate']/input", dtnascimento);
	}

	public void setNomeMae(String nomemae) throws InterruptedException {
		Thread.sleep(1000);
		escreverSemTroca("(//input[@type='text'])[2]", nomemae);
	}

	public void setCEP(String cep) throws InterruptedException {
		Thread.sleep(1000);
		escreverSemTroca("(//input[@type='tel'])[2]", cep);
	}

	public void buscarCEP() throws InterruptedException {
		clicarXpath("//button[@id='postcode-search']/span");
	}

	public void proximoDadosClientes() throws InterruptedException {
		clicarXpath("//div[2]/button[2]");
	}

	public void poupupClientes() throws InterruptedException {
		clicarXpath("//span[contains(.,'Estou Ciente')]");
	}

	// ########################################################
	
	

	// ######## ESCOLHA OFERTA ########
	

	public void clickOferta1() throws InterruptedException {
		clicarXpath("//p[contains(.,'TIM PRÉ TOP ONE 4.0* (WhatsApp + Deezer Go + Prime Video + Voz ilimitada + internet p/ usar como quiser)')]");
	}

	public void clickOferta2() throws InterruptedException {
		Thread.sleep(5000);
		clicarXpath("//p[contains(.,'TIM PRÉ TOP MAIS 3.0 (WhatsApp + Deezer Go + Prime Video + Voz ilimitada + internet p/ usar como quiser)')]");
	}

	public void fechaPopup() throws InterruptedException {
		clicarXpath("//div[3]/button/span");
	}

	public void proximoOferta() throws InterruptedException {
		clicarXpath("//span[contains(.,'Próximo')]");
	}

	// ########################################################
	
	

	// ######## ENDEREÇO DO CLIENTE ########
	

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

	// ########################################################
	
	

	// ######## ESCOLHA NUMERO ########
	

	public void clickNumero() throws InterruptedException {
		Thread.sleep(10000);
		clicarXpath("//ion-list/ion-item/div/ion-radio/button/span");
	}

	public void proximoEscolhaNum() throws InterruptedException {
		clicarXpath("//div[2]/button[2]/span");
		Thread.sleep(5000);
	}

	// ########################################################
	
	

	// ######## ESCOLHA PRODUTO ########
	

	public void escolherProduto() throws InterruptedException {
		clicarXpath("(//button[@id='button-back']/span)[2]");
	}

	// ########################################################
	
	

	// ######## ESCOLHA SEGMENTO ########
	

	public void clickPrepago() throws InterruptedException {
		clicarXpath("//span[contains(.,'Pré-Pago')]");
		Thread.sleep(5000);
	}

	public void clickControleExpress() throws InterruptedException {
		Thread.sleep(5000);
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
	
	public void clickTimBlackMultiB3() throws InterruptedException {
		Thread.sleep(10000);
		clicarXpath("//p[contains(.,'60GB, Ligações e SMS ilimitados, Audiobooks by Ubook Platinum, Babbel 3, Chefsclub, Loja Gameloft, Bancah Premium + Jornais, TIM Gestão Digital, Deezer, TIM Nuvem 2TB, TIM Segurança Digital, Reforça Premium, Band News, Band Sports e Apps Redes Sociais')];");
	}

	// ########################################################
	
	

	// ######## FIDELIZAÇÃO DE APARELHO ########
	

	public void setIMEI(String imei) throws InterruptedException {
		Thread.sleep(8000);
		escreverSemTroca("//input[@type='text']", imei);
	}

	public void clickPopupIMEI() throws InterruptedException {
		clicarXpath("//span[contains(.,'OK')]");
	}

	public void validarIMEI() throws InterruptedException {
		clicarXpath("//span[contains(.,'Validar')]");
		Thread.sleep(5000);
	}

	public void clickBotaoFidelAparelho() throws InterruptedException {
		clicarXpath("//span[contains(.,'Próximo')]");
	}

	// ########################################################
	
	

	// ######## INFORMAÇÃO DA FATURA ########
	

	public void clickDataVencimento() throws InterruptedException {
		Thread.sleep(5000);
		clicarXpath("(//button[@id='undefined']/span)[6]");
	}

	public void clickBotaoInfFatura() throws InterruptedException {
		clicarXpath("//span[contains(.,'Próximo')]");
	}

	// ########################################################
	
	

	// ######## INSERIR CHIP ########
	

	public void setCHIP(String chip) throws InterruptedException {
		Thread.sleep(5000);
		escreverSemTroca("//ion-input[@id='chip-barcode']/input", chip);
	}

	public void proximoInserirCHIP() throws InterruptedException {
		clicarXpath("//span[contains(.,'Próximo')]");
	}

	// ########################################################
	
	

	// ######## TROCA DE CHIP ########
	

	public void setTrocaCHIP(String chip) throws InterruptedException {
		escreverSemTroca("//ion-input[@id='chip-barcode']/input", chip);
	}

	public void clickMotivoTrocaChip() throws InterruptedException {
		clicarXpath("//ion-select/button/span");
	}

	public void escolhaMotivoTrocaChip() throws InterruptedException {
		Thread.sleep(10000);
		clicarXpath("//div/div/button[2]/span");
	}

	public void proximoTrocaCHIP() throws InterruptedException {
		clicarXpath("//span[contains(.,'Próximo')]");
	}

	// ########################################################
	
	

	// ######## NOVO ATENDIMENTO ########
	

	public void setCPF(String cpf) throws InterruptedException {
		Thread.sleep(3000);
		escreverSemTroca("//input[@type='tel']", cpf);
	}

	public void setTelefone(String telefone) throws InterruptedException {
		Thread.sleep(2000);
		escreverSemTroca("//ion-input[@id='input-tel-protocol']/input", telefone);
	}

	public void proximoNovoAtendimento() throws InterruptedException {
		clicarXpath("//div[2]/button/span");
	}

	// ########################################################
	
	

	                 // ######## PLANOS ########
	

	// ######## PLANO TIM CONTROLE GIGA ########

	// PLANO TIM CONTROLE GIGA A PROMO EXPRESS 3 1
	public void clickPlano1() throws InterruptedException {
		Thread.sleep(10000);
		clicarXpath("//p[contains(.,'6GB + Ligações Ilimitadas, Roaming Nacional, Whatsapp, Messenger e Telegram, Bancah Light,  Aya Books Light, TIM Segurança Digital e Babbel')]");
	}

	// PLANO TIM CONTROLE GIGA B PROMO EXPRESS 3 1
	public void clickPlano2() throws InterruptedException {
		Thread.sleep(10000);
		clicarXpath("");
	}

	// PLANO TIM CONTROLE SMART 4 0
	public void clickPlanoTimControleSmart_4() throws InterruptedException {
		Thread.sleep(10000);
		clicarXpath("//ion-item[@id='plan-1-11L5P25']/div[2]/div/ion-label/ion-row/ion-col/h1");
	}

			// SEM FIDELIZAÇÃO
			public void clickSemFidelizacao() throws InterruptedException {
				clicarXpath("//ion-radio/button/span");
			}

	// PLANO TIM CONTROLE SMART EXPRESS
	public void clickPlano3() throws InterruptedException {
		Thread.sleep(10000);
		clicarXpath("");
	}

	// PLANO TIM CONTROLE GIGA C EXPRESS 3 1
	public void clickPlano4() throws InterruptedException {
		Thread.sleep(10000);
		clicarXpath("");
	}

	// ############################################################
	
	

	// ######## PLANO TIM BLACK DEPENDENTE ########
	

	// ########PLANO DEPENDENTE ########
	public void clickPlanoDependente() throws InterruptedException {
		Thread.sleep(5000);
		clicarXpath("//ion-row[2]/ion-col");
	}

	// ######## PLANO SEM FIDELIZACAO ########
	public void clickPlanoSemFidel() throws InterruptedException {
		clicarXpath("//ion-radio/button/span");
	}

	// ######## PLANO APARELHO NÃO FIDELIZADO ########
	public void clickPlanoAparelhoSemFidel() throws InterruptedException {
		clicarXpath("//");
	}

	public void clickBotaoBlackDep() throws InterruptedException {
		clicarXpath("//span[contains(.,'Próximo')]");
	}

	// ############################################################
	
	

	// ######## PLANO TIM BLACK EXPRESS 2.0 ########
	
	// ########PLANO DEPENDENTE ########
	
	public void clickPlanoBlack_A_Express_2() throws InterruptedException {
		Thread.sleep(10000);
		clicarXpath(
				"//p[contains(.,'17GB, Ligações e SMS ilimitados, Aya Books, Bancah Premium Jornais, TIM Segurança Digital Light, TIM Music by Deezer e Apps de Redes Sociais.')]");
	}

	public void clickPlanoBlack_B_Express_2() throws InterruptedException {
		Thread.sleep(10000);
		clicarXpath(
				"//p[contains(.,'22GB, Ligações e SMS ilimitados, Aya Books, Bancah Premium Jornais, TIM Segurança Digital, TIM Music by Deezer e Apps de Redes Sociais.')]");
	}

	public void clickPlanoBlack_C_Express_2() throws InterruptedException {
		Thread.sleep(10000);
		clicarXpath(
				"//p[contains(.,'27GB, Ligações e SMS ilimitados, Aya Books Premium, Bancah Premium Jornais, TIM Segurança Digital, TIM Music by Deezer e Apps de Redes Sociais.')]");
	}

	public void clickBotaoBlackExpress() throws InterruptedException {
		Thread.sleep(10000);
		clicarXpath("//button[contains(.,'Próximo')]");
	}

	// ############################################################
	

	// ######## PLANO TIM BLACK ########
	
	
	// ########PLANO TIM BLACK A 3 ########

	public void clickPlanoTimBlackA3() throws InterruptedException {
		Thread.sleep(10000);
		clicarXpath(
				"//p[contains(.,'15GB, Ligações e SMS ilimitados, Audiobook By Ubook Premium, Bancah Premium + Jornais, TIM Segurança Digital Premium, TIM Music by Deezer, Reforça e Apps de Redes Sociais.')]");
	}

			// ######## SEM FIDELIZAÇÃO ########
			public void clickSemFidel() throws InterruptedException {
					clicarXpath("//");
			}

			// ######## FIDELIZAÇÃO DO APARELHO ########
			public void clickFidelApar() throws InterruptedException {
				clicarXpath("//ion-item[3]/ion-radio/button/span");
			}

			// ######## FIDELIZAÇÃO DO PLANO + APARELHO ########
			public void clickFidelPlano_Apar() throws InterruptedException {
				clicarXpath("//ion-item[3]/ion-radio/button/span");
			}

	// ######## PlanoTimBlackB3 ########
	public void clickPlanoTimBlackB3() throws InterruptedException {
		clicarXpath("//");
	}

	// ######## PlanoTimBlackCUltra ########
	public void clickPlanoTimBlackCUltra() throws InterruptedException {
		clicarXpath("//");
	}

	// ######## PlanoTimBlackCUHero3 ########
	public void clickPlanoTimBlackCUHero3() throws InterruptedException {
		clicarXpath("//");
	}

	public void clickBotaoBlack() throws InterruptedException {
		clicarXpath("//button[contains(.,'Próximo')]");
	}

	// ############################################################
	
	

	// ######## PLANO TIM CONTROLE REDES SOCIAIS 4 0 ########
	

	public void clickPlano() throws InterruptedException {
		Thread.sleep(10000);
		clicarXpath("//div[2]/ion-item/div[2]/div/ion-label/ion-row[2]/ion-col/p");
	}

				// PLANO SEM FIDELIZAÇÃO
				public void clickOpacao1() throws InterruptedException {
					clicarXpath("//ion-radio/button/span"); //
				}

				// PLANO FIDELIZAÇÃO DO PLANO
				public void clickOpacao2() throws InterruptedException {
					clicarXpath("//ion-item[2]/ion-radio/button/span");
				}

				// PLANO FIDELIZAÇÃO DO APARELHO
				public void clickOpacao3() throws InterruptedException {
					clicarXpath("//ion-item[3]/ion-radio/button/span");
				}
				
				// PLANO FIDELIZAÇÃO PLANO + APARELHO NÃO FIDELIZADO
				public void clickOpacao4() throws InterruptedException {
					clicarXpath("//ion-item[4]/ion-radio/button/span");
				}

				// PLANO FIDELIZAÇÃO PLANO + APARELHO
				public void clickOpacao5() throws InterruptedException {
					clicarXpath("//ion-item[5]/ion-radio/button/span");
				}

					// PLANO APARELHOS NÃO FIDELIZADOS
				public void clickOpacao6() throws InterruptedException {
					clicarXpath("//ion-item[6]/ion-radio/button/span");
				}

	// ############################################################
	
	
	// ######## PLANO TIM BLACK MULTI 3 0 ########
	
		// ######## PLANO A 3 0 ########
				
	public void clickMultiA3_0() throws InterruptedException {
		clicarXpath("//p[contains(.,'30GB, Ligações e SMS ilimitados, Audiobooks by Ubook Platinum, Babbel 3, Loja Gameloft, Bancah Premium + Jornais, TIM Gestão Digital, Deezer, TIM Nuvem 500GB, TIM Segurança Digital, Reforça, Band News, Band Sports e Apps de Redes Sociais.')]");
	}

	// ######## PLANO B 3 0 ########
	public void clickMultiB3_0() throws InterruptedException {
		clicarXpath("//p[contains(.,'60GB, Ligações e SMS ilimitados, Audiobooks by Ubook Platinum, Babbel 3, Chefsclub, Loja Gameloft, Bancah Premium + Jornais, TIM Gestão Digital, Deezer, TIM Nuvem 2TB, TIM Segurança Digital, Reforça Premium, Band News, Band Sports e Apps Redes Sociais')]");
	}

	// ######## PLANO C 3 0 ########
	public void clickMultiC3_0() throws InterruptedException {
		clicarXpath("//p[contains(.,'100GB, Ligações e SMS ilimitados, Audiobooks by Ubook Platinum, Babbel 3, Chefsclub, Loja Gameloft, Bancah Premium + Jornais, TIM Gestão Digital, Deezer, TIM Nuvem 2TB, TIM Segurança Digital, Reforça Premium, Band News, Band Sports e Apps Redes Sociais.')]");
	}

	// ######## PLANO D 3 0 ########
	public void clickMultiD3_0() throws InterruptedException {
		clicarXpath("//p[contains(.,'180GB, Ligações e SMS ilimitados, Audiobooks by Ubook Platinum, Babbel 3, Chefsclub, Loja Gameloft, Bancah Premium + Jornais, TIM Gestão Digital, Deezer, TIM Nuvem 2TB, TIM Segurança Digital, Reforça Premium, Band News, Band Sports e Apps Redes Sociais.')]");
	}

	// ######## FIDELIZAÇÃO DO APARELHO ########
	public void clickMultiD3_0SemFid() throws InterruptedException {
		clicarXpath("//ion-radio/button/span");
	}

	public void clicBotaoTimBlackMulti() throws InterruptedException {
		clicarXpath("//button[contains(.,'Próximo')]");
	}

	// ############################################################
		

	// ######## POPUP E BOTÃO PROXIMO ########

	public void clickPopup() throws InterruptedException {
		clicarXpath("//button[contains(.,'OK')]");
	}

	public void clickBotaoPlano() throws InterruptedException {
		clicarXpath("//span[contains(.,'Próximo')]");
	}

	// ########################################################
		
	
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
		Thread.sleep(20000);
	}

	// ########################################################
	
	

	// ######## SERVIÇO ########

	public void clickBotaoNetflix() throws InterruptedException {
		Thread.sleep(5000);
		clicarXpath("//ion-item[@id='service-Netflix Padrão']/div/div/ion-label/h1");
	}

	public void clickBotaoHBO() throws InterruptedException {
		clicarXpath("//ion-item[@id='service-HBO MAX']/div/div/ion-label/h1");
	}

	public void clickBotaoYoutube() throws InterruptedException {
		clicarXpath("//ion-item[@id='service-YouTube Premium']/div/div/ion-label");
	}

	public void clickBotaoProsseguir() throws InterruptedException {
		clicarXpath("//span[contains(.,'Próximo')]");
	}

	// ########################################################
	
	
			// ######## UPLOAD DE ARQUIVOS ########
	
	// ######## DADOS DA ALÇADA ########
		
	public static void anexarIdentFrente() throws InterruptedException {
		Thread.sleep(10000);
		String filePath = "C:\\Users\\T3666975\\Id_Frente.PNG";
		getDriver().findElement(By.xpath("//button[contains(.,'Anexar')]")).sendKeys(filePath);
//		Upload("//button[contains(.,'Anexar')]");
	}
	
	
	
	

	public void clickBotaoAnexar() throws InterruptedException {
		Thread.sleep(15000);
		clicarXpath("//button[contains(.,'Anexar')]");
		// WebElement upload_file = null;
		// upload_file.sendKeys("Id_Frente.PNG");

		// getDriver().findElement(by_xpath('C:\fakepath\não grava no siebel.PNG').send_keys(Keys.ENTER);

		// WebElement upload_file1 =
		// driver.findElement(By.xpath("//button[contains(.,'Anexar')]");
		// upload_file1.sendKeys("C:/Users/T3666975/Id_Frente.PNG");
	}

	public void anexarIdentFrente1() throws InterruptedException {
		Thread.sleep(10000);
		clicarXpath("//input[@type='file']");
	}

	public void clickBotaoAnexar1() throws InterruptedException {
		Thread.sleep(10000);
		clicarXpath("//button[contains(.,'Anexar')]");
	}

	public void anexarIdentVerso() throws InterruptedException {
		Thread.sleep(10000);
		clicarXpath("(//input[@type='file'])[2]");
	}

	public void clickBotaoAnexar2() throws InterruptedException {
		Thread.sleep(10000);
		clicarXpath("//button[contains(.,'Anexar')]");
	}

	public void anexarCPF() throws InterruptedException {
		Thread.sleep(10000);
		clicarXpath("(//input[@type='file'])[3]");
	}

	public void clickBotaoAnexar3() throws InterruptedException {
		Thread.sleep(10000);
		clicarXpath("//button[contains(.,'Anexar')]");
	}

	public void anexarComprovanteRes() throws InterruptedException {
		Thread.sleep(10000);
		clicarXpath("(//input[@type='file'])[4]");
	}

	public void clickBotaoAlcada() throws InterruptedException {
		clicarXpath("//span[contains(.,'Próximo')]	");
	}

	// ########################################################
		

	// ######## CARTÃO DE CRÉDITO ########

	public void setNumeroCartao(String numcartao) throws InterruptedException {
		Thread.sleep(10000);
		escrever("//input", numcartao);
	}

	public void clickMesValidade() throws InterruptedException {
		clicarXpath("//select[@id='cardExpirationMonth']");
	}

	public void escolhaMesValidade() throws InterruptedException {
		clicarXpath("//option[@value='11']");
	}

	public void clickAnoValidade() throws InterruptedException {
		clicarXpath("//select[@id='cardExpirationYear']");
	}

	public void escolhaAnoValidade() throws InterruptedException {
		clicarXpath("//option[@value='2023']");
	}

	public void setCodSeguranca(String codseg) throws InterruptedException {
		escreverSemTroca("//input[@id='cardCvv']", codseg);
	}

	public void clickConfPagamento() throws InterruptedException {
		clicarXpath("//buton[contains(.,'Confirmar pagamento')]");
	}

	// ########################################################
		

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


	public void clickMotivo1() throws InterruptedException {
		Thread.sleep(10000);
		clicarXpath("//ion-label[contains(.,'Motivo 1')]");
	}
}
// ########################################################
