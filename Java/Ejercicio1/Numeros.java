package ejercicios;

import javax.swing.JOptionPane;

public class Numeros {

    private double num1;
    private double num2;
    private int num3;
    private double sumados;
    private double multiplicados;

    public Numeros(double num1, int num3) {
        this.num1 = num1;
        this.num3 = num3;
    }   
    
    public Numeros(double num1, double num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public void suma() {
        sumados = this.num1 + this.num2;
        JOptionPane.showMessageDialog(null, "La suma es: " + sumados);
    }

    public void multiplicacion() {
        multiplicados = this.num1 * this.num2;
        JOptionPane.showMessageDialog(null, "La multiplicacion es: " + multiplicados);

    }
    public void comparacion(){
        if(num1>num2){
            JOptionPane.showMessageDialog(null, "El numero 1 es mayor que el numero 2");
        }
        else if(num1 == num2){
        JOptionPane.showMessageDialog(null, "El numero 1 es igual que el numero 2");
        }
        else{
        JOptionPane.showMessageDialog(null, "El numero 2 es mayor que el numero 1");
        }
    }
        public void multiplicacionInt(){
        multiplicados = this.num1 * this.num3;
        JOptionPane.showMessageDialog(null, "La multiplicacion es: " + multiplicados);
        }
}
