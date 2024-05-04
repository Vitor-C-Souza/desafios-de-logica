import java.util.Scanner;

public class comparandoNumeros {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        System.out.println("Digite o 1º numero inteiro: ");
        int n1 = read.nextInt();

        System.out.println("Digite o 2º numero inteiro: ");
        int n2 = read.nextInt();

        if (n1 == n2) {
            System.out.println("Numeros iguais!");
        } else {
            System.out.println("Numeros diferentes");
            if (n1 > n2) {
                System.out.println("O 1º numero é maior");
            } else {
                System.out.println("O 2º numero é maior");
            }
        }

        read.close();
    }
}
