package Pages;

import org.junit.Test;

import core.BasePage;


public class TaskPage extends BasePage {
	
	
	public void clicarnobotaonewtask() {
		clickradio("insert-button");
	}
	
	public void preenchecampos() {
		
		escrever("title", "GLAUCIA PELAQUIN");
		escrever("duedate", "28/09/1971");
		escrever("//*[@class = 'bootstrap-tagsinput form-control']//input", "Teste");
		clickradio("form-submit-button");
		
	}
	

}
