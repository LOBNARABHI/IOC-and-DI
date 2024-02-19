package presentation;

import dao.DaoImpl;
import dao.DaoImpl2;
import metier.MetierImpl;

public class Pres1 {
    public static void main(String[] args) {
        DaoImpl dao = new DaoImpl(); //creer l'objet dao
        MetierImpl metier = new MetierImpl(); //instanciation statique = couplagr fort

        metier.setDao(dao);  //pour que l'objet dao dans la classe metier ne doit pas null
            //donc j'ai fait l'injection des dépendances par setter.

        System.out.println("Resultat = " + metier.calculer());

        //pour utiliser le version 2 :
        DaoImpl2 dao2 = new DaoImpl2(); //creer l'objet dao2 utilisant le version de de l'implementation de IDao
        MetierImpl metier2 = new MetierImpl();
        metier2.setDao(dao2); //injection des dépendances
        System.out.println("Resultat = " + metier2.calculer());

//pour la couche presentation elle est ouverte a la modification car elle utilise des classes (probleme de maintenance)
        //et pour chaque version il faut modifier dans le code pour obtenir la version se qu'on a veux

        //la solution c'est l'instanciation dynamique ou bien le framework Spring
    }
}
