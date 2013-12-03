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
public class Dep implements Comparable<Dep> {
    
    private String num;
    private Collection<Med>lesMed= new TreeSet<Med>();

    public Dep(String num) {
        this.num = num;
        
    }

    public Collection<Med> getLesMed() {
        return lesMed;
    }

    public String getNum() {
        return num;
    }
    

    @Override
    public int compareTo(Dep t) {
        return num.compareTo(t.num);
    }

    void addUnMed(Med unMed) {
        lesMed.add(unMed);
    }
    
    
    
}
