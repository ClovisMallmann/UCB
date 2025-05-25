package POO;

import java.util.Scanner;

/*Implemente um programa em Java que calcule o juro de uma dívida
 * que você contraiu no mês passado no crediário de uma loja. A
 * taxa de juros mensal e o valor da dívida serão fornecidos pelo
 * usuário. A dívida deve ser calculada por método criado por você
 * chamado: **calcularDivida** e deve receber como parâmetro os
 * valores necessários para o cálculo e retornar a referida dívida.
 *
 * Entrada: valor da dívida
 * 			taxa de juros mensal
 * 			qtde de parcelas
 *
 * processamento: juro da divida por meio de um método
 * saída: quanto de juro será pago pelo devedor
 */

public class Atividade_2_1 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in) ;

        //Coletando dados
        System.out.print("Qual o valor da dívida? ");
        double divida = in.nextDouble();

        System.out.print("Qual a taxa? ");
        double taxa = in.nextDouble();

        System.out.print("Quantas parcelas? ");
        int parcelas = in.nextInt();

        //Chamando o método para calcular a divida
        calcularDivida(divida,taxa,parcelas);

    }

    //Toda declaração de método precisa estar fora do MAIN.

    public static void calcularDivida(double divida, double taxa, int parcelas) {

        double calculo = divida * (taxa / 100) * parcelas;
        System.out.printf("Juro a pagar R$ %.2f", calculo);
        System.out.printf("\n Montante de  R$ %.2f", calculo+divida);

    }

}
