/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

/**
 *
 * @author 21270
 */
public class MembreEquipe {
    private Long id ;
    private Equipe equipe;
    private Collaborateur collaborateur;

    public MembreEquipe() {
    }

    public MembreEquipe(Long id, Equipe equipe, Collaborateur collaborateur) {
        this.id = id;
        this.equipe = equipe;
        this.collaborateur = collaborateur;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Equipe getEquipe() {
        return equipe;
    }

    public void setEquipe(Equipe equipe) {
        this.equipe = equipe;
    }

    public Collaborateur getCollaborateur() {
        return collaborateur;
    }

    public void setCollaborateur(Collaborateur collaborateur) {
        this.collaborateur = collaborateur;
    }

    @Override
    public String toString() {
        return super.toString(); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}
