package POO;

import java.util.Random;
import java.util.Arrays; // Importa a classe Arrays
/* Objetivo da tarefa:
 * Leia 500 numeros inteiros e positivos :
 * encontre o maior valor, o menor valor e a media dos numeros lidos.
 */

public class Atividade_1_5 {

    public static void main(String[] args) {

        Random random = new Random();

        int contagem = 0;
        int numAleatorio;
        int numIntPosit = 0;
        int[] guarda_numero = new int[500];

        for (int i = 0 ; i < 500 ; i++) {

            numAleatorio = random.nextInt(5000);

            if (numAleatorio > 0) {

                guarda_numero[i] = numAleatorio;
                numIntPosit += numAleatorio;
                contagem++;
            }

        }

        Arrays.sort(guarda_numero);


        System.out.printf("O menor valor é %d ", guarda_numero[0]);
        System.out.printf("\nO mario valor é : %d", guarda_numero[guarda_numero.length - 1]);
        System.out.printf("\n A media dos numeros lidos é : %d ", numIntPosit / contagem);



    }
}