package com.qaautomation.model;

public class UsuarioAdmin extends Usuario {

    private String nivelAcesso;

    public UsuarioAdmin(String nome, String senha, String nivelAcesso) {
        super(nome, senha);
        this.nivelAcesso = nivelAcesso;
    }

    public String getNivelAcesso() {
        return nivelAcesso;
    }

    @Override
    public void exibirDados() {
        super.exibirDados();
        System.out.println("Nível de acesso: " + nivelAcesso);
    }
}
