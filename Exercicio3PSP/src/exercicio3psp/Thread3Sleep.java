package exercicio3psp;

/**
 *
 * @author Yasmin
 */
public class Thread3Sleep extends Thread{
    
    Thread hijo;
    static int i = 0;
    static int num = 0;
    static int duermo = 5000;
    
    public Thread3Sleep(String name) {
        super(name);
    }

    public void run() {
        duermo-=1000; //Se resta el tiempo del sleep
        System.out.println(getName() + " he comenzado.");//Comienza el primer hilo
        
        //Mientras que i sea menor o igual a 4 se crearan hilos 
        while (i <= 4) {
            i++; //Cuenta el numero de hilos creados
            num++; //Suma 1 a cada vuelta del bucle para ser comparado con i
            
            //Cada hilo se procesa 10 veces
            for (int z = 1; z <= 10; z++) {
                System.out.println(getName()  + " me estoy procesando.");    
            }
            
        //Se crea un nuevo hilo hijo 
        hijo = new Thread3Sleep("Hijo "+i);
        
            /**
             * Si i es igual a num y es menor o igual que 4 se crearan 
             * hilos nuevos y dormiran hasta que termine el hilo anterior
            **/
            if(i==num && i<=4){
                try {
                    hijo.start();
                    sleep(duermo);
                    
                } catch (InterruptedException ex) {}           
            }  
        System.out.println(getName() + " he terminado.");
        }    
    }
}

