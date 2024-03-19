/*2) Dado a sequência de Fibonacci, onde se inicia por 0 e 1 e o próximo valor sempre será
a soma dos 2 valores anteriores (exemplo: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34...), escreva um
programa na linguagem que desejar onde, informado um número,ele calcule a sequência de Fibonacci
e retorne uma mensagem avisando se o número informado pertence ou não a sequência.
IMPORTANTE:
Esse número pode ser informado através de qualquer entrada de sua preferência ou pode ser previamente definido no código;*/

package Desafio;

import java.util.Scanner;

public class desafio02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número para verificar se pertence à sequência de Fibonacci: ");
        int numero = scanner.nextInt();

        // Estrutura para verificação do número
        if (sequenciaFibonacci(numero)) {
            System.out.println("O número " + numero + " pertence à sequência de Fibonacci.");
        } else {
            System.out.println("O número " + numero + " não pertence à sequência de Fibonacci.");
        }

        scanner.close();
    }

    //Criação de método booleano para verificar sequencia
    public static boolean sequenciaFibonacci(int numero) {
        int a = 0;
        int b = 1;

        // Itera até que o próximo número na sequência seja menor ou igual ao número fornecido
        while (b <= numero) {
            // Verifica se o número fornecido é igual a algum número na sequência
            if (numero == b) {
                return true; // Se número encontrado, retorna verdadeiro
            }
            // Calcula o próximo número na sequência
            int varTemp = a + b;
            a = b;
            b = varTemp;
        }

        return false; // Se o número não for encontrado na sequência, retorna falso
    }
}
