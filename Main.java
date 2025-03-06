/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author gerar
 */
// Clase Principal para probar el código
public class Main {
    public static void main(String[] args) {
        // Crear objetos de las subclases y probar métodos
        Circulo c = new Circulo(5);
        c.Dibujar();
        System.out.println("Radio: " + c.CalcularRadio());

        Linea l = new Linea(10);
        l.Dibujar();

        Triangulo t = new Triangulo(60);
        t.Dibujar();
        System.out.println("Área del triángulo: " + t.CalcularArea(10, 5));

        Cuadrado q = new Cuadrado(4);
        q.Dibujar();
        System.out.println("Área del cuadrado: " + q.CalcularArea());
    }
}