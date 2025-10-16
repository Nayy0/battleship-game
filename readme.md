nayssam.benessalah.etu@univ-lille.fr
# Description du tp
Après avoir réalisé le diagramme UML ainsi que l'écriture de quelques méthodes en TD, l'objectif était du tp était d'écrire plusieurs classes pour réaliser un jeu de battaille navale. 
J'ai écrit 7 classes:

* Boat, une classe pour les bateaux qui constuit des bateaux de longueurs n.
* Position, une classe qui créé des objets de type Position.
* Square, qui s'occupe du comportement des cases du plateaux de jeu.
* Board, qui crée un objet de type Board pour géré le plateau de jeu.
* Direction, un type énuméré pour indiquer dans quelle direction les bateaux sont posés sur la grille.
* Response, un type énuméré pour s'occuper des différentes réponses des tirs.
* Game, pour lancer une partie et s'occuper des comportements d'une partie.

Tout fonctionne conformement à la consigne de tp. Cependant pour l'affichage de la grille de jeu(toSting de Board) je me suis aidé de chat gpt car je n'avais aucune idéé de la manière dont je pouvais la réalisé avec mes connaissances.

# Commandes 
## Compilations
* Compilation des classes de battleship: ```javac -sourcepath src src/battleship/*.java -d classes```
* Compilation des classes de io: ```javac -sourcepath src src/io/*.java -d classes```

## Création du jar pour battleship main
* Crétion du jar : ```jar cvfe battleship.jar battleship.BattleShipMain -C classes .```

## Execution
* Excetution sans jar : ```java -classpath classes battleship.BattleShipMain```
* Exectution avec le jar : ```java -jar battleship.jar```

## Compilation et exectution des tests
* Compilation : ```javac -classpath junit-console.jar:classes test/battleship/*.java```
* Execution : ```java -jar junit-console.jar -classpath test:classes -scan-classpath```

## Génération de la documentation
* ```javadoc -sourcepath src -subpackeges battleship io -d docs```


