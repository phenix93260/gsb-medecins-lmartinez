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
public class Pays {
    private Collection<Dep>lesDeps;
    
    public Pays(){
    lesDeps=DAO.getLesDeps();
    }

    public Collection<Dep> getLesDeps() {
        return lesDeps;
    }
    public Dep getLeDep(String numDep)
    {
        for(Dep unDep : lesDeps)
        {
            if(unDep.getNum().equals(numDep))
            {
                return unDep;
            }
        }
        return null;
    }
    
    
}
