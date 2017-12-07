
package br.udesc.ceavi.dsw.projetorestjpa.models;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="funil")
public class Etapa implements Serializable{
    
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idFunil;
    
    @Column(name="decricao")
    private String descricao;

    public Long getIdFunil() {
        return idFunil;
    }

    public void setIdFunil(Long idFunil) {
        this.idFunil = idFunil;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    
    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idFunil != null ? idFunil.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Etapa)) {
            return false;
        }
        Etapa other = (Etapa) object;
        if ((this.idFunil == null && other.idFunil != null) || (this.idFunil != null && !this.idFunil.equals(other.idFunil))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.udesc.ceavi.projetomaromba[ id funil: " + idFunil + 
                "\n descricao: "+descricao+" ]";
    }
    
}
