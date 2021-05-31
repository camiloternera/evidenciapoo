/**
 *
 * @author camilo
 */
public class Banco {
    
    private String nombre;
    private Cliente cliente[];
    private int numeroDeCliente;
    //Persona p = new Persona(p.getCedula(), p.getNombre(), p.getEdad());

    public Banco(String nombre) {
        this.nombre = nombre;
    }
    
    // @Override
    public String obtenerNombre(){
        return nombre;
    }
    
    public void cambiarNombre(String nombre) {
        this.nombre = nombre;
    }
    public void addCliente(Cliente clie) {
        
    }
    
    public int obtenerNumeroCliente(){
        
        return numeroDeCliente;
    }
    
    public Cliente obtenerCliente(int posicion) {
        return cliente[posicion];
    }

    public Cliente[] obtClientes(){
        return this.cliente;
    }

    public Cliente[] getCliente() {
        return cliente;
    }

    public void setCliente(Cliente[] cliente) {
        this.cliente = cliente;
    }

    public int getNumeroDeCliente() {
        return numeroDeCliente;
    }

    public void setNumeroDeCliente(int numeroDeCliente) {
        this.numeroDeCliente = numeroDeCliente;
    }    

}
