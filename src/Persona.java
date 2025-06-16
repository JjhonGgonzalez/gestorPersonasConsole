/**
 * Clase que representa a una Persona.
 * Aquí aplicamos ABSTRACCIÓN: creo un modelo simplificado de una persona real,
 * enfocándome solo en las propiedades que necesito para este programa.
 * También aplicamos ENCAPSULAMIENTO: protejo los datos internos con 'private'
 * y solo permito el acceso mediante métodos públicos controlados.
 */
public class Persona {
    // Propiedades privadas (encapsulamiento)
    private String nombre;
    private String apellido;
    private String genero;
    private int edad;

    /**
     * Constructor - Método especial para crear objetos Persona.
     * Como novato, entiendo que este es el "molde" inicial para mis personas.
     * @param nombre   : Nombre de la persona
     * @param apellido : Apellido de la persona
     * @param genero   : Género (M/F)
     * @param edad     : Edad en años
     */
    public Persona(String nombre, String apellido, String genero, int edad) {
        // Uso 'this' para diferenciar las propiedades del objeto de los parámetros
        this.nombre = nombre;
        this.apellido = apellido;
        this.genero = genero;
        this.edad = edad;
    }

    // Métodos de acceso (getters) - Parte del encapsulamiento
    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getGenero() {
        return genero;
    }

    public int getEdad() {
        return edad;
    }

    /**
     * Método polimórfico para mostrar información básica.
     * POLIMORFISMO: Este método podría comportarse diferente en subclases
     */
    public String obtenerInfoBasica() {
        return nombre + " " + apellido + " (" + genero + ")";
    }
}