package br.udesc.ceavi.dsw.projetorestjpa.dao;

import java.util.Set;
import javax.ws.rs.core.Application;

@javax.ws.rs.ApplicationPath("webresources")
public class ApplicationConfig extends Application {

    @Override
    public Set<Class<?>> getClasses() {
        Set<Class<?>> resources = new java.util.HashSet<>();
        addRestResourceClasses(resources);
        return resources;
    }

    /**
     * Do not modify addRestResourceClasses() method.
     * It is automatically populated with
     * all resources defined in the project.
     * If required, comment out calling this method in getClasses().
     */
    private void addRestResourceClasses(Set<Class<?>> resources) {
        resources.add(br.udesc.ceavi.dsw.projetorestjpa.dao.ClientesResource.class);
        resources.add(br.udesc.ceavi.dsw.projetorestjpa.dao.ContatosResource.class);
        resources.add(br.udesc.ceavi.dsw.projetorestjpa.dao.EmpresasResource.class);
        resources.add(br.udesc.ceavi.dsw.projetorestjpa.dao.EtapasResource.class);
        resources.add(br.udesc.ceavi.dsw.projetorestjpa.dao.ProdutosResource.class);
        resources.add(br.udesc.ceavi.dsw.projetorestjpa.dao.UsuariosResource.class);
        resources.add(br.udesc.ceavi.dsw.projetorestjpa.services.JWTAutenticarTokenFilter.class);
    }
    
}
