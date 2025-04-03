package org.sid.prese;

import org.sid.dao.DaoImpl;
import org.sid.metier.IMetierImpl;

public class Prese1 {
    public static void main(String[] args) {
        DaoImpl d = new DaoImpl();
        IMetierImpl metier = new IMetierImpl();
        metier.setDao(d);// injection des dépendances via le setter
        System.out.println("resultat= "+metier.calcul());

    }
}
