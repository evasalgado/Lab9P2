/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab9p2_grupo8;

import java.awt.Color;
import javax.swing.JProgressBar;

/**
 *
 * @author walter
 */
public class Barra extends Thread {

    private JProgressBar barra;
    private boolean avanzar;
    private boolean vive;
    private int num;
    private Color col;

    public Barra(JProgressBar barra, int num, Color col) {
        this.barra = barra;
        avanzar = true;
        vive = true;
        this.num = num;
        this.col = col;
    }

    public boolean isVive() {
        return vive;
    }

    public void setVive(boolean vive) {
        this.vive = vive;
    }

    public boolean isAvanzar() {
        return avanzar;
    }

    public void setAvanzar(boolean avanzar) {
        this.avanzar = avanzar;
    }

    public JProgressBar getBarra() {
        return barra;
    }

    public void setBarra(JProgressBar barra) {
        this.barra = barra;
    }

    @Override
    public void run() {
        while (vive) {
            if (avanzar) {
                barra.setForeground(col);
                barra.setValue(barra.getValue() + num);
                if (barra.getValue() == 100000000) {
                    vive = false;
                }
            } //FIN IF

            try {
                Thread.sleep(0);
            } catch (InterruptedException ex) {
            }
        }
    }
}
