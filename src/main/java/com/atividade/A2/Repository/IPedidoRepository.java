package com.atividade.A2.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.atividade.A2.Model.Pedido;

public interface IPedidoRepository extends JpaRepository<Pedido, Long> {}