/**
 *
 * @author camilo
 */
public class Persona extends Cliente {
    private String cedula;
    private int edad;


    public Persona (String cedula, String nombre, int edad) {
        super(nombre);
        this.cedula = cedula;
        this.edad = edad;
    }

    @Override
    public String obtenerIdentificacion() {
        return cedula;
    }

    public int obtenerEdad() {
        return edad;
    }
    
    public void cumplirAnios(){

    }
}
