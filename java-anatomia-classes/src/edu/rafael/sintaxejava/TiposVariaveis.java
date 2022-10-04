package edu.rafael.sintaxejava;

public class TiposVariaveis {

    public static void main(String[] args) {

        //A classe String que representa um texto na aplicação
        String meuNome =  "Rafael Lima";

        double salarioMinimo = 2500;

        short numeroCurto = 1;
        int numeroNormal = numeroCurto;
        short numeroCurto2 = (short) numeroNormal;

        int numero = 5;

        numero = 10;

        System.out.println(numero);

        final double VALOR_DE_PI = 3.14;
    }

}
