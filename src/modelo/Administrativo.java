/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author siug
 */
public class Administrativo extends empleado{
    
    private String cargo;

    public Administrativo() {
    }

    public Administrativo(int id) {
        super(id);
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
    
      @Override
    public void Mostrar(){
        super.Mostrar();
        
       System.out.println(" ------------> Soy Administrativo");
    }
    
}
