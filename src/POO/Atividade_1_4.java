package POO;

import java.util.Random;

/* Objetivo:
 * Gerar idade e altura aleatória para 10 pessoas.
 * Calcular e informar a média das alturas das pessoas com mais de 50 anos.
 */

public class Atividade_1_4 {

    public static void main(String[] args) {

        Random random = new Random();

        int ContaMais50 = 0;
        double soma_altura = 0.0;
        int quantIdades = 10;

        for (int i = 1 ; i < quantIdades ; i++) {

            int idade  = random.nextInt(90);
            double altura = 1.50 + (random.nextDouble() * 0.50); //porque Double anda entre 0.0 e 1.0

            if (idade > 50) {

                soma_altura += altura;
                ContaMais50++;
            }

        }


        double media_alturas = soma_altura / ContaMais50;

        System.out.printf("A media das alturas das %d pessoas acima de 50 anos é %.2f", ContaMais50, media_alturas );



    }

}