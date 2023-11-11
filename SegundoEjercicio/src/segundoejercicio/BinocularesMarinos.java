/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package segundoejercicio;

/**
 *
 * @author Jordy Enrique Cortez Aguilar
 */
class BinocularesMarinos extends Binoculares {
    //Caracteristicas de los binoculares marinos
    int resistenciaAgua; 
    String textura; 

    public BinocularesMarinos(String tipoPrisma, String nombre, double precio, int resistenciaAgua, String textura) {
        super(tipoPrisma, nombre, precio);
        this.resistenciaAgua = resistenciaAgua;
        this.textura = textura;
    }
}