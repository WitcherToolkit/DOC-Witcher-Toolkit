### Menu
* [Accueil](_accueil.md)
* [Etapes de développement](_etape_dev.md)
* [Cas d'usage](_uc.md)
* [Définitions](_definition.md)
* [Règles création fiche perso](_creer_fiche_perso.md)

# Créer une fiche personnage
Voici les différentes étapes de création d'une ficher personnage :
1. Choisir une race
2. Effectuer son parcours
3. Choisir sa profession
4. Choix des atouts magiques 
5. Choisir ses caractéristiques 
6. Choisir ses compétences acquises 
7. Prendre son or 
8. Acheter l'équipement

## 1. Choisir une race
Le choix de la race (sorceleur, elfe, nain, humain ou alfelin) va jouer sur la réputation que le personnage va avoir :

| Territoire   | Humain  | Elfe   | Nain   | Sorceleur      | Halfelin |
|:-------------|:--------|--------|--------|----------------|----------|
| Nord         | Neutre  | Haïs   | Toléré | Craint et haïs | Toléré   |
| Nilfgaard    | Neutre  | Neutre | Neutre | Craint et haïs | Neutre   |
| Skellige     | Neutre  | Neutre | Neutre | Toléré         | Neutre   |
| Dol Blathana | Haïs    | Neutre | Neutre | Toléré         | Neutre   |
| Mahakam      | Tolérés | Neutre | Neutre | Toléré         | Neutre   |

## 2. Effectuer son parcours
Le choix du parcours se fait en plusieurs étapes :
– Choix de la région
– En fonction de la région sélectionnée, choix de l'origine.
– Le choix de la situation familiale
– Le choix de la situation parentale
– Le choix du destin familial
– Le choix du destin parental
– La situation familiale
– Les amis influents
– Les frères et sœurs
– Choix d'un évènement important du passé (chanceux/malchanceux, alliés/ennemis, liaison amoureuse)
– En fonction de l'évènement, choisir un évènement en particulier parmi une liste prédéfinie.
– Choix du style personnel

Cette étape de la création de personnage n'a pas encore été prise en compte dans le projet, que ce soit du côté du front, du back ou BDD.
Cette étape est facultative lors de la création d'une fiche personnage.

## 3. Choisir sa profession
Les professions disponibles sont les suivantes :
– Artisan, barde, criminel, docteur, homme d'arme, mage, marchand, prêtre, sorceleur, noble.

Le choix de la profession va influer sur plusieurs éléments :
– Une compétence exclusive : la valeur dans cette compétence sera à définir lors de l'étape « Choisir ses compétences acquises ».
– La vigueur : la valeur de la vigueur est automatiquement saisie voir l'étape : "Choisir ses caractéristiques".
– Une liste de sorts, rituels ou envoûtements pour les utilisateurs de la magie : Ce choix sera à faire lors de l'étape « Choix des atouts magiques ».
– Des compétences : les valeurs dans ces compétences seront à définir lors de l'étape « Choisir ses compétences acquises ».
– Un équipement de départ : il faut choisir 5 éléments parmi une liste d'équipements. Cette liste d'équipement change en fonction du choix du job. Ces éléments seront mis dans l'inventaire.

NB :
- Si le choix de la race est "sorceleur", la profession est **obligatoirement** sorceleur. Dans ce cas, il possède automatiquement tous les signes de base.
- Si le choix de la profession est "mage" la réputation du personnage change et devient :

 | Territoire | Nord           | Nilfgaard | Skellige | Dol Blathana | Mahakam |
 |:-----------|:---------------|-----------|----------|--------------|---------|
 | Mage       | Craint et haîs | Toléré    | Toléré   | Neutre       | Toléré  |

## 4. Choix des atouts magiques
En fonction du métier choisi un certaint nombre atouts magiques sont à choisir.  
Pour le mage : choisir 5 sorts, novice, 1 rituel de novice, 1 envoûtement peu dangereux
Pour le prêtre : choisir 2 invocations de novice, 2 rituels de novice, 2 envoûtements peu dangereux

## 5. Choisir ses caractéristiques
Il y a un certain nombre de points à répartir dans chaque caractéristique : 60, 70, 75 ou 80 points. Il est aussi possible de lancer des dés (1D10) pour chacune des caractéristiques.
Les caractéristiques sont les suivantes : intelligence (INT), réflexes (RÉF), dextérité (DEX), corps (COR), vitesse (VIT), empathie (EMP), technique (TECH), volonté (VOL) et chance (CHA).  
En fonction des valeurs saisies, les caractéristiques dérivées seront calculées.
Les caractéristiques dérivées sont les suivantes : vigueur (VIG), étourdissement (ÉTOU), course (COURSE), saut (SAUT), points de santé (PS), endurance (END), encombrement (ENC), récupération (RÉC), pieds, poings.

VIG : la vigueur est défini en fonction de la profession choisie.
COURSE = VIT x 3
SAUT = COURSE / 5
ENC = COR x 10

| (COR + VOL) / 2 | PS | END | RÉC | ÉTOU |
|:----------------|:---|-----|-----|------|
| 2               | 10 | 10  | 2   | 2    |
| 3               | 15 | 15  | 3   | 3    |
| 4               | 20 | 20  | 4   | 4    |
| 5               | 25 | 25  | 5   | 5    |
| 6               | 30 | 30  | 6   | 6    |
| 7               | 35 | 35  | 7   | 7    |
| 8               | 40 | 40  | 8   | 8    |
| 9               | 45 | 45  | 9   | 9    |
| 10              | 50 | 50  | 10  | 10   |
| 11              | 55 | 55  | 10  | 10   |
| 12              | 60 | 60  | 10  | 10   |
| 13              | 65 | 65  | 10  | 10   |

| COR   | Poings  | Pieds    |
|:------|:--------|----------|
| 1-2   | 1D6 - 4 | 1D6      |
| 3-4   | 1D6 - 2 | 1D6 + 2  |
| 5-6   | 1D6     | 1D6 + 4  |
| 7-8   | 1D6 + 2 | 1D6 + 6  |
| 9-10  | 1D6 + 4 | 1D6 + 8  |
| 11-12 | 1D6 + 6 | 1D6 + 10 |
| 13    | 1D6 + 8 | 1D6 + 12 |

## 6. Choisir ses compétences acquises
- La valeur dans les point de compétences va de 0 à 10 points. Au moment de la création, la valeur max est de 6.
- Il y a 44 points à répartir avec au minimum 1 point dans chaque compétence lié à la profession ainsi que la compétence exclusive.  
- Il reste encore des points à ajouter à loisir dans les compétences autres celles qui concernent la proféssion et la compétence exclusive : nombre de points = Intelligence + Réflexes

## 7. Prendre son or
En fonction de la profession la quantité d'or est la suivante :

| Profession    | Pièces              | Moyenne |
|:--------------|:--------------------|---------|
| Artisant      | 120 couronnes x 2D6 | 720     |
| Barde         | 120 couronnes x 2D6 | 720     |
| Criminel      | 100 couronnes x 2D6 | 600     |
| Docteur       | 150 couronnes x 2D6 | 900     |
| Homme d'armes | 150 couronnes x 2D6 | 900     |
| Magicien      | 200 couronnes x 2D6 | 1 200   |
| Marchand      | 180 couronnes x 2D6 | 1 080   |
| Prêtre        | 75 couronnes x 2D6  | 450     |
| Sorceleur     | 80 couronnes x 2D6  | 300     |
| Noble         | 200 couronnes x 2D6 | 1 200   |

## 8. Acheter l'équipement
En fonction de la quantité d'or que possède le joueur, il peut acheter de l'équipement.
Il est possible d'ajouter manuellement sur la fiche personnage l'équipement, les composants et autres éléments que l'on peut acheter. On met à jour manuellement la quantité d'or en fonction des achats.
NB : par la suite, un magasin en ligne sera disponible et il suffira de sélectionner les éléments à acheter.
