/**
 *
 * @author camilo
 */
public class Banco extends Cliente {
    
    private String nombre;
    private Cliente cliente[];
    private int numeroDeCliente;

    public Banco(String nombre) {
        super(nombre);
    }
    
    public String obtenerNombre(){
        return nombre;
    }
    
    public void cambiarNombre(String nombre) {
        
    }
    public void addCliente(Cliente clie) {
        
    }
    
    public int obtenerNumeroCliente(int posicion){
        return numeroDeCliente;
    }
    
    public Cliente obtenerCliente(int posicion) {
        return cliente[posicion];
    }
    public Cliente[] obtClientes(){

    }

}
