package br.com.gerenciadorlocacoes.service;

import br.com.gerenciadorlocacoes.domain.Locatario;

public interface InterfaceLocatarioService {

    void criarlocatario (Locatario locatario);
    void editarlocatario (Locatario locatario);
    void removerlocatario (Locatario locatario);
    void listarLocatarios();
    void listarLocatario(int id);
}
