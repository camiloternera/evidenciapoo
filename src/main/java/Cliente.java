/**
 *
 * @author Camilo
 */
public abstract class Cliente extends Banco {

    public Cliente(String nombre) {
        super(nombre);
    }
    
    public abstract String obtenerIdentificacion();

    /** Getter and Setter */
    // public String getNombre() {
    //     return nombre;
    // }

    // public void setNombre(String nombre) {
    //     this.nombre = nombre;
    // }
}
