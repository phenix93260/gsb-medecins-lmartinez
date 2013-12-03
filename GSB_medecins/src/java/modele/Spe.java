/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package modele;

import java.util.Collection;
import java.util.TreeSet;

/**
 *
 * @author lmartinez
 */
public class Spe implements Comparable<Spe> {
    
    private String nom;
    private Collection<Med>lesMed= new TreeSet<Med>();

    public Spe(String nom  ) {
        this.nom = nom;
        
    }

    public Collection<Med> getLesMed() {
        return lesMed;
    }

    public String getNom() {
        return nom;
    }
    

    @Override
    public int compareTo(Spe t) {
        return nom.compareTo(t.nom);
    }

    void addUnMed(Med unMed) {
        lesMed.add(unMed);
    }
    
    
    
}
