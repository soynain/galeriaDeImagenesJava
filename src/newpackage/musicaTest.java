/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage;

import java.awt.Image;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;

/**
 *
 * @author Gebel
 */
class musicaTest implements Runnable {

    private boolean iterar;
    public JLabel galy;
    public JRadioButton unoX, dosX, tresX, cuatroX;
    public JButton leer, iniciar, bocina;
    fileInstancia global;

    musicaTest(JLabel lblGaleria, JRadioButton uno, JRadioButton dos, JRadioButton tres, JRadioButton cuatro, JButton ini, JButton boci) {
        this.galy = lblGaleria;
        global = new fileInstancia();
        this.unoX = uno;
        this.dosX = dos;
        this.tresX = tres;
        this.cuatroX = cuatro;
        this.bocina = boci;
        this.iniciar = ini;
    }

    @Override
    public void run() {
        while (iterar != false && global.getLongitudArr() >= global.getContadorImg()) {
            /*Calendar cal = Calendar.getInstance();
            int second = cal.get(Calendar.SECOND);
            int minute = cal.get(Calendar.MINUTE);
            int hour = cal.get(Calendar.HOUR);
            System.out.println(hour + ":" + (minute) + ":" + second);
            mantendrás esto por si las dudas debes hacer un cronometro de duración
            */
            galy.setIcon(new ImageIcon(new ImageIcon(global.indexArreglo(global.getContadorImg()).getAbsolutePath()).getImage().getScaledInstance(galy.getWidth(), galy.getHeight(), Image.SCALE_SMOOTH)));
            global.aumentarCont();
            if (global.getContadorImg() > global.getLongitudArr()) {
                detener();
                JOptionPane.showMessageDialog(galy, "CREDITOS: \n miembros del equipo: el de los chescos: Soto Guzmán Moisés Nain \n la que editó las fotos: Maria Fernanda Rodriguez Rivas \n el creativo detrás de la historia: Ruben Aguilar Nuñez Alexis");
                global.resetInstancia();
                resetGaleryGui();
            }
            try {
                Thread.sleep(12000);
            } catch (InterruptedException ex) {
                //Thread.currentThread().interrupt();
                System.out.println(ex);
            }
        }
    }

    public void resetGaleryGui() {
        unoX.setEnabled(false);
        unoX.setSelected(false);
        dosX.setEnabled(false);
        dosX.setSelected(false);
        tresX.setEnabled(false);
        tresX.setSelected(false);
        cuatroX.setEnabled(false);
        cuatroX.setSelected(false);
        bocina.setEnabled(false);
        bocina.setText("▶");
        galeriaTAP C = new galeriaTAP();
        C.ejecutando = false;
        // Arrays.fill(C.files, null);
        C.p1 = null;
        C.p2 = null;
        C.p3 = null;
        C.p4 = null;
        C.clip.stop();
        C = null;
    }

    public void start() {
        iterar = true;
        new Thread(this).start();
    }

    public void detener() {
        iterar = false;
    }

    public void setIterar(boolean iterar) {
        this.iterar = iterar;
    }
}

class serieDos implements Runnable {

    public boolean iterar;
    public JLabel galy;
    fileInstancia global;
    public JRadioButton unoX, dosX, tresX, cuatroX;
    public JButton leer, iniciar, bocina;

    serieDos(JLabel lblGaleria, JRadioButton uno, JRadioButton dos, JRadioButton tres, JRadioButton cuatro, JButton ini, JButton boci) {
        this.galy = lblGaleria;
        global = new fileInstancia();
        this.unoX = uno;
        this.dosX = dos;
        this.tresX = tres;
        this.cuatroX = cuatro;
        this.bocina = boci;
        this.iniciar = ini;
    }

    @Override
    public void run() {
        while (iterar != false && global.getLongitudArr() >= global.getContadorImg()) {
            galy.setIcon(new ImageIcon(new ImageIcon(global.indexArreglo(global.getContadorImg()).getAbsolutePath()).getImage().getScaledInstance(galy.getWidth(), galy.getHeight(), Image.SCALE_SMOOTH)));
            global.aumentarCont();
            if (global.getContadorImg() > global.getLongitudArr()) {
                //galy.setText(hour + ":" + (minute) + ":" + second + "->" + global.getContadorImg());
                detener();
                JOptionPane.showMessageDialog(galy, "CREDITOS: \n miembros del equipo: el de los chescos: Soto Guzmán Moisés Nain \n la que editó las fotos: Maria Fernanda Rodriguez Rivas \n el creativo detrás de la historia: Ruben Aguilar Nuñez Alexis");
                global.resetInstancia();
                resetGaleryGui();
            }
            try {
                Thread.sleep(8000);
            } catch (InterruptedException ex) {
                //Thread.currentThread().interrupt();
                System.out.println(ex);
            }
        }
    }

    public void resetGaleryGui() {
        unoX.setEnabled(false);
        unoX.setSelected(false);
        dosX.setEnabled(false);
        dosX.setSelected(false);
        tresX.setEnabled(false);
        tresX.setSelected(false);
        cuatroX.setEnabled(false);
        cuatroX.setSelected(false);
        bocina.setEnabled(false);
        bocina.setText("▶");
        galeriaTAP C = new galeriaTAP();
        C.ejecutando = false;
        // Arrays.fill(C.files, null);
        C.p1 = null;
        C.p2 = null;
        C.p3 = null;
        C.p4 = null;
        C.clip.stop();
        C = null;
    }

    public void start() {
        iterar = true;
        new Thread(this).start();
    }

    public void detener() {
        iterar = false;
    }

    public void setIterar(boolean iterar) {
        this.iterar = iterar;
    }
}

class serieTres implements Runnable {

    public boolean iterar;
    public JLabel galy;
    fileInstancia global;
    public JRadioButton unoX, dosX, tresX, cuatroX;
    public JButton leer, iniciar, bocina;

    serieTres(JLabel lblGaleria, JRadioButton uno, JRadioButton dos, JRadioButton tres, JRadioButton cuatro, JButton ini, JButton boci) {
        this.galy = lblGaleria;
        global = new fileInstancia();
        this.unoX = uno;
        this.dosX = dos;
        this.tresX = tres;
        this.cuatroX = cuatro;
        this.bocina = boci;
        this.iniciar = ini;
    }

    @Override
    public void run() {
        while (iterar != false && global.getLongitudArr() >= global.getContadorImg()) {
            galy.setIcon(new ImageIcon(new ImageIcon(global.indexArreglo(global.getContadorImg()).getAbsolutePath()).getImage().getScaledInstance(galy.getWidth(), galy.getHeight(), Image.SCALE_SMOOTH)));
            global.aumentarCont();
            if (global.getContadorImg() > global.getLongitudArr()) {
                //galy.setText(hour + ":" + (minute) + ":" + second + "->" + global.getContadorImg());
                detener();
                JOptionPane.showMessageDialog(galy, "CREDITOS: \n miembros del equipo: el de los chescos: Soto Guzmán Moisés Nain \n la que editó las fotos: Maria Fernanda Rodriguez Rivas \n el creativo detrás de la historia: Ruben Aguilar Nuñez Alexis");
                global.resetInstancia();
                resetGaleryGui();
            }
            try {
                Thread.sleep(4000);
            } catch (InterruptedException ex) {
                //Thread.currentThread().interrupt();
                System.out.println(ex);
            }
        }
    }

    public void resetGaleryGui() {
        unoX.setEnabled(false);
        unoX.setSelected(false);
        dosX.setEnabled(false);
        dosX.setSelected(false);
        tresX.setEnabled(false);
        tresX.setSelected(false);
        cuatroX.setEnabled(false);
        cuatroX.setSelected(false);
        bocina.setEnabled(false);
        bocina.setText("▶");
        galeriaTAP C = new galeriaTAP();
        C.ejecutando = false;
        //Arrays.fill(C.files, null);
        C.p1 = null;
        C.p2 = null;
        C.p3 = null;
        C.p4 = null;
        C.clip.stop();
        C = null;
    }

    public void start() {
        iterar = true;
        new Thread(this).start();
    }

    public void detener() {
        iterar = false;
    }

    public void setIterar(boolean iterar) {
        this.iterar = iterar;
    }
}

class serieCuatro implements Runnable {

    public boolean iterar;
    public JLabel galy;
    fileInstancia global;
    public JRadioButton unoX, dosX, tresX, cuatroX;
    public JButton leer, iniciar, bocina;
    ArrayList<ImageIcon> labelCambio;
    serieCuatro(JLabel lblGaleria, JRadioButton uno, JRadioButton dos, JRadioButton tres, JRadioButton cuatro, JButton ini, JButton boci) {
        this.galy = lblGaleria;
        global = new fileInstancia();
        this.unoX = uno;
        this.dosX = dos;
        this.tresX = tres;
        this.cuatroX = cuatro;
        this.bocina = boci;
        this.iniciar = ini;
        labelCambio=new ArrayList();
    }

    @Override
    public void run() {
        while (iterar != false && global.getLongitudArr() >= global.getContadorImg()) {
            galy.setIcon(new ImageIcon(new ImageIcon(global.indexArreglo(global.getContadorImg()).getAbsolutePath()).getImage().getScaledInstance(galy.getWidth(), galy.getHeight(), Image.SCALE_SMOOTH)));
            global.aumentarCont();
            if (global.getContadorImg() > global.getLongitudArr()) {
                detener();
                JOptionPane.showMessageDialog(galy, "CREDITOS: \n miembros del equipo: el de los chescos: Soto Guzmán Moisés Nain \n la que editó las fotos: Maria Fernanda Rodriguez Rivas \n el creativo detrás de la historia: Ruben Aguilar Nuñez Alexis");
                global.resetInstancia();
                resetGaleryGui();
            try {
                Thread.sleep(30);
            } catch (InterruptedException ex) {
                //Thread.currentThread().interrupt();
                System.out.println(ex);
            }
        }
    }
    }
    public void resetGaleryGui() {
        unoX.setEnabled(false);
        unoX.setSelected(false);
        dosX.setEnabled(false);
        dosX.setSelected(false);
        tresX.setEnabled(false);
        tresX.setSelected(false);
        cuatroX.setEnabled(false);
        cuatroX.setSelected(false);
        bocina.setEnabled(false);
        bocina.setText("▶");
        galeriaTAP C = new galeriaTAP();
        C.ejecutando = false;
        // Arrays.fill(C.files, null);
        C.p1 = null;
        C.p2 = null;
        C.p3 = null;
        C.p4 = null;
        C.clip.stop();
        C = null;
    }

    public void start() {
        iterar = true;
        new Thread(this).start();
    }

    public void detener() {
        iterar = false;
    }

    public void setIterar(boolean iterar) {
        this.iterar = iterar;
    }
}
