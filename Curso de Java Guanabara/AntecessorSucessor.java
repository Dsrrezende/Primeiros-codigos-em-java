/*EXERCICIO 2- Construa um algoritimo que leia um número e exiba na tela o seu sucessor e antecessor*/
import java.util.Scanner;
public class AntecessorSucessor {
    public static void main(String[] args){
        System.out.print("Digite um número: ");
        Scanner num = new Scanner(System.in); 
        int numero = num.nextInt();
        int sum = numero +1;
        int ant = numero -1;
        num.close();

        System.out.print("Você digitou o número: "+ numero +" \n");
        System.out.print("O Antecessor de "+numero+" é "+ant+" e o Sucessor é "+sum+"\n");
    }
    

  
}
