package it.pizzutilo;

public class Cavallo extends Thread{
    public static int posizione = 1;
    private final int numCavallo;
    private final String[] classifica;

    public Cavallo(int numCavallo, String[] classifica) {
        this.numCavallo = numCavallo;
        this.classifica = classifica;
    }

    
    @Override
    public void run() {

        try {
            int tempoDicorsa = (int) (Math.random() * 100);
            Thread.sleep(tempoDicorsa);

            synchronized (Cavallo.class) {
                classifica[posizione-1] = "Cavallo " + numCavallo +  " ha finito in posizione " + posizione;
                posizione++;
            }
        
        }catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    
}
