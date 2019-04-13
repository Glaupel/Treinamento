package Pages;

import org.openqa.selenium.By;

import core.BasePage;

public class Inicializacao extends BasePage {
	
	public void abrirsite() {
		abrirurl("https://mark7.herokuapp.com/login");
		
	}
	
	  public void logar( )  {
	    	escrever(By.id("login_email"), "glaupel17@hotmail.com");
	    	escrever(By.id("login_password"),"pelaca15");
	    	criarbotaoxpath(By.xpath("//*[.='Login']") );
	    	
	    }
}
