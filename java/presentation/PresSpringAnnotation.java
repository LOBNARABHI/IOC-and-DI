package presentation;

import metier.IMetier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class PresSpringAnnotation {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext("dao","metier");
        //fait un scan sur ces package lorsque il trouve l'annotation component il creer une instance de cette class
        //et losqu'il trouve l'annotation autowired il fait l'injection des dépendances
        IMetier metier = context.getBean(IMetier.class);
        System.out.println("Resultat : " + metier.calculer());
    }
}
