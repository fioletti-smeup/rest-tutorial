package com.smeup.tutorial.rest;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;

@Path("contacts")
public class ContactsSearch {

    private final List<Contact> contacts = new ArrayList<>();

    public ContactsSearch() {

        this.contacts.add(new Contact("000001", "Antonio Manfredi"));
        this.contacts.add(new Contact("000002", "Giacomo Boselli"));
    }

    @GET
    public List<Contact> search(@QueryParam("desc") final String description) {

        if (null == description) {

            return this.contacts;
        }
        return this.contacts.stream().filter(c -> c.getDescription().toUpperCase().contains(description.toUpperCase()))
                .collect(Collectors.toList());
    }
}
