package com.qaautomation.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
	
	private WebDriver driver;
	
	private By campoUsuario = By.id("user-name");
	private By campoSenha = By.id("password");
	private By botaoEntrar = By.id("login-button");
	

	public LoginPage (WebDriver driver) {
		this.driver = driver;
	}
	
	public void abrir() {
		driver.get("https://www.saucedemo.com");
	}
	
	public void preencherUsuario(String usuario) {
		WebElement campo = driver.findElement(campoUsuario);
		campo.sendKeys(usuario);
	}
	
	public void preencherSenha(String senha) {
		WebElement campo = driver.findElement(campoSenha);
		campo.sendKeys(senha);
	}
	
	public void clicarEntrar() {
		driver.findElement(botaoEntrar).click();
	}
	
}
