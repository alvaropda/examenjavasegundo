package Ejercicio1;

public class CalculadoraCientifica extends Calculadora{
    public int add(int a, int b) {

        return (int) Math.pow((a+b),2);
    }

    public double raizCuadrada(double a) {

        return Math.sqrt(a);
    }
}
