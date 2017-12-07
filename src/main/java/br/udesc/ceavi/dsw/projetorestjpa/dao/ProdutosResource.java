
package br.udesc.ceavi.dsw.projetorestjpa.dao;

import br.udesc.ceavi.dsw.projetorestjpa.models.Produto;
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
@Path("produto")
public class ProdutosResource {
 
    public ProdutosResource() {
    }
   
    @GET  
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public Produto getProdutos() {
        System.out.println("get produto..." );
        Dao d = new Dao();
        return (Produto)d.ler(Produto.class, 1);
    }
    
    @GET  
    @JWTAutenticarTokenInterface
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/{idProduto}")
    public Produto getProduto(@PathParam("idProduto") String id) {
        System.out.println("get produto..." + id);
        Dao d = new Dao();
        return (Produto)d.ler(Produto.class, Integer.parseInt(id));
    }

    @PUT
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public void putJson(String content) {
    }
    
    @POST
    @JWTAutenticarTokenInterface
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Produto addProduto(Produto produto){
        System.out.println("POST Produto: " + produto);
        Dao d = new Dao();
        d.salvar(produto);
        return produto;
    }
}
