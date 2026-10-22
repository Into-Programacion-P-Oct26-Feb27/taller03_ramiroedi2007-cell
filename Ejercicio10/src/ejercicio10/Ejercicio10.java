/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio10;

/**
 *
 * @author Usuario iTC
 */
public class Ejercicio10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int var1 = 4;
        int var2 = 81;
        int var3 = 70;
        int var4 = 50;
        int var5 = 2;
        int var6 = 25;
        int var7 = 18;
        int var8 = 12;
        int var9 = 25;
        int var10 = 7;
        int var11 = 40;
        
        boolean resultado = ((Math.pow(var1, 3)+ Math.sqrt(var2)>var3) && (var4/var5 == var6)) || ((var7+var8<=var9)&&!(Math.pow(var10, 2)>var11));
        
        System.out.println("El resultado es: "+ resultado);
}
}