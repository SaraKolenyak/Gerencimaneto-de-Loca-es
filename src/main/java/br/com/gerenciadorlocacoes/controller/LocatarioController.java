package br.com.gerenciadorlocacoes.controller;
import br.com.gerenciadorlocacoes.domain.Locatario;
import br.com.gerenciadorlocacoes.service.LocatarioService;

import java.util.List;

public class LocatarioController {

    private final LocatarioService locatarioService;

    public LocatarioController(LocatarioService locatarioService) {
        this.locatarioService = locatarioService;
    }

    public void criarlocatario (Locatario locatario){
        locatarioService.criarlocatario(locatario);
    }
    public void editarlocatario (Locatario locatario){
        locatarioService.editarlocatario(locatario);
    }
    public void removerlocatario (Locatario locatario){
        locatarioService.removerlocatario(locatario);
    }
    public List<Locatario> listarLocatarios(){
        return locatarioService.listarLocatarios();
    }
    public Locatario listarLocatario(int id){
        return locatarioService.listarLocatario(id);
    }
}
