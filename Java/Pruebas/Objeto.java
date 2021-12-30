/*
Construir un programa que permita dirigir el movimiento de un objeto
dentro de un tablero y actualice su posicion dentro del mismo.
Los movimientos son arriba abajo izqda derecha
Tras cada movimiento el programa mostrara la nueva direccion elegida
y la situacion del objeto dentro del tablero
 */
package ejercicios;

import javax.swing.JOptionPane;

public class Objeto {
//Atributos

    private int ejeX;
    private int ejeY;

//Constructor
    public Objeto(int ejeX, int ejeY) {
        this.ejeX = ejeX;
        this.ejeY = ejeY;
    }

    public int arriba() {
        ejeX += 1;
        JOptionPane.showMessageDialog(null, "El movimiento es hacia arriba\nPosicion actual: (" + ejeX + "," + ejeY + ")");
        return ejeX;
    }

    public int abajo() {
        ejeX -= 1;
        JOptionPane.showMessageDialog(null, "El movimiento es hacia abajo\nPosicion actual: (" + ejeX + "," + ejeY + ")");
        return ejeX;
    }
    
    public int derecha() {
        ejeY += 1;
        JOptionPane.showMessageDialog(null, "El movimiento es hacia la derecha\nPosicion actual: (" + ejeX + "," + ejeY + ")");
        return ejeY;
    }

    public int izquierda() {
        ejeY -= 1;
        JOptionPane.showMessageDialog(null, "El movimiento es hacia la izquierda\nPosicion actual: (" + ejeX + "," + ejeY + ")");
        return ejeY;
    }

    public int getEjeX() {
        return ejeX;
    }

    public int getEjeY() {
        return ejeY;
    }
    
    
    
    
}
