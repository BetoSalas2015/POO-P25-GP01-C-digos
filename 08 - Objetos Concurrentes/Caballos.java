
/* Cree un programa que simule una carrera de caballos con 5 competidores. 
Cada caballo debe ser representado por un hilo independiente que avanza una 
distancia aleatoria (entre 1 y 5 unidades) en cada iteración. La carrera debe 
terminar cuando algún caballo llegue a una meta predefinida (por ejemplo, 100 
unidades). Imprima el progreso de cada caballo y anuncie el ganador cuando 
termine la carrera. */

public class Caballos extends Thread {
    private String nombre;
    private int  distanciaRecorrida = 0;
    private static final int META = 100;
    private static boolean hayGanador = false;

    public Caballos(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public void run() {
        while (!hayGanador && distanciaRecorrida < META) {
            int avance = (int) (Math.random() * 5) + 1;
            distanciaRecorrida += avance;
            System.out.println(nombre + " avanzó " + avance + " unidades. Total " + distanciaRecorrida);
            if (distanciaRecorrida >= META && !hayGanador) {
                hayGanador = true;
                System.out.println("¡" + nombre + " ha ganado la carrera!");
            }
            try {
                sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        Caballos[] caballos = new Caballos[5]; 
        for (int i = 0; i < caballos.length; i++) {
            caballos[i] = new Caballos("Caballo " + (i + 1));
            caballos[i].start();
        }
    }
}
