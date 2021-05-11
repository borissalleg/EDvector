/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Personas;

import java.time.LocalDate;

/**
 *
 * @author Forsaken
 */
public class persona 
{
    /*
    1. definir atributos
    */
    protected String Nombre ;
    protected String Apellido;
    protected LocalDate FechaNacimiento;
    
    /*
    2. definir metodo constructor
    */
    
    public persona() 
    {
    }
    public persona(String Nombre, String Apellido, LocalDate FechaNacimiento) {
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.FechaNacimiento = FechaNacimiento;
    }
     
    /*
    3. Encapsulamiento
   */

    /**
     * @return the Nombre
     */
    public String getNombre() {
        return Nombre;
    }

    /**
     * @param Nombre the Nombre to set
     */
    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    /**
     * @return the Apellido
     */
    public String getApellido() {
        return Apellido;
    }

    /**
     * @param Apellido the Apellido to set
     */
    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    /**
     * @return the FechaNacimiento
     */
    public LocalDate getFechaNacimiento() {
        return FechaNacimiento;
    }

    /**
     * @param FechaNacimiento the FechaNacimiento to set
     */
    public void setFechaNacimiento(LocalDate FechaNacimiento) {
        this.FechaNacimiento = FechaNacimiento;
    }
    

    

   
    
}
