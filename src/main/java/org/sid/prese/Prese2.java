package org.sid.prese;
import org.sid.dao.IDao;

import java .util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class Prese2 {
    public static void main(String[] args) throws FileNotFoundException, ClassNotFoundException, InstantiationException, IllegalAccessException {
        Scanner scanner = new Scanner(new File( "config.txt"));
        String daoClassName = scanner.nextLine();
        Class cDao = Class.forName(daoClassName);
         IDao  dao =(IDao) cDao.newInstance();
         System.out.println(dao.getData());

    }
}
