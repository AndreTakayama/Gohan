package com.atividade.A2.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity // simboliza que a classe será mapeada no banco de dados.
public class Produto {
    @Id // o anotation ID faz o atributo ID ser identificado como a chave primária no banco
    @GeneratedValue(strategy = GenerationType.IDENTITY) // gera IDs automáticos
    private Long codigo; 

    @ManyToOne
    @JoinColumn(name = "pedido_id")
    private Pedido pedido;  // Certifique-se de que esta propriedade exista

    private String nome;
    private double preco;

    // Construtor padrão
    public Produto() {}

    // Construtor com parâmetros
    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    // Getters e Setters
    public Long getCodigo() {
        return codigo;
    }

    public void setCodigo(Long id) {
        this.codigo = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
}
