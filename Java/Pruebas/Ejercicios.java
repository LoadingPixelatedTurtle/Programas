/*
Construir un programa para trabajar con 2 numeros complejos.
Implemente el siguiente menu:
1. Sumar dos numeros complejos
2. Multiplicar dos numeros complejos
3. Comparar 2 numeros complejos
4. Multiplicar un numero complejo por un entero.
 */
package ejercicios;

import javax.swing.JOptionPane;

public class Ejercicios {

    public static void main(String[] args) {
        int menu, num3;
        double num1, num2;
        Numeros operacion;
        do {
            menu = Integer.parseInt(JOptionPane.showInputDialog("""
                                                            1. Sumar dos numeros complejos
                                                            2. Multiplicar dos numeros complejos
                                                            3. Comparar 2 numeros complejos
                                                            4. Multiplicar un numero complejo por un entero."""));

            switch (menu) {
                case 1:
                    num1 = Double.parseDouble(JOptionPane.showInputDialog("Introduzca el primer numero"));
                    num2 = Double.parseDouble(JOptionPane.showInputDialog("Introduzca el segundo numero"));
                    operacion = new Numeros(num1, num2);
                    operacion.suma();
                    break;
                case 2:
                    num1 = Double.parseDouble(JOptionPane.showInputDialog("Introduzca el primer numero"));
                    num2 = Double.parseDouble(JOptionPane.showInputDialog("Introduzca el segundo numero"));
                    operacion = new Numeros(num1, num2);
                    operacion.multiplicacion();
                    break;
                case 3:
                    num1 = Double.parseDouble(JOptionPane.showInputDialog("Introduzca el primer numero"));
                    num2 = Double.parseDouble(JOptionPane.showInputDialog("Introduzca el segundo numero"));
                    operacion = new Numeros(num1, num2);
                    operacion.comparacion();
                    break;

                case 4:
                    num1 = Double.parseDouble(JOptionPane.showInputDialog("Introduzca el primer numero"));
                    num3 = Integer.parseInt(JOptionPane.showInputDialog("Introduzca el segundo numero"));
                    operacion = new Numeros(num1, num3);
                    operacion.multiplicacionInt();
                    break;
                default:
                    
            }
        } while (menu != 5);
    }

}
