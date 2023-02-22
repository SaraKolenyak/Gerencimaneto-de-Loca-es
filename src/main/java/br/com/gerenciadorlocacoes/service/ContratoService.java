package br.com.gerenciadorlocacoes.service;

import br.com.gerenciadorlocacoes.domain.Contrato;
import java.util.List;

public interface ContratoService {

    void criarContrato (Contrato contrato);
    void editarContrato (Contrato contrato);
    void removerContrato (Contrato contrato);
    List<Contrato> listarContratos();
    Contrato listarContrato(int id);

}
