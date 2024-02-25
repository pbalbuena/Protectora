package main;

import entities.Animal;
import entities.Protectora;

public class Main {
	public static void main(String[] args) {
        // Creación de un objeto Animal
        Animal leon = new Animal("León", 5);
        Animal ardilla = new Animal("Ardilla", 1);
        Animal perro = new Animal("Perro", 3);
        Animal gato = new Animal("Gato", 2);
        
        Animal[] animales = { leon, ardilla, perro, gato };

        // Creación de un objeto Zoo y asignación del objeto Animal
        Protectora protectora = new Protectora("Protectora Central", animales);

        // Presentación del animal en el zoológico
        protectora.presentarAnimales();
    }
}
