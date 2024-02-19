package presentation;

import dao.DaoImpl2;
import dao.IDao;
import metier.MetierImpl;

import java.io.File;
import java.io.FileNotFoundException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Scanner;

public class Pres2 {
    public static void main(String[] args) throws FileNotFoundException, ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        //instanciation dynamique
        //DaoImpl dao = new DaoImpl();
        Scanner scanner = new Scanner(new File("config.txt"));
        String DaoClassName = scanner.nextLine();
        Class cDao = Class.forName(DaoClassName);
        IDao dao = (IDao) cDao.newInstance(); //instanciation dynamique => new DaoImpl();
        //System.out.println(dao.getdate());

        //ici j'ai utiliser l'instanciation dynamique est le couplage faible car j'ai connuu sauf les interface et non les classes
        //les nom des classes sont stocker dans un fichier txt nomé config.txt
        //donc j'ai rendre la couche presentation fermer a la modification a traver l'instancition dynamique

        //MetierImpl metier2 = new MetierImpl();
        String metierClassName = scanner.nextLine();
        Class cMetier = Class.forName(metierClassName);
        MetierImpl metier = (MetierImpl) cMetier.newInstance();

        //metier2.setDao(dao2); //statique //phase d'injection
        Method setDao = cMetier.getDeclaredMethod("setDao", IDao.class);
        setDao.invoke(metier,dao); //l'injection des dépendances dynamique

        //la calcul
        System.out.println("Resultat = " + metier.calculer());
    }
}
