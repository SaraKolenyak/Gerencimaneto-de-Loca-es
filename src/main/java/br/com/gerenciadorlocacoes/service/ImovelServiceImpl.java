package br.com.gerenciadorlocacoes.service;
import java.util.List;

import br.com.gerenciadorlocacoes.domain.Imovel;
import br.com.gerenciadorlocacoes.repository.ImovelRepository;

public class ImovelServiceImpl implements ImovelService {

    private final ImovelRepository imovelRepository;


    public ImovelServiceImpl(ImovelRepository imovelRepository) {
        this.imovelRepository = imovelRepository;
    }

    @Override
    public void criarImovel(Imovel imovel) {

    }

    @Override
    public void editarImovel(Imovel imovel) {

    }

    @Override
    public void removerImovel(Imovel imovel) {

    }

    @Override
    public List<Imovel> listarImoveis() {

        return null;
    }

    @Override
    public Imovel listarimovel(int id) {

        return null;
    }
}
