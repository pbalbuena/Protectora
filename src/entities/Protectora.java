package entities;

public class Protectora {
	private String nombre;
    private Animal[] animales;

    // Constructor
    public Protectora(String nombre, Animal[] animales) {
        this.nombre = nombre;
        this.animales = animales;
    }

    // Método para presentar el animal en la protectora
    public void presentarAnimales() {
    	for (Animal animal : animales) {
    		System.out.println("En la protectora " + nombre + " hay un " + animal.getNombre() + " de " + animal.getEdad() + " años.");
		}
    }

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Animal[] getAnimales() {
		return animales;
	}

	public void setAnimal(Animal[] animales) {
		this.animales = animales;
	}
    
    
}
