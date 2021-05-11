
import Estructuras.vector;
import Personas.persona;
import java.time.LocalDate;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Forsaken
 */
public class main {
    /**
     * @param args the command line arguments
     */
   public static void main(String[] args) {
       
       Scanner sc = new Scanner(System.in);
       String n, a;
        int m;
        int dia , mes , ano;
        
       LocalDate date;
       vector v = new vector();
       for (int i=0;i<=3;i++)
       { 
           System.out.println("Digite el nombre de la persona >==> " );
           n= sc.next();
           System.out.println("Digite el Apellido");
           a= sc.next();
           System.out.println("Digite al Año de nacimiento ");
           ano= sc.nextInt();
           System.out.println("Digite al Mes de nacimiento ");
           mes= sc.nextInt();
           System.out.println("Digite al Dia de nacimiento ");
           dia=sc.nextInt();
           date =  LocalDate.of(ano,mes,dia);
           
           v.InsertarElemento(n, a, date);
       }   
        
        
        System.out.println(v.getVecpersona());
        v.ImprimirVector();
    }
    
}
