// UTILIZAÇÃO DOS OPERADORES MATEMÁTICOS BÁSICOS (+, -, *, /, %)

//EXERCICIO 1- Leia dois valores pelo teclado e imprima a soma

import java.util.Scanner;

public class SomaDeDoisNumeros {
    public static void main(String[] args){
        float n1 ;
        float n2 ;
        float soma ;
        System.out.print("Digite o primeiro número: ");
        Scanner entrada = new Scanner(System.in);
        n1 = entrada.nextFloat();
        System.out.print("Digite o segundo número: ");
        n2 = entrada.nextFloat();
        soma = n1 + n2;
        System.out.println("A soma entre " + n1 + " e " + n2 + " é igual a: " + soma);
        entrada.close();
    } 
    
    
}
