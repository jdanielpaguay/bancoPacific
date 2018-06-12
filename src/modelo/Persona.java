/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author siug
 * la clase persona es abstracta 
 * puede tener hijos pero no puede ser instanciada
 * la clase puede tener contructor una clase abstracta porque todavia puede tener hijos
 */
public abstract class Persona {
    
    private int id;
    private String nombre;
    private String apellido;

    public Persona(int id) {
        this.id = id;
        
    }
    public Persona(){
        
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    
   public void Mostrar(){
       
       System.out.println(String.format("Mi nombre es: %s,%s", nombre,apellido));
   } 
}
