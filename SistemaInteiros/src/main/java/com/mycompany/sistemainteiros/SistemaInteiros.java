/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.sistemainteiros;
import java.util.Scanner;

/**
 *
 * @author Marcelo
 */
public class SistemaInteiros {

    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);

            int nro = 0;
             int soma = 0;
              int maior = Integer.MIN_VALUE;
             int menor = Integer.MAX_VALUE;
            int quantidade = 0;
            
        System.out.println("Digite diversos números que sejam inteiros, para encerrar o programa digite o valor -1:");
        
            while (nro != -1) {
                nro = scanner.nextInt();
            
            if (nro == -1) {
                break;
                }
            
            quantidade++;
            soma += nro;
            maior = Math.max(maior, nro);
            menor = Math.min(menor, nro);
            }
            
        if (quantidade > 0) {
            int media = soma / quantidade;
                System.out.println("Total de número digitados: "+ quantidade);
                System.out.println("Maior número digitado: "+ maior);
                System.out.println("Menor número digitado: "+ menor);
                System.out.println("Média da quantidade de números digitados: "+ media);
            } else{
                System.out.println("Nenhum número foi digitado!!!");
            }
        scanner.close();
    }  
}