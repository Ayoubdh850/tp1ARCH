package presentation;

import dao.DaoIMP;
import metier.MetierIMP;

public class PresentationStatique {
    public static void main(String[] args) {
        DaoIMP dao = new DaoIMP();
        MetierIMP metier = new MetierIMP();
        metier.setDao(dao);
        System.out.println("Résultat = " + metier.calcul());
    }
}
