package com.qaautomation.test;

import com.qaautomation.pages.LoginPage;
import com.qaautomation.model.Usuario;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class LoginTest {
	
	@Test
	void deveLogarComSucesso() {
		Usuario usuario = new Usuario("standard_user", "secret_sauce");
		
		WebDriver driver = new ChromeDriver();
		LoginPage loginPage = new LoginPage(driver);
		
		loginPage.abrir();
		loginPage.preencherUsuario(usuario.getNome());
		loginPage.preencherSenha(usuario.getSenha());
		loginPage.clicarEntrar();
		
		assertTrue(driver.getCurrentUrl().contains("inventory"));
		
		driver.quit();
	}

}
