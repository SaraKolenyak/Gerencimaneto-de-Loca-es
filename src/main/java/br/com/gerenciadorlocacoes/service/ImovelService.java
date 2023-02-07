package br.com.gerenciadorlocacoes.service;
import br.com.gerenciadorlocacoes.domain.Imovel;
import br.com.gerenciadorlocacoes.repository.ImovelRepository;

public class ImovelService {

    private ImovelRepository imovelRepository;

    public void setImovelRepository(ImovelRepository imovelRepository) {
        this.imovelRepository = imovelRepository;
    }

    public ImovelRepository getImovelRepository() {
        return imovelRepository;
    }

    void criarImovel(Imovel imovel){}
    void editarImovel(Imovel imovel){}
    void removerImovel(){}
    void listarImoveis(){}
    void listarimovel(int id){}
}
