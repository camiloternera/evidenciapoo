/**
 *
 * @author camilo
 */
public class Banco extends Cliente {
    
    private String nombre;
    private Cliente cliente[];
    private int numeroDeCliente;
    //Persona p = new Persona(p.getCedula(), p.getCedula(), p.getEdad());

    public Banco(String nombre) {
        super(nombre);
    }
    
    @Override
    public String obtenerNombre(){
        return nombre;
    }
    
    public void cambiarNombre(String nombre) {
        this.nombre = nombre;
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

    @Override
    public String obtenerIdentificacion() {
        // TODO Auto-generated method stub
        return null;
    }

}
