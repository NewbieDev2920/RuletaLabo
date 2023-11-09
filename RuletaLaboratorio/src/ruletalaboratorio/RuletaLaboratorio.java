/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ruletalaboratorio;

import java.lang.Math;
import java.util.Random;
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
        Random rand = new Random();
        int flow;
        int giros = 1;
        int max = 24;
        int min = 1;
        int rango = max - min + 1;
        int LanzamientoBlanca;
        int LanzamientoNegra;
        int colorBlanca = 0;
        int colorNegra = 0;
        int sum;
        float mayorgan;
        float prom1, prom2, prom3;
        float sum1 = 0, sum2 = 0, sum3 = 0;
        Scanner leer = new Scanner(System.in);
        System.out.println("Presiona (1) para girar la ruleta.");
        flow = leer.nextInt();
        while(flow!=1){
            System.out.println("Valor invalido, presiona (1) para girar la ruleta:");
            flow = leer.nextInt();
        }
        while (flow == 1) {
            System.out.println("----------");
            System.out.println("Giro #" + giros);
            System.out.println("----------");
            LanzamientoBlanca = rand.nextInt(rango) + min;
            LanzamientoNegra = rand.nextInt(rango) + min;
            sum = LanzamientoBlanca + LanzamientoNegra;
            if (LanzamientoBlanca % 2 == 1) {
                colorBlanca = 0;
            } else {
                colorBlanca = 1;
            }
            if (LanzamientoNegra % 2 == 1) {
                colorNegra = 0;
            } else {
                colorNegra = 1;
            }

            System.out.println("Bola Blanca, casilla " + LanzamientoBlanca);
            System.out.println("Bola negra, casilla " + LanzamientoNegra);

            if (colorBlanca == 1 & colorNegra == 0 & (sum <= 19 | sum >= 29)) {
                /*System.out.println("GANASTE!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
                System.out.println("por condicion 1");*/
                System.out.println("Ganancia por condicion 1");
                sum1++;
            } else {
                if (colorBlanca == 1 & colorNegra == 0 & (sum >= 20 | sum < 29)) {
                    /*System.out.println("GANASTE!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
                    System.out.println("por condicion 2");*/
                    System.out.println("Ganancia por condicion 2");
                    sum2++;
                } else {
                    if (colorBlanca == 0 & colorNegra == 1 & sum <= 21) {
                        /*System.out.println("GANASTE!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
                        System.out.println("por condicion 3");*/
                        System.out.println("Ganancia por condicion 3");
                        sum3++;
                    } else {
                        System.out.println("No tuviste Ganancias, No se cumplieron ninguna de las condiciones.");
                    }
                }
            }
            System.out.println("\nDeseas girar la ruleta otravez? \n(1)Si \n(2)No");
            flow = leer.nextInt();
            while(flow<1 || flow>5){
                System.out.println("Valor invalido, Deseas girar la ruleta otravez? \n(1)Si \n(2)No");
                flow=leer.nextInt();
            }
            if (flow == 1) {
                giros += 1;
            }
        }

        prom1 = sum1 / giros;
        prom2 = sum2 / giros;
        prom3 = sum3 / giros;
        mayorgan = prom1;
        
        if (prom2 > mayorgan) {
            mayorgan = prom2;
        } else {
            if (prom3 > mayorgan) {
                mayorgan = prom3;
            }
        }

        if (mayorgan == prom1 && prom1 == prom2 && prom2 == prom3) {
            System.out.println("Obtendras las mismas ganancias por todas las condiciones");
        } else {
            if (mayorgan == prom1 && prom1 == prom2) {
                System.out.println("Obtendras las mismas ganancias por la CONDICIÓN 1 Y CONDICIÓN 2");
            } else {
                if (mayorgan == prom2 && prom2 == prom3) {
                    System.out.println("Obtendra las mismas ganancias por la CONDICION 2 Y CONDICION 3");
                } else {
                    if (mayorgan == prom3 && prom3 == prom1) {
                        System.out.println("Obtendras las mismas ganancias por la CONDICIÓN 1 Y CONDICIÓN 3");
                    } else {
                        if (mayorgan == prom1) {
                            System.out.println("Obtendrias mayores ganancias por la CONDICIÓN 1");
                        } else {
                            if (mayorgan == prom2) {
                                System.out.println("Obtendrias mayores ganancias por la CONDICIÓN 2");
                            } else {
                                if (mayorgan == prom3) {
                                    System.out.println("Obtendrias mayores ganancias por la CONDICIÓN 3");
                                }
                            }
                        }
                    }
                }
            }
        }

    }

}
