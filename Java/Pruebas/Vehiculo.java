/*
Construir un programa que dada una serie de vehiculos caracterizados
por su marca,modelo  precio, imprima las propiedades del vehiculo mas barato.
Para ello se deberan leer por teclado las caracteristicas de cada vehiculo 
y crear una clase que represente cada uno de ellos
 */
package ejercicios;


public class Vehiculo {
    private String marca;
    private String modelo;
    private float precio;

    public Vehiculo(String marca, String modelo, float precio) {
        this.marca = marca;
        this.modelo = modelo;
        this.precio = precio;
    }

    public float getPrecio() {
        return precio;
    }
    
    public String mostrarDatos(){
        return "El coche mas barato cuesta"+ precio + "\nEs de la marca: " +marca+ "\nY el modelo es: " +modelo;
    }
    
    
    
}
