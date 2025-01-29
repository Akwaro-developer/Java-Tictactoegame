//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
/*public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.print("Hello and welcome!");

        for (int i = 1; i < 101; i++) {
            //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
            // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
            System.out.println("i = " + i);
        }
    }



}*/

// Creating the while statement
/*public class Main {
    public static void main(String[] args) {
        int i = 0;
        while(i < 15) {
            System.out.println(i);
            i++;
        }
    }
}

// Java Boolean
public class Main {
    public static void main(String[] args) {
        boolean isJavaFun = true;
        boolean isFishTasty = false;
        System.out.println(isJavaFun);
        System.out.println(isFishTasty);
    }
}*/

//Écrire un programme n’affichant que les nombres pairs entre 0 et 100 (0, 2, 4,
//6, ...).

/*public class Main {
    public static void main(String[] args) {
        for (int i = 0; i <= 100; i++) {
            if (i % 2 == 0) { // To verify if the number is a pair
                System.out.println(i);
            }
        }
    }
}*/

// Java Data Types
/*public class Main {
    public static void main(String[] args) {
        int myNum=10; // integer whole number
        float myDig = 3.4f; // This is float
        char myChar = 'A'; // This is character
        boolean myBool =false; // This is boolean
        String text = "Hello this is the first time I am using java";
        System.out.println(text);
        System.out.println(myNum);
        System.out.println(myDig);
        System.out.println(myChar);
        System.out.println(myBool);


    }
}*/

// Java Arrays Examples
/*public class Main {
    public static void main(String[] args) {
        String [] colors = { "red", "yellow", "green", "blue" };
        System.out.println(colors[0]);
    }
}*/


//LOOPING THROUGH AN ARRAY IN JAVA with examples



/*public class Main {
    public static void main(String[] args) {
        String[] cars ={"BMW","Audi","Ford","Honda"};
        for (int i=0;i<cars.length;i++) {
            System.out.println(cars[i]);
        }
    }
}*/

// Java example of Arrays

/*public class Main {
    public static void main(String[] args) {
        int ages[] = {20, 22, 18, 35, 48, 26, 87, 70};
        float avg, sum = 0;

        // Get the length of the array
        int length = ages.length;
        // Loop through the elements of the array
        for (int age: ages) {
            sum += age;
        }
        //This is to calculate the average age by dividing the sum by the length
        avg = sum / length;
        System.out.println("The average age is: " +  avg);
    }
}*/

// UNDERSTANDING JAVA OBJECTS
//AN OBJECT IS AN INSTANCE OF A CLASS
//CREATING AN OBJECT EXAMPLE
/*public class Main {
    int b = 30;
    public static void main(String[] args) {
        Main m = new Main();
        System.out.println(m.b);
    }
}*/


// MULTIPLE OBJECTS-You can create multiple objects in one class

/*public class Main {
    int z =40;
    int k=30;
    public static void main(String[] args) {
        Main main1 = new Main();
        Main main2 = new Main();
        System.out.println(main1.z);
        System.out.println(main2.k);

    }
}*/

//Java Class Attributes Examples
/*public class Main {
    int c = 65;
    public static void main(String[] args) {

        Main myValue = new Main();
        myValue.c = 85;// c is now 85
        System.out.println(myValue.c);
    }
}*/

// MULTIPLE ATTRIBUTES IN JAVA AND UNDERSTANDING CLASSES AND OBJECTS
/*public class Main {
    String fname = "Hassan";
    String lname = "Mohammed";
    int age = 24;

    public static void main(String[] args) {
        Main myObj = new Main();
        System.out.println("Name: " + myObj.fname + " " + myObj.lname);
        System.out.println("Age: " + myObj.age);
    }
}*/


//JAVA CONSTRUCTORS


// JAVA FUNCTIONS
//Methods are used to perform certain actions, and they are also known as functions.

/*public class Main {
   static void myFunction() {
       System.out.println("Hello I am trying to call this function");
   }
   public static void main(String[] args) {
       myFunction();
       myFunction();
       myFunction();
   }
}*/

// Information can be passed as parameters which are variables

/*public class Main {
    // Method to print the elements of an array
    static void myFunction(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
    }

    public static void main(String[] args) {
        // Create an array of numbers from 0 to 100
        int[] numbers = new int[101]; // Array with 101 elements
        for (int i = 0; i <= 100; i++) {
            numbers[i] = i; // Populate the array
        }

        // Call myFunction with the numbers array
        myFunction(numbers);
    }
}*/

//Écrire un programme, en utilisant une boucle while, qui affiche tous les nombres de 1 à 100.

/*public class Main {
    // Fonction 1 : To show numbers with while
    static void enumerate_while(int max) {
        int i = 1; // Initialisation
        while (i <= max) { // Condition
            System.out.println(i);
            i++; // Incrémentation
        }
    }

    // Fonction 2 : Show nombres de 1 à max with loop for
    static void enumerate_for(int max) {
        for (int i = 1; i <= max; i++) { // Initialisation, condition, incrémentation
            System.out.println(i);
        }
    }

    // Fonction 3 : Afficher uniquement les nombres pairs de 0 à max
    static void enumerate_even(int max) {
        for (int i = 0; i <= max; i += 2) { // Incrémentation par 2
            System.out.println(i);
        }
    }

    // Méthode principale (point d'entrée du programme)
    public static void main(String[] args) {
        int max = 100; // Définir le nombre maximal à afficher

        System.out.println("Nombres de 1 à " + max + " avec une boucle while :");
        enumerate_while(max);

        System.out.println("\nNombres de 1 à " + max + " avec une boucle for :");
        enumerate_for(max);

        System.out.println("\nNombres pairs de 0 à " + max + " :");
        enumerate_even(max);
    }
}*/


/*public class Main {
    // Fonction pour trouver le plus petit carré supérieur ou égal à n
    static int smallestSquare(int n) {
        int i = 1; // Initialisation
        while (i * i < n) { // Vérifier si i^2 est inférieur à n
            i++; // Incrémentation
        }
        return i * i; // Retourne le carré parfait trouvé
    }

    public static void main(String[] args) {
        // Exemple 1
        int n1 = 63;
        System.out.println("Le plus petit carré supérieur ou égal à " + n1 + " est : " + smallestSquare(n1));

        // Exemple 2
        int n2 = 30;
        System.out.println("Le plus petit carré supérieur ou égal à " + n2 + " est : " + smallestSquare(n2));
    }
}*/

// JAVA MATH
/*public class Main {
    public static void main(String[] args) {
        System.out.println(Math.max(5,10));
    }
}*/


/*public class Main {
    public static void main(String[] args) {
        System.out.println(Math.min(10,5));
    }
}*/

/*public class Main {
    public static void main(String[] args) {
        System.out.println(Math.sqrt(64));
    }
}*/

//JAVA IF/ELSE STATEMENTS EXAMPLES
/*public class Main {
    public static void main(String[] args) {
        int time = 20;
        if (time < 18) {
            System.out.println("Good day.");
        } else {
            System.out.println("Good evening.");
        }
    }
}*/


/*public class Main {
    static void fibo() {
        System.out.println("Hello I am trying to call this function");
    }
    public static void main(String[] args) {
        fibo();

    }
}*/

/*public class Main {

    // Fonction pour générer les nombres de Fibonacci
    static int[] fibo(int n) {
        // Vérifier si l'entrée est valide
        if (n <= 0) {
            return new int[0]; // Retourner un tableau vide si l'entrée est invalide
        }

        int[] fibonacci = new int[n]; // Tableau pour stocker les nombres de Fibonacci

        // Initialisation des deux premiers nombres de Fibonacci
        if (n > 0) {
            fibonacci[0] = 0; // Premier nombre de Fibonacci
        }
        if (n > 1) {
            fibonacci[1] = 1; // Deuxième nombre de Fibonacci
        }

        // Calculer les nombres de Fibonacci restants
        for (int i = 2; i < n; i++) {
            fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2];
        }

        return fibonacci; // Retourner le tableau contenant les nombres de Fibonacci
    }

    public static void main(String[] args) {
        int n = 10; // Nombre de termes de Fibonacci à générer
        int[] fibonacciSequence = fibo(n); // Appeler la fonction fibo

        // Afficher les nombres de Fibonacci
        System.out.print("Les " + n + " premiers nombres de Fibonacci sont : ");
        for (int num : fibonacciSequence) {
            System.out.print(num + " ");
        }
    }
}*/


/*import java.util.ArrayList;

//JAVA ARRAY LIST-It is flexible to use and mutable
public class Main {
    public static void main(String[] args) {
        ArrayList<String> cars = new ArrayList<String>();
        cars.add("BMW");
        cars.add("Audi");
        cars.add("Volvo");
        cars.add("Ford");
        cars.add("Honda");
        cars.add("Mazda");
        cars.add("Mercedes");

        System.out.println(cars);

    }
}*/

/*import java.util.ArrayList;

//Adding an item in a specific position
public class Main {
    public static void main(String[] args) {
        ArrayList<String> cars = new ArrayList<String>();
        cars.add("BMW");
        cars.add("Audi");
        cars.add("Volvo");
        cars.add("Honda");
        cars.add("Ford");
cars.addFirst("Toyota");
System.out.println(cars);}
}*/

//Récrire la function précédente en utilisant une boucle for-each.
// Write a function using loop

/*import java.util.ArrayList;

public class DescribeNames {
    public static void main(String[] args) {
        // These are the list of names
        ArrayList<String> names = new ArrayList<>();
        names.add("Jean");
        names.add("Ahmed");
        names.add("Lea");
        names.add("Blanca");

        // Call the function describe and pass the names
        describe(names);
    }
 // This is a function with the parameters
    public static void describe(ArrayList<String> names) {
        for (String name : names) {
            //Show the name that follows the number of letters

            System.out.println(name + " : " + name.length());
        }
    }
}*/

//Écrire une fonction describe qui parcourt un ArrayList contenant des
//prénoms et qui n’affiche que ceux dont la longueur est supérieure ou égale à 4.

/*import java.util.ArrayList;

public class DescribeNames {
    public static void main(String[] args) {
        // Example of list of names
        ArrayList<String> names = new ArrayList<>();
        names.add("Jean");
        names.add("Ahmed");
        names.add("Lea");
        names.add("Blanca");

        // Call the function describe
        describe(names);
    }

    public static void describe(ArrayList<String> names) {
        // Using for-each for each list
        for (String name : names) {
            // Vérify the name is equal or superior to 4
            if (name.length() >= 4) {
                // Show the name
                System.out.println(name);
            }
        }
    }
}*/

//Écrire une fonction to_upper_case qui parcourt un tableau contenant des
//prénoms et qui affiche chacun des prénoms en majuscule.

/*import java.util.ArrayList;

public class DescribeNames {
    public static void main(String[] args) {
        // Example of list of names
        ArrayList<String> names = new ArrayList<String>();
        names.add("John");
        names.add("Jane");
        names.add("Bob");
        names.add("Jack");



        // Call the function describe
        to_upper_case(names);
    }

    public static void to_upper_case(ArrayList<String> names) {
        // Using for-each for each list
        for (String name : names) {
            // Vérify the name is equal or superior to 4
            if (name.length() >= 4) {
                // Show the name
                System.out.println(name.toUpperCase());
            }
        }
    }
}*/
// JAVA STRING METHODS EXAMPLES
/*public class Main {
    public static void main(String[] args) {
        String myStr1 = "Hello";
        String myStr2 = "";
        System.out.println(false);
        System.out.println(true);
    }
}*/

//The length() method returns the length of a specified string
/*public class Main {
    public static void main(String[] args) {
        String txt = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        System.out.println(txt.length());
    }
}*/
//The toLowerCase() method converts a string to lower case letters.
//The toUpperCase() method converts a string to upper case letters.

/*public class Main {
    public static void main(String[] args) {
        String text = "I love to travel to different countries in the world";
        System.out.println(text.toUpperCase());
        System.out.println(text.toLowerCase());
    }
}
*/

//The concat() method appends (concatenate) a string to the end of another string.
/*public class Main {
    public static void main(String[] args) {
        String firstName = "Anne";
        String lastName = "Defonse";
        System.out.println(firstName.concat(lastName));
    }
}*/






/*
public class DecryptMessage {
    public static String decrypt(String message) {
        // Remplacer tous les '0' par une chaîne vide
        return message.replace("0", "");
    }

    public static void main(String[] args) {
        // Message chiffré
        String encryptedMessage = "000000e00000Ce message est chiffré.";
        // Déchiffrer le message
        String decryptedMessage = decrypt(encryptedMessage);
        // Show the crypted message
        System.out.println(decryptedMessage);
    }
}
*/

//JAVA INHERITANCE
/*class Vehicle {
    protected String brand = "Ford";        // Vehicle attribute
    public void honk() {                    // Vehicle method
        System.out.println("Tuut, tuut!");
    }
}

class Car extends Vehicle {
    private String modelName = "Mustang";    // Car attribute
    public static void main(String[] args) {

        // Create a myCar object
        Car myCar = new Car();

        // Call the honk() method (from the Vehicle class) on the myCar object
        myCar.honk();

        // Display the value of the brand attribute (from the Vehicle class) and the value of the modelName from the Car class
        System.out.println(myCar.brand + " " + myCar.modelName);
    }
}*/


// JAVA INHERITANCE, EXAMPLE 2
/*class Animal {
    public void eat() {
        System.out.println("Eat");
    }
}

    class Dog extends Animal {
        public void eat() {
            System.out.println("Eat this food");
        }
    }

        class Cat extends Animal {
            public void eat() {
                System.out.println("Eat the other food");
            }
        }
public class Main {
    public static void main(String[] args) {
        Animal a1 = new Animal();
        Animal a2 = new Dog();
        Animal a3 = new Cat();

        a1.eat(); // Output: Eat
        a2.eat(); // Output: Eat this food
        a3.eat(); // Output: Eat the other food
    }
}*/

// Tic Tac Toe


/*class Cell {
    protected String cell = "TicTacToe"; // Cell attribute
    public void getRepresentation() {   // Cell method
        System.out.println("!");
    }
}

class TicTacToe extends Cell {
    private String size = "3x3"; // TicTacToe-specific attribute

    public static void main(String[] args) {
        //  Cell object
        Cell myCell = new TicTacToe(); //  object as a Cell reference

        // Calling the getRepresentation() method (from the Cell class)
        myCell.getRepresentation();

        // cell attribute
        System.out.println(myCell.cell);

        // Access "size" attribute from TicTacToe (requires a cast)
        TicTacToe ticTacToeCell = (TicTacToe) myCell; // Downcast to TicTacToe
        System.out.println(ticTacToeCell.size);
    }
}*/


// USING THIS REFERENCE IN JAVA
//USING THIS IS MEANT TO REFER TO THE CURRENT VARIABLE IN JAVA, SEE THE EXAMPLE BELOW
//https://www.geeksforgeeks.org/this-reference-in-java/

/*public class Person {
    // These are the attributes
    String name;
    int age;

    // Constructor
    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    //Getter for name
    public String getName() {
        return name;
    }
    // Setter for age
    public int getAge() {
        return age;
    }
    // Setter for name


    public void change_name(String name)
    {
        this.name = name;
    }

    // Method to Print the Details of
    // the person
    public void printDetails()
    {
        System.out.println("Name: " + this.name);
        System.out.println("Age: " + this.age);
        System.out.println();
    }

    // main function
    public static void main(String[] args)
    {
        // Objects Declared
        Person first = new Person("ABC", 18);
        Person second = new Person("XYZ", 22);

        first.printDetails();
        second.printDetails();

        first.change_name("PQR");
        System.out.println("Name has been changed to: "
                + first.getName());
    }



}*/

// DETAILED EXAMPLE OF JAVA CLASS, EXAMPLE 2
// Creating a Java class

// Creating a Java class
/*class Dog {
    // Declaring and initializing the attributes
    String breed;
    int age;
    String color;

    // methods to set breed, age, and color of the dog
    public void setBreed(String breed) {
        this.breed = breed;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public void setColor(String color) {
        this.color = color;
    }

    // method to print all three values
    public void printDetails() {
        System.out.println("Dog details:");
        System.out.println(this.breed);
        System.out.println(this.age);
        System.out.println(this.color);
    }
}

public class Main {
    public static void main(String[] args) {
        // Creating an object of the class Dog
        Dog obj = new Dog();

        // setting the attributes
        obj.setBreed("Golden Retriever");
        obj.setAge(2);
        obj.setColor("Golden");

        // Printing values
        obj.printDetails();

    }
}*/

//The game starts with an empty board.
//Player X is prompted to make a move (e.g., "Enter your move (row and column):").
//If the move is valid, the board updates with Player X's marker at the specified position.
//The updated board is displayed.

//The Scanner class is imported from the java.util package.
//It is used for reading user input from the console.

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
/*public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.print("Hello and welcome!");

        for (int i = 1; i < 101; i++) {
            //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
            // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
            System.out.println("i = " + i);
        }
    }



}*/

// Creating the while statement
/*public class Main {
    public static void main(String[] args) {
        int i = 0;
        while(i < 15) {
            System.out.println(i);
            i++;
        }
    }
}

// Java Boolean
public class Main {
    public static void main(String[] args) {
        boolean isJavaFun = true;
        boolean isFishTasty = false;
        System.out.println(isJavaFun);
        System.out.println(isFishTasty);
    }
}*/

//Écrire un programme n’affichant que les nombres pairs entre 0 et 100 (0, 2, 4,
//6, ...).

/*public class Main {
    public static void main(String[] args) {
        for (int i = 0; i <= 100; i++) {
            if (i % 2 == 0) { // To verify if the number is a pair
                System.out.println(i);
            }
        }
    }
}*/

// Java Data Types
/*public class Main {
    public static void main(String[] args) {
        int myNum=10; // integer whole number
        float myDig = 3.4f; // This is float
        char myChar = 'A'; // This is character
        boolean myBool =false; // This is boolean
        String text = "Hello this is the first time I am using java";
        System.out.println(text);
        System.out.println(myNum);
        System.out.println(myDig);
        System.out.println(myChar);
        System.out.println(myBool);


    }
}*/

// Java Arrays Examples
/*public class Main {
    public static void main(String[] args) {
        String [] colors = { "red", "yellow", "green", "blue" };
        System.out.println(colors[0]);
    }
}*/


//LOOPING THROUGH AN ARRAY IN JAVA with examples



/*public class Main {
    public static void main(String[] args) {
        String[] cars ={"BMW","Audi","Ford","Honda"};
        for (int i=0;i<cars.length;i++) {
            System.out.println(cars[i]);
        }
    }
}*/

// Java example of Arrays

/*public class Main {
    public static void main(String[] args) {
        int ages[] = {20, 22, 18, 35, 48, 26, 87, 70};
        float avg, sum = 0;

        // Get the length of the array
        int length = ages.length;
        // Loop through the elements of the array
        for (int age: ages) {
            sum += age;
        }
        //This is to calculate the average age by dividing the sum by the length
        avg = sum / length;
        System.out.println("The average age is: " +  avg);
    }
}*/

// UNDERSTANDING JAVA OBJECTS
//AN OBJECT IS AN INSTANCE OF A CLASS
//CREATING AN OBJECT EXAMPLE
/*public class Main {
    int b = 30;
    public static void main(String[] args) {
        Main m = new Main();
        System.out.println(m.b);
    }
}*/


// MULTIPLE OBJECTS-You can create multiple objects in one class

/*public class Main {
    int z =40;
    int k=30;
    public static void main(String[] args) {
        Main main1 = new Main();
        Main main2 = new Main();
        System.out.println(main1.z);
        System.out.println(main2.k);

    }
}*/

//Java Class Attributes Examples
/*public class Main {
    int c = 65;
    public static void main(String[] args) {

        Main myValue = new Main();
        myValue.c = 85;// c is now 85
        System.out.println(myValue.c);
    }
}*/

// MULTIPLE ATTRIBUTES IN JAVA AND UNDERSTANDING CLASSES AND OBJECTS
/*public class Main {
    String fname = "Hassan";
    String lname = "Mohammed";
    int age = 24;

    public static void main(String[] args) {
        Main myObj = new Main();
        System.out.println("Name: " + myObj.fname + " " + myObj.lname);
        System.out.println("Age: " + myObj.age);
    }
}*/


//JAVA CONSTRUCTORS


// JAVA FUNCTIONS
//Methods are used to perform certain actions, and they are also known as functions.

/*public class Main {
   static void myFunction() {
       System.out.println("Hello I am trying to call this function");
   }
   public static void main(String[] args) {
       myFunction();
       myFunction();
       myFunction();
   }
}*/

// Information can be passed as parameters which are variables

/*public class Main {
    // Method to print the elements of an array
    static void myFunction(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
    }

    public static void main(String[] args) {
        // Create an array of numbers from 0 to 100
        int[] numbers = new int[101]; // Array with 101 elements
        for (int i = 0; i <= 100; i++) {
            numbers[i] = i; // Populate the array
        }

        // Call myFunction with the numbers array
        myFunction(numbers);
    }
}*/

//Écrire un programme, en utilisant une boucle while, qui affiche tous les nombres de 1 à 100.

/*public class Main {
    // Fonction 1 : To show numbers with while
    static void enumerate_while(int max) {
        int i = 1; // Initialisation
        while (i <= max) { // Condition
            System.out.println(i);
            i++; // Incrémentation
        }
    }

    // Fonction 2 : Show nombres de 1 à max with loop for
    static void enumerate_for(int max) {
        for (int i = 1; i <= max; i++) { // Initialisation, condition, incrémentation
            System.out.println(i);
        }
    }

    // Fonction 3 : Afficher uniquement les nombres pairs de 0 à max
    static void enumerate_even(int max) {
        for (int i = 0; i <= max; i += 2) { // Incrémentation par 2
            System.out.println(i);
        }
    }

    // Méthode principale (point d'entrée du programme)
    public static void main(String[] args) {
        int max = 100; // Définir le nombre maximal à afficher

        System.out.println("Nombres de 1 à " + max + " avec une boucle while :");
        enumerate_while(max);

        System.out.println("\nNombres de 1 à " + max + " avec une boucle for :");
        enumerate_for(max);

        System.out.println("\nNombres pairs de 0 à " + max + " :");
        enumerate_even(max);
    }
}*/


/*public class Main {
    // Fonction pour trouver le plus petit carré supérieur ou égal à n
    static int smallestSquare(int n) {
        int i = 1; // Initialisation
        while (i * i < n) { // Vérifier si i^2 est inférieur à n
            i++; // Incrémentation
        }
        return i * i; // Retourne le carré parfait trouvé
    }

    public static void main(String[] args) {
        // Exemple 1
        int n1 = 63;
        System.out.println("Le plus petit carré supérieur ou égal à " + n1 + " est : " + smallestSquare(n1));

        // Exemple 2
        int n2 = 30;
        System.out.println("Le plus petit carré supérieur ou égal à " + n2 + " est : " + smallestSquare(n2));
    }
}*/

// JAVA MATH
/*public class Main {
    public static void main(String[] args) {
        System.out.println(Math.max(5,10));
    }
}*/


/*public class Main {
    public static void main(String[] args) {
        System.out.println(Math.min(10,5));
    }
}*/

/*public class Main {
    public static void main(String[] args) {
        System.out.println(Math.sqrt(64));
    }
}*/

//JAVA IF/ELSE STATEMENTS EXAMPLES
/*public class Main {
    public static void main(String[] args) {
        int time = 20;
        if (time < 18) {
            System.out.println("Good day.");
        } else {
            System.out.println("Good evening.");
        }
    }
}*/


/*public class Main {
    static void fibo() {
        System.out.println("Hello I am trying to call this function");
    }
    public static void main(String[] args) {
        fibo();

    }
}*/

/*public class Main {

    // Fonction pour générer les nombres de Fibonacci
    static int[] fibo(int n) {
        // Vérifier si l'entrée est valide
        if (n <= 0) {
            return new int[0]; // Retourner un tableau vide si l'entrée est invalide
        }

        int[] fibonacci = new int[n]; // Tableau pour stocker les nombres de Fibonacci

        // Initialisation des deux premiers nombres de Fibonacci
        if (n > 0) {
            fibonacci[0] = 0; // Premier nombre de Fibonacci
        }
        if (n > 1) {
            fibonacci[1] = 1; // Deuxième nombre de Fibonacci
        }

        // Calculer les nombres de Fibonacci restants
        for (int i = 2; i < n; i++) {
            fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2];
        }

        return fibonacci; // Retourner le tableau contenant les nombres de Fibonacci
    }

    public static void main(String[] args) {
        int n = 10; // Nombre de termes de Fibonacci à générer
        int[] fibonacciSequence = fibo(n); // Appeler la fonction fibo

        // Afficher les nombres de Fibonacci
        System.out.print("Les " + n + " premiers nombres de Fibonacci sont : ");
        for (int num : fibonacciSequence) {
            System.out.print(num + " ");
        }
    }
}*/


/*import java.util.ArrayList;

//JAVA ARRAY LIST-It is flexible to use and mutable
public class Main {
    public static void main(String[] args) {
        ArrayList<String> cars = new ArrayList<String>();
        cars.add("BMW");
        cars.add("Audi");
        cars.add("Volvo");
        cars.add("Ford");
        cars.add("Honda");
        cars.add("Mazda");
        cars.add("Mercedes");

        System.out.println(cars);

    }
}*/

/*import java.util.ArrayList;

//Adding an item in a specific position
public class Main {
    public static void main(String[] args) {
        ArrayList<String> cars = new ArrayList<String>();
        cars.add("BMW");
        cars.add("Audi");
        cars.add("Volvo");
        cars.add("Honda");
        cars.add("Ford");
cars.addFirst("Toyota");
System.out.println(cars);}
}*/

//Récrire la function précédente en utilisant une boucle for-each.
// Write a function using loop

/*import java.util.ArrayList;

public class DescribeNames {
    public static void main(String[] args) {
        // These are the list of names
        ArrayList<String> names = new ArrayList<>();
        names.add("Jean");
        names.add("Ahmed");
        names.add("Lea");
        names.add("Blanca");

        // Call the function describe and pass the names
        describe(names);
    }
 // This is a function with the parameters
    public static void describe(ArrayList<String> names) {
        for (String name : names) {
            //Show the name that follows the number of letters

            System.out.println(name + " : " + name.length());
        }
    }
}*/

//Écrire une fonction describe qui parcourt un ArrayList contenant des
//prénoms et qui n’affiche que ceux dont la longueur est supérieure ou égale à 4.

/*import java.util.ArrayList;

public class DescribeNames {
    public static void main(String[] args) {
        // Example of list of names
        ArrayList<String> names = new ArrayList<>();
        names.add("Jean");
        names.add("Ahmed");
        names.add("Lea");
        names.add("Blanca");

        // Call the function describe
        describe(names);
    }

    public static void describe(ArrayList<String> names) {
        // Using for-each for each list
        for (String name : names) {
            // Vérify the name is equal or superior to 4
            if (name.length() >= 4) {
                // Show the name
                System.out.println(name);
            }
        }
    }
}*/

//Écrire une fonction to_upper_case qui parcourt un tableau contenant des
//prénoms et qui affiche chacun des prénoms en majuscule.

/*import java.util.ArrayList;

public class DescribeNames {
    public static void main(String[] args) {
        // Example of list of names
        ArrayList<String> names = new ArrayList<String>();
        names.add("John");
        names.add("Jane");
        names.add("Bob");
        names.add("Jack");



        // Call the function describe
        to_upper_case(names);
    }

    public static void to_upper_case(ArrayList<String> names) {
        // Using for-each for each list
        for (String name : names) {
            // Vérify the name is equal or superior to 4
            if (name.length() >= 4) {
                // Show the name
                System.out.println(name.toUpperCase());
            }
        }
    }
}*/
// JAVA STRING METHODS EXAMPLES
/*public class Main {
    public static void main(String[] args) {
        String myStr1 = "Hello";
        String myStr2 = "";
        System.out.println(false);
        System.out.println(true);
    }
}*/

//The length() method returns the length of a specified string
/*public class Main {
    public static void main(String[] args) {
        String txt = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        System.out.println(txt.length());
    }
}*/
//The toLowerCase() method converts a string to lower case letters.
//The toUpperCase() method converts a string to upper case letters.

/*public class Main {
    public static void main(String[] args) {
        String text = "I love to travel to different countries in the world";
        System.out.println(text.toUpperCase());
        System.out.println(text.toLowerCase());
    }
}
*/

//The concat() method appends (concatenate) a string to the end of another string.
/*public class Main {
    public static void main(String[] args) {
        String firstName = "Anne";
        String lastName = "Defonse";
        System.out.println(firstName.concat(lastName));
    }
}*/






/*
public class DecryptMessage {
    public static String decrypt(String message) {
        // Remplacer tous les '0' par une chaîne vide
        return message.replace("0", "");
    }

    public static void main(String[] args) {
        // Message chiffré
        String encryptedMessage = "000000e00000Ce message est chiffré.";
        // Déchiffrer le message
        String decryptedMessage = decrypt(encryptedMessage);
        // Show the crypted message
        System.out.println(decryptedMessage);
    }
}
*/

//JAVA INHERITANCE
/*class Vehicle {
    protected String brand = "Ford";        // Vehicle attribute
    public void honk() {                    // Vehicle method
        System.out.println("Tuut, tuut!");
    }
}

class Car extends Vehicle {
    private String modelName = "Mustang";    // Car attribute
    public static void main(String[] args) {

        // Create a myCar object
        Car myCar = new Car();

        // Call the honk() method (from the Vehicle class) on the myCar object
        myCar.honk();

        // Display the value of the brand attribute (from the Vehicle class) and the value of the modelName from the Car class
        System.out.println(myCar.brand + " " + myCar.modelName);
    }
}*/


// JAVA INHERITANCE, EXAMPLE 2
/*class Animal {
    public void eat() {
        System.out.println("Eat");
    }
}

    class Dog extends Animal {
        public void eat() {
            System.out.println("Eat this food");
        }
    }

        class Cat extends Animal {
            public void eat() {
                System.out.println("Eat the other food");
            }
        }
public class Main {
    public static void main(String[] args) {
        Animal a1 = new Animal();
        Animal a2 = new Dog();
        Animal a3 = new Cat();

        a1.eat(); // Output: Eat
        a2.eat(); // Output: Eat this food
        a3.eat(); // Output: Eat the other food
    }
}*/

// Tic Tac Toe


/*class Cell {
    protected String cell = "TicTacToe"; // Cell attribute
    public void getRepresentation() {   // Cell method
        System.out.println("!");
    }
}

class TicTacToe extends Cell {
    private String size = "3x3"; // TicTacToe-specific attribute

    public static void main(String[] args) {
        //  Cell object
        Cell myCell = new TicTacToe(); //  object as a Cell reference

        // Calling the getRepresentation() method (from the Cell class)
        myCell.getRepresentation();

        // cell attribute
        System.out.println(myCell.cell);

        // Access "size" attribute from TicTacToe (requires a cast)
        TicTacToe ticTacToeCell = (TicTacToe) myCell; // Downcast to TicTacToe
        System.out.println(ticTacToeCell.size);
    }
}*/


// USING THIS REFERENCE IN JAVA
//USING THIS IS MEANT TO REFER TO THE CURRENT VARIABLE IN JAVA, SEE THE EXAMPLE BELOW
//https://www.geeksforgeeks.org/this-reference-in-java/

/*public class Person {
    // These are the attributes
    String name;
    int age;

    // Constructor
    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    //Getter for name
    public String getName() {
        return name;
    }
    // Setter for age
    public int getAge() {
        return age;
    }
    // Setter for name


    public void change_name(String name)
    {
        this.name = name;
    }

    // Method to Print the Details of
    // the person
    public void printDetails()
    {
        System.out.println("Name: " + this.name);
        System.out.println("Age: " + this.age);
        System.out.println();
    }

    // main function
    public static void main(String[] args)
    {
        // Objects Declared
        Person first = new Person("ABC", 18);
        Person second = new Person("XYZ", 22);

        first.printDetails();
        second.printDetails();

        first.change_name("PQR");
        System.out.println("Name has been changed to: "
                + first.getName());
    }



}*/

// DETAILED EXAMPLE OF JAVA CLASS, EXAMPLE 2
// Creating a Java class

// Creating a Java class
/*class Dog {
    // Declaring and initializing the attributes
    String breed;
    int age;
    String color;

    // methods to set breed, age, and color of the dog
    public void setBreed(String breed) {
        this.breed = breed;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public void setColor(String color) {
        this.color = color;
    }

    // method to print all three values
    public void printDetails() {
        System.out.println("Dog details:");
        System.out.println(this.breed);
        System.out.println(this.age);
        System.out.println(this.color);
    }
}

public class Main {
    public static void main(String[] args) {
        // Creating an object of the class Dog
        Dog obj = new Dog();

        // setting the attributes
        obj.setBreed("Golden Retriever");
        obj.setAge(2);
        obj.setColor("Golden");

        // Printing values
        obj.printDetails();

    }
}*/

//The game starts with an empty board.
//Player X is prompted to make a move (e.g., "Enter your move (row and column):").
//If the move is valid, the board updates with Player X's marker at the specified position.
//The updated board is displayed.

//The Scanner class is imported from the java.util package.
//It is used for reading user input from the console.

// Main class outside the TicTacToe class







