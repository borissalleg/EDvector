/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Estructuras;

import Personas.persona;
import java.time.LocalDate;

/**
 *
 * @author Forsaken
 */
public class vector 
{
    private persona p;
    private persona[] vecpersona = new persona[20];
    private int indice;
    public vector() {
        indice=-1;
    }

    /**
     * @return the p
     */
    public persona getP() {
        return p;
    }

    /**
     * @param p the p to set
     */
    public void setP(persona p) {
        this.p = p;
    }

    /**
     * @return the vecpersona
     */
    public persona[] getVecpersona() {
        return vecpersona;
    }

    /**
     * @param vecpersona the vecpersona to set
     */
    public void setVecpersona(persona[] vecpersona) {
        this.vecpersona = vecpersona;
    }
    
    public boolean VectorLLeno()
    {
        if (indice == 20)
            return true;
            else
               return false;
    }
    public boolean VectorVacio()
    {
        if (indice == -1)
            return true;
            else
               return false;
    }        

    
    public void InsertarElemento(String Nombre, String Apellido, LocalDate fnac)
    {
        if (!VectorLLeno())
        {   
            indice++;
            this.p = new persona(Nombre,Apellido,fnac);
            this.vecpersona[indice]= this.p;
        }
    }        

    
    public void ImprimirVector() 
    {
        for (int i=0;i<=this.indice;i++)
        {
            System.out.println(this.vecpersona[i].getNombre());
            System.out.println(this.vecpersona[i].getApellido());
            System.out.println(this.vecpersona[i].getFechaNacimiento());
            
        }    
        
        
    }
    
    
    
}
