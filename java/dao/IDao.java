package dao;

public interface IDao {
    double getdate();
}

//la couche dao est fermer a la modification car les classe de implementation ne depend que de cette interface
// et ouverte a la modification car on peut ajouter autre classe d'implementation de cette interface (les extensions)
