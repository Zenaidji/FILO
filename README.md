# ThreeStack
ce depot contien deux repertoire `threestack` qui est l'implémentaion de la FILO et `thresstacktest` qui sont les test de la classe threestack.
- la classe`threestack`permet de créer et gérer trois piles en utilisant la structure de données LinkedList. Les piles peuvent être utilisées pour stocker des objets de type String.

## Fonctionnalités

- Ajout d'un élément à la pile en utilisant la méthode `push(int FILO, String element)` où FILO est l'identifiant de la pile (1, 2 ou 3) et element est l'élément à ajouter.
- Suppression d'un élément à la pile en utilisant la méthode `pop(int FILO)` où FILO est l'identifiant de la pile (1, 2 ou 3).
## Dépendances
La classe utilise la bibliothèque Java `java.util.LinkedList` pour stocker les éléments des piles.
## compilations et execution
- `javac ThreeStack.java`
- `java ThreeStack`