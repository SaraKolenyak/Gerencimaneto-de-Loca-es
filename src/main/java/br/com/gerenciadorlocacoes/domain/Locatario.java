package br.com.gerenciadorlocacoes.domain;

public class Locatario {

    private String nome;
    private int celular;

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCelular(int celular) {
        this.celular = celular;
    }

    public String getNome() {
        return nome;
    }

    public int getCelular() {
        return celular;
    }
}
