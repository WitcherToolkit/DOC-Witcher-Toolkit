### Menu

* [Accueil](README.md)
* [Etapes de développement](_etape_dev.md)
* [Cas d'usage](_uc.md)
* [Définitions](_definition.md)

## Étapes de développement


|       N°        | Description                                                                                                                                                                                 | Date       |   ?tat   |
|:---------------:|:--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|:-----------|:--------:|
|  [0](#etape-0)  | - Revoir de MDC<br/>- Mettre en place les différentes tâches <br/>- Créer un jeux de donnée                                                                                                 | 01/12/2024 |    ok    |
|  [1](#etape-1)  | - Faire le CRUD pour : Races, Caractéristiques, Compétences, Sorts, Rituels, Signes, Envoûtements<br/>- Lister : Races, Caractéristiques, Compétences, Sorts, Rituels, Signes, Envoûtements | 22/12/2024 | en cours |
|  [2](#etape-2)  | - Faire le CRUD pour les joueurs<br/>- Lister les joueurs<br/>- Faire le CRUD pour la fiche personnage/PNJ<br/>- Lister la liste des fiche personnage/PNJ                                   | 05/01/2025 | a faire  |
|  [3](#etape-3)  | - Connecter le back à la BDD<br/>- Faire la partie connexion/déconnexion avec un rôle admin et utilisateur<br/>- Redirection vers la bonne page                                             | 02/02/2025 | a faire  |
|  [4](#etape-4)  | - Coder la partie front afin d'avoir un visuel de base puis le connecter au back                                                                                                            | 23/02/2025 | a faire  |
|  [5](#etape-5)  | - Modification et création d'un profil                                                                                                                                                      | 16/03/2025 | a faire  |
|  [6](#etape-6)  | - Préparer la structure d'un nouvelle API spécifique au Magasin                                                                                                                             | 13/04/2025 | a faire  |
|  [7](#etape-7)  | - Gestion et consultation des marchandises                                                                                                                                                  | 11/05/2025 | a faire  |
|  [8](#etape-8)  | - Ajouter l'inventaire dans la fiche personnage                                                                                                                                             | 08/06/2025 | a faire  |
|  [9](#etape-9)  | - Faire de CRUD des PNJ (extend fiche perso)<br/>- Duplication PJ & PNJ                                                                                                                     |            |          |
| [10](#etape-10) | - Modification des stats en fonction de l'équipement                                                                                                                                        |            |          |
| [11](#etape-11) | - Calcul des tests (lancés de dé)                                                                                                                                                           |            |          |

## Précisions sur les Étapes

### <a name="etape-0"></a>Étapes 0

Schema merise : (à mettre à jour)
![](src\main\resoures\img\Diagramme-bdd.jpg "Diagramme BDD")

Liste des tables et leur description :

|         NOM TABLE          | Description                                                                                                                   |
|:--------------------------:|:------------------------------------------------------------------------------------------------------------------------------|
|            USER            | Les utilisateurs de l'application (les maîtres de jeux).<br/> Un utilisateur peut posséder 0 à n fiches de personnage.        |
|          CAMPAGNE          | Un utilisateur à la possibilité d'associer ses fiches personnages à une campagne.                                             |
|         PERSONNAGE         | Éléments définissant un personnage avec ses origines, ses points forts, ses points faibles, etc...                            |
|           RITUEL           | Description détaillé des rituels disponibles dans le jeu.                                                                     |
|        ENVOUTEMENT         | Description détaillé des envoûtements disponibles dans le jeu.                                                                |
|           SIGNE            | Description détaillé des signes disponibles dans le jeu.                                                                      |
|            SORT            | Description détaillé des sorts disponibles dans le jeu.                                                                       |
|         INVOCATION         | Description détaillé des invocations disponibles dans le jeu.                                                                 |
|         COMPETENCE         | Compétences disponible pour chaque personnage, ce qu'il est capable de faire ou non (exemple : négoce, survie, bagarre, ...). |
|   COMPETENCE/PERSONNAGE    | Valeur d'une compétence donnée pour un personnage donné.                                                                      |
|      CARACTÉRISTIQUE       | Description des caractéristiques physiques du personnage, son intelligence, sa dextérité etc...                               |
| CARACTÉRISTIQUE/PERSONNAGE | Valeur d'une caractéristique donnée pour un personnage donné.                                                                 |
|                            |                                                                                                                               |

Refonte du projet et travail plus poussé du schéma Merise. Puis mise en place d'un planning avec les différentes étapes.

### <a name="etape-1"></a>Étape 1

Mise en place sur la partie des JPA, du jeu de données ainsi que du CRUD pour les éléments suivants : races, caractéristiques, compétences, sorts, rituels, signes.
- Sorts, Sorts et Signes sont finalement regroupés en une seule table : Magie
- Les compétences concernent :
    - le job avec sa compétence exclusive,
    - les compétences spécifiques à un job,
    - Les compétences plus générales.

### <a name="etape-2"></a>Étapes 2

Ajout de la partie centrale d'une fiche personnage avec les règles de gestion nécessaires à la création d'une fiche personnage.

### <a name="etape-3"></a>Étapes 3

Connecter le back à la BDD (MySQL)
Deux types de compte :
- Administrateur : qui peut créer, modifier, lire, supprimer les éléments suivants : races, caractéristiques, compétences, sorts, rituels, signes, ainsi que 
 les fiches des monstres.
- Utilisateur : qui peut lire les éléments cités précédemment.
- Les deux rôles peuvent créer, modifier, lire et supprimer des campagnes et des fiches personnages visibles que par eux.

### <a name="etape-4"></a>Étapes 4

Créer la partie Front en Angular, coder dans un premier tempsen dur puis connecter petit à petit les éléments avec le back.

### <a name="etape-5"></a>Étapes 5

Permettre la modification du profil, mais aussi la création d'un nouveau compte User.
Seul un administrateur peut changer les rôles.

### <a name="etape-6"></a>Étapes 6

Faire le schéma de BDD.
Préparer les différentes étapes de développement.

### <a name="etape-7"></a>Étapes 7

Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.

### <a name="etape-8"></a>Étapes 8

Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.

### <a name="etape-9"></a>Étapes 9

Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.

### <a name="etape-10"></a>Étapes 10

Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.

### <a name="etape-11"></a>Étapes 11

Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.
