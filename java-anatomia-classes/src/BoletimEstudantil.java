public class BoletimEstudantil {

    public static void main(String[] args) {

        /*
         * Exemplo do código não indentado
         * 
         * int mediaFinal = 7;
         * 
         * if(mediaFinal<6)
         * System.out.println("REPROVADO");
         * else if(mediaFinal==6)
         * System.out.println("PROVA MINERVA");
         * else
         * System.out.println("APROVADO");
         */

        // Código indentado
        int mediaFinal = 5;

        if (mediaFinal < 6)
            System.out.println("REPROVADO");
        else if (mediaFinal == 6)
            System.out.println("PROVA MINERVA");
        else
            System.out.println("APROVADO");

    }
}
