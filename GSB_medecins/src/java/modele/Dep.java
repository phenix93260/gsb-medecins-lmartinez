/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package modele;

import java.util.Collection;

/**
 *
 * @author lmartinez
 */
public class Dep implements Comparable<Dep> {
    
    private String num;
    private Collection<Med>lesMed;

    public Dep(String num, Collection<Med> lesMed) {
        this.num = num;
        this.lesMed = lesMed;
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
    
    
    
}
