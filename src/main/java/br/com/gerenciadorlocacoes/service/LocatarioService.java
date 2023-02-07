package br.com.gerenciadorlocacoes.service;
import br.com.gerenciadorlocacoes.domain.Locatario;
import br.com.gerenciadorlocacoes.repository.LocatarioRepository;

public class LocatarioService {

    private LocatarioRepository locatarioRepository;

    public void setLocatarioRepository(LocatarioRepository locatarioRepository) {
        this.locatarioRepository = locatarioRepository;
    }

    public LocatarioRepository getLocatarioRepository() {
        return locatarioRepository;
    }

    void criarlocatario (Locatario locatario){}
    void editarlocatario (Locatario locatario){}
    void removerlocatario (Locatario locatario){}
    void listarLocatarios(){}
    void listarLocatario(int id){}

}
