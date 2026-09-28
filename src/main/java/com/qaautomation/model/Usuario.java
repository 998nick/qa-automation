package com.qaautomation.model;

public class Usuario {

    private String nome;
    private String senha;

    public Usuario(String nome, String senha) {
        this.nome = nome;
        this.senha = senha;
    }

    public String getNome() {
        return nome;
    }

    public String getSenha() {
        return senha;
    }

    public void exibirDados() {
        System.out.println("Nome: " + nome + " | Senha: " + senha);
    }
}
