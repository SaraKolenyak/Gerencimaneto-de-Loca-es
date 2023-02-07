package br.com.gerenciadorlocacoes.controller;
import br.com.gerenciadorlocacoes.domain.Imovel;
import br.com.gerenciadorlocacoes.service.ImovelService;

public class ImovelController {

    private ImovelService imovelService;

    public void setImovelService(ImovelService imovelService) {
        this.imovelService = imovelService;
    }

    public ImovelService getImovelService() {
        return imovelService;
    }

    void criarImovel(Imovel imovel){}
    void editarImovel(Imovel imovel){}
    void removerImovel(Imovel imovel){}
    void listarImoveis(){}
    void listarimovel(int id){}
}
