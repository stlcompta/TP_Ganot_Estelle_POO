**Partie 1**

**Etape 3**

Description des dépendances que nous allons utiliser:

Spring Web :

    Cette dépendance sert au développement d’application Web ainsi que d’API Web,à l'aide de MVC.
    

Spring Data JPA :

    Spring Data JPA permet d'implémenter facilement des référentiels basés sur JPA (API Java Persistence).
    Il facilite le développement des applications qui doivent accéder aux sources de données JPA.
    Il fournit un service qui appelle Hibernate, il n'y a pas besoin d'écrire de SQL mais du java.

Bean Validation with Hibernate validator:

    Permet la communication avec base de données, écrit des requêtes sql pour insérer des données, permet de créer une 
    base de donnée, de récupérer des données...

H2 Database:

    C'est  une des bases de données écrite en Java. H2 peut être intégré dans des applications Java ou peut 
    fonctionner en mode client-serveur. Il fournit également une vue console pour maintenir et interagir avec
    les tables et les données de la base de données à l'aide de l'interface graphique.

Spring Boot DevTools:

    Rend plus agréable d'utilisation le développement d'applications. Il fournit des fonctionnalités
    supplémentaires lors du développement, comme les redémarrages rapides des applications et autres configurations. 

Thymeleaf:

    Cette dépendance est conçue pour créer des environnements Web. Elle fournit un support permettant de générer 
    des documents HTML, XHTML, JavaScript et CSS, ou encore un simple format txt.

**Etape 13**

1. L'url d'appel/ greeting est paramétré par @GetMapping("/greeting")
2. return "greeting";
3. On le récupère avec (@RequestParam(name="nameGET",
   required=false , defaultValue="World")
**Etape 17**

La table ADDRESS a été créée ainsi qu'une séquence hibernate.

**Etape 18**

      Dans la classe Address, @Entity permet de définir le fait que 
      l'on va créer une table. Il y a des attributs dans la classequi correspondent
      aux futures colones de la table. Cela sera sous la forme Java Beans, il faut
      ainsi mettre un setter et getter par attribut. @Id et @GeneratedValue indiquent que
      le champ suivant,id, est clé primaire de la  table et de type Serial (incrémentation
      automatique quand une nouvelle insertion survient dans la table)



**Etape 20**

      Oui l'ensemble du contenu de data.sql se retrouve avec la requete 
      SELECT * FROM ADDRESS :


ID  	CONTENT ▲	                            CREATION  
1	     57 boulevard demorieux	                2021-11-12 15:41:24.718966
2	     51 allee du gamay, 34080 montpellier	2021-11-12 15:41:24.737881


**Etape 23** 

      L'annotation @Autowired nous permet de ne pas avoir à faire à configurer ce 
      qu'il faut injecter, ça le fait tout seul. 

**Etape 30**

      Bootstrap a été importé à l'aide de la dernière dépendance du fichier pom.xml
      
      
***Partie 2***

**Etape 6**

- Faut-il une clé API pour appeler MeteoConcept ?

Oui une clé API est nécessaire, les appels sont limités à un nombre donné par jour.

- Quelle URL appeler ?

Pour obtenir la météo quotidienne sur 2 semaines à une localisation donnée, j'utilise l'URL suivante:

https://api.meteo-concept.com/api/location/city?token=MON_TOKEN&latlng=LATTITUDE,LONGITUDE


- Quelle méthode HTTP utiliser ?

On utilise la méthode GET pour envoyer au serveur les informations inscrites par l'utilisateur dans l'URL.

- Comment passer les paramètres d’appels ?

Les paramètres d'appels se passent directement dans l'URL, par exemple si on veut passer en paramètre le code insee d'une commune ayant comme code 35238, on inscrit insee=35238.

- Où est l’information dont j’ai besoin dans la réponse :

Le fichier XML retourné contient la température minimale du lieu visé dans la balise "tmin" et la température maximale dans la balise "tmax", ces températures sont en °C, à 2 mètres.
Ces balises se situent à l'intérieur d'une balise "item", elle même dans une balise "forecast", elle même dans une balise "response"
	
Pour afficher la température du lieu visé par les coordonnées GPS:

Pour la température actuelle, on regarde dans les balises "tmin" et "tmax" de la balise "item" où la balise "day" contient 0.

	
Pour afficher la prévision de météo du lieu visé par les coordonnées GPS:
	
Pour la prévision météo, on regarde dans les balise "day" contenant 1 à 13 pour les deux semaines à venir. En plus des températures minimales et maximales, de nombreuses balises indiquent diverses prévisions, comme l'ensoleillement en heures, le cumul d'évapotranspiration en mm, la probabilité de gel entre 0 et 100% etc...



