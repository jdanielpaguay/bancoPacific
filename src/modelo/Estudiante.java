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
public class Estudiante extends Persona{
    
    private double promedio;

    public Estudiante(int id) {
        super(id);
    }

    public Estudiante() {
    }

    public double getPromedio() {
        return promedio;
    }

    public void setPromedio(double promedio) {
        this.promedio = promedio;
    }
    
      @Override
    public void Mostrar(){
        //super.Mostrar();
          System.out.println(this.getNombre());
       System.out.println(" -------------> Soy Estudiante");
    }
    
}
