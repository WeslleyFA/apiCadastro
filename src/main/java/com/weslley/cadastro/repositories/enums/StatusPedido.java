package com.weslley.cadastro.repositories.enums;

public enum StatusPedido {
    PENDENTE(0),
    ENVIADO(1),
    PAGO(2),
    ENTREGUE(3),
    CANCELADO(4);

    private Integer codigo;

    private StatusPedido(int codigo) {
        this.codigo = codigo;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public static StatusPedido valueOf(int codigo){
        for(StatusPedido pedido : StatusPedido.values()){
            if(pedido.getCodigo() == codigo){
                return pedido;
            }
        }
        throw new IllegalArgumentException("Código de Pedido inválido");

    }
}
