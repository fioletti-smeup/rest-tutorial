package com.smeup.tutorial.rest;

import java.util.function.Supplier;

import javax.ws.rs.NotFoundException;

public class NotFoundExceptionSupplier implements Supplier<NotFoundException> {

    private final String msg;

    public NotFoundExceptionSupplier(final String msg) {

        this.msg = msg;
    }

    @Override
    public NotFoundException get() {
        return new NotFoundException(this.msg);
    }

}
