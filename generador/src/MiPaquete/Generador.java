/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MiPaquete;

/**
 *
 * @author Antonio
 */
import java.util.*;
import javax.swing.*;
public class Generador {
    private String abcdario[] = {"A","E","I","O","U","A","B","C","D","E","F","G","H","I","J","K","L","M","N","Ñ","O","P","Q","R","S","T","V","W","Y","Z"};    
    //private String vocales[] = {"A","E","I","O","U"};
    public void generar(){
        Random r = new Random();
        int contador = 0;
        int nElem = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el numero de nombres que desea ingresar"));
        while(contador <= nElem){
           for(int i = 0; i<5; i++){
              int ale = (int)(r.nextDouble()*2);
              int aleatorio = (int)(r.nextDouble()*25);
                System.out.print(abcdario[aleatorio]);   
          }
           System.out.println("");
           contador++;
        }
    }
}
