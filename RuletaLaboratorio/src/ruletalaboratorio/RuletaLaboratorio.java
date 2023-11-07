/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ruletalaboratorio;

import java.lang.Math;
import java.util.Scanner;

/**
 *
 * @author Silva Jorge, Tilano Samuel, De la Rosa Carlos
 */

/*

ColorCasilla
0 = negro
1 = blanco


 */
public class RuletaLaboratorio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        float i;
        int max = 24;
        int min = 1;
        int rango = max - min + 1;
        int LanzamientoBlanca;
        int LanzamientoNegra;
        int colorBlanca = 0;
        int colorNegra = 0;
        int sum;
        float prom1, prom2, prom3;
        float sum1 = 0, sum2 = 0, sum3 = 0;
        System.out.println("Introduzca la cantidad de ruletas a girar");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        while (n < 0) {
            System.out.println("Valor incorrecto, vuelva a introducir la cantidad de ruletas a girar");
            n = input.nextInt();
        }
        for (i = 0; i <= n; i++) {
            System.out.println("----------");
            System.out.println("Giro #" + i+1);
            System.out.println("----------");
            LanzamientoBlanca = (int) (Math.random() * rango) + min;
            LanzamientoNegra = (int) (Math.random() * rango) + min;
            sum = LanzamientoBlanca + LanzamientoNegra;
            if(LanzamientoBlanca % 2 == 1) {
                colorBlanca = 0;
            }else{
                colorNegra = 1;
            }
            if(LanzamientoNegra % 2 == 1) {
                colorBlanca = 0;
            } else {
                colorNegra = 1;
            }

            System.out.println("Casilla1: " + LanzamientoBlanca);
            System.out.println("Casilla2: " + LanzamientoNegra);
            System.out.println("Suma: " + sum);

            if (colorBlanca == 1 & colorNegra == 0 & (sum <= 19 | sum >= 29)) {
                System.out.println("GANASTE!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
                System.out.println("por condicion 1");
                sum1++;
            } else {
                if (colorBlanca == 1 & colorNegra == 0 & (sum >= 20 | sum < 29)) {
                    System.out.println("GANASTE!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
                    System.out.println("por condicion 2");
                    sum2++;
                } else {
                    if (colorBlanca == 0 & colorNegra == 1 & sum <= 21) {
                        System.out.println("GANASTE!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
                        System.out.println("por condicion 3");
                        sum3++;
                    } else {
                        System.out.println("PERDISTE :'(");
                        
                    }
                }
            }

        }
        prom1 = sum1 / i;
        prom2 = sum2 / i;
        prom3 = sum3 / i;
        System.out.println("Probabilidades---");
        System.out.println("Condicion 1: " + prom1 * 100 + "%");
        System.out.println("Condicion 2: " + prom2 * 100 + "%");
        System.out.println("Condicion 3: " + prom3 * 100 + "%");

    }

}
