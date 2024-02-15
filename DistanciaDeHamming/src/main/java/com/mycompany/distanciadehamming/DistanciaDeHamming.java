/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.distanciadehamming;

/**
 *
 * @author Marcelo
 */
public class DistanciaDeHamming {

    public static void main(String[] args) {
        String dna1 = "GAGCCTACTAACGGGAT";
        String dna2 = "CATCGTAATGACGGCCT";
            
        int distancia = calcularDistancia(dna1, dna2);
            System.out.println("O tamanho da distância Hamming é: " + distancia);
    }

    public static int calcularDistancia(String dna1, String dna2) {
        int hamming = 0;

        for (int i = 0; i < dna1.length(); i++) {
            if (dna1.charAt(i) != dna2.charAt(i)) {
                hamming++;
            }
        }
    return hamming;
    }
}
        