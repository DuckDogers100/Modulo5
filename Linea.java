/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author gerar
 */
// Subclase Línea
public class Linea extends Formas {
    private double largo;

    public Linea(double largo) {
        this.largo = largo;
    }

    @Override
    public void Dibujar() {
        System.out.println("Dibujando una Línea");
    }
}