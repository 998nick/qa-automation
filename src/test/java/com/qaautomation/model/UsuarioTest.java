package com.qaautomation.model;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class UsuarioTest {

    @Test
    void deveCriarUsuarioComNomeESenhaCorretos() {
        Usuario usuario = new Usuario("diego", "1234");

        assertEquals("diego", usuario.getNome());
        assertEquals("1234", usuario.getSenha());
    }

    @Test
    void usuarioAdminDeveHerdarDadosDeUsuario() {
        UsuarioAdmin admin = new UsuarioAdmin("diego", "1234", "superadmin");

        assertEquals("diego", admin.getNome());
        assertEquals("superadmin", admin.getNivelAcesso());
    }
}
