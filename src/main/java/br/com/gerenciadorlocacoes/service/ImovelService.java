package br.com.gerenciadorlocacoes.service;
import br.com.gerenciadorlocacoes.domain.Imovel;

public interface InterfaceImovelService {

    void criarImovel(Imovel imovel);
    void editarImovel(Imovel imovel);
    void removerImovel(Imovel imovel);
    void listarImoveis(Imovel imovel);
    void listarimovel(int id);
}
