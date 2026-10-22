/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio08;

/**
 *
 * @author Usuario iTC
 */
public class Ejercicio08 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int var1 = 80;
        int var2 = 40;
        int var3 = 6;
        int var4 = 5;
        int var5 = 45;
        int var6 = 100;
        int var7 = 25;
        int var8 = 3;
        int var9 = 30;
        
        boolean resultado = (var1+var2 / var3 + Math.pow(var4, 2)>= var5) && (var6 - var7 * var8 < var9);
        System.out.println("El resultado es: " + resultado );
    }
    
}
