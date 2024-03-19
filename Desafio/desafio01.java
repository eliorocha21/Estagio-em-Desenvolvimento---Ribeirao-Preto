/*1) Observe o trecho de código abaixo:
int INDICE = 13, SOMA = 0, K = 0;
enquanto K < INDICE faça
{
K = K + 1;
SOMA = SOMA + K;
}
imprimir(SOMA);
Ao final do processamento, qual será o valor da variável SOMA?
*/

package Desafio;

public class desafio01 {
    public static void main(String[] args) {
        int indice = 13;
        int soma = 0;
        int k = 0;

        while (k < indice){
            k = k + 1;
            soma = soma + k;
        }

        System.out.println("O valor da variável Soma é = " + soma);
        /* O loop while executa enquanto o valor de K(0) for menor que INDICE,
        que é 13. Dentro do loop, a cada iteração, o valor de K é incrementado em 1 e
        adicionado ao valor atual de SOMA, que ao final será 91.*/
    }
}
