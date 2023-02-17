package br.com.gerenciadorlocacoes.controller;
import java.util.List;

import br.com.gerenciadorlocacoes.domain.Imovel;
import br.com.gerenciadorlocacoes.service.ImovelService;

public class ImovelController {

    private final ImovelService imovelService;

    public ImovelController(ImovelService imovelService) {
        this.imovelService = imovelService;
    }

    public void criarImovel(Imovel imovel){
        imovelService.criarImovel(imovel);
    }
    public void editarImovel(Imovel imovel){
        imovelService.editarImovel(imovel);
    }
    public void removerImovel(Imovel imovel){
        imovelService.removerImovel(imovel);
    }
    public List<Imovel> listarImoveis(){
        return imovelService.listarImoveis();
    }
    public Imovel listarimovel(int id){
        return imovelService.listarimovel(id);
    }
}
