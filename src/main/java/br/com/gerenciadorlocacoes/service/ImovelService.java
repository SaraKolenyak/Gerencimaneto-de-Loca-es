package br.com.gerenciadorlocacoes.service;
import java.util.List;

import br.com.gerenciadorlocacoes.domain.Imovel;

public interface ImovelService {

    void criarImovel(Imovel imovel);
    void editarImovel(Imovel imovel);
    void removerImovel(Imovel imovel);
    List<Imovel> listarImoveis();
    Imovel listarimovel(int id);
}
