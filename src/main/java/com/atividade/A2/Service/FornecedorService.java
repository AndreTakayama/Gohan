package com.atividade.A2.Service;

import com.atividade.A2.Model.Fornecedor;
import com.atividade.A2.Repository.IFornecedorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FornecedorService {

    @Autowired
    private IFornecedorRepository fornecedorRepository;

    public List<Fornecedor> listarFornecedores() {
        return fornecedorRepository.findAll();
    }

    public Fornecedor salvarFornecedor(Fornecedor fornecedor) {
        return fornecedorRepository.save(fornecedor);
    }

    public Fornecedor obterFornecedorPorId(Long id) {
        return fornecedorRepository.findById(id).orElse(null);
    }

    public void excluirFornecedor(Long id) {
        fornecedorRepository.deleteById(id);
    }
}
