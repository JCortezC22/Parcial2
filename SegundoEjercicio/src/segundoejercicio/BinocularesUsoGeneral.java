/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package segundoejercicio;

/**
 *
 * @author Jordy Enrique Cortez Aguilar
 */
class BinocularesUsoGeneral extends Binoculares {
    String tipoLente; 
    String alcance;

    public BinocularesUsoGeneral(String tipoPrisma, String nombre, double precio, String tipoLente, String alcance) {
        super(tipoPrisma, nombre, precio);
        this.tipoLente = tipoLente;
        this.alcance = alcance;
    }
}
