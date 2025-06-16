/**
 * Clase para cálculos estadísticos sobre personas.
 * Aplicamos ABSTRACCIÓN al definir solo las operaciones necesarias para el problema.
 */
public class EstadisticasPersonas {
    /**
     * Calcula el promedio de edades.
     * @param personas : Arreglo de objetos Persona
     * @return Promedio de edades
     */
    public static double calcularPromedioEdades(Persona[] personas) {
        int total = 0;
        // Recorro todas las personas sumando sus edades
        for (Persona persona : personas) {
            total += persona.getEdad();
        }
        return (double) total / personas.length;
    }

    /**
     * Cuenta personas por género usando POLIMORFISMO.
     * El mismo método sirve para contar masculinos o femeninos según el parámetro.
     * @param personas : Arreglo de objetos Persona
     * @param genero   : "M" para masculino, "F" para femenino
     * @return Cantidad de personas del género especificado
     */
    public static int contarPorGenero(Persona[] personas, String genero) {
        int contador = 0;
        for (Persona persona : personas) {
            // Comparo ignorando mayúsculas/minúsculas
            if (persona.getGenero().equalsIgnoreCase(genero)) {
                contador++;
            }
        }
        return contador;
    }
}