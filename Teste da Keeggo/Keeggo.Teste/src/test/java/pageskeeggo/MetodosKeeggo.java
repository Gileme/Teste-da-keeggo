package pageskeeggo;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MetodosKeeggo {
	
	
WebDriver driver;
	
	
	public void abrirNavegador(String Url) {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(Url);
		driver.manage().window().maximize();
		
	}

         public void clicar(By elemento, String string) {
        	 
        	 driver.findElement(elemento).click();
         }
         
public void pausa (int tempo)  throws InterruptedException {
	
	Thread.sleep(tempo);

}

     public void preencher (By elemento, String texto) throws InterruptedException {
	
	driver.findElement(elemento).sendKeys(texto);
	
}
	
     public void screenshot(String nome) throws IOException {
    	
    	 TakesScreenshot srcShot = ((TakesScreenshot)driver);
    	 File SrcFile = srcShot.getScreenshotAs(OutputType.FILE);
    	 File DestFile = new File("./src/evidencias/" + nome + ".png");
    	 FileUtils.copyFile(SrcFile, DestFile);
    	 
     
	}

     
     public void fecharNavegador() {
    	 
    	 driver.quit();
     }
}
