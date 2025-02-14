### Menu
* [Accueil](_accueil.md)
* [Etapes de développement](_etape_dev.md)
* [Cas d'usage](_uc.md)
* [Définitions](_definition.md)
* [Règles création fiche perso](_creer_fiche_perso.md)

## Étapes de développement


|       N°        | Description                                                                                                                                     | Date       |   Etat   |
|:---------------:|:------------------------------------------------------------------------------------------------------------------------------------------------|:-----------|:--------:|
|  [0](#etape-0)  | - Revoir de MDC<br/>- Mettre en place les différentes tâches <br/>- Créer un jeux de donnée                                                     | 01/12/2024 |    ok    |
|  [1](#etape-1)  | - Faire le CRUD pour la partie wiki                                                                                                             | 22/12/2024 | en cours |
|  [2](#etape-2)  | - Faire le CRUD pour la partie personnage                                                                                                       | 05/01/2025 | a faire  |
|  [3](#etape-3)  | - Connecter le back à la BDD<br/>- Faire la partie connexion/déconnexion avec un rôle admin et utilisateur<br/>- Redirection vers la bonne page | 02/02/2025 | a faire  |
|  [4](#etape-4)  | - Coder la partie front afin d'avoir un visuel de base puis le connecter au back                                                                | 23/02/2025 | en cours |
|  [5](#etape-5)  | - Modification et création d'un profil                                                                                                          | 16/03/2025 | a faire  |
|  [6](#etape-6)  | - Préparer la structure d'un nouvelle API spécifique au Magasin                                                                                 |            |          |
|  [7](#etape-7)  | - Gestion et consultation des marchandises                                                                                                      |            |          |
|  [8](#etape-8)  | - Ajouter l'inventaire dans la fiche personnage                                                                                                 |            |          |
|  [9](#etape-9)  | - Faire de CRUD des PNJ (extend fiche perso)<br/>- Duplication PJ & PNJ                                                                         |            |          |
| [10](#etape-10) | - Modification des stats en fonction de l'équipement                                                                                            |            |          |
| [11](#etape-11) | - Calcul des tests (lancés de dé)                                                                                                               |            |          |

## Précisions sur les Étapes

### <a name="etape-0"></a>Étapes 0

Schema merise : 
![Diagramme BDD](../images/MCD-2025-02-02.jpg)

MLD :  
magie = (idMagie INT, nom VARCHAR(60), cout VARCHAR(10), effet TEXT, portee VARCHAR(10), duree VARCHAR(10), elementaire VARCHAR(5), niveau VARCHAR(20), contre VARCHAR(20), profession VARCHAR(9));  
caracteristique = (idCaractéristique INT, nom VARCHAR(16), code VARCHAR(4), description TEXT);  
user = (idUser INT, pseudo VARCHAR(64), email VARCHAR(255), password VARCHAR(255), isAdmin LOGICAL);  
rituel = (idRituel INT, nom VARCHAR(60), cout VARCHAR(10), effet TEXT, TempsPreparation INT, sd VARCHAR(7), duree VARCHAR(10), composant TEXT, niveau VARCHAR(20));  
envoutement = (idEnvoutement INT, nom VARCHAR(60), cout VARCHAR(10), effet TEXT, prerequis TEXT, danger VARCHAR(6));  
profession = (idProfession INT, nom VARCHAR(50), description TEXT);  
race = (idRace INT, nom VARCHAR(50), categorie VARCHAR(50));  
campagne = (idCampagne INT, nom VARCHAR(50), #idUser);  
competence = (idCompetenceSpecifique INT, nom VARCHAR(50), description TEXT, codeCaracteristique VARCHAR(4), specialisation VARCHAR(20), prerequis VARCHAR(20), exclusif LOGICAL, #idProfession);  
personnage = (idPersonnage INT, nomPersonnage VARCHAR(50), nomJoueur VARCHAR(50), nomImage VARCHAR(100), urlImage TEXT, genre CHAR(1), terreNatale VARCHAR(20), xp INT, age INT, bestiaire LOGICAL, #idRace, #idCampagne*, #idUser*);  
profession_competence_personnage = (idProfessionCompetencePersonnage INT, valeurActuelle INT, valeurMax INT, #idProfession, #idCompetenceSpecifique, #idPersonnage);  
historique = (idHistorique INT, typeHistorique VARCHAR(50), description TEXT, #idPersonnage);  
inventaire = (idEnvoutement INT, nom VARCHAR(60), type VARCHAR(10), effet TEXT, quantité INT, #idPersonnage);  
caracteristique_personnage = (idCaracteristiquePersonnage INT, valeurActuelle INT, valeurMax INT, #idPersonnage, #idCaractéristique);  
magie_personnage = (#idPersonnage, #idMagie);  
rituel_personnage = (#idPersonnage, #idRituel);  
envoutement_personnage = (#idPersonnage, #idEnvoutement);  

  
Liste des tables et leur description :

|         NOM TABLE          | Description                                                                                                                       |
|:--------------------------:|:----------------------------------------------------------------------------------------------------------------------------------|
|            USER            | Les utilisateurs de l'application (les maîtres de jeux).<br/> Un utilisateur peut posséder 0 à n fiches de personnage.            |
|          CAMPAGNE          | Un utilisateur a la possibilité d'associer ses fiches personnages à une campagne.                                                 |
|         PERSONNAGE         | Éléments définissant un personnage avec ses origines, ses points forts, ses points faibles, etc...                                |
|           RITUEL           | Description détaillée des rituels disponibles dans le jeu.                                                                        |
|        ENVOUTEMENT         | Description détaillée des envoûtements disponibles dans le jeu.                                                                   |
|           MAGIE            | Description détaillée des signes, sorts et invocations disponibles dans le jeu.                                                   |
|        ENVOUTEMENT         | Description détaillée des envoûtements disponibles dans le jeu.                                                                   |
|         INVENTAIRE         | Liste les objets et équipements que possède le personnage (cette table sera retravaillée lors de la phase de création du magasin) |
|         HISTORIQUE         | Histoire du personnage                                                                                                            |
|            RACE            | Liste des races disponibles et de leur spécificité                                                                                |
|         PROFESSION         | Liste les métiers disponibles                                                                                                     |
|         COMPETENCE         | Compétences disponibles pour chaque personnage, ce qu'il est capable de faire ou non (exemple : négoce, survie, bagarre, ...).    |
|   COMPETENCE/PERSONNAGE    | Valeur d'une compétence donnée pour un personnage et une profession donnée.                                                       |
|      CARACTÉRISTIQUE       | Description des caractéristiques physiques du personnage, son intelligence, sa dextérité etc...                                   |
| CARACTÉRISTIQUE/PERSONNAGE | Valeur d'une caractéristique donnée pour un personnage donné.                                                                     |

Refonte du projet et travail plus poussé du schéma Merise. Puis mise en place d'un planning avec les différentes étapes.

### <a name="etape-1"></a>Étape 1

Mise en place sur la partie des JPA, du jeu de données ainsi que du CRUD pour les éléments suivants : races, **caractéristiques**, **compétences**, sorts, rituels, signes.
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

Créer la partie Front en Angular, coder dans un premier temps en dur.  
Coder en dur va permettre d'avoir un premier aperçu du visuel du site.  
Quand la partie base de donnée sera fixé de manière plus définitive, coder le reste du front.  
Brancher le back et le front au fur et à mesure de l'avancement du projet dans cet ordre :  
- la partie wiki, 
- la partie fiche personnage, 
- la connexion/déconnexion, 
- la partie magasin
- la partie lancement des tests

### <a name="etape-5"></a>Étapes 5

Permettre la modification du profil, mais aussi la création d'un nouveau compte User.
Seul un administrateur peut changer les rôles.

|      Rôle      | Droits                                                                                                                                                                                                                                                  |
|:--------------:|:--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| Administrateur | Droits Utilisateur et Visiteur + possibilité de créer, modifier, supprimer le wiki et peut donner les droits.                                                                                                                                           |
|  Utilisateur   | Droits Visiteur + possibilité de créer modifier supprimer des ficher personnage et PNJ/monstres visibles que par lui et de les intégrer à des campagnes. Possibilité de rendre visible pour autrui les fiches créées. Possibilité de consulter le wiki. |
|    Visiteur    | Mode déconnecté. Possibilité de consulter sur le wiki la liste des races, profession, magie, envoûtement. Possibilité de consulter une fiche personnage partagé (à l'aide de l'url) par une personne connecté.                                          |

### <a name="etape-6"></a>Étapes 6

Faire le schéma de BDD.
Préparer les différentes étapes de développement.

### <a name="etape-7"></a>Étapes 7

À faire lors de la phase 2 : Le Magasin.

### <a name="etape-8"></a>Étapes 8

À faire lors de la phase 2 : Le Magasin.

### <a name="etape-9"></a>Étapes 9

À faire lors de la phase 2 : Le Magasin.

### <a name="etape-10"></a>Étapes 10

À faire lors de la phase 2 : Le Magasin.

### <a name="etape-11"></a>Étapes 11

À faire lors de la phase 2 : Le Magasin.
