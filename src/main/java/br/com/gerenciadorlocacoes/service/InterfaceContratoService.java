package br.com.gerenciadorlocacoes.service;

import br.com.gerenciadorlocacoes.domain.Contrato;

public interface InterfaceContratoService {

    void criarContrato (Contrato contrato);
    void editarContrato (Contrato contrato);
    void removerContrato (Contrato contrato);
    void listarContrato();
    void listarContrato(int id);
}
