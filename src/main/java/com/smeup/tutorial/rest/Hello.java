package com.smeup.tutorial.rest;

import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.QueryParam;

@Path("")
public class Hello {

    @Path("hello/{name}")
    @GET
    public String pathParamHello(@PathParam("name") final String name) {

        return "Hello, " + name + "!";
    }

    @Path("helloWorld")
    @GET
    public String getHelloWorld() {

        return "Hello, World!";
    }

    @Path("hello")
    @GET
    public String queryParamHello(@QueryParam("name") final String name) {

        return "Hello, " + name + "!";
    }

    @Path("hello")
    @POST
    public String postHello(@FormParam("name") final String name) {

        return "Hello, " + name + "!";
    }
}
