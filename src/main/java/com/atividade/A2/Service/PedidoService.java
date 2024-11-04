package com.atividade.A2.Service;

import com.atividade.A2.Model.Pedido;
import com.atividade.A2.Repository.IPedidoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PedidoService {

    @Autowired
    private IPedidoRepository pedidoRepository;

    public List<Pedido> listarPedidos() {
        return pedidoRepository.findAll();
    }

    public Pedido salvarPedido(Pedido pedido) {
        return pedidoRepository.save(pedido);
    }

    public Pedido obterPedidoPorId(Long id) {
        return pedidoRepository.findById(id).orElse(null);
    }

    public void excluirPedido(Long id) {
        pedidoRepository.deleteById(id);
    }
}

