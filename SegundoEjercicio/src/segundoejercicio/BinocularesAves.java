/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package segundoejercicio;

/**
 *
 * @author Jordy Enrique Cortez Aguilar
 */
class BinocularesAves extends Binoculares {
    String enfoque; 
    String recubrimientoNiebla; 

    public BinocularesAves(String tipoPrisma, String nombre, double precio, String enfoque, String recubrimientoNiebla) {
        super(tipoPrisma, nombre, precio);
        this.enfoque = enfoque;
        this.recubrimientoNiebla = recubrimientoNiebla;
    }
}