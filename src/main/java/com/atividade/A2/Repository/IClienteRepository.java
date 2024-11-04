package com.atividade.A2.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.atividade.A2.Model.Cliente;

public interface IClienteRepository extends JpaRepository<Cliente, Long> {}
