package br.com.gerenciadorlocacoes.controller;
import br.com.gerenciadorlocacoes.domain.Contrato;
import br.com.gerenciadorlocacoes.service.ContratoService;

public class ContratoController {

    private ContratoService contratoService;

    public void setContratoService(ContratoService contratoService) {
        this.contratoService = contratoService;
    }

    public ContratoService getContratoService() {
        return contratoService;
    }

    void criarContrato (Contrato contrato){}
    void editarContrato (Contrato contrato){}
    void removerContrato (Contrato contrato){}
    void listarContrato(){}
    void listarContrato(int id){}
}
