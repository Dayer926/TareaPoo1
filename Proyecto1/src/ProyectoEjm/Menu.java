/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ProyectoEjm;

import javax.swing.JOptionPane;

/**
 *
 * @author paulb
 */
public class Menu {
public static void main(String[]args){
     int opcion=0; String op="";
   op=JOptionPane.showInputDialog("Selecionar una opción: \n"
           + "1. -Nombre\n"
           + "2. -Apellido\n"
           + "3. -Edad \n");
   opcion=Integer.parseInt(op);
   switch(opcion){
       case 1: JOptionPane.showMessageDialog(null,"eligió la 1era opció"); break;
       case 2: JOptionPane.showMessageDialog(null,"eligió 2da opció"); break;
       case 3: JOptionPane.showMessageDialog(null,"eligió 3era primera opció"); break;
       }System.exit(0);
   }
}
