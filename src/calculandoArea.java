import java.util.Scanner;

public class calculandoArea {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        System.out.println("""
                Escolha uma opção a seguir
                               \s
                1 - Calcular área do quadrado
                2 - Calcular área do círculo
               \s""");
        int opcao = read.nextInt();

        switch (opcao) {
            case 1:
                System.out.println("Digite o valor do lado do quadrado: ");
                double lado = read.nextDouble();

                System.out.println("A area do quadrado é " + (lado * lado));
                break;

            case 2:
                System.out.println("Digite o raio do circulo: ");
                double raio = read.nextDouble();

                String numeroFormatado = String.format("%.2f", (Math.PI * (raio * raio)));
                System.out.println("A area do circulo é " + numeroFormatado);
                break;

            default:
                System.out.println("Opção invalida");
        }

        read.close();
    }
}
