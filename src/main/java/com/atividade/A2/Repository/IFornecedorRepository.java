package com.atividade.A2.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.atividade.A2.Model.Fornecedor;

public interface IFornecedorRepository extends JpaRepository<Fornecedor, Long> {}
