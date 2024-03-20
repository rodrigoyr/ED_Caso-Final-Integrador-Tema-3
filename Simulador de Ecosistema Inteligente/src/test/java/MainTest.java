import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class MainTest {

    @Test
    public void testMostrarMenuPrincipal() {
        // Configuración de la entrada y salida de prueba
        java.io.ByteArrayOutputStream outContent = new java.io.ByteArrayOutputStream();
        System.setOut(new java.io.PrintStream(outContent));

        // Ejecutar el método a probar
        testMostrarMenuPrincipal();

        // Capturar la salida
        String expectedOutput = "1. Iniciar simulación\n" +
                "2. Resolver problema ecológico\n" +
                "3. Visualizar datos\n" +
                "4. Integrar nueva función\n" +
                "5. Registrar mensaje\n" +
                "6. Validar datos\n" +
                "7. Realizar experimento virtual\n" +
                "8. Salir\n" +
                "Seleccione una opción: ";
        String actualOutput = outContent.toString();

        // Verificar si la salida es la esperada
        assertEquals(expectedOutput, actualOutput);
    }
}
