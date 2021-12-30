package ejercicios;

import javax.swing.JOptionPane;

public class Triangulos {

    double lado1;
    double lado2;
    double area;
    double altura;

    double perimetro;

    public Triangulos(double lado1, double lado2) {
        this.lado1 = lado1;
        this.lado2 = lado2;
    }

    public double getArea() {
        this.altura = Math.sqrt((lado2 * lado2) - ((lado1 * lado1) / 4));
        this.area = (this.lado1 * this.altura) / 2;
        return area;
    }

    public double getPerimetro() {
        this.perimetro = lado1 + (lado2 * 2);
        return perimetro;
    }

    public void mostrarDatos (){
        JOptionPane.showMessageDialog(null, "El perimetro es: " + getPerimetro() + "\nY el area es: " + getArea());
    }
}
