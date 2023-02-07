package br.com.gerenciadorlocacoes.repository;
import br.com.gerenciadorlocacoes.entity.ContratoEntity;

public interface InterfaceContratoRepository {

    void criarContrato (ContratoEntity contrato);
    void editarContrato (ContratoEntity contrato);
    void removerContrato (ContratoEntity contrato);
    void listarContrato();
    void listarContrato(int id);
}
