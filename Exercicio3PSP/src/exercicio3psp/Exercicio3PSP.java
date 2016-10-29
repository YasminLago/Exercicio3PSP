/*
Realizar un programa que cree un hilo, que a su vez cree otro hilo, 
y así consecutivamente, hasta un total de cinco hilos. Cada hilo 
debe presentar su nombre indicando que ha comenzado, crear su 
hilo hijo y presentar su nombre 10 veces indicando que se está 
procesando, esperando un tiempo aleatorio entre 100 y 600 
milisegundos entre cada presentación. Cada hilo deberá esperar 
a que su hijo termine antes de presentar su último mensaje 
indicando su nombre y que ha terminado.
 */
package exercicio3psp;

/**
 *
 * @author Yasmin
 */
public class Exercicio3PSP {
    public static void main(String[] args) throws InterruptedException {
      
       //new Thread3Join("Hilo Padre").start();
     
       new Thread3Sleep("Hilo Padre").start();
    }
    
}
