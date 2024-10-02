package br.com.fiap.adjt;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("/demo")
public class HelloResource {


    @GET
    @Path("/v1")
    public String sayHello(){
        return "{\"mensagem\":\"Hello, World!\"}";
    }

    @GET
    @Path("/v1/teste")
    public String sayHelloV1Teste(){
        return "{\"mensagem\":\"Hello, World!\"}";
    }
    @GET
    @Path("/v2")
    public String sayHelloVersao2(){
        return """
                {"mensagem":"Hello, World!"}
                """;
    }

}
