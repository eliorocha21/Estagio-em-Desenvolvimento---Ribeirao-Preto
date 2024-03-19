/*5) Escreva um programa que inverta os caracteres de um string.
IMPORTANTE:
a) Essa string pode ser informada através de qualquer entrada de sua preferência ou pode ser previamente definida no código;
b) Evite usar funções prontas, como, por exemplo, reverse;*/

package Desafio;

public class desafio05 {
    public static void main(String[] args) {

        String textoOriginal = "Olá, Target Sistemas!";
        String textoInvertido = inverterString(textoOriginal);
        System.out.println("Texto original: " + textoOriginal);
        System.out.println("Texto invertido: " + textoInvertido);
    }

    public static String inverterString(String texto) {
        // Verifica se a string é nula ou vazia
        if (texto == null || texto.isEmpty()) {
            return texto;
        }

        // Constrói a string invertida
        StringBuilder resultado = new StringBuilder();
        for (int i = texto.length() - 1; i >= 0; i--) {
            resultado.append(texto.charAt(i));
        }

        return resultado.toString();
    }
}

