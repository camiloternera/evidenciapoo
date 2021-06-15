/**
 *
 * @author camilo
 */
public class Banco {
    
    private String nombre;
    private Cliente cliente[];
    private int numerosCliente;
    //Persona p = new Persona(p.getCedula(), p.getNombre(), p.getEdad());

    public Banco(String nombre) {
        this.nombre = nombre;
    }
    
    public String obtenerNombre(){
        return nombre;
    }
    
    public void cambiarNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public void addCliente(Cliente clie) {
        
    }
    
    public int obtenerNumeroCliente(){
        
        return numerosCliente;
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

    public int getNumerosCliente() {
        return numerosCliente;
    }

    public void setNumerosCliente(int numerosCliente) {
        this.numerosCliente = numerosCliente;
    }

    /** Getter and Setter */
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    

}
