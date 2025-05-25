package POO;

import java.util.Random;


/* Objetivo:
 * Ler 5000 numeros inteiros e positivos :
 *
 * processamento: popular o array;
 *                calcular media;
 *                quantos sao impares;
 *
 * saida: 		  media dos numeros lidos;
 *       		  valores do array;
 *
 */

public class Atividade_1_8 {

    public static void main(String[] args) {

        Random random = new Random();

        int contagem = 0;
        int numAleatorio = 0;
        int numIntPosit = 0;
        int conta_impar = 0;
        int[] guarda_numero = new int[5000];


        for (int i = 0; i < 5000; i++) {

            //Popular o array
            numAleatorio = random.nextInt(5000);

            if (numAleatorio > 0) {

                guarda_numero[i] = numAleatorio;
                numIntPosit += numAleatorio;
                contagem++;
            }

            //contagem dos impares
            if (numAleatorio % 2 != 0) {
                conta_impar++;
            }
        }

        //Mostra da média
        System.out.printf("\n A media dos numeros lidos é : %d ", numIntPosit / contagem);

        //Mostra os Impares
        System.out.printf("\n A quantidade de numeros impares é : %d ", conta_impar);

        //Mostra de todos os numeros do array
        System.out.print("\n Os numeros do array são : ");


        for (int i : guarda_numero) {

                System.out.print(i + ",");
        }

    }



}


    /*
    inicio         fim
         0 1 2 3 4 5

    fim + 1        fim +4
          6 7 8 9 10


     */

