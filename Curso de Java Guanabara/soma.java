import java.util.Scanner;
public class soma {
    public static void main(String[] args) {
        System.out.print("Digite um número: ");
        Scanner entrada = new Scanner(System.in);
        int nun = entrada.nextInt();
        entrada.close();
        if (nun < 10) {
            System.out.println("O número digitado é menor que 10.");
        }else{
            System.out.println("O número é maior que 10.");
        }
            
    }
}

