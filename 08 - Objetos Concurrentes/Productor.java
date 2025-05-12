public class Productor extends Thread {
    
    private Almacen dato;

    public Productor(Almacen d) {
        dato = d;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            dato.setValor(i);
            System.out.println("Se guardó el valor " + i);
            try {
                sleep( (int) Math.random() * 500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
