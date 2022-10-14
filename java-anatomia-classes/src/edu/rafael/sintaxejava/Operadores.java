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

        // // EXEMPLO DE OPERADOR TERNÁRIO
        // int a, b;

        // a = 5;
        // b = 6;

        // /*
        // * EXEMPLO DE CONDICIONAL UTILIZANDO UMA ESTRUTURA IF/ELSE
        // * if(a==b)
        // * resultado = "verdadeiro";
        // * else
        // * resultado = "falso";
        // */

        // // MESMA CONDICIONAL, MAS DESSA VEZ, UTILIZANDO O OPERADOR CONDICIONAL
        // TERNÁRIO
        // String resultado = (a == b) ? "verdadeiro" : "false";

        // System.out.println(resultado);

        // // EXEMPLO DE OPERADORES RELACIONAIS

        // int numero1 = 1;
        // int numero2 = 2;

        // boolean simNao = numero1 == numero2;

        // System.out.println("Número1 é igual ao Número2? " + simNao);

        // simNao = numero1 != numero2;

        // System.out.println("Número1 é diferente do Número2? " + simNao);

        // simNao = numero1 > numero2;

        // System.out.println("Número1 é maior do que Número2? " + simNao);

        // String nome01 = "Rafael";
        // String nome02 = new String("Rafael");

        // System.out.println(nome01 == nome02);
        // System.out.println(nome01.equals(nome02));

        // EXEMPLO DE OPERADORES LÓGICOS
        
        boolean condicao1 = true;

        boolean condicao2 = false;

        if(condicao1 && condicao2){
            System.out.println("As duas condições são verdadeiras");
        }

        if(condicao1 || condicao2){
            System.out.println("Uma das condições é verdadeira");
        }
    }

}
