package com.example.resteasy;

import org.springframework.stereotype.Service;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;

@Path("/hello")
@Service
public class HelloService {
    @Path("/world")
    @GET
    @Produces("text/plain")
    public String hello() {
        return "Hello World!";
    }
}
