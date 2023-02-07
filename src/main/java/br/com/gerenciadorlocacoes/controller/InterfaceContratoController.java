package br.com.gerenciadorlocacoes.controller;
import br.com.gerenciadorlocacoes.domain.Contrato;

public interface InterfaceContratoController {

    void criarContrato (Contrato contrato);
    void editarContrato (Contrato contrato);
    void removerContrato (Contrato contrato);
    void listarContrato();
    void listarContrato(int id);

}
