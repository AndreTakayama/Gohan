package com.atividade.A2.Controller;

import com.atividade.A2.Model.ItemPedido;
import com.atividade.A2.Service.ItemPedidoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/itens-pedido")
public class ItemPedidoController {

    @Autowired
    private ItemPedidoService itemPedidoService;

    @GetMapping
    public List<ItemPedido> listarItensPedido() {
        return itemPedidoService.listarItensPedido();
    }

    @PostMapping
    public ItemPedido criarItemPedido(@RequestBody ItemPedido itemPedido) {
        return itemPedidoService.salvarItemPedido(itemPedido);
    }

    @GetMapping("/{id}")
    public ItemPedido obterItemPedido(@PathVariable Long id) {
        return itemPedidoService.obterItemPedidoPorId(id);
    }

    @DeleteMapping("/{id}")
    public void excluirItemPedido(@PathVariable Long id) {
        itemPedidoService.excluirItemPedido(id);
    }
}