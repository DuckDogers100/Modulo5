/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author gerar
 */
// Superclase Formas
public class Formas {
    protected String color;

    // Método para dibujar (será sobreescrito en las subclases)
    public void Dibujar() {
        System.out.println("Dibujando una forma");
    }

    // Método para establecer el color de la forma
    public void EstablecerColor(String color) {
        this.color = color;
        System.out.println("Color establecido a: " + color);
    }
}
