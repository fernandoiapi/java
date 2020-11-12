import java.util.Scanner;
public class Uri1008{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        int number, numHoras;
        float valorHora, salario;

        number    = teclado.nextInt();
        numHoras  = teclado.nextInt();
        valorHora = teclado.nextFloat();

        // processamento
        salario = numHoras * valorHora;

        System.out.println("NUMBER = "+number);
        System.out.printf("SALARY = U$ %.2f\n",salario);
    }
}