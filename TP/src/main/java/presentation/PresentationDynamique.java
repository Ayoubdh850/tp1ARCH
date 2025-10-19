package presentation;

import dao.IDao;
import metier.IMetier;

import java.io.BufferedReader;
import java.io.FileReader;

public class PresentationDynamique {
    public static void main(String[] args) {
        try {
                 BufferedReader br = new BufferedReader(new FileReader("config.txt"));
            String daoClassName = br.readLine();
            String metierClassName = br.readLine();
            br.close();

            Class<?> cDao = Class.forName(daoClassName);
            Class<?> cMetier = Class.forName(metierClassName);

            IDao dao = (IDao) cDao.getDeclaredConstructor().newInstance();
            IMetier metier = (IMetier) cMetier.getDeclaredConstructor().newInstance();

            cMetier.getMethod("setDao", IDao.class).invoke(metier, dao);

            System.out.println("Résultat = " + metier.calcul());

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
