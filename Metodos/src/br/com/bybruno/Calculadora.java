package br.com.bybruno;

public class Calculadora {

    public static void main(String[] args) {

        soma(1, 4);
        substracao(1, 4);
        multiplicacao(1, 4);
        divisao(1, 4);

    }

    public static void soma(double numero1, double numero2) {
        double resultado = numero1 + numero2;
        System.out.println("A soma de " + numero1 + " mais " + numero2 + " é = " + resultado);
    }

    public static void substracao(double numero1, double numero2) {
        double resultado = numero1 - numero2;
        System.out.println("A substração de " + numero1 + " mais " + numero2 + " é = " + resultado);
    }

    public static void multiplicacao(double numero1, double numero2) {
        double resultado = numero1 * numero2;
        System.out.println("A multiplicação de " + numero1 + " mais " + numero2 + " é = " + resultado);
    }

    public static void divisao(double numero1, double numero2) {
        double resultado = numero1 / numero2;
        System.out.println("A divisão de " + numero1 + " mais " + numero2 + " é = " + resultado);
    }

}
