package org.sid.metier;

import org.sid.dao.IDao;

public class IMetierImpl implements IMetier {
  private IDao dao ;// couplage Faible

    @Override
    public double calcul() {
        return 0;
    }
}
