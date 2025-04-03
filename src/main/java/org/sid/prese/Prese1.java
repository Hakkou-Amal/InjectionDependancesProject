package org.sid.prese;

import org.sid.dao.DaoImpl;
import org.sid.metier.IMetierImpl;
import org.sid.org.sid.ext.DaoImplVer2;

public class Prese1 {
    public static void main(String[] args) {
        DaoImplVer2 d = new DaoImplVer2();
        IMetierImpl metier = new IMetierImpl();
        metier.setDao(d);// injection des dépendances via le setter
        System.out.println("resultat= "+metier.calcul());

    }
}
