import java.awt.*;

public class Ventana extends Frame {

    private Dibujo dibujo;

    public Ventana() {
        super("Objetos Gráficos");

        dibujo = new Dibujo();
        add(dibujo,"Center");
    }

    public boolean handleEvent(Event e) {
        if (e.id == Event.WINDOW_DESTROY) {
            hide();
            dispose();
            return true;
        }
        return super.handleEvent(e);
    }
    
    public static void main(String[] args) {
        Ventana ventana = new Ventana();
        ventana.resize(400, 300);
        ventana.show();
    }
}