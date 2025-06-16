import java.util.Scanner;

/**
 * Clase principal con el método main.
 * Aquí coordino todo el programa como un novato que sigue pasos lógicos.
 */
public class Main {
    // Constante para el número de personas (cumpliendo con la indicación)
    private static final int NUM_PERSONAS = 5;

    public static void main(String[] args) {
        // Como novato: primero creo un espacio para guardar 5 personas
        Persona[] personas = new Persona[NUM_PERSONAS];

        // Paso 1: Capturar datos
        capturarPersonas(personas);

        // Paso 2: Mostrar nombres y géneros
        System.out.println("\n=== Información Básica ===");
        mostrarNombresGeneros(personas);

        // Paso 3: Calcular y mostrar estadísticas
        System.out.println("\n=== Estadísticas ===");
        mostrarEstadisticas(personas);
    }

    /**
     * Captura los datos de las personas por teclado.
     * @param personas : Arreglo donde guardaremos los objetos Persona
     */
    public static void capturarPersonas(Persona[] personas) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Captura de datos de " + NUM_PERSONAS + " personas:");

        for (int i = 0; i < NUM_PERSONAS; i++) {
            System.out.println("\nPersona #" + (i + 1));

            // Pido cada dato por separado
            System.out.print("Nombre: ");
            String nombre = scanner.nextLine();

            System.out.print("Apellido: ");
            String apellido = scanner.nextLine();

            System.out.print("Género (M/F): ");
            String genero = scanner.nextLine();

            System.out.print("Edad: ");
            int edad = Integer.parseInt(scanner.nextLine());  // Uso parseo seguro

            // Creo el objeto Persona usando el constructor
            personas[i] = new Persona(nombre, apellido, genero, edad);
        }
    }

    /**
     * Muestra nombres y géneros usando el método polimórfico.
     * @param personas : Arreglo de personas a mostrar
     */
    public static void mostrarNombresGeneros(Persona[] personas) {
        for (Persona persona : personas) {
            // Aquí uso el método polimórfico obtenerInfoBasica()
            System.out.println(persona.obtenerInfoBasica());
        }
    }

    /**
     * Calcula y muestra todas las estadísticas requeridas.
     * @param personas : Arreglo de personas para los cálculos
     */
    public static void mostrarEstadisticas(Persona[] personas) {
        // Uso los métodos de EstadisticasPersonas
        double promedio = EstadisticasPersonas.calcularPromedioEdades(personas);
        int masculinos = EstadisticasPersonas.contarPorGenero(personas, "M");
        int femeninos = EstadisticasPersonas.contarPorGenero(personas, "F");

        System.out.println("Promedio de edades: " + String.format("%.2f", promedio));
        System.out.println("Personas género masculino: " + masculinos);
        System.out.println("Personas género femenino: " + femeninos);
    }
}