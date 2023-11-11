/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package segundoejercicio;

/**
 *
 * @author Jordy Enrique Cortez Aguilar
 */
import javax.swing.JOptionPane;
public class AplicacionBinoculares {

    public static void main(String[] args) {
        BinocularesMarinos binocularMarino = new BinocularesMarinos("BAK-4", "Binocular Marino 1", 150.0, 5, "Corrugado");

        BinocularesAves binocularAves = new BinocularesAves("BK-7", "Binocular Aves 1", 100.0, "Cuadrado", "Cromado");

        BinocularesUsoGeneral binocularUsoGeneral = new BinocularesUsoGeneral("BAK-4", "Binocular Uso General 1", 80.0, "Plástico", "Mayor");

        mostrarInformacionBinoculares(binocularMarino);
        mostrarInformacionBinoculares(binocularAves);
        mostrarInformacionBinoculares(binocularUsoGeneral);
    }
    
   public static void mostrarInformacionBinoculares(Binoculares binoculares) {
        String mensaje = "Tipo Prisma: " + binoculares.tipoPrisma +
                "\nNombre: " + binoculares.nombre +
                "\nPrecio: $" + binoculares.precio;

        if (binoculares instanceof BinocularesMarinos) {
            BinocularesMarinos marinos = (BinocularesMarinos) binoculares;
            mensaje += "\nResistencia al Agua (IPX): " + marinos.resistenciaAgua +
                    "\nTextura: " + marinos.textura;
        } else if (binoculares instanceof BinocularesAves) {
            BinocularesAves aves = (BinocularesAves) binoculares;
            mensaje += "\nEnfoque: " + aves.enfoque +
                    "\nRecubrimiento para Niebla: " + aves.recubrimientoNiebla;
        } else if (binoculares instanceof BinocularesUsoGeneral) {
            BinocularesUsoGeneral usoGeneral = (BinocularesUsoGeneral) binoculares;
            mensaje += "\nTipo de Lente: " + usoGeneral.tipoLente +
                    "\nAlcance: " + usoGeneral.alcance;
        }

        JOptionPane.showMessageDialog(null, mensaje, "Información de Binoculares", JOptionPane.INFORMATION_MESSAGE);
    }
}