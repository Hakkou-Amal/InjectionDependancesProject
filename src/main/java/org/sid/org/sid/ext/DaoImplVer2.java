package org.sid.org.sid.ext;

import org.sid.dao.DaoImpl;
import org.sid.dao.IDao;

public class DaoImplVer2 implements IDao {
    @Override
    public double getData() {
        System.out.println("Version Capteur");
        double t = 12;
        return t;
    }
}
