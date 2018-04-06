package com.smeup.tutorial.rest;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.QueryParam;

@Path("contacts")
public class Contacts {

    private final List<Contact> contacts = new ArrayList<>();

    public Contacts() {

        this.contacts.add(new Contact("000001", "Antonio Manfredi"));
        this.contacts.add(new Contact("000002", "Giacomo Boselli"));
        this.contacts.add(new Contact("000002", "Pasquale Baudaffi"));
    }

    @GET
    public List<Contact> search(@QueryParam("desc") final String description) {

        if (null == description) {

            return this.contacts;
        }
        return this.contacts.stream().filter(c -> c.getDescription().toUpperCase().contains(description.toUpperCase()))
                .collect(Collectors.toList());
    }

    @Path("{code}")
    @GET
    public Contact get(@PathParam("code") final String code) {

        return this.contacts.stream().filter(c -> c.getCode().equals(code)).findAny()
                .orElseThrow(new NotFoundExceptionSupplier("Contact code: " + code + " not found"));
    }
}
