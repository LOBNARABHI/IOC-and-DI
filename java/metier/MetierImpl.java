package metier;

import dao.IDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component //pour la version annotation du Spring
public class MetierImpl implements IMetier{
    @Autowired //pour l'injection des dependances, spring il cherche s'il y a un objet de type IDao pour l'affecter au dao

    //si dans le package il y a plusieurs classe avec l'annotation component on utilise Qualifier qui prend le nom de l'annotaion
    private IDao dao; //couplage faible
    @Override
    public double calculer() {
        double d=dao.getdate();
        double res = d*11;
        return res;
    }

    /**
     * pour permettre d'injecter dans la variable dao
     * un objet d'une classe qui implimente l'interface IDao
     * on utilise ce setter pour fair l'injection de dependances
     * on peut utiliser aussi les constructeurs
     * @param dao
     */
    public void setDao(IDao dao) {
        this.dao = dao;
    }
}
