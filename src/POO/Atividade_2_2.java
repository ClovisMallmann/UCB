package POO;
import java.util.Scanner;

/*receba a temperatura em graus Celsius e apresente-a convertida
 * em graus Fahrenheit. A fórmula de conversão é:
 * FAR = (9 * CEL + 160) / 5, sendo FAR a temperatura em
 * Fahrenheit e CEL em Celsius. Esta conversão deve ser feita
 * por meio de um metodo com a seguinte assinatura: public static
 * double fahrenheit(double celsius). O metodo deve receber a
 * temperatura em Celsius e retornar em Fahrenheit.
 *
 * Entrada:	temperatura em graus celsius
 * processamento: metodo que converta celsius para fahrenheit
 * saida : mostrar temperatura convertida
 */


public class Atividade_2_2 {


    public static void main(String[] args) {

        double celsius;
        Scanner in = new Scanner(System.in);


        System.out.print("Entre com a temperatura em Celsius: ");
        celsius = in.nextDouble();
        System.out.print("\n =============================== ");
        System.out.printf("\nA temperatura %.1f Celsius, em fahrenheit é %.1f . ", celsius, fahrenheit(celsius));



    }

    //All statements should stay out of "main".

    public static double fahrenheit(double celsius) {
        double FAR = (9 * celsius + 160) / 5;
        return FAR;
    }

}
