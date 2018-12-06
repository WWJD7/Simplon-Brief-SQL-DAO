<<<<<<< Upstream, based on origin/master
# Simplon-Brief-SQL-DAO
=======

## Compétences visées

| Compétences professionnelles |Savoir-faire techniques |Compétences transversales 
|--|--|--|
| Créer une base de données **niveau 2 (restera le NoSQL)** | SQL, MySQL| Documentation et veille en Anglais, Analyse et modélisation|
|Développer les composants d’accès aux données **niveau 2 (restera JPA)** |GIT, JDBC, Tests Unitaires, Architecture en couche | Notions de qualité et de performances|



# Contexte
## Phase 1 : Découverte et utilisation de SQL
	Pas de prérequis particuliers mise à part la capacité de lire un peu d’anglais technique

## Phase 2 : Persistance des objets JAVA vers une base de donnée SQL

- Le langage Java avec les Exceptions, les Interfaces
-  A l'aise avec les commandes Git, un compte GitHub pour forker ce repository
- Le projet de  modélisation de classe du projet SHOP est terminé et assimilé
- Le pattern repository est assimilé et une implémentation vers des fichiers sérialisés fonctionne
- Des tests unitaires basiques ont été mis en place avec SHOP


# Dispositifs d’animation
## Ateliers Phase 1
- Learning by teachning en groupe sur les aspects principaux du SQL
-  Analyse et appropriation dans le contexte des exemples de W3 Schools sur SQL
- Création de tutoriels vidéios sur la sauvegarde et la restauration d'une base MySQL
- Kahoot sur les bases de SQL avec acronymes et exemples de résultats de requêtes
-  Veille sur JDBC et les standard SQL ANSI 92

## Théorie Phase 1 (2 heures)
- introduction sur le SQL
- Les principes avancées SQL : types de données, index, contraintes et jointures
 
## Projet Phase 1 (1 semaine)
- Passage du modèle de SHOP en SQL
- Intégration de données de tests dans la BDD via un script
- Sauvegarde et restauration de la BDD

## Ateliers Phase 2 
 - Peer 2 Peer Programming pour les parties repository JDBC et Tests Unitaires
 - Déploiement de son projet sur GitHub et récupération sur les postes d'autres apprenants
 - Revues de code entre apprenants sous la supervision du formateur par groupe de 5

## Théorie Phase 2 (1 heure)
- JDBC (Java Database Connectivity)

## Projet  Phase 2 (1 semaine)
- Le projet SHOP est complètement utilisable avec un stockage SQL
- On peut même choisir de ne stocker certains repository seulement en SQL et les autres dans des fichiers




# Supports
- https://dev.mysql.com/doc/
-  https://www.w3schools.com/sql/default.asp
-  https://kahoot.it/
- Le code JAVA du model de SHOP et son shéma UML (dans ce repository)
- https://www.oracle.com/technetwork/java/overview-141217.html


# Evaluations

- Les apprenants apprennent à créer un cahier de recette qui leur permet de pointer leur réussites points par points
- Leur base de données est importée par d'autre et fonctionne
- Les revues de codes en groupe et leurs interventions argumentées consolident leur acquisitions
- Les apprenants apprennent à créer une listes de test unitaires exhaustifs qui couvrent toutes les méthodes des repositories et ils sont tous OK (verts !)
- Leur projet est sur Git et le formateur après analyse @home dispensera des remarques en individuel le cas échéant

# Accompagnement 

## Difficultés à anticiper
- Problèmes techniques d'installation des serveurs SQL
- Pour les personnes visuelles montrer des schémas styles théorie des ensembles
- Difficultés à comprendre l'architecture 3 couches
- Les relations en SQL sont la partie la plus abstraites
- Comprendre la correspondance entre associations UML (many to many, onetomany etc) vers des relations SQL.

## Accompagnement mettre en place
Pour les apprenants avec des lacunes sur les bases, réduire le modèle de SHOP a sa plus simple expression voire faire un projet avec 2 classes / tables

## Méthode, outil(s) de suivi individuel à mettre en place

>>>>>>> 0421614 Blah
