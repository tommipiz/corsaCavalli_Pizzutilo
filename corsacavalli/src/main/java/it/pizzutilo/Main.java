package it.pizzutilo;

public class Main {
    public static void main(String[] args) throws InterruptedException{
        int numCavalli = 5;
        String[] classifica = new String[numCavalli];


        Cavallo[] cavalli = new Cavallo[numCavalli];
        for(int i=0; i< numCavalli; i++) {
            cavalli[i] = new Cavallo(i+1, classifica);
            cavalli[i].start();

        }

        for(Cavallo cavallo : cavalli) {
            try {
                cavallo.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println("Classifica finale");
        for (String posizione : classifica) {
            System.out.println(posizione);
        }

    }
}