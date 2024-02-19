package metier;

public interface IMetier {
    double calculer();
}

//la couche metier est aussi fermer a la modification car ne depend que des interfaces(couplage faible)
//couplage faible = fermer a la modification

//ouverte a l'extension (oui) car on a cette interface donc on peut creer autre implementation pour la fonction calculer

