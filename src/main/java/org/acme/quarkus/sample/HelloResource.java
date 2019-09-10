package org.acme.quarkus.sample;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/hello")
public class HelloResource {
    @Inject
    NovoTeste teste;

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    @Path("{name}")
    public String saudacao(@PathParam("name") String name) {
        return teste.teste(name);
    }

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() {
        return "hello";
    }
}