package usermanagement;

import java.util.ArrayList;
import java.util.List;

public class SimulationManager {
    private List<Object> simulations; // Lista para almacenar las simulaciones

    public SimulationManager() {
        this.simulations = new ArrayList<>();
    }

    public void addSimulation(Object simulation) { // Método para agregar simulaciones
        simulations.add(simulation);
    }

    // Otros métodos según sea necesario
}
