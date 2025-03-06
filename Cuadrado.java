/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author gerar
 */
// Subclase Cuadrado
public class Cuadrado extends Formas {
    private double lado;

    public Cuadrado(double lado) {
        this.lado = lado;
    }

    @Override
    public void Dibujar() {
        System.out.println("Dibujando un Cuadrado");
    }

    public double CalcularArea() {
        return lado * lado;
    }
}