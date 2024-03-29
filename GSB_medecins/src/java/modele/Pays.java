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

    private Collection<Dep> lesDeps;
    private Collection<Spe> lesSpes;

    public Pays() {
        lesDeps = DAO.getLesDeps();
        lesSpes = DAO.getLesSpes();
        this.assocMedecins(DAO.getLesMeds());
    }

    public Collection<Dep> getLesDeps() {
        return lesDeps;
    }

    public Collection<Spe> getLesSpes() {
        return lesSpes;
    }

    private void assocMedecins(Collection<Med> lesMeds) {

        for (Med unMed : lesMeds) {
            getLeDep(unMed.getDep()).addUnMed(unMed);
            Spe uneSpe = getLaSpe(unMed.getSpe());
            if (uneSpe != null) {
                uneSpe.addUnMed(unMed);

            }
        }

    }

    public Dep getLeDep(String numDep) {
        for (Dep unDep : lesDeps) {
            if (unDep.getNum().equals(numDep)) {
                return unDep;
            }
        }
        return null;
    }
    
     public Spe getLaSpe(String Spe) {
        for (Spe uneSpe : lesSpes) {
            if (uneSpe.getNom().equals(Spe)) {
                return uneSpe;
            }
        }
        return null;
    }
    
}
