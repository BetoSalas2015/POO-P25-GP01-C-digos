import java.awt.*;

public class Ventana extends Frame {

    public Ventana() {
        super("Objetos Gráficos");
    }

    public boolean handleEvent(Event e) {
        if (e.id == Event.WINDOW_DESTROY) {
            hide();
            dispose();
            return true;
        }
        return super.handleEvent(e);
    }

    public void paint(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;


        /*Font f = new Font("Arial", Font.BOLD + Font.ITALIC, 16);
        Color c = new Color(0x4D, 0x55, 0xCC);
        g.setColor(Color.RED);
        g.setFont(f);
        g.drawString("Saludos Programas!!!!", 100, 100);

        g.drawLine(150, 50, 100, 90);
        g.fillRect(155, 200, 90, 70);
        g.fillRoundRect(150, 99, 100, 80, 25, 50);

        g.setColor(Color.blue);
        g.fillOval(170, 99, 39, 99);
        g.drawOval(450, 50, 130, 130);

        Color color = new Color(50, 26, 94);
        g.setColor(Color.black);
        g.fillRect(0,0,getWidth(), getHeight());
        g.setColor(Color.yellow);
        g.fillArc(70, 70, 175, 175, 35, 280);
        g.setColor(color);
        g.fillOval(140, 110, 18, 18);
        g.setColor(new Color(232, 214, 19));
        g.fillOval(200, 145, 30, 30); 
        g.fillOval(270, 145, 30, 30);
        g.fillOval(340, 145, 30, 30);*/
    }
    
    public static void main(String[] args) {
        Ventana ventana = new Ventana();
        ventana.resize(400, 300);
        ventana.show();
    }
}