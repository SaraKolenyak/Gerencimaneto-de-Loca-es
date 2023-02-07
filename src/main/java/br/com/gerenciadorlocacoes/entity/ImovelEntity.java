package br.com.gerenciadorlocacoes.entity;

public class ImovelEntity {

    private int id;
    private String apelido;
    private String endereco;

    public void setId(int id) {
        this.id = id;
    }

    public void setApelido(String apelido) {
        this.apelido = apelido;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public int getId() {
        return id;
    }

    public String getApelido() {
        return apelido;
    }

    public String getEndereco() {
        return endereco;
    }
}
