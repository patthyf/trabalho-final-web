
package br.udesc.ceavi.dsw.projetorestjpa.models;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="empresa")
public class Empresa implements Serializable{
    
    private static final long serialVersionUID = 1L;
    @Id
    private Long cnpj;
    
    @Column(name="nome")
    private String nome;
    
    @Column(name="logradouro")
    private String logradouro;
    
    @Column(name="email")
    private String email;
    
    @Column(name="site")
    private String site;
    
    @Column(name="facebook")
    private String facebook;
    
    @Column(name="twitter")
    private String twitter;
    
    @Column(name="cep")
    private int cep;
    
    @Column(name="numero")
    private int numero;
    
    @Column(name="telefone")
    private int telefone;
    
    public Long getCnpj() {
        return cnpj;
    }

    public void setCnpj(Long cnpj) {
        this.cnpj = cnpj;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSite() {
        return site;
    }

    public void setSite(String site) {
        this.site = site;
    }

    public String getFacebook() {
        return facebook;
    }

    public void setFacebook(String facebook) {
        this.facebook = facebook;
    }

    public String getTwitter() {
        return twitter;
    }

    public void setTwitter(String twitter) {
        this.twitter = twitter;
    }

    public int getCep() {
        return cep;
    }

    public void setCep(int cep) {
        this.cep = cep;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getTelefone() {
        return telefone;
    }

    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }
    
    @Override
    public int hashCode() {
        int hash = 0;
        hash += (cnpj != null ? cnpj.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Empresa)) {
            return false;
        }
        Empresa other = (Empresa) object;
        if ((this.cnpj == null && other.cnpj != null) || (this.cnpj != null && !this.cnpj.equals(other.cnpj))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.udesc.ceavi.projetomaromba[ cnpj: " + cnpj + 
                "\n nome: "+nome+
                "\n logradouro: "+logradouro+
                "\n cep: "+cep+
                "\n numero: "+numero+
                "\n telefone: "+telefone+
                "\n email: "+email+
                "\n site: "+site+
                "\n facebook: "+facebook+
                "\n twitter: "+twitter+" ]";
    }
    
    
}
