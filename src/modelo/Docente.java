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
public class Docente extends empleado {
    
     private int numeroPapers;

    public Docente(int id) {
        super(id);
    }

    public Docente() {
    }


    public int getNumeroPapers() {
        return numeroPapers;
    }

    public void setNumeroPapers(int numeroPapers) {
        this.numeroPapers = numeroPapers;
    }
    
   
    @Override
    public void Mostrar(){
        super.Mostrar();
        
       System.out.println(" -------> Soy Docente");
    }
    
    
}
