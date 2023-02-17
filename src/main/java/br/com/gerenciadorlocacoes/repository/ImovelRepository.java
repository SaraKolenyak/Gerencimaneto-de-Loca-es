package br.com.gerenciadorlocacoes.repository;
import br.com.gerenciadorlocacoes.entity.ImovelEntity;

public interface ImovelRepository {

    void criarImovel(ImovelEntity imovel);
    void editarImovel(ImovelEntity imovel);
    void removerImovel(ImovelEntity imovel);
    void listarImoveis(ImovelEntity imovel);
    void listarimovel(int id);
}
