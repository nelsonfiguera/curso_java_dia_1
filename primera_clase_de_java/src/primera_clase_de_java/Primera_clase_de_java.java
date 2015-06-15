/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primera_clase_de_java;

import nuevoPaquete.Clase_2;

/**
 *
 * @author laboratorio
 */
public class Primera_clase_de_java {

    private int contador;
    
    
    public static void main(String[] args) {
        
        Primera_clase_de_java jp1=new Primera_clase_de_java();
        
        // TODO code application logic he
        for (jp1.contador= 0; jp1.contador< 5; jp1.contador++) {
            System.out.println("imprimiento el contador \n\n          " +jp1.contador);
           
        }

      Clase_2 cd1 =new  Clase_2();
        System.out.println("atributos " + cd1.otracosa);
      
        Clase_3 cd2 =new  Clase_3();
        
        System.out.println("atributos " + cd2.j);
        
    }

}
