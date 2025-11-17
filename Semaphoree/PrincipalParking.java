package Semaphoree;

public class PrincipalParking {

    public static void main(String[] args) {

        Aparcamiento parking = new Aparcamiento(3);

        for (int i = 1; i <= 7; i++) {
            Coche coche = new Coche("Coche-" + i, parking);
            Thread hilo = new Thread(coche);
            hilo.start();
        }
    }
}
