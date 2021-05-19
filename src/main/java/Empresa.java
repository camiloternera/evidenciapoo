/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author camilo
 */
public class Empresa extends Persona {
    
    private String nit;
    private String representante;

    public Empresa (String nit, String nombre, String representante) {
        
        this.nit = nit;
        this.representante = representante;
    }

    @Override
    public String obtenerIdentificacion() {
        // TODO Auto-generated method stub
        return super.obtenerIdentificacion();
    }

    public String obtenerRepresentante () {
        
    }

    public String cambiarRepresentante (String representante) {

    }

}
