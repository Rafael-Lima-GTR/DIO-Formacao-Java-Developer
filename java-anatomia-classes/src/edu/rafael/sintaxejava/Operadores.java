package edu.rafael.sintaxejava;

public class Operadores {

    public static void main(String[] args) {

        // // EXEMPLO DE CONCATENAÇÃO
        // String concatenacao = "?";

        // concatenacao = 1 + 1 + 1 + "1";
        // System.out.println(concatenacao);

        // concatenacao = 1 + "1" + 1 + 1;
        // System.out.println(concatenacao);

        // concatenacao = 1 + "1" + 1 + "1";
        // System.out.println(concatenacao);

        // concatenacao = "1" + 1 + 1 + 1;
        // System.out.println(concatenacao);

        // concatenacao = "1" + (1 + 1 + 1);
        // System.out.println(concatenacao);

        // EXEMPLO DE OPERADOR TERNÁRIO
        int a, b;

        a = 5;
        b = 6;

        /*
         * EXEMPLO DE CONDICIONAL UTILIZANDO UMA ESTRUTURA IF/ELSE
         * if(a==b)
         * resultado = "verdadeiro";
         * else
         * resultado = "falso";
         */

        // MESMA CONDICIONAL, MAS DESSA VEZ, UTILIZANDO O OPERADOR CONDICIONAL TERNÁRIO
        String resultado = (a == b) ? "verdadeiro" : "false";

        System.out.println(resultado);
    }

}
