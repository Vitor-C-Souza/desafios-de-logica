import java.util.Scanner;

public class parOuImpar {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        System.out.println("Digite um numero inteiro: ");
        int numero = read.nextInt();

        if (numero % 2 == 0) {
            System.out.println("O numero é par");
        } else {
            System.out.println("O numero é impar");
        }

        read.close();
    }
}
