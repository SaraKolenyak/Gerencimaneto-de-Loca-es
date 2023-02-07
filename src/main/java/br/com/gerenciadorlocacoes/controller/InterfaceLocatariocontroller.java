package br.com.gerenciadorlocacoes.controller;
import br.com.gerenciadorlocacoes.domain.Locatario;

public interface InterfaceLocatariocontroller {

    void criarlocatario (Locatario locatario);
    void editarlocatario (Locatario locatario);
    void removerlocatario (Locatario locatario);
    void listarLocatarios();
    void listarLocatario(int id);

}
