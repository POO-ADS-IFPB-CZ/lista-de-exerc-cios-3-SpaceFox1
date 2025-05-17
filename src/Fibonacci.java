package src;

import java.util.Scanner;

public class Fibonacci {
    public static int fibonacci(int n) {
        if (n <= 0) return 0;
        if (n == 1) return 1;
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a quantidade de números da série de Fibonacci a exibir: ");
        int n = scanner.nextInt();

        if (n <= 0) {
            System.out.println("Por favor, digite um número maior que zero.");
            return;
        }

        int[] fibonacciValues = new int[n];

        for (int i = 0; i < n; i++) {
            fibonacciValues[i] = fibonacci(i);
        }

        System.out.print("Série de Fibonacci com " + n + " termos: [");
        for (int i = 0; i < n; i++) {
            System.out.print(fibonacciValues[i]);
            if (i < n - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
}
