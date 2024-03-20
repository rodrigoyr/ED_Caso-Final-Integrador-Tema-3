package entities;

public class Animal {
    private int positionX;
    private int positionY;
    private int health;
    private int age;
    private boolean reproductiveState;

    public Animal(int positionX, int positionY) {
        this.positionX = positionX;
        this.positionY = positionY;
        this.health = 100;
        this.age = 0;
        this.reproductiveState = false;
    }

    public void move(int newX, int newY) {
        this.positionX = newX;
        this.positionY = newY;
    }

    public void age() {
        this.age++;
    }

    public void updateHealth(int change) {
        this.health += change;
    }

    public void setReproductiveState(boolean state) {
        this.reproductiveState = state;
    }

    public boolean isReproductive() {
        return this.reproductiveState;
    }

    // Otros métodos y atributos según sea necesario
}
