package com.atividade.A2.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.atividade.A2.Model.ItemPedido;

public interface IItemPedidoRepository extends JpaRepository<ItemPedido, Long> {
}
