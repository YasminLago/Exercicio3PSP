package exercicio3psp;

/**
 *
 * @author Yasmin
 */
public class Thread3Join extends Thread {
    
    Thread hijo;
    static int i = 0;
    
    public Thread3Join(String name) {
        super(name);
    }

    public void run() {
        //Comienza el hilo
        System.out.println(getName() + " he comenzado.");
        
        //Mientras que i sea menor o igual a 4 se crearan hilos 
        while (i <= 4) {
            i++;//Cuenta el numero de hilos creados
            
            //Cada hilo se procesa 10 veces 
            for (int z = 1; z <= 10; z++) {
                System.out.println(getName()  + " me estoy procesando.");      
            }
            
        //Se crea un nuevo hilo hijo 
        hijo = new Thread3Join("Hijo "+i);
            
            /**
             * Si i es menor o igual que 4 se crearan hilos nuevos y 
             * esperaran a que termine el hilo anterior
            **/
            if(i<=4){
                try {
                    hijo.start();
                    hijo.join();
                } catch (InterruptedException ex) {}
            }
        System.out.println(getName() + " he terminado.");  
        }    
    }
}
