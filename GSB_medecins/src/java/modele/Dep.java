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
public class Dep {
    
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
    
    
    
}
