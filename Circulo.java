/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author gerar
 */
// Subclase Círculo
public class Circulo extends Formas {
    private double radio;

    public Circulo(double radio) {
        this.radio = radio;
    }

    @Override
    public void Dibujar() {
        System.out.println("Dibujando un Círculo");
    }

    public double CalcularRadio() {
        return radio;
    }
}