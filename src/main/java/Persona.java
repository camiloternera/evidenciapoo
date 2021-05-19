/**
 *
 * @author camilo
 */
public class Persona extends Cliente {

    private String cedula = null;
    private int edad = 0;

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
