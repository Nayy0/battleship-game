nayssam.benessalah.etu@univ-lille.fr
# Description du tp 
J'ai écrit 7 classes pour le jeu de la bataille navale :
* Boat, une classe pour les bateaux qui constuit des bateaux de longueurs n.
* Position, une classe qui créé des objets de type Position.
* Square, qui s'occupe du comportement des cases du plateaux de jeu.
* Board, qui crée un objet de type Board pour géré le plateau de jeu.
* Direction, un type énuméré pour indiquer dans quelle direction les bateaux sont posés sur la grille.
* Response, un type énuméré pour s'occuper des différentes réponses des tirs.
* Game, pour lancer une partie et s'occuper des comportements d'une partie.

Tout fonctionne conformement à la consigne de tp. Cependant pour l'affichage de la grille de jeu (toSting de Board) je me suis aidé de chat gpt car je n'avais aucune idéé de la manière dont je pouvais la réalisé avec mes connaissances.

## Commandes 
### Compilations
* Classes du packetage battleship :
```javac -sourcepath src src/battleship/*.java -d classes```
* Classes du packetages io :
```javac -sourcepath src src/io/*.java -d classes```

### Création du .jar pour battleship main
* Création du .jar executable: 
```jar cvfe battleship.jar battleship.BattleShipMain -C classes .```

### Execution
* Excetution sans .jar : 
```java -classpath classes battleship.BattleShipMain```
* Exectution avec le .jar : 
```java -jar battleship.jar```

### Compilation et exectution des tests
* Compilation : 
```javac -classpath junit-console.jar:classes test/battleship/*.java```
* Execution : 
```java -jar junit-console.jar -classpath test:classes -scan-classpath```

### Génération de la documentation
```javadoc -sourcepath src -subpackages battleship io -d docs```
