package br.com.gerenciadorlocacoes.repository;
import br.com.gerenciadorlocacoes.entity.ContratoEntity;

public interface ContratoRepository {

    void criarContrato (ContratoEntity contrato);
    void editarContrato (ContratoEntity contrato);
    void removerContrato (ContratoEntity contrato);
    void listarContratos(ContratoEntity contrato);
    void listarContrato(int id);
}
