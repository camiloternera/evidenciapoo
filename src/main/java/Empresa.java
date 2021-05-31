/**
 *
 * @author camilo
 */
public class Empresa extends Cliente {
    
    private String nit;
    private String representante;

    public Empresa (String nit, String nombre, String representante) {
        super(nombre);
        this.nit = nit;
        this.representante = representante;
    }

    @Override
    public String obtenerIdentificacion() {
        return this.obtenerIdentificacion();
    }

    public String obtenerRepresentante () {
        return representante;
    }

    public String cambiarRepresentante (String representante) {
        return this.representante;
    }

    public String getNit() {
        return nit;
    }

    public void setNit(String nit) {
        this.nit = nit;
    }

    public String getRepresentante() {
        return representante;
    }

    public void setRepresentante(String representante) {
        this.representante = representante;
    }

}
