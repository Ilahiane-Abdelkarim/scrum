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
public class Equipe {
    private Long id ;
    private String libette ;

    public Equipe() {
    }

    public Equipe(Long id, String libette) {
        this.id = id;
        this.libette = libette;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLibette() {
        return libette;
    }

    public void setLibette(String libette) {
        this.libette = libette;
    }

    @Override
    public String toString() {
        return super.toString(); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
