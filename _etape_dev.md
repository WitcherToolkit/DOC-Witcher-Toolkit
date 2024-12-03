### Menu

* [Accueil](README.md)
* [Etapes de développement](_etape_dev.md)
* [Cas d'usage](_uc.md)
* [Définitions](_definition.md)

## Étapes de développement


|       N°        | Description                                                                                                                                                     | Date       |  ?tat   |
|:---------------:|:----------------------------------------------------------------------------------------------------------------------------------------------------------------|:-----------|:-------:|
|  [0](#etape-0)  | - Revoir de MDC<br/>- Mettre en place les différentes tâches <br/>- Créer un jeux de donnée                                                                     | 01/12/2024 |   ok    |
|  [1](#etape-1)  | - Coder en dur la partie front afin d'avoir un visuel de base                                                                                                   | En attente | a faire |
|  [2](#etape-2)  | - Connecter le back à la BDD<br/>- Faire la partie connexion/déconnexion avec un rôle admin et utilisateur<br/>- Redirection vers la bonne page                 | 05/01/2025 | a faire |
|  [3](#etape-3)  | - Faire le CRUD pour : Races, Caractéristiques, Compétences, Sorts, Rituels, Signes<br/>- Lister : Races, Caractéristiques, Compétences, Sorts, Rituels, Signes | 02/02/2025 | a faire |
|  [4](#etape-4)  | - Faire le CRUD pour les joueurs<br/>- Lister les joueurs<br/>- Faire le CRUD pour la fiche personnage/PNJ<br/>- Lister la liste des fiche personnage/PNJ       | 23/02/2025 | a faire |
|  [5](#etape-5)  | - Modification et création d'un profil                                                                                                                          | 16/03/2025 | a faire |
|  [6](#etape-6)  | - Gestion et consultation des marchandises                                                                                                                      | 13/04/2025 | a faire |
|  [7](#etape-7)  | - Ajouter l'inventaire dans la fiche personnage                                                                                                                 | 11/05/2025 | a faire |
|  [8](#etape-8)  | - Faire de CRUD des PNJ (extend fiche perso)<br/>- Duplication PJ & PNJ                                                                                         | 08/06/2025 | a faire |
|  [9](#etape-9)  | - Modification des stats en fonction de l'équipement                                                                                                            |            |         |
| [10](#etape-10) | - Calcul des tests (lancés de dé)                                                                                                                               |            |         |

## Précisions sur les Étapes

### <a name="etape-0"></a>Étapes 0

Schema merise :
![](src\main\resoures\img\Diagramme-bdd.jpg "Diagramme BDD")

Liste des tables et leur description :

|          NOM TABLE          | Description                                                                                                                     |
| :-------------------------: | :------------------------------------------------------------------------------------------------------------------------------ |
|            USER            | Les utilisateurs de l'application (les maîtres de jeux).<br/> Un utilisateur peut posséder 0 à n fiches de personnage.       |
|          CAMPAGNE          | Un utilisateur à la possibilité d'associer ses fiches personnages à une campagne.                                            |
|         PERSONNAGE         | Éléments définissant un personnage avec ses origines, ses points forts, ses points faibles, etc...                           |
|           RITUEL           | Description détaillé des rituels disponibles dans le jeu.                                                                     |
|         ENVOUTEMENT         | Description détaillé des envoûtements disponibles dans le jeu.                                                               |
|            SIGNE            | Description détaillé des signes disponibles dans le jeu.                                                                      |
|            SORT            | Description détaillé des sorts disponibles dans le jeu.                                                                       |
|         INVOCATION         | Description détaillé des invocations disponibles dans le jeu.                                                                 |
|         COMPETENCE         | Compétences disponible pour chaque personnage, ce qu'il est capable de faire ou non (exemple : négoce, survie, bagarre, ...). |
|    COMPETENCE/PERSONNAGE    | Valeur d'une compétence donnée pour un personnage donné.                                                                     |
|      CARACTÉRISTIQUE      | Description des caractéristiques physiques du personnage, son intelligence, sa dextérité etc...                              |
| CARACTÉRISTIQUE/PERSONNAGE | Valeur d'une caractéristique donnée pour un personnage donné.                                                                |
|                            |                                                                                                                                 |

### <a name="etape-1"></a>Étape 1

Coder en dur la partie front permet d'avoir un bon aperçu du

### <a name="etape-2"></a>Étapes 2

Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.

### <a name="etape-3"></a>Étapes 3

Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.

### <a name="etape-4"></a>Étapes 4

Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.

### <a name="etape-5"></a>Étapes 5

Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.

### <a name="etape-6"></a>Étapes 6

Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.

### <a name="etape-7"></a>Étapes 7

Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.

### <a name="etape-8"></a>Étapes 8

Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.

### <a name="etape-9"></a>Étapes 9

Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.

### <a name="etape-10"></a>Étapes 10

Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.
