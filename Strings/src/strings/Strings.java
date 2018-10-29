/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package strings;
import java.util.*;
/**
 *
 * @author admin
 */
public class Strings {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Scanner para leer de teclado
        Scanner teclado= new Scanner (System.in);
        
        //variables string a usar
        String nombre, apellido;
        
        //Pedimos nombre y apellido
        System.out.println("Introduce tu nombre: ");
        nombre=teclado.nextLine();
        
        System.out.println("Introduce tu apellido: ");
        apellido=teclado.nextLine();
        
        //damos una variable al método crear_codigo
        String codigo=crear_codigo(nombre,apellido);
        
        //sacamos el codigo por pantalla
        System.out.println("El codigo es: "+codigo);
        
    }
    
    //Método crear_codigo
    public static String crear_codigo (String nombre, String apellido){
        //Scanner para leer de teclado
        Scanner teclado= new Scanner (System.in);
        
        //variables a usar
        String apellido_2;
        String codigo;
        
        //si apellido.lenght es menor que 3 pido el segundo apellido 
        if(apellido.length() >= 3){
            codigo=nombre.substring(0, 1)+apellido.substring(0, 3);
            return codigo;
        }
        else{
            
            System.out.println("El apellido el muy corto");
            
            System.out.println("Introduce tu segundo apellido:");
            apellido_2=teclado.nextLine();
            
            if(apellido_2.length() >= 3)
                codigo=nombre.substring(0, 1)+apellido_2.substring(0, 3);
            
            else
                if(apellido.length() >= apellido_2.length())
                    codigo=nombre.substring(0, 1)+apellido.substring(0, 3);
                
                else
                    codigo=nombre.substring(0, 1)+apellido_2.substring(0, 3);
            
            return codigo;
        }
        
    }
    
}
