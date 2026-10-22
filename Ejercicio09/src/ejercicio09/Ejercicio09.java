/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio09;

/**
 *
 * @author Usuario iTC
 */
public class Ejercicio09 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int var1 = 225;
        int var2 = 5;
        int var3 = 50;
        int var4 = 120;
        int var5 = 4;
        int var6 = 30;

        boolean resultado = !((Math.sqrt(var1) + Math.pow(var2, 2) < var3) && (var4 / var5 == var6
        ));
        System.out.println("el resultado es: " + resultado);
    }

}
