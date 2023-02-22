package br.com.gerenciadorlocacoes.service;
import br.com.gerenciadorlocacoes.domain.Locatario;
import br.com.gerenciadorlocacoes.repository.LocatarioRepository;

import java.util.List;

public class LocatarioServiceImpl implements LocatarioService {

    private final LocatarioRepository locatarioRepository;

    public LocatarioServiceImpl(LocatarioRepository locatarioRepository) {
        this.locatarioRepository = locatarioRepository;
    }

    @Override
    public void criarlocatario (Locatario locatario){}

    @Override
    public void editarlocatario (Locatario locatario){}

    @Override
    public void removerlocatario (Locatario locatario){}

    @Override
    public List<Locatario> listarLocatarios(){
        return null;
    }

    @Override
    public Locatario listarLocatario(int id){
        return null;
    }

}
