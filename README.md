### Menu
* [Accueil](README.md)
* [Etapes de développement](_etape_dev.md)
* [Cas d'usage](_uc.md)
* [Définitions](_definition.md)


Au moment du commit, le faire en ligne de commande :
````gitexclude
git add .
git commit -m "commentaire"
git push -u origin main
````
Configuration des packages pour une architecture héxagonale et reste
```
fr.meya.witcher
|	application
|	|	service
|	domaine
|	|	model
|	|	|	persistent
|	|	|	enumeration
|	|	port
|	|	|	in
|	|	|	out
|	infrasctucture
|	|	adapter
|	|	|	in
|	|	|	out
|	|	condig
|	exeption
|	message
|	|	request
|	|	response
```
- **application** : Couche des services applicatifs (orchestrateurs)
  - **service** : Services applicatifs **(cas d'utilisation)**, utilisent uniquement les interfaces du domaine. On y retrouve toutes les classes service

- **domain** : Couche du domaine métier, purement logique et indépendante.
  - **model** Modèles métier (entités & logiques)
    - **persistent** : Si besoin, modèle spécifique au stockage (couche abstraite). On y retrouve les classes JPA, les entités
    - **enumeration** : Enumérations métier.
  - **port** : Interfaces définissant les **Ports** (entrée/sortie)
    - **in** : Ports d'entrée (ex.: interfaces utilisées par les Adapters comme les Services).
    - **out** : Ports de sortie (interfaces pour les Adapters qui intègrent les accès externes, ex.: bases de données, APIs).

- **infrastructure** : Implémentation des Ports (Adapters, intégrations techniques).
  - **adapter** : Implémentations adaptées aux Ports.
    - **in** : Adapters d'entrée : Controllers REST, listeners, etc.
    - **out** : Adapters de sortie (repos, API externes, file systèmes, etc.).
  - **config** : Classes et fichiers de configuration spécifiques au framework (Spring, Jakarta).

- **exceptions** : pour des exceptions spécifiques et standardisées.

- **messages** : Transport Objects pour la communication extérieure (DTO, VO, etc.).
  - **request** : Objets représentant les requêtes entrant dans le système.
  - **response** : Objets pour les réponses sortantes.
