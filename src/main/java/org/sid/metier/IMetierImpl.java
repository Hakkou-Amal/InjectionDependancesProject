package org.sid.metier;

import org.sid.dao.IDao;

public class IMetierImpl implements IMetier {
  private IDao dao ;// couplage Faible
// pour injecter dans l attribut dao
    // un object d'une classe qui implémente l interface IDao
// au moment de l instantiation
    public IMetierImpl(IDao dao) {
        this.dao = dao;
    }

    public IMetierImpl() {
    }

    @Override
    public double calcul() {
        double t = dao.getData();
        double resultat = t * 12 * Math.PI/2 ;
        return resultat ;
    }
// pour injecter dans l attribut dao
    // un object d'une classe qui implémente l interface IDao
// aprés l instantiation

    public void setDao(IDao dao) {
        this.dao = dao;

    }
// commentaire """"""""""""""""""