package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import core.BasePage;
import core.DriverFactory;
import static core.DriverFactory.getDriver;

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
	
	public void send_EMAIL(String email) throws InterruptedException {
	    escreverSemTroca("/html/body/section/div/div/div[2]/form/div[3]/div[1]/input", email);
    }  
	
	public void send_TELEFONE(String tel) throws InterruptedException {
	    escreverSemTroca("/html/body/section/div/div/div[2]/form/div[4]/div/input", tel);
    }  
	
	public void clica_MASCULINO() throws InterruptedException {
        clicarXpath("/html/body/section/div/div/div[2]/form/div[5]/div/label[1]/input");
    }  
	
	public void clica_HOBBIES() throws InterruptedException {
        clicarXpath("/html/body/section/div/div/div[2]/form/div[6]/div/div[2]/input");
        Thread.sleep(2000);
	}  
	
	public void clica_OPCOES_LINGUAGENS() throws InterruptedException {
        clicarXpath("/html/body/section/div/div/div[2]/form/div[7]/div/multi-select/div[1]");
    }  
	
	public void clica_LINGUAGENS() throws InterruptedException {
        clicarXpath("/html/body/section/div/div/div[2]/form/div[7]/div/multi-select/div[2]/ul/li[29]/a");
    }
	
	public void clica_OPCOES_SKILL() throws InterruptedException {
        clicarXpath("/html/body/section/div/div/div[2]/form/div[8]/div/select");
    }  
	
	public void clica_SKILL() throws InterruptedException {
        clicarXpath("/html/body/section/div/div/div[2]/form/div[8]/div/select/option[20]");
    }
	
	public void clica_OPCOES_DATE() throws InterruptedException {
        clicarXpath("/html/body/section/div/div/div[2]/form/div[11]/div[1]/select");
    }  

	public void clica_DATE() throws InterruptedException {
        clicarXpath("/html/body/section/div/div/div[2]/form/div[11]/div[1]/select/option[62]");
    }
	
	public void clica_OPCOES_MES() throws InterruptedException {
        clicarXpath("/html/body/section/div/div/div[2]/form/div[11]/div[2]/select");
    }  

    public void clica_MES() throws InterruptedException {
        clicarXpath("/html/body/section/div/div/div[2]/form/div[11]/div[2]/select/option[11]");
    }
    
    public void clica_OPCOES_ANO() throws InterruptedException {
        clicarXpath("/html/body/section/div/div/div[2]/form/div[11]/div[3]/select");
    }  

    public void clica_ANO() throws InterruptedException {
        clicarXpath("/html/body/section/div/div/div[2]/form/div[11]/div[3]/select/option[13]");
    }
	       
    public void send_PASSWORD(String senha) throws InterruptedException {
        escreverSemTroca("/html/body/section/div/div/div[2]/form/div[12]/div/input", senha);
    }
		
	public void send_CONFIRM_PASSWORD(String conf_senha) throws InterruptedException {
	    escreverSemTroca("/html/body/section/div/div/div[2]/form/div[13]/div/input", conf_senha);
    }   
	
	public void clica_SUBMIT() throws InterruptedException {
        clicarXpath("/html/body/section/div/div/div[2]/form/div[14]/div/button[1]");
    }
	
	// ########################################################
    // ######## SWITCH TO IFRAME ########
    // ########################################################
	
	public void clicaSwitch_Iframe() throws InterruptedException {
        clicarXpath("/html/body/header/nav/div/div[2]/ul/li[4]/ul/li[3]/a");
        Thread.sleep(3000);
    }
	
	public void clicaUMA_Frame () throws InterruptedException {
	        try {
	            // Esperar até que o iframe esteja presente
	            WebDriverWait wait = new WebDriverWait(getDriver(), 5);
	            WebElement iframe = wait.until(ExpectedConditions.presenceOfElementLocated(By.name("SingleFrame")));
	            
	            // Mudar o contexto para o iframe
	            getDriver().switchTo().frame(iframe);

	            // Localizar o campo de entrada dentro do iframe
	            WebElement inputField = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/section/div/div/div/input")));
	            
	            // Limpar o campo e inserir o texto
	            inputField.clear();
	            inputField.sendKeys("Leonardo");

	            // Voltar para o contexto principal (fora do iframe)
	            getDriver().switchTo().defaultContent();
	            
	            // Adicione qualquer outro código ou validação aqui
	            System.out.println("Texto inserido com sucesso.");

	        } catch (Exception e) {
	            e.printStackTrace();
	        } finally {
	            
	        }
	    }
	
	
	public void clica_Switch_Frame2() throws InterruptedException {
        clicarXpath("/html/body/section/div[1]/div/div/div/div[1]/div/ul/li[2]/a");
    }
	
	public void clicaDUAS_Frame() throws InterruptedException {
	    try {
            // Esperar até que o primeiro iframe esteja presente e mudar o contexto para ele
	        WebDriverWait wait = new WebDriverWait(getDriver(), 5);
            WebElement firstIframe = wait.until(ExpectedConditions.presenceOfElementLocated(By.name("SingleFrame")));
            getDriver().switchTo().frame(firstIframe);

            // Esperar até que o segundo iframe esteja presente e mudar o contexto para ele
            WebElement secondIframe = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//iframe[@src='SingleFrame.html']")));
            getDriver().switchTo().frame(secondIframe);

            // Localizar o campo de entrada dentro do segundo iframe
            WebElement inputField = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@type='text']")));
            
            // Verificar se o campo está visível e habilitado antes de interagir
            if (inputField.isDisplayed() && inputField.isEnabled()) {
                // Limpar o campo e inserir o texto
                inputField.clear();
                inputField.sendKeys("Teixeira");
            } else {
                System.out.println("Campo de entrada não está visível ou habilitado.");
            }

            // Voltar para o contexto do primeiro iframe
            getDriver().switchTo().parentFrame();

            // Voltar para o contexto principal (fora de todos os iframes)
            getDriver().switchTo().defaultContent();

            // Adicione qualquer outro código ou validação aqui
            System.out.println("Texto inserido com sucesso.");

        } catch (Exception e) {
            e.printStackTrace();
        } 
    }
	
    
    // ########################################################
    // ######## SWITCH TO ALERT ########
    // ########################################################
	
	
	public void clicaSwitch_Alert() throws InterruptedException {
	    clicarXpath("/html/body/header/nav/div/div[2]/ul/li[4]/ul/li[1]/a");
	    Thread.sleep(3000);
    }
	
	public void clica_Alert_With_Textbox() throws InterruptedException {
        clicarXpath("/html/body/div[1]/div/div/div/div[1]/ul/li[3]/a");
    }
	
	public void clica_Button_Name_Textbox() throws InterruptedException {
	    try {
            // Executar o script JavaScript para preencher o campo com "Leonardo"
            ((JavascriptExecutor) getDriver()).executeScript(
                "var person = 'Leonardo';" +
                "document.getElementById('demo1').innerHTML = 'Hello ' + person + ' da Motta Teixeira';"
            );

            // Adicione qualquer outro código ou validação aqui
            System.out.println("Texto inserido com sucesso.");

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
           
        }
    }
    
	
	public void sendName(String name) throws InterruptedException {
	    escreverSemTroca("demo1", name);
    }
		
	public void clica_Alert_With_OK() throws InterruptedException {
        clicarXpath("/html/body/div[1]/div/div/div/div[1]/ul/li[1]/a");
    }
	
	public void clica_Display_alert_Box() throws InterruptedException {
        clicarXpath("/html/body/div[1]/div/div/div/div[2]/div[1]/button");
        Thread.sleep(3000);
    }
	
	public void clica_Popup() throws InterruptedException {
	    clicarXpath("/html/body/div[1]/div/div/div/div[2]/div[3]/button");
    }
	
	public void clica_Alert_With_OK_Cancel() throws InterruptedException {
        clicarXpath("/html/body/div[1]/div/div/div/div[1]/ul/li[2]/a");
    }
	
	public void clica_buttom_OK_Cancel() throws InterruptedException {
        clicarXpath("/html/body/div[1]/div/div/div/div[2]/div[2]/button");
        Thread.sleep(3000);
    }
	
	// Clica no botão OK do POPUP
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
        Thread.sleep(3000);
    }
	
	public void clicaOPEN_NEW_SEPERATE() throws InterruptedException {
        clicarXpath("/html/body/div[1]/div/div/div/div[1]/ul/li[2]/a");
    }
	
	public void clicaButton_Seperate() throws InterruptedException {
        clicarXpath("/html/body/div[1]/div/div/div/div[2]/div[2]/button");
        Thread.sleep(3000);
    }
	
	public void clicaOPEN_SEPERATE_MULTIPLE() throws InterruptedException {
        clicarXpath("/html/body/div[1]/div/div/div/div[1]/ul/li[3]/a");
    }
	
	public void clicaButton_Multiple() throws InterruptedException {
        clicarXpath("/html/body/div[1]/div/div/div/div[2]/div[3]/button");
        Thread.sleep(3000);
    }
	
	public void fechar_Janela() throws InterruptedException {
	    fechar_Janela();
    }
	
	
	// ########################################################
    // ######## WIDGETS - ACCORDION ########
    // ########################################################
	
	public void clicaMenu_Widgets() throws InterruptedException {
        clicarXpath("/html/body/header/nav/div/div[2]/ul/li[5]/a");
        Thread.sleep(2000);
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
        Thread.sleep(2000);
    }
    
    
    // ########################################################
    // ######## WIDGETS - DATE PICKER ########
    // ########################################################
    
    
    public void clica_teste() throws InterruptedException {
        Thread.sleep(2000);
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
    
    //### AQUI EU PEGO UMA BARRA E ARRASTO ELA UM POUCO ###
    public void clica_Slider() throws InterruptedException {
        try {
            // Criar uma instância de Actions
            Actions actions = new Actions(getDriver());

            // Localizar o elemento a ser arrastado
            WebElement elementToDrag = getDriver().findElement(By.xpath("//section/div/div/div/div/a"));

            // Definir o ponto de destino para onde o elemento deve ser arrastado
            // Aqui você pode precisar ajustar os deslocamentos
            int xOffset = 300; // Ajuste conforme necessário
            int yOffset = 0;   // Ajuste conforme necessário

            // Usar Actions para clicar e arrastar
            actions.clickAndHold(elementToDrag)
                   .moveByOffset(xOffset, yOffset)
                   .release()
                   .build()
                   .perform();
        } finally {
            // Fechar o navegador
            // Thread.sleep(4000); // Opcional
        }
    }

    
    // ########################################################
    // ######## INTERACTION - DRAG AND DROP ########
    // ########################################################
    
    public void clicaMenu_Interactions() throws InterruptedException {
        clicarXpath("/html/body/header/nav/div/div[2]/ul/li[6]/a");
    }
    
    public void clica_Drag_and_Drop() throws InterruptedException {
        clicarXpath("/html/body/header/nav/div/div[2]/ul/li[6]/ul/li[1]/a");
    }
    
    public void clica_Dynamic() throws InterruptedException {
        clicarXpath("/html/body/header/nav/div/div[2]/ul/li[6]/ul/li[1]/ul/li[2]/a");
        Thread.sleep(2000);
    }
    
    
    // ########################################################
    // ######## INTERACTION - DINAMIC 1 ########
    // ########################################################
    
    public void clica_Dynamic1() throws InterruptedException {
        
    try {
        // Espera o carregamento da página e encontra o elemento a ser arrastado
        WebDriverWait wait = new WebDriverWait(getDriver(), 15);
        WebElement sourceElement = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/section/div[1]/div/div[1]/div[1]/img")));
                   
        // Espera o elemento alvo estar visível
        WebElement targetElement = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/section/div[1]/div/div[2]/div")));

        // Cria uma instância de Actions
        Actions actions = new Actions(getDriver());

        // Alternativa: Verifica a visibilidade dos elementos
        scrollIntoView(getDriver(), sourceElement);
        scrollIntoView(getDriver(), targetElement);

     // Realiza o drag and drop usando JavaScript
        performDragAndDrop(getDriver(), sourceElement, targetElement);

        // Aguarda um pouco para ver o resultado
        Thread.sleep(2000);
        
        } catch (Exception e) {
            e.printStackTrace();
        } 
    }

    public static void scrollIntoView1D(WebDriver driver, WebElement element) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true);", element);
    }

    public static void performDragAndDrop1D(WebDriver driver, WebElement source, WebElement target) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        String script = "var source = arguments[0];"
                    + "var target = arguments[1];"
                    + "var dataTransfer = new DataTransfer();"
                    + "var event = new DragEvent('dragstart', {bubbles: true, cancelable: true, dataTransfer: dataTransfer});"
                    + "source.dispatchEvent(event);"
                    + "event = new DragEvent('drop', {bubbles: true, cancelable: true, dataTransfer: dataTransfer});"
                    + "target.dispatchEvent(event);"
                    + "event = new DragEvent('dragend', {bubbles: true, cancelable: true, dataTransfer: dataTransfer});"
                    + "source.dispatchEvent(event);";
        js.executeScript(script, source, target);
    }

    public static void actionsDragAndDropByCoordinates1D(WebElement source, WebElement target) {
        Actions actions = new Actions(((DriverFactory) source).getDriver());
        actions.clickAndHold(source)
            .moveToElement(target)
            .release(target)
            .build()
            .perform();
        }

    // ########################################################
    // ######## INTERACTION - DINAMIC 2 ########
    // ########################################################
    
    public void clica_Dynamic2() throws InterruptedException {
       try {
            // Espera o carregamento da página e encontra o elemento a ser arrastado
            WebDriverWait wait = new WebDriverWait(getDriver(), 15);
            WebElement sourceElement = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/section/div[1]/div/div[1]/div[2]/img")));
                           

            // Espera o elemento alvo estar visível
            WebElement targetElement = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/section/div[1]/div/div[2]/div")));

            // Cria uma instância de Actions
            Actions actions = new Actions(getDriver());

            // Alternativa: Verifica a visibilidade dos elementos
            scrollIntoView(getDriver(), sourceElement);
            scrollIntoView(getDriver(), targetElement);

            // Realiza o drag and drop usando JavaScript
            performDragAndDrop(getDriver(), sourceElement, targetElement);

            // Alternativa: Usando ações por coordenadas
            // actionsDragAndDropByCoordinates(sourceElement, targetElement);

            // Aguarda um pouco para ver o resultado
            Thread.sleep(2000);
        } catch (Exception e) {
            e.printStackTrace();
        } 
    }

    public static void scrollIntoView2D(WebDriver driver, WebElement element) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true);", element);
    }

    public static void performDragAndDrop2D(WebDriver driver, WebElement source, WebElement target) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        String script = "var source = arguments[0];"
                        + "var target = arguments[1];"
                        + "var dataTransfer = new DataTransfer();"
                        + "var event = new DragEvent('dragstart', {bubbles: true, cancelable: true, dataTransfer: dataTransfer});"
                        + "source.dispatchEvent(event);"
                        + "event = new DragEvent('drop', {bubbles: true, cancelable: true, dataTransfer: dataTransfer});"
                        + "target.dispatchEvent(event);"
                        + "event = new DragEvent('dragend', {bubbles: true, cancelable: true, dataTransfer: dataTransfer});"
                        + "source.dispatchEvent(event);";
        js.executeScript(script, source, target);
    }

    public static void actionsDragAndDropByCoordinates2D(WebElement source, WebElement target) {
        Actions actions = new Actions(((DriverFactory) source).getDriver());
        actions.clickAndHold(source)
               .moveToElement(target)
               .release(target)
               .build()
               .perform();
    }

    
    // ########################################################
    // ######## INTERACTION - DINAMIC 3 ########
    // ########################################################
    
    public void clica_Dynamic3() throws InterruptedException {
        try {
            // Espera o carregamento da página e encontra o elemento a ser arrastado
            WebDriverWait wait = new WebDriverWait(getDriver(), 15);
            WebElement sourceElement = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/section/div[1]/div/div[1]/div[3]/img")));
                           

            // Espera o elemento alvo estar visível
            WebElement targetElement = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/section/div[1]/div/div[2]/div")));

            // Cria uma instância de Actions
            Actions actions = new Actions(getDriver());

            // Alternativa: Verifica a visibilidade dos elementos
            scrollIntoView(getDriver(), sourceElement);
            scrollIntoView(getDriver(), targetElement);

            // Realiza o drag and drop usando JavaScript
            performDragAndDrop(getDriver(), sourceElement, targetElement);

            // Alternativa: Usando ações por coordenadas
            // actionsDragAndDropByCoordinates(sourceElement, targetElement);

            // Aguarda um pouco para ver o resultado
            Thread.sleep(2000);
        } catch (Exception e) {
            e.printStackTrace();
        } 
    }

    public static void scrollIntoView3D(WebDriver driver, WebElement element) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true);", element);
    }

    public static void performDragAndDrop3D(WebDriver driver, WebElement source, WebElement target) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        String script = "var source = arguments[0];"
                        + "var target = arguments[1];"
                        + "var dataTransfer = new DataTransfer();"
                        + "var event = new DragEvent('dragstart', {bubbles: true, cancelable: true, dataTransfer: dataTransfer});"
                        + "source.dispatchEvent(event);"
                        + "event = new DragEvent('drop', {bubbles: true, cancelable: true, dataTransfer: dataTransfer});"
                        + "target.dispatchEvent(event);"
                        + "event = new DragEvent('dragend', {bubbles: true, cancelable: true, dataTransfer: dataTransfer});"
                        + "source.dispatchEvent(event);";
        js.executeScript(script, source, target);
    }

    public static void actionsDragAndDropByCoordinates3D(WebElement source, WebElement target) {
        Actions actions = new Actions(((DriverFactory) source).getDriver());
        actions.clickAndHold(source)
               .moveToElement(target)
               .release(target)
               .build()
               .perform();
    }

    
    // ########################################################
    // ######## INTERACTION - ESTATIC 1 ########
    // ########################################################
    
    public void clica_Static() throws InterruptedException {
        clicarXpath("/html/body/header/nav/div/div[2]/ul/li[6]/ul/li[1]/ul/li[1]/a");
    }
    
    public void clica_Static1() throws InterruptedException {
            try {
                    // Espera o carregamento da página e encontra o elemento a ser arrastado
                WebDriverWait wait = new WebDriverWait(getDriver(), 15);
                WebElement sourceElement = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/section/div[1]/div/div[1]/div[1]/img")));
                      
                // Espera o elemento alvo estar visível
                WebElement targetElement = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/section/div[1]/div/div[2]/div")));

                // Cria uma instância de Actions
                Actions actions = new Actions(getDriver());

                // Alternativa: Verifica a visibilidade dos elementos
                scrollIntoView(getDriver(), sourceElement);
                scrollIntoView(getDriver(), targetElement);

                // Realiza o drag and drop usando JavaScript
                performDragAndDrop(getDriver(), sourceElement, targetElement);

                // Aguarda um pouco para ver o resultado
                    Thread.sleep(2000);
                } catch (Exception e) {
                    e.printStackTrace();
                } 
            }

    public static void scrollIntoView(WebDriver driver, WebElement element) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true);", element);
    }

    public static void performDragAndDrop(WebDriver driver, WebElement source, WebElement target) {
                JavascriptExecutor js = (JavascriptExecutor) driver;
                String script = "var source = arguments[0];"
                                + "var target = arguments[1];"
                                + "var dataTransfer = new DataTransfer();"
                                + "var event = new DragEvent('dragstart', {bubbles: true, cancelable: true, dataTransfer: dataTransfer});"
                                + "source.dispatchEvent(event);"
                                + "event = new DragEvent('drop', {bubbles: true, cancelable: true, dataTransfer: dataTransfer});"
                                + "target.dispatchEvent(event);"
                                + "event = new DragEvent('dragend', {bubbles: true, cancelable: true, dataTransfer: dataTransfer});"
                                + "source.dispatchEvent(event);";
                js.executeScript(script, source, target);
            }

            public static void actionsDragAndDropByCoordinates(WebElement source, WebElement target) {
                Actions actions = new Actions(((DriverFactory) source).getDriver());
                actions.clickAndHold(source)
                       .moveToElement(target)
                       .release(target)
                       .build()
                       .perform();
            }

            
            
            
    // ########################################################
    // ######## INTERACTION - ESTATIC 1 ########
    // ######################################################## 
    
    public void clica_Static2() throws InterruptedException {
        try {
        // Espera o carregamento da página e encontra o elemento a ser arrastado
        WebDriverWait wait = new WebDriverWait(getDriver(), 15);
        WebElement sourceElement = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/section/div[1]/div/div[1]/div[2]/img")));
                       
        // Espera o elemento alvo estar visível
        WebElement targetElement = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/section/div[1]/div/div[2]/div")));

        // Cria uma instância de Actions
        Actions actions = new Actions(getDriver());

        // Alternativa: Verifica a visibilidade dos elementos
        scrollIntoView(getDriver(), sourceElement);
        scrollIntoView(getDriver(), targetElement);

        // Realiza o drag and drop usando JavaScript
        performDragAndDrop(getDriver(), sourceElement, targetElement);

        // Aguarda um pouco para ver o resultado
            Thread.sleep(2000);
        } catch (Exception e) {
            e.printStackTrace();
        } 
    }

    public static void scrollIntoView1(WebDriver driver, WebElement element) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true);", element);
    }

    public static void performDragAndDrop1(WebDriver driver, WebElement source, WebElement target) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        String script = "var source = arguments[0];"
                        + "var target = arguments[1];"
                        + "var dataTransfer = new DataTransfer();"
                        + "var event = new DragEvent('dragstart', {bubbles: true, cancelable: true, dataTransfer: dataTransfer});"
                        + "source.dispatchEvent(event);"
                        + "event = new DragEvent('drop', {bubbles: true, cancelable: true, dataTransfer: dataTransfer});"
                        + "target.dispatchEvent(event);"
                        + "event = new DragEvent('dragend', {bubbles: true, cancelable: true, dataTransfer: dataTransfer});"
                        + "source.dispatchEvent(event);";
        js.executeScript(script, source, target);
    }

    public static void actionsDragAndDropByCoordinates1(WebElement source, WebElement target) {
        Actions actions = new Actions(((DriverFactory) source).getDriver());
        actions.clickAndHold(source)
               .moveToElement(target)
               .release(target)
               .build()
               .perform();
    }
    
    
    // ########################################################
    // ######## INTERACTION - ESTATIC 1 ########
    // ########################################################
    
    public void clica_Static3() throws InterruptedException {
        try {
            // Espera o carregamento da página e encontra o elemento a ser arrastado
            WebDriverWait wait = new WebDriverWait(getDriver(), 15);
            WebElement sourceElement = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/section/div[1]/div/div[1]/div[3]/img")));
            
            // Espera o elemento alvo estar visível
            WebElement targetElement = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/section/div[1]/div/div[2]/div")));

            // Cria uma instância de Actions
            Actions actions = new Actions(getDriver());

            // Alternativa: Verifica a visibilidade dos elementos
            scrollIntoView(getDriver(), sourceElement);
            scrollIntoView(getDriver(), targetElement);

            // Realiza o drag and drop usando JavaScript
            performDragAndDrop(getDriver(), sourceElement, targetElement);

            // Aguarda um pouco para ver o resultado
            Thread.sleep(2000);
            
        } catch (Exception e) {
            e.printStackTrace();
        } 
    }

    public static void scrollIntoView2(WebDriver driver, WebElement element) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true);", element);
    }

    public static void performDragAndDrop2(WebDriver driver, WebElement source, WebElement target) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        String script = "var source = arguments[0];"
                        + "var target = arguments[1];"
                        + "var dataTransfer = new DataTransfer();"
                        + "var event = new DragEvent('dragstart', {bubbles: true, cancelable: true, dataTransfer: dataTransfer});"
                        + "source.dispatchEvent(event);"
                        + "event = new DragEvent('drop', {bubbles: true, cancelable: true, dataTransfer: dataTransfer});"
                        + "target.dispatchEvent(event);"
                        + "event = new DragEvent('dragend', {bubbles: true, cancelable: true, dataTransfer: dataTransfer});"
                        + "source.dispatchEvent(event);";
        js.executeScript(script, source, target);
    }

    public static void actionsDragAndDropByCoordinates2(WebElement source, WebElement target) {
        Actions actions = new Actions(((DriverFactory) source).getDriver());
        actions.clickAndHold(source)
               .moveToElement(target)
               .release(target)
               .build()
               .perform();
    }
    
    
    // ########################################################
    // ######## INTERACTION - SELECTABLE - DAFAULT ########
    // ########################################################
    
    public static void clica_Selectable_Alternado () throws InterruptedException {
        try {
            // Esperar até que os elementos estejam presentes
            WebDriverWait wait = new WebDriverWait(getDriver(), 10);

            // Definir os XPaths dos elementos
            String[] xpaths = {
                "//li[@class='ui-widget-content' and .//b[text()='Sakinalium - Readability']]",
                "//li[@class='ui-widget-content' and .//b[text()='Sakinalium - Method Chaining']]",
                "//li[@class='ui-widget-content' and .//b[text()='Sakinalium - Extent Reports']]",
                "//li[@class='ui-widget-content' and .//b[text()='Sakinalium - Functional Testing']]"
            };

            // Criar uma instância de JavascriptExecutor
            JavascriptExecutor js = (JavascriptExecutor) getDriver();

            // Adicionar a classe de seleção usando JavaScript
            for (String xpath : xpaths) {
                try {
                    WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpath)));
                    System.out.println("Elemento encontrado: " + element.getText());

                    // Adicionar a classe de seleção ao elemento
                    js.executeScript("arguments[0].classList.add('selected');", element);

                    // Adicione uma pausa se necessário
                    Thread.sleep(2000); // Pausa de 2 segundos

                } catch (Exception e) {
                    System.out.println("Não foi possível encontrar ou modificar o elemento com XPath: " + xpath);
                    e.printStackTrace();
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // Fechar o navegador
            //driver.quit();
        }
    }
    
    public void clica_Selectable() throws InterruptedException {
        clicarXpath("/html/body/header/nav/div/div[2]/ul/li[6]/ul/li[2]/a");
    }
    
    
    // ########################################################
    // ######## INTERACTION - SELECTABLE - DAFAULT ########
    // ########################################################
    
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
    
    
    // ########################################################
    // ######## INTERACTION RESIZABLE ########
    // ########################################################
          
    public void clica_Resizable() throws InterruptedException {
        clicarXpath("/html/body/header/nav/div/div[2]/ul/li[6]/ul/li[3]/a");
    }
    
    public void clica_Move_Resizable() throws InterruptedException {//getDriver()
        try {
            // Esperar até que o elemento esteja presente
            WebDriverWait wait = new WebDriverWait(getDriver(), 10);
            WebElement elementToDrag = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/section/div[1]/div/div/div/div/div[3]")));

            // Criar uma instância de Actions
            Actions actions = new Actions(getDriver());

         // Calcular deslocamento em pixels
            int moveX = (int) (10 * 37.8); // 10 cm para a direita
            int moveY = (int) (3 * 37.8);  // 3 cm para baixo

            // Clicar e arrastar para a direita e para baixo
            actions.clickAndHold(elementToDrag)
                   .moveByOffset(moveX, moveY) // Ajuste conforme necessário
                   .release()
                   .build()
                   .perform();


        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // Fechar o navegador
            //driver.quit();
        }
    }
    
        
    // ########################################################
    // ######## VIDEO ########
    // ########################################################
    
    public void clicaMenu_Video() throws InterruptedException {
        clicarXpath("/html/body/header/nav/div/div[2]/ul/li[7]/a");
    }
    
    public void clica_Youtube() throws InterruptedException {
        clicarXpath("/html/body/header/nav/div/div[2]/ul/li[7]/ul/li[1]/a");
    }
    
    public void clica_Vimeo() throws InterruptedException {
        clicarXpath("/html/body/header/nav/div/div[2]/ul/li[7]/ul/li[2]/a");
    }
    
    
    // ########################################################
    // ######## WYSIWYG - TinyMCE ########
    // ########################################################
    
    public void clica_WYSIWYG() throws InterruptedException {
        clicarXpath("/html/body/header/nav/div/div[2]/ul/li[8]/a");
    }
       
    public void clica_TinyMCE() throws InterruptedException {
        clicarXpath("/html/body/header/nav/div/div[2]/ul/li[8]/ul/li[1]/a");
    }
    
    public void send_TinyMCE(String text) throws InterruptedException {
      //### AQUI EU ESPERO APARECER PARA EU ESCREVER "tESTE" ################# 
        WebDriverWait wait = new WebDriverWait(getDriver(), 10);// 10 segundos
        WebElement elemento = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/section/div[1]/div/div/textarea")));
        elemento.sendKeys("Teste");
    }
    
    public void clica_TinyMCELeiaMais() throws InterruptedException {
        clicarXpath("/html/body/section/div[1]/div/div/div/a/img");
        Thread.sleep(3000);
    }
    
    
    // ########################################################
    // ######## WYSIWYG - CKEditor ########
    // ########################################################
    
    public void clica_CKEditor() throws InterruptedException {
        clicarXpath("/html/body/header/nav/div/div[2]/ul/li[8]/ul/li[2]/a");
    }
    
    public void send_Teste_CKEditor() throws InterruptedException {
        try {
            // Esperar até que o iFrame esteja presente
            WebDriverWait wait = new WebDriverWait(getDriver(), 10);
            WebElement iframe = wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("iframe.cke_wysiwyg_frame")));

            // Alternar para o iFrame
            getDriver().switchTo().frame(iframe);

            // Esperar até que o campo de texto dentro do iFrame esteja visível
            WebElement body = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("body.cke_editable"))); // Ajuste conforme necessário

            // Inserir o texto no editor
            body.sendKeys("Leonardo da MOTTA Teixeira");

            // Executar JavaScript para selecionar o texto
            JavascriptExecutor js = (JavascriptExecutor) getDriver();
            js.executeScript("window.getSelection().removeAllRanges(); " +
                             "var range = document.createRange(); " +
                             "range.selectNodeContents(document.body); " +
                             "window.getSelection().addRange(range);");

            // Voltar para o conteúdo principal
            getDriver().switchTo().defaultContent();

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // Fechar o navegador
            //driver.quit();
        }
    }
    
    
    public void clica_Bold() throws InterruptedException {
        clicarXpath("/html/body/section/div[1]/div/div/div/div/span[1]/span[2]/span[8]/span[3]/a[1]/span[1]\r\n"
                + "");
    }
    
    public void clica_Italico() throws InterruptedException {
        clicarXpath("/html/body/section/div[1]/div/div/div/div/span[1]/span[2]/span[8]/span[3]/a[2]/span[1]\r\n"
                + "");
    }
    
       
    // ########################################################
    // ######## WYSIWYG - SummerNote  ########
    // ########################################################
    
    public void clica_SummerNote() throws InterruptedException {
        clicarXpath("/html/body/header/nav/div/div[2]/ul/li[8]/ul/li[3]/a");
    }
    
    public void select_Text() throws InterruptedException {//getDriver()
        try {
            // Esperar até que o elemento esteja visível
            WebDriverWait wait = new WebDriverWait(getDriver(), 10);
            WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/section/div[1]/div/div/div[2]/div[3]/div[2]/p")));

            // Obter o texto do elemento
            String text = element.getText();
            System.out.println("Texto do elemento: " + text);

            // Se você precisa fazer algo com o texto, como verificar a palavra "Hello Summernote"
            if (text.contains("Hello Summernote")) {
                System.out.println("A palavra 'Hello Summernote' foi encontrada no texto.");
            } else {
                System.out.println("A palavra 'Hello Summernote' não foi encontrada no texto.");
            }
            
            // Executar JavaScript para selecionar o texto do elemento específico
            JavascriptExecutor js = (JavascriptExecutor) getDriver();

            // Adicione um ID temporário ao elemento para facilitar a seleção
            js.executeScript("arguments[0].setAttribute('id', 'tempId');", element);

            js.executeScript("window.getSelection().removeAllRanges(); " +
                             "var range = document.createRange(); " +
                             "var element = document.getElementById('tempId'); " +
                             "range.selectNodeContents(element); " +
                             "window.getSelection().addRange(range);");

            // Remove o ID temporário
            js.executeScript("arguments[0].removeAttribute('id');", element);

            // Voltar para o conteúdo principal
            getDriver().switchTo().defaultContent();

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // Fechar o navegador
            // driver.quit();
        }
    }

    
     public void clica_text_Bold_() throws InterruptedException {
        clicarXpath("/html/body/section/div[1]/div/div/div[2]/div[2]/div[2]/button[1]");
    }
    
    public void clica_text_Font() throws InterruptedException {
        clicarXpath("/html/body/section/div[1]/div/div/div[2]/div[2]/div[3]/div/button");
    }
    
    public void select_text_Font() throws InterruptedException {
        clicarXpath("/html/body/section/div[1]/div/div/div[2]/div[2]/div[3]/div/div/li[9]/a");
    }
    
    public void clica_text_Color() throws InterruptedException {
        clicarXpath("/html/body/section/div[1]/div/div/div[2]/div[2]/div[4]/div/button[2]");
    }
    
    public void select_text_Color() throws InterruptedException {
        clicarXpath("/html/body/section/div[1]/div/div/div[2]/div[2]/div[4]/div/div/li/div[1]/div[3]/div/div[5]/button[8]");
    }
    
    public void clica_text_Centralizar() throws InterruptedException {
        clicarXpath("/html/body/section/div[1]/div/div/div[2]/div[2]/div[5]/div/button");
    }
    
    public void select_text_Centralizar() throws InterruptedException {
        clicarXpath("/html/body/section/div[1]/div/div/div[2]/div[2]/div[5]/div/div/div[1]/button[3]");
    }
    
    public void clica_Fim() throws InterruptedException {
        clicarXpath("/html/body/section/div[1]/div/div/div[2]/div[3]/div[2]/p");
    }
    
    // ########################################################
    // ################ CHARTS ##########################
    // ########################################################
    
    public void clica_Charts() throws InterruptedException {
        clicarXpath("/html/body/header/nav/div/div[2]/ul/li[9]/ul/li[1]/a");
    }
        
    
    // ########################################################
    // ################ DYNAMIC_DATA ##########################
    // ########################################################
    
    public void MORE() throws InterruptedException {
        clicarXpath("/html/body/header/nav/div/div[2]/ul/li[9]/a");
    }
    
    public void DYNAMIC() throws InterruptedException {
        clicarXpath("/html/body/header/nav/div/div[2]/ul/li[9]/ul/li[2]/a");
    }
    
    public void CLICAR_BUTTOM() throws InterruptedException {
        clicarXpath("/html/body/section/div[1]/div/div/div/div[2]/button");
        Thread.sleep(3000);
    }
         
    
    // ########################################################
    // ################### FILE DOWNLOAD ######################
    // ########################################################

    public void clicar_Menu_File_Download() throws InterruptedException {
            clicarXpath("/html/body/header/nav/div/div[2]/ul/li[9]/ul/li[3]/a");
    }
    
    public void send_Download_File(String down) throws InterruptedException {
            escreverSemTroca("/html/body/section/div[1]/div/div/div[2]/div[2]/div/textarea", down);
    }
    
    public void clicar_Gerar_File_Download() throws InterruptedException {
            clicarXpath("/html/body/section/div[1]/div/div/div[2]/div[2]/button");
    }
            
    public void clicar_Download_File_Gerado() throws InterruptedException {
            clicarXpath("/html/body/section/div[1]/div/div/div[2]/div[2]/a");
    }

    
    // ########################################################
    // ################### UP LOAD ##########################
    // ########################################################
    
    public void clicaFileUpload() {
            try {
                // Encontre o elemento de input do tipo file
                WebElement uploadElement = getDriver().findElement(By.xpath("/html/body/section/div[1]/div/div/div[1]"));

                // Defina o caminho do arquivo que você deseja fazer upload
                String filePath = "C:\\Leonardo\\package_lock.json";

                // Envie o caminho do arquivo para o elemento de input
                uploadElement.sendKeys(filePath);

                // Opcional: você pode clicar no botão de enviar, se necessário
                // WebElement submitButton = driver.findElement(By.id("submit"));
                // submitButton.click();

                // Adicione uma pausa para ver o resultado (opcional)
                Thread.sleep(5000);
            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                // Feche o WebDriver
            
            }
    }
    
    
    public void remover_UpLoad() throws InterruptedException {
        clicarXpath("/html/body/section/div[1]/div/div/div[1]/button[1]");
    }

    public void send_Download_PDF(String down) throws InterruptedException {
        escreverSemTroca("/html/body/section/div[1]/div/div/div[3]/div[2]/div/textarea", down);
    }
        
    public void clicar_Gerar_PDF() throws InterruptedException {
        clicarXpath("/html/body/section/div[1]/div/div/div[3]/div[2]/button");
    }
                
    public void clicar_Download_PDF_Gerado() throws InterruptedException {
        clicarXpath("/html/body/section/div[1]/div/div/div[3]/div[2]/a");
    }
    
    
    // ########################################################    
    // ################### JQUERY PROGRESSBAR ##########################
    // ########################################################
    
    public void clica_CodeMirror() throws InterruptedException {
        clicarXpath("/html/body/header/nav/div/div[2]/ul/li[8]/ul/li[4]/a");
    }
    
    public void clica_Para_Escrever() throws InterruptedException {
        clicarXpath("/html/body/section/div[1]/div/div/div/div[6]/div[1]/div/div/div/div[5]/div/pre");
    }
    
    public void escrever_Texto_CodeMirror() throws InterruptedException {
        try {
            // Encontrar o elemento onde o texto será inserido
            WebElement element = getDriver().findElement(By.xpath("/html/body/section/div[1]/div/div/div/div[6]/div[1]/div/div/div/div[5]/div/pre"));

            // Inserir o texto com a formatação desejada usando JavaScript
            String formattedText = "Leonardo da Motta Teixeira\n" +
                                   "\t\tLeonardo da Motta\n" +
                                   "Teixeira\n" +
                                   "\tMotta Teixeira\n" +
                                   "\t\t\t\tLeonardo, usando";

            JavascriptExecutor js = (JavascriptExecutor) getDriver();
            js.executeScript("arguments[0].textContent = arguments[1];", element, formattedText);

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // Fechar o navegador
            // driver.quit();
        }
    }
        
    
    public void clica_Menu_More() throws InterruptedException {
        clicarXpath("/html/body/header/nav/div/div[2]/ul/li[9]/a");
    }
    
    public void clica_UpLoad() throws InterruptedException {
            clicarXpath("/html/body/header/nav/div/div[2]/ul/li[9]/ul/li[4]/a");
    }    
  
    // ########################################################    
    // ################### JQUERY PROGRESSBAR ##########################
    // ########################################################
        
    public void clica_JQuery() throws InterruptedException {
            clicarXpath("/html/body/header/nav/div/div[2]/ul/li[9]/ul/li[5]/a");
    }
        
    public void clica_Iniciar_Barra_Progress() throws InterruptedException {
            clicarXpath("/html/body/section/div[1]/div/div/button");
    }
        
    public void clica_Fechar_Barra_Progress() throws InterruptedException {
            clicarXpath("/html/body/div/div[3]/div/button");
    }


    // ########################################################
    // ################### LOADER TEST ##########################
    // ########################################################
        
    public void clica_LOADER_TEST() throws InterruptedException {
            clicarXpath("/html/body/header/nav/div/div[2]/ul/li[9]/ul/li[6]/a");
    }
        
    //### AQUI EU ESPERO APARECER PARA CLICAR ################# 
    public void clica_Run() throws InterruptedException {
            WebDriverWait wait = new WebDriverWait(getDriver(), 5);
            WebElement elemento = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/section/div[1]/div/div/div/div[2]/button")));
            elemento.click();
    }
        
    //### AQUI EU ESPERO APARECER PARA CLICAR ################# 
    public void clica_Run_Closed() throws InterruptedException {
            WebDriverWait wait = new WebDriverWait(getDriver(), 20);
            WebElement elemento = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/section/div[1]/div/div/div/div[2]/div/div/div/div[3]/button[1]")));
            elemento.click();
    }        
        
    // ########################################################   
    // ################### MODALS ##########################
    // ########################################################
        
    public void clica_MODALS() throws InterruptedException {
           clicarXpath("/html/body/header/nav/div/div[2]/ul/li[9]/ul/li[7]/a");
    }
        
    public void clica_Bootstrap_MODALS() throws InterruptedException {
            clicarXpath("/html/body/section/div[1]/div[1]/div/div[2]/a");
    }
        
    public void clica_Fechar_Bootstrap_MODALS() throws InterruptedException {
            clicarXpath("/html/body/section/div[1]/div[1]/div/div[2]/div/div/div/div[3]/button[1]");
    }        
                
    public void clica_Multiple_MODALS() throws InterruptedException {
            clicarXpath("/html/body/section/div[1]/div[2]/div/div[2]/a");
    }
        
    public void clica_launch_MODALS() throws InterruptedException {
           clicarXpath("/html/body/section/div[1]/div[2]/div/div[2]/div[1]/div/div/div[3]/a");
    }
        
    public void clica_fechar_launch_MODALS() throws InterruptedException {
            clicarXpath("/html/body/section/div[1]/div[2]/div/div[2]/div[2]/div/div/div[6]/a[1]");
    }
         
    public void clica_fechar_Primeiro_launch_MODALS() throws InterruptedException {
            clicarXpath("/html/body/section/div[1]/div[2]/div/div[2]/div[1]/div/div/div[4]/a[1]");
    }        
                
    // ########################################################       
    // ################### PROGRESS BAR ##########################
    // ########################################################
        
    public void clica_PROGRESS_BAR() throws InterruptedException {
            clicarXpath("/html/body/header/nav/div/div[2]/ul/li[9]/ul/li[8]/a");
    }

    public void clica_Start_PROGRESS_BAR() throws InterruptedException {
            clicarXpath("/html/body/section/div[1]/div/div/button");
    }
        
    // ########################################################   
    // ################### ENCERRAR ##########################
    // ########################################################
        
    public void encerra() throws InterruptedException {
            getDriver().close();
    }
    
}    