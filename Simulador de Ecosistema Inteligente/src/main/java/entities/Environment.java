package entities;

import java.util.Random;

public class Environment {
    private String climate;
    private String terrain;
    private int availableResources;
    private int maxX; // Límite máximo en el eje X
    private int maxY; // Límite máximo en el eje Y

    public Environment(String climate, String terrain, int availableResources, int maxX, int maxY) {
        this.climate = climate;
        this.terrain = terrain;
        this.availableResources = availableResources;
        this.maxX = maxX;
        this.maxY = maxY;
    }

    // Getters y Setters para los atributos

    public int getMaxX() {
        return maxX;
    }

    public int getMaxY() {
        return maxY;
    }

    public int getRandomPositionX() {
        Random random = new Random();
        return random.nextInt(maxX);
    }

    public int getRandomPositionY() {
        Random random = new Random();
        return random.nextInt(maxY);
    }

    // Otros métodos según sea necesario
}
