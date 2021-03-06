
package br.udesc.ceavi.dsw.projetorestjpa.dao;

import br.udesc.ceavi.dsw.projetorestjpa.models.Contato;
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
@Path("contato")
public class ContatosResource {

    @Context
    private UriInfo context;

    /**
     * Creates a new instance of ContatosResource
     */
    public ContatosResource() {
    }
   
    @GET  
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public Contato getContatos() {
        System.out.println("get contatos..." );
        Dao d = new Dao();
        return (Contato)d.ler(Contato.class, 1);
    }
    
    @GET  
   /* @JWTAutenticarTokenInterface  Método não protegido por autenticação, pois qqr um pode entrar em contato*/
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/{idContato}")
    public Contato getContato(@PathParam("idContato") String id) {
        System.out.println("get contato..." + id);
        Dao d = new Dao();
        return (Contato)d.ler(Contato.class, Integer.parseInt(id));
    }

    @PUT
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public void putJson(String content) {
    }
    
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Contato addContatos(Contato contato){
        System.out.println("POST Contato: " + contato);
        Dao d = new Dao();
        d.salvar(contato);
        return contato;
    }
    
}

