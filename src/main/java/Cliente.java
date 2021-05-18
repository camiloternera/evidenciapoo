/**
 *
 * @author camilo
 */
public abstract class Cliente {

    private String nombre;

    public Cliente(String nombre) {
        this.nombre = nombre;
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
