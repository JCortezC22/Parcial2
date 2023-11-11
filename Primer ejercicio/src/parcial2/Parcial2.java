/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package parcial2;

/**
 *
 * @author Jordy Enrique Cortez Aguilar
 */

import javax.swing.JOptionPane;

public class Parcial2 {

    public static int elevarAlCuadrado(int numero) {
        return numero * numero;
    }

    public static float multiplicar(float numero1, float numero2) {
        return numero1 * numero2;
    }

    public static String multiplicarYConcatenar(int numero1, int numero2, char caracter) {
        int resultado = numero1 * numero2;
        return resultado + String.valueOf(caracter);
    }

    public static void main(String[] args) {
        int numeroEntero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un número entero:"));

        float numeroFlotante1 = Float.parseFloat(JOptionPane.showInputDialog("Ingrese el primer número flotante:"));
        float numeroFlotante2 = Float.parseFloat(JOptionPane.showInputDialog("Ingrese el segundo número flotante:"));

        int otroNumeroEntero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese otro número entero:"));
        char caracter = JOptionPane.showInputDialog("Ingrese un carácter:").charAt(0);

        JOptionPane.showMessageDialog(null, + numeroEntero + " Elevado al cuadrado " + ": " + elevarAlCuadrado(numeroEntero));

        // Multiplicar dos números flotantes
        JOptionPane.showMessageDialog(null, "Multiplicación de " + numeroFlotante1 + " y " + numeroFlotante2 + ": "
                + multiplicar(numeroFlotante1, numeroFlotante2));

        JOptionPane.showMessageDialog(null,
                "Multiplicación de " + otroNumeroEntero + " y " + numeroEntero + " '" + caracter
                        + "': " + multiplicarYConcatenar(otroNumeroEntero, numeroEntero, caracter));
    }
}