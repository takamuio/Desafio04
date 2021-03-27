package com.mycompany.desafio04;

import java.util.Collections;
import java.util.Scanner;

public class Solucao extends Atributo {

    Scanner ler = new Scanner(System.in);

    public void PegandoNumeros() {
        int index = 1;

        System.out.println("Digite 10 numeros: ");

        do {
            System.out.println("Numero " + index + ": ");
            firstNumber.add(ler.nextInt());
            index++;

        } while (firstNumber.size() < 10);

    }

    public void DiferecaNumeros() {

        for (int x = 0; x < 9; x++) {
            marco1 = firstNumber.get(index0);
            marco2 = firstNumber.get(index1);
            int diferenca = marco2 - marco1;
            diferenceNumber.add(diferenca);

            index0++;
            index1++;
        }

    }

    public void BigDiference() {
        int maior = Integer.MIN_VALUE;
        int indiceMaior = -1;
        for (int i = 0; i < diferenceNumber.size(); i++) {
            if (diferenceNumber.get(i) > maior) {
                maior = diferenceNumber.get(i);
                indiceMaior = i;
            }
        }
        int somaIndice = indiceMaior + 1;

        System.out.printf("A maior diferença é %d, no índice %d e %d", maior, indiceMaior, somaIndice);
        //System.out.printf("A maior diferença é " + maior + " no índice " + indiceMaior + " e " + somaIndice);

    }

    public void FirstSort() {
        Collections.sort(firstNumber);
    }

    public void diferenceSort() {
        Collections.sort(diferenceNumber);
    }

}
