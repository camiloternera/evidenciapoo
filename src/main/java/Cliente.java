/**
 *
 * @author Camilo
 */
public abstract class Cliente extends Banco {

    private String nombre;

    public Cliente(String nombre) {
        super(nombre);
    }

    public String obtenerNombre() {
        return nombre;
    }
    
    public abstract String obtenerIdentificacion();

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
