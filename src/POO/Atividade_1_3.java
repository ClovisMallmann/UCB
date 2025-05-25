package POO;

import java.util.Scanner;


public class Atividade_1_3 {

    public static void main(String[] args) {


        String vendedor;
        double salario_fixo;
        int total_vendas;
        double comissao = 0.15;
        double salario_bonus;


        System.out.print("Qual o nome do vendedor? ");
        Scanner scanner = new Scanner(System.in);
        vendedor = scanner.nextLine();

        System.out.printf("\nQual o salario do vendedor %s ?", vendedor);
        salario_fixo = scanner.nextDouble();

        System.out.printf("\nQual o total de vendas do vendedor %s ?", vendedor);
        total_vendas = scanner.nextInt();

        salario_bonus = salario_fixo + (total_vendas * comissao);

        System.out.printf("Salario final do vendedor %s é : R$ " + salario_bonus, vendedor);

    };
};