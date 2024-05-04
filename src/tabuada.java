import java.util.Scanner;

public class tabuada {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        System.out.println("Digite um tabuada a ser consultada: ");
        int tabuada = read.nextInt();

        for (int i = 0; i < 11; i++) {

            System.out.println(tabuada + " x " + i + " = " + (i * tabuada));
        }

        read.close();
    }
}
