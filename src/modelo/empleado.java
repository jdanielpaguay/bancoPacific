/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.Date;



/**
 *
 * @author siug
 * 
 */
public abstract class empleado extends Persona{
    
    private Date fechaAfilicacionIESS;

    public empleado() {
        
    }
    public empleado(int id) {
        super(id);
    }

    public Date getFechaAfilicacionIESS() {
        return fechaAfilicacionIESS;
    }

    public void setFechaAfilicacionIESS(Date fechaAfilicacionIESS) {
        this.fechaAfilicacionIESS = fechaAfilicacionIESS;
    }

   
    
}
