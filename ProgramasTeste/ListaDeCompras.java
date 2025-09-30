package ProgramasTeste;

import java.util.Scanner;

public class ListaDeCompras {
    public static void main(String []args){
        String [] ListaMercado = new String [1];

        Scanner Leia = new Scanner (System.in);

        for (int i =0 ;i < ListaMercado.length;i ++){
            System.out.print("Digite o "+(i+1)+"º item da Lista de Compras: ");
            ListaMercado[i] = Leia.nextLine();
        }
        System.out.println();
        for(int i =0 ;i < ListaMercado.length;i ++){
            System.out.println("Item "+(i+1)+": "+ListaMercado[i]);
        }
        Leia.close();
    }   
}
