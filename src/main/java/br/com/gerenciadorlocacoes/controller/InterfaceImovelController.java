package br.com.gerenciadorlocacoes.controller;
import br.com.gerenciadorlocacoes.domain.Imovel;

public interface InterfaceImovelController {

    void criarImovel(Imovel imovel);
    void editarImovel(Imovel imovel);
    void removerImovel(Imovel imovel);
    void listarImoveis(Imovel imovel);
    void listarimovel(int id);
}
