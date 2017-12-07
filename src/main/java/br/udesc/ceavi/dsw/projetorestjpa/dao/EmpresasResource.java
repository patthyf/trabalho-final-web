package br.udesc.ceavi.dsw.projetorestjpa.dao;

import br.udesc.ceavi.dsw.projetorestjpa.models.Empresa;
import br.udesc.ceavi.dsw.projetorestjpa.services.JWTAutenticarTokenInterface;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.UriInfo;
/**
 *
 * @author Patrícia
 */
@Path("empresa")
public class EmpresasResource {
    
    
    @Context
    private UriInfo context;

    /**
     * Creates a new instance of EmpresasResource
     */
    public EmpresasResource() {
    }
   
    @GET  
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public Empresa getEmpresas() {
        System.out.println("get empresa..." );
        Dao d = new Dao();
        return (Empresa)d.ler(Empresa.class, 1);
    }
    
    @GET  
    @JWTAutenticarTokenInterface
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/{idEmpresa}")
    public Empresa getEmpresa(@PathParam("idEmpresa") String id) {
        System.out.println("get empresa..." + id);
        Dao d = new Dao();
        return (Empresa)d.ler(Empresa.class, Integer.parseInt(id));
    }

    @PUT
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public void putJson(String content) {
    }
    
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Empresa addEmpresas(Empresa empresa){
        System.out.println("POST Empresa: " + empresa);
        Dao d = new Dao();
        d.salvar(empresa);
        return empresa;
    }      
    
    
    
}

















