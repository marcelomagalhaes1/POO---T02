/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.calculandoresistor;

/**
 *
 * @author Marcelo
 */
public class CalculandoResistor {

    public static void main(String[] args) {
        System.out.println("primeira soma: "+ valorResistor("marrom", "verde"));
        System.out.println("segunda soma: "+ valorResistor("marrom", "verde","violeta"));
    }
    
    public static int valorResistor (String... cores){
        int resistor = 0;
        int maxCor = 2;
        
        for (String cor : cores) {
            resistor = resistor * 10 + valorDaCor(cor);
                if (--maxCor == 0){
            break;   
            }
        }
    return resistor;
    }
    
    public static int valorDaCor (String cor){
        cor = cor.toLowerCase();
        
        return switch (cor) {
            case "preto" -> 0;
              case "marrom" -> 1;
                case "vermelho" -> 2;
                  case "laranja" -> 3;
                    case "amarelo" -> 4;
                    case "verde" -> 5;
                  case "azul" -> 6;
                case "violeta" -> 7;
              case "cinza" -> 8;
            case "branco" -> 9;
        default -> 0;
        };
    }
}   