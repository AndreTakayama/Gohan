package com.atividade.A2.Service;

import com.atividade.A2.Model.ItemPedido;
import com.atividade.A2.Repository.IItemPedidoRepository; // Certifique-se de ter este repositório
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ItemPedidoService {

    @Autowired
    private IItemPedidoRepository itemPedidoRepository;

    public List<ItemPedido> listarItensPedido() {
        return itemPedidoRepository.findAll();
    }

    public ItemPedido salvarItemPedido(ItemPedido itemPedido) {
        return itemPedidoRepository.save(itemPedido);
    }

    public ItemPedido obterItemPedidoPorId(Long id) {
        return itemPedidoRepository.findById(id).orElse(null);
    }

    public void excluirItemPedido(Long id) {
        itemPedidoRepository.deleteById(id);
    }
}
