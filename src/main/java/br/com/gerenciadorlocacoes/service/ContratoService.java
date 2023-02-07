package br.com.gerenciadorlocacoes.service;
import br.com.gerenciadorlocacoes.domain.Contrato;
import br.com.gerenciadorlocacoes.repository.ContratoRepository;

public class ContratoService {

    private ContratoRepository contratoRepository;

    public void setContratoRepository(ContratoRepository contratoRepository) {
        this.contratoRepository = contratoRepository;
    }

    public ContratoRepository getContratoRepository() {
        return contratoRepository;
    }

    void criarContrato (Contrato contrato){}
    void editarContrato (Contrato contrato){}
    void removerContrato (Contrato contrato){}
    void listarContrato(){}
    void listarContrato(int id){}
}
