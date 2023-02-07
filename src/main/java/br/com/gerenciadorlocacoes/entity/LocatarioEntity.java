package br.com.gerenciadorlocacoes.entity;

public class LocatarioEntity {

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
