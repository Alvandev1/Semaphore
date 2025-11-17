package Semaphoree;

import java.util.Random;
import java.util.concurrent.Semaphore;

public class Coche implements Runnable {

    private Aparcamiento parking;
    private String nombre;
    private Random random = new Random();

    public Coche(String nombre, Aparcamiento parking) {
        this.nombre = nombre;
        this.parking = parking;
    }


    @Override
    public void run() {
        parking.entrar(nombre);

        try {
            int tiempo = 1000 + random.nextInt(3000); // entre 1 y 4 segundos
            Thread.sleep(tiempo);
        } catch (InterruptedException e) {
            System.err.println("Error en el hilo de " + nombre);
        }

        parking.salir(nombre);
    }
}
