package br.com.gerenciadorlocacoes.repository;
import br.com.gerenciadorlocacoes.entity.LocatarioEntity;

public interface LocatarioRepository {

    void criarlocatario (LocatarioEntity locatario);
    void editarlocatario (LocatarioEntity locatario);
    void removerlocatario (LocatarioEntity locatario);
    void listarLocatarios(LocatarioEntity locatario);
    void listarLocatario(int id);
}
