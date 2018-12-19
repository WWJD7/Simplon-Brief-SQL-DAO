# Simplon-Brief-SQL-DAO

## Comp�tences vis�es

| Comp�tences professionnelles |Savoir-faire techniques |Comp�tences transversales 
|--|--|--|
| Cr�er une base de donn�es **niveau 2 (restera le NoSQL)** | SQL, MySQL| Documentation et veille en Anglais, Analyse et mod�lisation|
|D�velopper les composants d�acc�s aux donn�es **niveau 2 (restera JPA)** |GIT, JDBC, Tests Unitaires, Architecture en couche | Notions de qualit� et de performances|



# Contexte
## Phase 1 : D�couverte et utilisation de SQL
	Pas de pr�requis particuliers mise � part la capacit� de lire un peu d�anglais technique

## Phase 2 : Persistance des objets JAVA vers une base de donn�e SQL

- Le langage Java avec les Exceptions, les Interfaces
-  A l'aise avec les commandes Git, un compte GitHub pour forker ce repository
- Le projet de  mod�lisation de classe du projet SHOP est termin� et assimil�
- Le pattern repository est assimil� et une impl�mentation vers des fichiers s�rialis�s fonctionne
- Des tests unitaires basiques ont �t� mis en place avec SHOP


# Dispositifs d�animation
## Ateliers Phase 1
- Learning by teachning en groupe sur les aspects principaux du SQL : Relations, Commandes (DDL, DML, DCL, TCL), les contraintes, Merise
-  Analyse et appropriation dans le contexte des exemples de W3 Schools sur SQL
- Cr�ation de tutoriels vid�os sur la sauvegarde et la restauration d'une base MySQL
- Kahoot sur les bases de SQL avec acronymes et exemples de r�sultats de requ�tes
-  Veille sur JDBC et les standard SQL ANSI 92

## Th�orie Phase 1 (2 heures)
- introduction sur le SQL
- Les principes avanc�es SQL : types de donn�es, index, contraintes et jointures
_ Le Modele Conceptuel de Donn�es (MCD) : regarder vid�o propos�e @home
 
## Projet Phase 1 (1 semaine)
- Passage du mod�le de SHOP en SQL
- Int�gration de donn�es de tests dans la BDD via un script
- Sauvegarde et restauration de la BDD

## Ateliers Phase 2 
 - Peer 2 Peer Programming pour les parties repository JDBC et Tests Unitaires
 - D�ploiement de son projet sur GitHub et r�cup�ration sur les postes d'autres apprenants
 - Revues de code entre apprenants sous la supervision du formateur par groupe de 5

## Th�orie Phase 2 (1 heure)
- JDBC (Java Database Connectivity)

## Projet  Phase 2 (1 semaine)
- Le projet SHOP est compl�tement utilisable avec un stockage SQL
- On peut m�me choisir de ne stocker certains repository seulement en SQL et les autres dans des fichiers




# Supports
- https://dev.mysql.com/doc/
-  https://www.w3schools.com/sql/default.asp
-  https://kahoot.it/
- https://www.youtube.com/watch?v=obfNA-838YY
- Le code JAVA du model de SHOP et son sh�ma UML (dans le repository Shop)
- https://www.oracle.com/technetwork/java/overview-141217.html


# Evaluations

- Les apprenants apprennent � cr�er un cahier de recette qui leur permet de pointer leur r�ussites points par points
- Leur base de donn�es est import�e par d'autre et fonctionne
- Les revues de codes en groupe et leurs interventions argument�es consolident leur acquisitions
- Les apprenants apprennent � cr�er une listes de test unitaires exhaustifs qui couvrent toutes les m�thodes des repositories et ils sont tous OK (verts !)
- Leur projet est sur Git et le formateur apr�s analyse @home dispensera des remarques en individuel le cas �ch�ant

# Accompagnement 

## Difficult�s � anticiper
- Probl�mes techniques d'installation des serveurs SQL
- Pour les personnes visuelles montrer des sch�mas styles th�orie des ensembles
- Difficult�s � comprendre l'architecture 3 couches
- Les relations en SQL sont la partie la plus abstraites
- Comprendre la correspondance entre associations UML (many to many, onetomany etc) vers des relations SQL.

## Accompagnement mettre en place
Pour les apprenants avec des lacunes sur les bases, r�duire le mod�le de SHOP a sa plus simple expression voire faire un projet avec 2 classes / tables

## M�thode, outil(s) de suivi individuel � mettre en place

