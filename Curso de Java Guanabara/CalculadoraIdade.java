/*EXERCÍCIO 4 -FAÇA UM PROGRAMA COM DUAS VARIÁVEIS ANO_NASCIMENTO QUE RECEBERÁ O ANO QUE VOCÊ NASCEU 
E OUTRA VARIÁVEL COM O NOME ANO_FUTURO QUE DEVERÁ SER ATRIBUÍDO O VALOR 2035. 
CRIAR UMA VARIÁVEL COM O NOME RESULTADO PARA CALCULAR A DIFERENÇA. NO FINAL ESCREVA NA TELA QUAL SERÁ A SUA IDADE EM 2035.)*/

//Bibliotecas
import java.util.Scanner;
import java.time.LocalDate; 

//Inicio da Classe
public class CalculadoraIdade {  
    public static void main(String[]args){
        //Constantes e Variáveis
        final int ANO_FUTURO = 2035;
        int ano_nascimento; int resultado;
        int ano_atual = LocalDate.now().getYear();

        //Input
        System.out.print("Digite o ano do seu nascimento: ");
        Scanner entrada = new Scanner(System.in);
        ano_nascimento = entrada.nextInt();
        resultado = ano_atual - ano_nascimento;
        entrada.close();

        //Limpar console
        System.out.print("\033[H\033[2J");
        System.out.flush();

        //Output
        System.out.println("\n");
        System.out.println("Você tem "+ resultado +" Anos.\n");
        System.out.println("Sua idade em 2035 será: " + (ANO_FUTURO - ano_nascimento) + " Anos.\n");
    }
}
