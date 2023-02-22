package br.com.gerenciadorlocacoes.service;

import br.com.gerenciadorlocacoes.domain.Locatario;
import java.util.List;

public interface LocatarioService {

    void criarlocatario (Locatario locatario);
    void editarlocatario (Locatario locatario);
    void removerlocatario (Locatario locatario);
    List<Locatario> listarLocatarios();
    Locatario listarLocatario(int id);
}
