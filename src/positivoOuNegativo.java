import java.util.Scanner;

public class positivoOuNegativo {
    public static void main(String[] args) {

        Scanner leitura = new Scanner(System.in);

        double numeroDigitado;

        System.out.println("Digite um numero: ");
        numeroDigitado = leitura.nextDouble();

        if (numeroDigitado > 0) {
            System.out.println("Numero digitado é positivo");
        } else if (numeroDigitado < 0) {
            System.out.println("Numero digitado é negativo");
        } else {
            System.out.println("Numero digitado é 0");
        }

        leitura.close();
    }
}