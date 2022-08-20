package com.weslley.cadastro.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.weslley.cadastro.entities.pk.PedidoProdutoPK;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import java.io.Serializable;

@Entity
public class PedidoProduto implements Serializable {
    public static final long serialVersionUID = 1L;

    @EmbeddedId
    private PedidoProdutoPK id = new PedidoProdutoPK();
    private Integer quantidade;
    private Double preco;

    public PedidoProduto() {
    }

    public PedidoProduto(Pedido pedido, Produto produto, Integer quantidade, Double preco) {
        id.setPedido(pedido);
        id.setProduto(produto);
        this.quantidade = quantidade;
        this.preco = preco;
    }

    @JsonIgnore
    public Pedido getPedido() {
        return id.getPedido();
    }

    public void setPedido(Pedido pedido) {
        this.id.setPedido(pedido);
    }

    public Produto getProduto() {
        return id.getProduto();
    }

    public void setProduto(Produto produto) {
        this.id.setProduto(produto);
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }
}
