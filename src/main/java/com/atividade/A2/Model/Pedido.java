package com.atividade.A2.Model;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;

@Entity
public class Pedido {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long codigo;
    private String nome;

    @ManyToOne
    @JoinColumn(name = "cliente_codigo")
    private Cliente cliente;

    @ManyToOne
    @JoinColumn(name = "fornecedor_codigo")
    private Fornecedor fornecedor;
    
    @OneToMany(mappedBy = "pedido", cascade = CascadeType.ALL, fetch = FetchType.LAZY) 
    private Set<Produto> produtos = new HashSet<>();

    // Relacionamento "um para muitos" com a entidade Item. 
    // mappedBy indica que a chave estrangeira está na entidade Item (propriedade 'pedido'). 
    // CascadeType.ALL propaga operações (persistir, atualizar, excluir) para Itens. 
    // FetchType.LAZY carrega Itens apenas quando acessados, melhorando desempenho.

    private LocalDate dataDeInclusao;
    private LocalDate dataDeAlteracao;
    
    public Pedido() {
    }

    public Pedido(long codigo, String nome, Cliente cliente, Fornecedor fornecedor, Set<Produto> produtos,
            LocalDate dataDeInclusao, LocalDate dataDeAlteracao) {
        this.codigo = codigo;
        this.nome = nome;
        this.cliente = cliente;
        this.fornecedor = fornecedor;
        this.produtos = produtos;
        this.dataDeInclusao = dataDeInclusao;
        this.dataDeAlteracao = dataDeAlteracao;
    }

    public long getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Fornecedor getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(Fornecedor fornecedor) {
        this.fornecedor = fornecedor;
    }

    public Set<Produto> getProdutos() {
        return produtos;
    }

    public void setProdutos(Set<Produto> produtos) {
        this.produtos = produtos;
    }

    public LocalDate getDataDeInclusao() {
        return dataDeInclusao;
    }

    public void setDataDeInclusao(LocalDate dataDeInclusao) {
        this.dataDeInclusao = dataDeInclusao;
    }

    public LocalDate getDataDeAlteracao() {
        return dataDeAlteracao;
    }

    public void setDataDeAlteracao(LocalDate dataDeAlteracao) {
        this.dataDeAlteracao = dataDeAlteracao;
    }

    
    
}

/*
- Código: int
- Nome: string
- Cliente: Cliente
- Fornecedor: Fornecedor
- Produtos: Set<Produto>
- DataDeInclusão: date
- DataDeAlteração: date
+ Pedido ()
+ Pedido (int, string, date,
date)
*/