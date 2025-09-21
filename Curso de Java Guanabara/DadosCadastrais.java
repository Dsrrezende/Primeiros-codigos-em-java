import java.util.Scanner;
public class DadosCadastrais {
    public static void main(String[]args){
        //Variáveis
        String nome;
        int idade;
        float peso; float altura;
        double imc; double arredondamento;
        char estadoCivil;

        //Input
        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite seu nome: ");
        nome = entrada.nextLine();
        System.out.print("Digite sua idade: ");
        idade = entrada.nextInt();
        System.out.print("Digite seu peso: ");
        peso = entrada.nextFloat();
        System.out.print("Digite sua altura em Metros: ");
        altura = entrada.nextFloat();
        System.out.print("Informe seu estado cívil, Digite [S] para solteiro ou [C] Casado: ");
        estadoCivil = entrada.next().charAt(0);
        entrada.close();

        //Limpa terminal
        System.out.print("\u001b[H\u001b[2J");
        System.out.flush();
        
        //Cálculos e Arrendondamentos
        imc = peso/(altura*altura);
        arredondamento= Math.round(imc*100)/100.0; //Use 10.0 (1 casa), 100.0 para (2 Casas) e 1000.0 (3 casas), , etc.

        //output
        System.out.println("######################################");
        System.out.println("Nome: "+ nome);
        System.out.println("A sua idade é: "+ idade +" Anos");
        System.out.println("Você pesa: "+ peso + " Kg");
        System.out.println("A sau altura é: "+ altura +" M");
        System.out.println("O seu estado Cívil é: "+ estadoCivil);
        System.out.println("O seu IMC é: "+ arredondamento);
        System.out.println("######################################");
    }
}
