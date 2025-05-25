package POO;

import java.util.Scanner;

/* Calculo do juro de divida
 * Entrada:
 * 		- taxa de juros mensal
 * 		- valor da divida
 */

public class Atividade_1_2 {

    public static void main(String[] args) {

        double juro_simples, juro_composto, Montante,  taxa_juros, tempo, divida;

        System.out.print("Entre com o valor do seu empréstimo: ");
        divida = new Scanner(System.in).nextDouble();

        System.out.print("Quantas parcelas ? ");
        tempo = new Scanner(System.in).nextDouble();

        System.out.print("Qual a taxa de juros mensal ? ");
        taxa_juros = new Scanner(System.in).nextDouble();

        juro_simples = divida * (taxa_juros/100) * tempo;

        juro_composto = (divida * Math.pow((1+(taxa_juros/100)),tempo)) - divida;

        System.out.printf("\n Com base em suas informações, você pagará um montante de juros:");
        System.out.printf("\n Em juros simples : R$ %.2f$ ", juro_simples);
        System.out.printf("\n Em juros compostos : R$ %.2f$", juro_composto);


    }

}

/* Se digitar valores com ponto, 1.2 por eexmplo, o Scanner por ser regional
 * emitirá um erro, uma excessão. No nosso caso, pode entrar  com valores com
 * virgula para double */
