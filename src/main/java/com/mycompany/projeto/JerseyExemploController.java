/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.projeto;

/**
 *
 * @author pronatec
 */
import com.google.gson.Gson;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;
 
/**
 * Root resource (exposed at "myresource" path)
 */
@Path("meuwebservice")
public class JerseyExemploController {
    
    PessoaDAO pessoaDAO;
    
    public JerseyExemploController(){
        pessoaDAO = new PessoaDAO();
    }
 
    /**
     * Method handling HTTP GET requests. The returned object will be sent
     * to the client as "text/plain" media type.
     *
     * @return String that will be returned as a text/plain response.
     */
    @GET
    @Path("ola")
    @Produces(MediaType.TEXT_PLAIN)
    public String olaMundo() {
        return "Olá mundo!";
    }
    
    // http://localhost:8084/ExemploCrudREST/meuwebservice/adicionar?nome=Leonardo&idade=31
    
    @GET
    @Path("adicionar")
    public Response adicionar(@QueryParam("nome") String nome, 
                              @QueryParam("idade") int idade){
        Pessoa pessoa = new Pessoa(nome);
        this.pessoaDAO.adicionar(pessoa);
        return Response.status(Status.OK).build();
        
    }
    
    
    
    
    /*@GET
    @Path("adicionar")
    @Produces(MediaType.TEXT_PLAIN)
    public Response adicionar(@QueryParam("nome") String nome) {
        Pessoa pessoa = new Pessoa(nome);
        Gson gson = new Gson();
        Boolean resultado = new Boolean(this.pessoaDAO.adicionar(pessoa));
        return Response.status(Status.OK).entity(gson.toJson(resultado)).build();
    }*/
}