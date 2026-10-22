/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio07;

/**
 *
 * @author Usuario iTC
 */
public class Ejercicio07 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int var1 = 15; 
        int var2 = 25;
        int var3 = 30;
        int var4 = 8;
        int var5 = 60;
        int var6 = 144;
        int var7 = 12;
        
        boolean resultado = (var1+var2>var3) || (Math.pow(var4, 2)) > var5 && (Math.sqrt(var6)) == var7 ;
        System.out.println("el resultado es: " + resultado);
    }
    
}
