/*3) Descubra a lógica e complete o próximo elemento:
a) 1, 3, 5, 7, ___ <~  Esta sequência parece estar aumentando de 2 em 2. Portanto, o próximo número seria 9
b) 2, 4, 8, 16, 32, 64, ____ <~  Essa sequência esta dobrando o número anterior. Então, o próximo número seria 128
c) 0, 1, 4, 9, 16, 25, 36, ____ <~  a sequência representa a soma dos números ímpares consecutivos:
d) 4, 16, 36, 64, ____ <~ Quadrado dos números pares começando de 2. (2^2, 4^2, 6^2, 8^2...)
e) 1, 1, 2, 3, 5, 8, ____ <~ Esta é a sequência de Fibonacci do exercicio anterior. Próximo numero é 13 (8 + 5)
f) 2,10, 12, 16, 17, 18, 19, ____ <~ Todos os números começam com a letra D, o próximo é 200.
*/

package Desafio;

public class desafio03 {
    public static void main(String[] args) {

        // Sequência a)
        int a = 7; // Último elemento da sequência A
        int proximoA = proximoElementoA(a);
        System.out.println("a) Próximo elemento da sequência A: " + proximoA);

        // Sequência b)
        int b = 64; // Último elemento da sequência B
        int proximoB = proximoElementoB(b);
        System.out.println("b) Próximo elemento da sequência B: " + proximoB);

        // Sequência c)
        int c = 36; // Último elemento da sequência C
        int proximoC = proximoElementoC(c);
        System.out.println("c) Próximo elemento da sequência C: " + proximoC);

        // Sequência d)
        int d = 64; // Último elemento da sequência D
        int proximoD = proximoElementoD(d);
        System.out.println("d) Próximo elemento da sequência D: " + proximoD);

        // Sequência e)
        int e = 8; // Último elemento da sequência E
        int proximoE = proximoElementoE(e);
        System.out.println("e) Próximo elemento da sequência E: " + proximoE);

        // Sequência f)
        int proximoF = proximoElementoSequenciaF(20);
        System.out.println("f) Próximo elemento da sequência F: " + proximoF);
    }

    // Método para encontrar o próximo elemento da sequência A
    public static int proximoElementoA(int ultimo) {
        return ultimo + 2; // A sequência A é formada por números ímpares, então o próximo número será o último conhecido + 2
    }

    // Método para encontrar o próximo elemento da sequência B
    public static int proximoElementoB(int ultimo) {
        return ultimo * 2; /* A sequência B é formada por números que são o dobro do anterior,
                            então o próximo número será o último conhecido vezes 2 */
    }

    // Método para encontrar o próximo elemento da sequência C
    public static int proximoElementoC(int ultimo) {
        return ultimo + 13; /* A sequência C aumenta de 1 em 1, e depois de 4 em 4, depois de 9 em 9,
                              então aumenta 13 por ser o próximo quadrado */
    }

    // Método para encontrar o próximo elemento da sequência D
    public static int proximoElementoD(int ultimo) {
        return 10 * 10; /* Tive muita dificuldade com a lógica desse algoritmo. Irei estudar para conseguir realizá-lo propriamente.*/
    }

    // Método para encontrar o próximo elemento da sequência E
    public static int proximoElementoE(int ultimo) {
        int a = 1;
        int b = 1;
        int temp;
        do {
            temp = a + b;
            a = b;
            b = temp;
        } while (b <= ultimo);
        return b; // A sequência E é a sequência de Fibonacci
    }

    // Método para encontrar o próximo elemento da sequência F
    public static int proximoElementoSequenciaF(int inicio) {
        // Verifica os números de 20 a 200 até encontrar um que comece com a letra "D"
        for (int i = 200; i <= 200; i++) {
            if (String.valueOf(i).startsWith("2")) { // Verifica se começa com a letra "D"
                return i; // Retorna o próximo número que começa com "D"
                //Ha algum erro de logica aqui, consigo visualizá-lo porém preciso de mais técnica para corrigi-lo.
            }
        }
        return -1; // Se nenhum número foi encontrado, retorna -1

    }
}
