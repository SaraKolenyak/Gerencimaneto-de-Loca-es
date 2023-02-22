package br.com.gerenciadorlocacoes.controller;
import br.com.gerenciadorlocacoes.domain.Contrato;
import br.com.gerenciadorlocacoes.service.ContratoService;

import java.util.List;

public class ContratoController {

    private final ContratoService contratoService;

    public ContratoController(ContratoService contratoService) {
        this.contratoService = contratoService;
    }

    public void criarContrato (Contrato contrato){
        contratoService.criarContrato(contrato);
    }
    public void editarContrato (Contrato contrato){
        contratoService.editarContrato(contrato);
    }
    public void removerContrato (Contrato contrato){
        contratoService.removerContrato(contrato);
    }
    public List<Contrato> listarContratos(){
        return contratoService.listarContratos();
    }
    public Contrato listarContrato(int id){
        return contratoService.listarContrato(id);
    }
}
