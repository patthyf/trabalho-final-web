package br.udesc.ceavi.dsw.projetorestjpa.dao;


import br.udesc.ceavi.dsw.projetorestjpa.models.Etapa;
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
@Path("etapa")
public class EtapasResource {
    
    
    public EtapasResource() {
    }
   
    @GET  
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public Etapa getEmpresas() {
        System.out.println("get etapa..." );
        Dao d = new Dao();
        return (Etapa)d.ler(Etapa.class, 1);
    }
    
    @GET  /*Protegido pois só o admin poderá acessar o funil de vendas*/
    @JWTAutenticarTokenInterface
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/{idEtapa}")
    public Etapa getEtapa(@PathParam("idEtapa") String id) {
        System.out.println("get etapa..." + id);
        Dao d = new Dao();
        return (Etapa)d.ler(Etapa.class, Integer.parseInt(id));
    }

    @PUT
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public void putJson(String content) {
    }
    
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Etapa addEtapas(Etapa etapa){
        System.out.println("POST Etapa: " + etapa);
        Dao d = new Dao();
        d.salvar(etapa);
        return etapa;
    }
}
