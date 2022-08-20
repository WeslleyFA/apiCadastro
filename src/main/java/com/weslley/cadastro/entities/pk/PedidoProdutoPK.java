package com.weslley.cadastro.entities.pk;

import com.weslley.cadastro.entities.Pedido;
import com.weslley.cadastro.entities.Produto;

import javax.persistence.Embeddable;
import javax.persistence.ManyToOne;
import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class PedidoProdutoPK  implements Serializable {
    public static final long serialVersionUID = 1L;

    @ManyToOne
    private Pedido pedido;
    @ManyToOne
    private Produto produto;


    public Pedido getPedido() {
        return pedido;
    }

    public void setPedido(Pedido pedido) {
        this.pedido = pedido;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }
}
