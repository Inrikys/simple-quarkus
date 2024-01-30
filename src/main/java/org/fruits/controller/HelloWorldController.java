package org.fruits.controller;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/hello")
public class HelloWorldController {

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() {
        return "Olá! Eu e a Jessica estamos estudando";
    }

}
