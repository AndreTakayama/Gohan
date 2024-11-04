package com.atividade.A2.Service;


import com.atividade.A2.Model.Cliente;
import com.atividade.A2.Repository.IClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ClienteService {

    @Autowired
    private IClienteRepository clienteRepository;

    // Método para salvar um cliente
    public Cliente salvarCliente(Cliente cliente) {
        return clienteRepository.save(cliente);
    }

    // Método para buscar um cliente pelo ID
    public Optional<Cliente> buscarClientePorId(Long id) {
        return clienteRepository.findById(id);
    }

    // Método para buscar todos os clientes
    public List<Cliente> buscarTodosClientes() {
        return clienteRepository.findAll();
    }

    // Método para atualizar um cliente
    public Cliente atualizarCliente(Cliente cliente) {
        if (clienteRepository.existsById(cliente.getCodigo())) {
            return clienteRepository.save(cliente);
        }
        throw new IllegalArgumentException("Cliente não encontrado.");
    }

    // Método para deletar um cliente pelo ID
    public void deletarCliente(Long id) {
        clienteRepository.deleteById(id);
    }
}

