/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package agendagui;

/**
 *
 * @author 16.03378-7
 */
public class Contato {
    //atributos do contato
    private String nome;
    private String email;
    private String telefone;
    private String facebook;

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public String toString(){
        String retorno;
        retorno = nome + "\n";
        retorno += "Tel.: "+ this.telefone + "E-mail: " +this.email;
        return retorno;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public void setFacebook(String facebook) {
        this.facebook = facebook;
    }

    public void setInstagram(String instagram) {
        this.instagram = instagram;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    public void setGeo(String geo) {
        this.geo = geo;
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public String getTelefone() {
        return telefone;
    }

    public String getFacebook() {
        return facebook;
    }

    public String getInstagram() {
        return instagram;
    }

    public String getFoto() {
        return foto;
    }

    public String getGeo() {
        return geo;
    }
    private String instagram;
    private String foto;
    private String geo;
    public Contato(String nome){
        this.nome = nome;
    }
    
    
}
