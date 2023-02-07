package br.com.gerenciadorlocacoes.controller;
import br.com.gerenciadorlocacoes.domain.Locatario;
import br.com.gerenciadorlocacoes.service.LocatarioService;

public class LocatarioController {

    private LocatarioService locatarioService;

    public void setLocatarioService(LocatarioService locatarioService) {
        this.locatarioService = locatarioService;
    }

    public LocatarioService getLocatarioService() {
        return locatarioService;
    }

    void criarlocatario (Locatario locatario){}
    void editarlocatario (Locatario locatario){}
    void removerlocatario (Locatario locatario){}
    void listarLocatarios(){}
    void listarLocatario(int id){}
}
