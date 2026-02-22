/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.eduardoflx.att5lista3ed1;
import java.util.Scanner;

/**
 *
 * @author eduardo
 */
public class Att5Lista3ED1 {

    // Verifica se todos os elementos são distintos
    public static boolean verificarUnicos(int[] vetor) {

        for (int i = 0; i < vetor.length; i++) {
            for (int j = i + 1; j < vetor.length; j++) {
                if (vetor[i] == vetor[j]) {
                    return false; // Encontrou repetido
                }
            }
        }

        return true; // Não encontrou repetido
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o tamanho do vetor: ");
        int tamanho = scanner.nextInt();

        int[] vetor = new int[tamanho];

        System.out.println("Digite os elementos do vetor:");

        for (int i = 0; i < tamanho; i++) {
            vetor[i] = scanner.nextInt();
        }

        if (verificarUnicos(vetor)) {
            System.out.println("Todos os numeros sao distintos.");
        } else {
            System.out.println("Existem numeros repetidos no vetor");
        }

        scanner.close();
    }
}
