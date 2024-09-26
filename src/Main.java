import java.sql.Struct;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int [] vetorNosso = new int[15];
        int x;

        for (int i = 0; i < 15; i++) {

            System.out.println("Insira um elemento para o indice " + (i + 1));
            vetorNosso[i] = scanner.nextInt();

        }

        System.out.print("Insira um número para ser procurado: ");
        x = scanner.nextInt();

        boolean achou = MethodsNewList.verifyElement(vetorNosso, x);
        int [] indexes = MethodsNewList.searchElement(vetorNosso, x);

        if (achou) {
            for (int index : indexes) {
                System.out.print(index + " ");
            }
        } else {
            System.out.println("Elemento não encontrado");
        }


    }
}