package trycatch;

import erro.FahrenheitException;

import java.util.Scanner;

public class Conversor {
    public static void main(String[] args) {
        double valorF=0;
        double valorC=0;
		
        Scanner ler = new Scanner(System.in);

        System.out.print("Digite o grau em ºF: ");

        try{
            valorF = ler.nextDouble();
            
            if(valorF < -459.67){
                throw new FahrenheitException(valorF);
            }
            
            valorC = (5*(valorF-32))/9;
            
            System.out.printf("%.2f °F = %.2f °C\n", valorF, valorC);
        }catch(FahrenheitException erro){
            erro.printStackTrace();
        }
    }
}