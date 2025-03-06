/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author gerar
 */
// Subclase Triángulo
public class Triangulo extends Formas {
    private double angulo;

    public Triangulo(double angulo) {
        this.angulo = angulo;
    }

    @Override
    public void Dibujar() {
        System.out.println("Dibujando un Triángulo");
    }

    public double CalcularArea(double base, double altura) {
        return (base * altura) / 2;
    }
}