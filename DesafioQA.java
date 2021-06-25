package testes;

import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DesafioQA {
	
	private WebDriver driver;
	
	@Before
	public void setUp() {
		System.setProperty("webdriver.chrome.driver","E:\\Arquivos de Programas\\Java Development\\ChromeDriver.exe");
		driver = new ChromeDriver();
		driver.get("https://opentdb.com/");
	}

	@Test
	public void buscaQuestaoInexistente() {
		
		/*
		Funcionalidade: Busca no Banco de Questões.
		Cenário: Busca por questão inexistente.
		Dado que navego para a página de busca do banco de questões
		E digito 'Science: Computers' no campo de busca
		Quando clico no botão de buscar
		Então visualizo uma mensagem de erro com o texto 'No questions found.'
		 */
		
		driver.findElement(By.xpath("//*[@id=\"page-top\"]/section/div/div/div/a[1]")).click(); 						//Click em Browser.
		
		Select options = new Select (driver.findElement(By.id("type")));	
        options.selectByVisibleText("Question");																		//Seleciona "Question" em lista.
        
        driver.findElement(By.xpath("//*[@id=\"query\"]")).sendKeys("Science: Computers");								//Insere o texto no campo de busca.
        driver.findElement(By.xpath("//*[@id=\"page-top\"]/div[1]/form/div/button")).click();							//Click em Search.
        
        WebElement result = driver.findElement(By.xpath("//*[@id=\"page-top\"]/div[2]/div"));
        assertTrue(result.getText().contains("No questions found."));        
	}
  
	@Test
    	public void buscaListagemDeCategorias() {

        /*
        Funcionalidade: Busca no Banco de Categorias.
          Cenário: Busca por quantidade de questões.
          Dado que navego para a página de busca do banco de categorias
          E digito 'Science: Computers' no campo de busca
          Quando clico no botão de buscar
          Então visualizo a listagem com 25 itens e o controle de paginação.
        /

        driver.findElement(By.xpath("//[@id="page-top"]/section/div/div/div/a[1]")).click();                         //Click em Browser.
        Select options = new Select (driver.findElement(By.id("type")));
        options.selectByVisibleText("Category");                                                                        //Seleciona "Category" em lista.
        driver.findElement(By.xpath("//[@id="query"]")).sendKeys("Science: Computers");                                //Insere o texto no campo de busca.
        driver.findElement(By.xpath("//[@id="page-top"]/div[1]/form/div/button")).click();                            //Click em Search.

        int verifyList = driver.findElements(By.xpath("//[@id="page-top"]/div[2]/table/tbody/tr")).size();
        assertEquals(verifyList, 25);                                                                                    //Verifica os 25 itens da listagem.

        WebElement confirmPagination = driver.findElement(By.xpath("//[@id="page-top"]/div[2]/center/ul"));
        assertTrue(confirmPagination.isDisplayed());                                                                    //Verifica se paginação é exibido.
    }
