package src;

import java.util.Arrays;
import java.util.Scanner;

public class MegaSena {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[6];
        int contador = 0;

        System.out.println("Digite 6 números distintos entre 1 e 60:");

        while (contador < 6) {
            System.out.print("Número " + (contador + 1) + ": ");
            int numero = scanner.nextInt();

            if (numero < 1 || numero > 60) {
                System.out.println("Número inválido. Digite um número entre 1 e 60.");
                continue;
            }

            boolean duplicado = false;
            for (int i = 0; i < contador; i++) {
                if (numeros[i] == numero) {
                    duplicado = true;
                    break;
                }
            }

            if (duplicado) {
                System.out.println("Número já inserido. Digite um número diferente.");
                continue;
            }

            numeros[contador] = numero;
            contador++;
        }

        Arrays.sort(numeros);

        System.out.println("Números escolhidos em ordem crescente:");
        for (int numero : numeros) {
            System.out.print(numero + " ");
        }
    }
}
