package POO;

import java.util.Scanner;


/* Entrada de dados: 2 notas de um estudante em double;
 * processamento: verificar se o mesmo está aprovado ou não
 * saída: valores informados, media e resultado.
 */

public class Atividade_1_6 {

    public static void main(String[] args) {

        double nota1, nota2;
        boolean S = false;
        Scanner scanner = new Scanner(System.in);
        double media;

        do {
            System.out.print("===================================== \n");

            System.out.print("Digite a primeira nota: ");
            nota1 = scanner.nextDouble();
            System.out.print("\n Digite a segunda nota: ");
            nota2 = scanner.nextDouble();

            if (nota1!= 0 && nota2 != 0) {
                if (nota1 <=10 && nota2 <= 10) {
                    media = (nota1 + nota2) / 2;

                    if (media > 7) {
                        S = true;
                        System.out.printf("\nO aluno está aprovado com média: %.2f \n", media);
                    }else {
                        System.out.printf("\nO aluno está reprovado com média: %.2f\n", media);
                    }
                }else {
                    System.out.print("\n ---> Entre com o formato correto.\n");
                }
            }else {
                System.out.print("\n ---> Entre com o formato correto.\n");
            }


        }while(!S);
        System.out.print("===================================== \n");

    }

}