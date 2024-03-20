import entities.Environment;
import simulation.PopulationSimulation;
import usermanagement.SimulationManager;
import analysis.ProblemSolver;
import analysis.DataVisualizer;
import analysis.FunctionIntegrator;
import util.Logger;
import util.Validator;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Main {
    private static List<String> mensajes = new ArrayList<>();
    private static List<String> animales = new ArrayList<>();
    private static List<String> plantas = new ArrayList<>();
    private static List<String> ecosistemas = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Crear objetos para las diferentes clases
        Environment environment = new Environment("Templado", "Bosque", 1000, 100, 100);
        PopulationSimulation populationSimulation = new PopulationSimulation(environment, 10); // Cambiar el valor de healthChange según sea necesario
        SimulationManager simulationManager = new SimulationManager();
        ProblemSolver problemSolver = new ProblemSolver();
        DataVisualizer dataVisualizer = new DataVisualizer();
        FunctionIntegrator functionIntegrator = new FunctionIntegrator();
        Logger logger = new Logger();
        Validator validator = new Validator();

        // Interfaz de usuario interactiva
        boolean salir = false;
        while (!salir) {
            mostrarMenuPrincipal();
            int opcion = scanner.nextInt();
            scanner.nextLine(); // Consumir la nueva línea pendiente

            switch (opcion) {
                case 1:
                    iniciarSimulacion(scanner, simulationManager, populationSimulation);
                    break;
                case 2:
                    resolverProblema(scanner, problemSolver);
                    break;
                case 3:
                    visualizarDatos(scanner, dataVisualizer);
                    break;
                case 4:
                    integrarFuncion(scanner, functionIntegrator);
                    break;
                case 5:
                    registrarMensaje(scanner, logger);
                    break;
                case 6:
                    añadirInformacion(scanner);
                    break;
                case 7:
                    realizarExperimento(scanner, environment);
                    break;
                case 8:
                    // Salir
                    salir = true;
                    break;
                default:
                    System.out.println("Opción no válida. Por favor, seleccione una opción del 1 al 8.");
            }
        }

        // Cerrar el scanner al salir
        scanner.close();
    }

    private static void mostrarMenuPrincipal() {
        System.out.println("1. Iniciar simulación");
        System.out.println("2. Resolver problema ecológico");
        System.out.println("3. Visualizar datos");
        System.out.println("4. Integrar nueva función");
        System.out.println("5. Registrar mensaje");
        System.out.println("6. Validar datos");
        System.out.println("7. Realizar experimento virtual");
        System.out.println("8. Salir");
        System.out.print("Seleccione una opción: ");
    }

    private static void iniciarSimulacion(Scanner scanner, SimulationManager simulationManager, PopulationSimulation populationSimulation) {
        System.out.println("1. Interactuar con el ecosistema");
        System.out.println("2. Ver estado de la simulación");
        System.out.println("3. Volver al menú principal");
        System.out.print("Seleccione una opción: ");
        int opcion = scanner.nextInt();
        scanner.nextLine(); // Consumir la nueva línea pendiente

        switch (opcion) {
            case 1:
                // Aquí puedes agregar la lógica para interactuar con el ecosistema
                break;
            case 2:
                // Aquí puedes agregar la lógica para ver el estado de la simulación
                break;
            case 3:
                // Volver al menú principal
                break;
            default:
                System.out.println("Opción no válida. Por favor, seleccione una opción del 1 al 3.");
        }
    }

    private static void resolverProblema(Scanner scanner, ProblemSolver problemSolver) {
        System.out.println("1. Resolver problema de deforestación");
        System.out.println("2. Resolver problema de contaminación");
        System.out.println("3. Volver al menú principal");
        System.out.print("Seleccione una opción: ");
        int opcion = scanner.nextInt();
        scanner.nextLine(); // Consumir la nueva línea pendiente

        switch (opcion) {
            case 1:
                // Aquí puedes agregar la lógica para resolver el problema de deforestación
                break;
            case 2:
                // Aquí puedes agregar la lógica para resolver el problema de contaminación
                break;
            case 3:
                // Volver al menú principal
                break;
            default:
                System.out.println("Opción no válida. Por favor, seleccione una opción del 1 al 3.");
        }
    }

    private static void visualizarDatos(Scanner scanner, DataVisualizer dataVisualizer) {
        System.out.println("1. Ver información de los animales");
        System.out.println("2. Ver información de las plantas");
        System.out.println("3. Ver información de los ecosistemas");
        System.out.println("4. Volver al menú principal");
        System.out.print("Seleccione una opción: ");
        int opcion = scanner.nextInt();
        scanner.nextLine(); // Consumir la nueva línea pendiente

        switch (opcion) {
            case 1:
                System.out.println("Información de los animales: ");
                for (String animal : animales) {
                    System.out.println(animal);
                }
                break;
            case 2:
                System.out.println("Información de las plantas: ");
                for (String planta : plantas) {
                    System.out.println(planta);
                }
                break;
            case 3:
                System.out.println("Información de los ecosistemas: ");
                for (String ecosistema : ecosistemas) {
                    System.out.println(ecosistema);
                }
                break;
            case 4:
                // Volver al menú principal
                break;
            default:
                System.out.println("Opción no válida. Por favor, seleccione una opción del 1 al 4.");
        }
    }

    private static void integrarFuncion(Scanner scanner, FunctionIntegrator functionIntegrator) {
        System.out.println("1. Integrar nueva planta");
        System.out.println("2. Integrar nuevo animal");
        System.out.println("3. Integrar nuevo terreno");
        System.out.println("4. Volver al menú principal");
        System.out.print("Seleccione una opción: ");
        int opcion = scanner.nextInt();
        scanner.nextLine(); // Consumir la nueva línea pendiente

        switch (opcion) {
            case 1:
                // Aquí puedes agregar la lógica para integrar una nueva planta
                break;
            case 2:
                // Aquí puedes agregar la lógica para integrar un nuevo animal
                break;
            case 3:
                // Aquí puedes agregar la lógica para integrar un nuevo terreno
                break;
            case 4:
                // Volver al menú principal
                break;
            default:
                System.out.println("Opción no válida. Por favor, seleccione una opción del 1 al 4.");
        }
    }

    private static void registrarMensaje(Scanner scanner, Logger logger) {
        System.out.println("1. Registrar nuevo mensaje");
        System.out.println("2. Ver mensajes registrados");
        System.out.println("3. Volver al menú principal");
        System.out.print("Seleccione una opción: ");
        int opcion = scanner.nextInt();
        scanner.nextLine(); // Consumir la nueva línea pendiente

        switch (opcion) {
            case 1:
                System.out.println("Escriba su mensaje: ");
                String mensaje = scanner.nextLine();
                mensajes.add(mensaje);
                System.out.println("Mensaje registrado con éxito.");
                break;
            case 2:
                System.out.println("Mensajes registrados: ");
                for (String msg : mensajes) {
                    System.out.println(msg);
                }
                break;
            case 3:
                // Volver al menú principal
                break;
            default:
                System.out.println("Opción no válida. Por favor, seleccione una opción del 1 al 3.");
        }
    }

    private static void añadirInformacion(Scanner scanner) {
        System.out.println("1. Añadir información de animal");
        System.out.println("2. Añadir información de planta");
        System.out.println("3. Añadir información de ecosistema");
        System.out.println("4. Volver al menú principal");
        System.out.print("Seleccione una opción: ");
        int opcion = scanner.nextInt();
        scanner.nextLine(); // Consumir la nueva línea pendiente

        switch (opcion) {
            case 1:
                System.out.println("Ingrese la información del animal: ");
                String animal = scanner.nextLine();
                animales.add(animal);
                System.out.println("Información del animal añadida con éxito.");
                break;
            case 2:
                System.out.println("Ingrese la información de la planta: ");
                String planta = scanner.nextLine();
                plantas.add(planta);
                System.out.println("Información de la planta añadida con éxito.");
                break;
            case 3:
                System.out.println("Ingrese la información del ecosistema: ");
                String ecosistema = scanner.nextLine();
                ecosistemas.add(ecosistema);
                System.out.println("Información del ecosistema añadida con éxito.");
                break;
            case 4:
                // Volver al menú principal
                break;
            default:
                System.out.println("Opción no válida. Por favor, seleccione una opción del 1 al 4.");
        }
    }

    private static void realizarExperimento(Scanner scanner, Environment environment) {
        System.out.println("1. Realizar experimento de crecimiento de plantas");
        System.out.println("2. Realizar experimento de interacción animal");
        System.out.println("3. Volver al menú principal");
        System.out.print("Seleccione una opción: ");
        int opcion = scanner.nextInt();
        scanner.nextLine(); // Consumir la nueva línea pendiente

        switch (opcion) {
            case 1:
                // Aquí puedes agregar la lógica para realizar un experimento de crecimiento de plantas
                break;
            case 2:
                // Aquí puedes agregar la lógica para realizar un experimento de interacción animal
                break;
            case 3:
                // Volver al menú principal
                break;
            default:
                System.out.println("Opción no válida. Por favor, seleccione una opción del 1 al 3.");
        }
    }
}