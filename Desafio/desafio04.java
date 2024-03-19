/*4) Você está em uma sala com três interruptores, cada um conectado a uma lâmpada em uma sala diferente.
Você não pode ver as lâmpadas da sala em que está, mas pode ligar e desligar os interruptores quantas vezes quiser.
Seu objetivo é descobrir qual interruptor controla qual lâmpada.
Como você faria para descobrir, usando apenas duas idas até uma das salas das lâmpadas,
qual interruptor controla cada lâmpada?*/

/*
Resolução:
Ligue o primeiro interruptor e espere alguns minutos.
Desligue o primeiro interruptor e ligue o segundo interruptor.
Entre na sala onde estão as lâmpadas.
Agora, vejamos as possíveis situações:

Se a lâmpada estiver acesa, então o primeiro interruptor controla essa lâmpada.
Se a lâmpada estiver apagada e sentirmos que ela está quente ao tocar, então o segundo interruptor controla essa lâmpada.
Se a lâmpada estiver apagada e não estiver quente ao tocar, então o terceiro interruptor controla essa lâmpada.
Com este método, podemos identificar qual interruptor controla cada lâmpada com apenas duas visitas à sala das lâmpadas.*/

package Desafio;

import java.util.Random;

public class desafio04 {
    public static void main(String[] args) {
        boolean[] lâmpadas = new boolean[3];
        boolean[] interruptores = new boolean[3];
        Random random = new Random();

        // Ligar e desligar os interruptores aleatoriamente
        for (int i = 0; i < interruptores.length; i++) {
            interruptores[i] = random.nextBoolean();
        }

        // Simular a primeira ida até a sala das lâmpadas
        for (int i = 0; i < interruptores.length; i++) {
            if (interruptores[i]) {
                lâmpadas[i] = !lâmpadas[i]; // Inverter o estado da lâmpada
            }
        }

        // Simular a segunda ida até a sala das lâmpadas
        for (int i = 0; i < interruptores.length; i++) {
            if (interruptores[i]) {
                lâmpadas[i] = !lâmpadas[i]; // Inverter o estado da lâmpada
            }
        }

        // Imprimir o resultado
        for (int i = 0; i < lâmpadas.length; i++) {
            System.out.println("A lâmpada " + (i + 1) + " está " + (lâmpadas[i] ? "ligada" : "desligada"));
            System.out.println("O interruptor " + (i + 1) + " está " + (interruptores[i] ? "ligado" : "desligado"));
        }
    }
}
