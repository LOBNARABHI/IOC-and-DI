Rapport sur l'Architecture et l'Implémentation du Projet
L'architecture générale du projet est basée sur trois couches principales : la couche DAO, la couche métier et la couche de présentation.
couche Dao :
la couche dao est fermer a la modification car les classe de implementation ne depend que de cette interface 
et ouverte a l'extension car on peut ajouter autre classe d'implementation de cette interface. la meme chose pour la couche metier 
couche metier : 
L'interface IMetier est créée avec une méthode calcul pour effectuer des calculs métier.
Une implémentation de cette interface est fournie, utilisant un couplage faible pour permettre l'injection de dépendances a travers le setter
couche presentation : 
Dans la première version, l'injection de dépendances est réalisée par instanciation statique, ce qui entraîne un couplage fort.(et la couche devient ouverte a la modification, la solution c'est l'intanciation dynamique ou bien l'utilisation du framework)
Dans la deuxième version, l'instanciation dynamique est utilisée en stockant les noms de classe dans un fichier de configuration (config.txt), ce qui rend la couche de présentation fermée à la modification.
Dans la version utilisant Spring XML, les classes à utiliser sont définies dans un fichier de configuration XML (config.xml), offrant une flexibilité similaire à l'instanciation dynamique.
Dans la version utilisant Spring avec annotations, les classes sont découvertes automatiquement via le balisage d'annotation (@Component) et les dépendances sont injectées à l'aide de l'annotation @Autowired, offrant un couplage faible et une grande extensibilité.
