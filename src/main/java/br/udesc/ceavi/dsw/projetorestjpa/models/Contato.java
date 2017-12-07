
package br.udesc.ceavi.dsw.projetorestjpa.models;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Contato")
public class Contato implements Serializable{
    
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idContato;
    
    @Column(name="nome")
    private String nome;
    
    @Column(name="email")
    private String email;
    
    @Column(name="mensagem")
    private String mensagem; 

    public Long getIdContato() {
        return idContato;
    }

    public void setIdContato(Long idContato) {
        this.idContato = idContato;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMensagem() {
        return mensagem;
    }

    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }
    
    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idContato != null ? idContato.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Contato)) {
            return false;
        }
        Contato other = (Contato) object;
        if ((this.idContato == null && other.idContato != null) || (this.idContato != null && !this.idContato.equals(other.idContato))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.udesc.ceavi.projetomaromba[ id contato: " + idContato + 
                "\n nome: "+nome+
                "\n email: "+email+
                "\n mensagem: "+mensagem+" ]";
    }
    
}
