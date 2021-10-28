/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import javax.swing.ImageIcon;

public class fileInstancia {

    public static File[] imagenes;
    private static int contadorImg;
    private static int longitudArr;

    //ArrayList<ImageIcon> hola;
/////////////////////////////////////////////////////////////////////////////////////////
    public fileInstancia(File[] imagenes, int aux) {
        this.imagenes = imagenes;
        this.longitudArr = aux;
    }

    public fileInstancia(int cont) {
        fileInstancia.contadorImg = cont;
    }

    public fileInstancia() {

    }

    //////////////////////////////////////////////////////////////////////////////////////
    public File indexArreglo(int indice) {
        return imagenes[indice];
    }

    public int getContadorImg() {
        return contadorImg;
    }

    public int getLongitudArr() {
        return longitudArr;
    }

    //////////////////////////////////////////////////////////////////////////////////////
    public void aumentarCont() {
        contadorImg++;
    }

    public void resetInstancia() {
        Arrays.fill(imagenes, null);
        contadorImg = 0;
        longitudArr = 0;
    }

}
