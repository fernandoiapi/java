import java.util.Scanner;

public class Uri1065{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        float numero;
        int qtdpositivos=0;
        for (int count=1; count<=5; count++){
            numero = teclado.nextFloat();
            if (numero %2 == 0){
                qtdpositivos++;
            }
        }
        System.out.printf(qtdpositivos+ "valores pares");
    }
}