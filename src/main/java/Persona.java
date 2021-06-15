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

    
    /** Getter and Setter */
    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
}
