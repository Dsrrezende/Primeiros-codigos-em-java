import java.util.Scanner;

// UTILIZAÇÃO DOS OPERADORES MATEMÁTICOS BÁSICOS (+, -, *, /, %)

//EXERCICIO 1- Leia dois valores pelo teclado e imprima a soma
public class teste {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro valor: ");
        int valor1 = scanner.nextInt();

        System.out.print("Digite o segundo valor: ");
        int valor2 = scanner.nextInt();

        int soma = valor1 + valor2;
        System.out.println("A soma é: " + soma);

        scanner.close();
    }
}