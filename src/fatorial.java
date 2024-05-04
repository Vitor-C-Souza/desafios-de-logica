import java.util.Scanner;

public class fatorial {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        int resultado = 1;
        System.out.println("Digite um numero: ");
        int fatorial = read.nextInt();
        int i = fatorial;
        while (i > 0) {
            resultado = resultado * i;

            i--;
        }

        System.out.println("Fatorial de " + fatorial + " é " + resultado);

        read.close();
    }
}
