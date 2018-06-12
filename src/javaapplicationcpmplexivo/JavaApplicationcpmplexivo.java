/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplicationcpmplexivo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import modelo.Administrativo;
import modelo.Docente;
import modelo.Estudiante;
import modelo.Persona;

/**
 *
 * @author siug
 */
public class JavaApplicationcpmplexivo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Docente dn1=new Docente(100);
        dn1.setApellido("Perez");
        dn1.setNombre("Maria");
        Administrativo ta1=new Administrativo(200);
        ta1.setApellido("Perez");
        ta1.setNombre("Marcos");
        Estudiante en1=new Estudiante(300);
        en1.setApellido("Perez");
        en1.setNombre("Teresa");
        
        List<Persona> personas = new ArrayList<>();
        personas.add(en1);
        personas.add(ta1);
        personas.add(dn1);
        
        personas.forEach((persona) -> {
            persona.Mostrar();
        });
            
    Scanner s= new Scanner(System.in);
    
    s.nextLine();
    
    }
    
    
}
