package br.com.gerenciadorlocacoes.repository;
import br.com.gerenciadorlocacoes.entity.LocatarioEntity;

public interface InterfaceLocatarioRepository {

    void criarlocatario (LocatarioEntity locatario);
    void editarlocatario (LocatarioEntity locatario);
    void removerlocatario (LocatarioEntity locatario);
    void listarLocatarios();
    void listarLocatario(int id);
}
