package simulation;

import java.util.Random;

public class RandomEventGenerator {
    private Random random;

    public RandomEventGenerator() {
        this.random = new Random();
    }

    public boolean generateRandomEvent(double probability) {
        return random.nextDouble() < probability;
    }

    // Otros métodos según sea necesario
}
