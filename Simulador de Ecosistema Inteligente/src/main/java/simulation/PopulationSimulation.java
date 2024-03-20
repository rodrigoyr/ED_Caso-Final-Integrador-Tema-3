package simulation;

import entities.Animal;
import entities.Plant;
import entities.Environment;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class PopulationSimulation {
    private List<Animal> animals;
    private List<Plant> plants;
    private Environment environment;
    private Random random;
    private int healthChange; // Nuevo atributo

    public PopulationSimulation(Environment environment, int healthChange) {
        this.animals = new ArrayList<>();
        this.plants = new ArrayList<>();
        this.environment = environment;
        this.random = new Random();
        this.healthChange = healthChange; // Se asigna el valor del cambio de salud
    }

    public void addAnimal(Animal animal) {
        animals.add(animal);
    }

    public void addPlant(Plant plant) {
        plants.add(plant);
    }

    public void simulateOneDay() {
        // Simular el crecimiento y la reproducción de las plantas
        for (Plant plant : plants) {
            plant.grow();
            if (plant.isReproductive()) {
                int randomX = random.nextInt(environment.getMaxX());
                int randomY = random.nextInt(environment.getMaxY());
                plants.add(new Plant(randomX, randomY));
                plant.setReproductiveState(false);
            }
        }

        // Simular el movimiento, envejecimiento y salud de los animales
        for (Animal animal : animals) {
            int randomX = random.nextInt(environment.getMaxX());
            int randomY = random.nextInt(environment.getMaxY());
            animal.move(randomX, randomY);
            animal.age();
            animal.updateHealth(healthChange); // Se utiliza el valor del cambio de salud pasado como parámetro
            if (animal.isReproductive()) {
                animals.add(new Animal(randomX, randomY));
                animal.setReproductiveState(false);
            }
        }
    }

    // Otros métodos según sea necesario
}
