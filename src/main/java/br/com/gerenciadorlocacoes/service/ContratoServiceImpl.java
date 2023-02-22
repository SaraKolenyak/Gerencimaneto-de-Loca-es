package br.com.gerenciadorlocacoes.service;
import br.com.gerenciadorlocacoes.domain.Contrato;
import br.com.gerenciadorlocacoes.repository.ContratoRepository;

import java.util.List;

public class ContratoServiceImpl implements ContratoService {

    private final ContratoRepository contratoRepository;

    public ContratoServiceImpl(ContratoRepository contratoRepository) {
        this.contratoRepository = contratoRepository;
    }


    @Override
    public void criarContrato (Contrato contrato){

    }

    @Override
    public void editarContrato (Contrato contrato){

    }

    @Override
    public void removerContrato (Contrato contrato) {

    }

    @Override
    public List<Contrato> listarContratos(){
        return null;
    }

    @Override
    public Contrato listarContrato(int id){

        return null;
    }
}
