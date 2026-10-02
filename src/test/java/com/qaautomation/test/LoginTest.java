package com.qaautomation.test;

import com.qaautomation.pages.LoginPage;
import com.qaautomation.base.BaseTest;
import com.qaautomation.model.Usuario;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;


public class LoginTest  extends BaseTest{
	
	@Test
	void deveLogarComSucesso() {
		Usuario usuario = new Usuario("standard_user", "secret_sauce");
		LoginPage loginPage = new LoginPage(driver);
		
		
		loginPage.abrir();
		loginPage.preencherUsuario(usuario.getNome());
		loginPage.preencherSenha(usuario.getSenha());
		loginPage.clicarEntrar();
		
		assertTrue(driver.getCurrentUrl().contains("inventory"));
		
		driver.quit();
	}

}
