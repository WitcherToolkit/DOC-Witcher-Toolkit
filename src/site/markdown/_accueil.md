### Menu
* [Accueil](_accueil.md)
* [Etapes de développement](_etape_dev.md)
* [Cas d'usage](_uc.md)
* [Définitions](_definition.md)
* [Règles création fiche perso](_creer_fiche_perso.md)

Au moment du commit, le faire en ligne de commande :
````gitexclude
git add .
git commit -m "commentaire"
git push -u origin main
````
## Architecture de l'application
```
┌──────────────┐
│  Angular App │  (Frontend)
└──────┬───────┘
       │ HTTP/REST
       ↓
┌──────────────┐
│QuestConnect  │  (API Gateway + Sécurité)
│              │  - Authentification JWT
│              │  - Gestion des rôles
│              │  - Passerelle (pass-through)
└──────┬───────┘
       │ HTTP/REST
       ↓
┌──────────────┐
│WitcherToolKit│  (Business Logic)
│              │  - Logique métier
│              │  - Validation
│              │  - Mapping DTO ↔ Entité
└──────┬───────┘
       │ JPA/Hibernate
       ↓
┌──────────────┐
│   Database   │
└──────────────┘
```

## Exemple de Flux Détaillé - Création d'un Personnage
```
1. Angular
   ↓ POST /api/personnages + JWT
   
2. QuestConnect
   ↓ Valide JWT + rôles
   ↓ Forward POST /personnages
   
3. WitcherToolKit - Controller (Adapter In)
   ↓ Reçoit PersonnageVolatile
   
4. WitcherToolKit - Service (Domain)
   ↓ DTO → Entité
   ↓ Logique métier
   
5. WitcherToolKit - Repository (Adapter Out)
   ↓ Save en BDD
   
6. WitcherToolKit - Service
   ↓ Entité → DTO
   
7. WitcherToolKit - Controller
   ↓ ResponseEntity<PersonnageVolatile> (201 Created)
   
8. QuestConnect
   ↓ Forward response
   
9. Angular
   ↓ Récupère PersonnageVolatile avec ID
   ↓ Navigate vers /personnages/{id}
```

## Configuration des packages pour une architecture héxagonale et REST
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
