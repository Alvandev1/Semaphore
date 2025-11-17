package Semaphoree;
import java.util.concurrent.Semaphore;

public class Aparcamiento {

    private Semaphore semaphore; // Controla cuántos pueden entrar
    private int plazasOcupadas = 0; // Para mostrar el estado en consola


    public Aparcamiento(int capacidad) {
        this.semaphore = new Semaphore(capacidad, true);

    }

    public void entrar(String nombre) {
        try {
            System.out.println(nombre + " está intentando entrar...");
            semaphore.acquire();

            synchronized (this) {
                plazasOcupadas++;
                System.out.println(nombre + " ha entrado. Plazas ocupadas: " + plazasOcupadas);
            }

        } catch (InterruptedException e) {
            System.err.println("Error: Hilo interrumpido en entrar()");
        }
    }
    public void salir(String nombre) {
        semaphore.release();

        synchronized (this) {
            plazasOcupadas--;
            System.out.println(nombre + " ha salido. Plazas ocupadas: " + plazasOcupadas);
        }
    }
}
