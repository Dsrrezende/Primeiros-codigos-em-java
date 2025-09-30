package ProgramasTeste;

import java.util.Scanner;

public class CalculadoraDeMediaVetor {
    public static void main(String[] args) {
        double [] notasBimestrais = new double [4];
        double media = 0;

        Scanner Leia = new Scanner (System.in);
        for (int i = 0;i < notasBimestrais.length; i++){
        System.out.print("Digite a "+(i+1)+"ª nota bimestral: ");
        notasBimestrais[i] = Leia.nextInt();
        media = media + notasBimestrais[i] /4;
    }
    System.out.printf("A sua média é %.2f ", media);
    Leia.close();
    }
}

