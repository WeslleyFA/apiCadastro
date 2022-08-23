package com.weslley.cadastro.services.exception;

public class ResourceNotFindException extends RuntimeException{
    public ResourceNotFindException(Object o) {
        super("Recurso não encontrado: ID "+o);
    }
}
