import java.io.IOException;

public class Excepciones {
    private String saludo; //= "Saludos Programas!!!!";

    public Excepciones() {

    }

    public void saludo() throws ArithmeticException {
        System.out.println(Integer.toString("a"));
    }

    public void tryCatch() {
        System.out.println();
        try {
            // código que potencialemente arrojara una excepción
            saludo();
        } catch (IOException e) {
            throw e;
        } catch (Exception e) {

        } finally {
            archivo.close()
        }

    }

    public static void main(String[] args) {
        Excepciones exep = new Excepciones();
        exep.saludo();
    }
}