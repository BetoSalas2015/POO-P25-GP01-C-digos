/**
 * Objeto que representa la Abstracción del Objeto Hora.
 * 
 * @author Roberto Salazar Márquez
 * @version 1.0
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Hora extends JFrame implements Runnable
{
    // instance variables - Atributos de la Abstracción
    private int horas;
    private int minutos;
    private int segundos;
    private JTextField texto;
    private Thread hilo;

    /**
     * Constructor para objetos de la clase Hora sin Argumentos
     */

    public Hora(String nombre)
    {
        super(nombre);
        // initialise instance variables
        horas = 0;
        minutos = 0;
        segundos = 0;

        setLayout(new FlowLayout());
        texto = new JTextField(8);
        texto.setEditable(false);
        add(texto);
        addWindowListener(new CloseWin());
        setSize(230,90);
        setVisible(true);

        hilo = new Thread(this);
        hilo.start();
    }

    private class CloseWin extends WindowAdapter {
        @Override
        public void windowClosing(WindowEvent e) {
            // TODO Auto-generated method stub
            setVisible(false);
            dispose();
        }
        
    }
    
    /**
     * Constructor para objetos de la clase Hora recibiendo
     * horas.
     */

    public Hora(int h)
    {
        super("Hora");
        // initialise instance variables
        setHoras(h);
        setMinutos(0);
        setSegundos(0);
        setLayout(new FlowLayout());
        texto = new JTextField(8);
        texto.setEditable(false);
        add(texto);
        addWindowListener(new CloseWin());
        setSize(230,90);
        setVisible(true);

        hilo = new Thread(this);
        hilo.start();
    }
    
    /**
     * Constructor para objetos de la clase Hora recibiendo
     * horas y minutos.
     */

    public Hora(int h, int m)
    {
        super("Hora");
        // initialise instance variables
        setHoras(h);
        setMinutos(m);
        setSegundos(0);
        setLayout(new FlowLayout());
        texto = new JTextField(8);
        texto.setEditable(false);
        add(texto);
        addWindowListener(new CloseWin());
        setSize(230,90);
        setVisible(true);

        hilo = new Thread(this);
        hilo.start();
    }
    
    /**
     * Constructor para objetos de la clase Hora recibiendo
     * horas minutos y segundos.
     */

    public Hora(int h, int m, int s, String nombre)
    {
        super(nombre);
        // initialise instance variables
        setHoras(h);
        setMinutos(m);
        setSegundos(s);
        setLayout(new FlowLayout());
        texto = new JTextField(8);
        texto.setEditable(false);
        add(texto);
        addWindowListener(new CloseWin());
        setSize(230,90);
        setVisible(true);

        hilo = new Thread(this);
        hilo.start();
    }
    
    /**
     * Constructor para objetos de la clase Hora a partir
     * de un objeto Hora existente
     */
    
    public Hora(Hora hr)
    {
        super("Hora");
        // initialise instance variables
        setHoras( hr.getHoras() );
        setMinutos( hr.getMinutos() );
        setSegundos( hr.getSegundos() );
        setLayout(new FlowLayout());
        texto = new JTextField(8);
        texto.setEditable(false);
        add(texto);
        addWindowListener(new CloseWin());
        setSize(230,90);
        setVisible(true);

        hilo = new Thread(this);
        hilo.start();
    }
    
    /**
     * Este método recibe una nueva hora para el objeto
     * La nueva hora deberá estar entre 0 y 23.
     * 
     * @param      h       Nueva hora para asignar
     * @return     Nada. 
     */
    public void setHoras(int h)
    {
        horas = (h >= 0 && h <= 23) ? h : 0;
    }
    
    /**
     * Este método recibe un nuevo minuto para el objeto
     * El nuevo minuto deberá estar entre 0 y 59.
     * 
     * @param      m       Nuevo minuto para asignar
     * @return     Nada. 
     */
    public void setMinutos(int m)
    {
        minutos = (m >= 0 && m <= 59) ? m : 0;
    }
    
    /**
     * Este método recibe un nuevo minuto para el objeto
     * El nuevo minuto deberá estar entre 0 y 59.
     * 
     * @param      m       Nuevo minuto para asignar
     * @return     Nada. 
     */
    public void setSegundos(int s)
    {
        segundos = (s >= 0 && s <= 59) ? s : 0;
    }
    
    /**
     * Este método envía al exterior el valor del atributo Horas
     * 
     * @param      Ninguno
     * @return     Un int que representa las horas del objeto. 
     */
    public int getHoras()
    {
        return horas;
    }
    
    /**
     * Este método envía al exterior el valor del atributo Minutos
     * 
     * @param      Ninguno
     * @return     Un int que representa los minutos del objeto. 
     */
    public int getMinutos()
    {
        return minutos;
    }
    
    /**
     * Este método envía al exterior el valor del atributo segundos
     * 
     * @param      Ninguno
     * @return     Un int que representa los segundos del objeto. 
     */
    public int getSegundos()
    {
        return segundos;
    }
    
    /**
     * Este método devuelve la hora actuan en forma de cadena
     * en formato AM-PM
     * 
     * @param      Ninguno
     * @return     Cadena con la hora en formato AM-PM. 
     */
    
    public String toString()
    {
        return ((horas == 12  || horas == 0) ? 12 : horas % 12) +
                 ":" + (minutos < 10 ? "0" : "") + minutos +
                 ":" + (segundos < 10 ? "0" : "") + segundos +
                 (horas < 12 ? " AM" : " PM");
    }
    
    /**
     * Este método devuelve la hora actuan en forma de cadena
     * en formato militar de 4 dígitos
     * 
     * @param      Ninguno
     * @return     Cadena con la hora en formato AM-PM. 
     */
    
    public String toMilitaryString()
    {
        return (horas < 10 ? "0" : "")+ horas + (minutos < 10 ? "0" : "") + minutos + 
                     " hrs";
    }
    
    /**
     * Este método incrementa en 1 los segundos actualizando la hora
     * correspondiente.
     * 
     * @param      Ninguno
     * @return     Nada 
     */
    
    public void tick() {
        segundos++;
        if(segundos == 60) {
            segundos = 0;
            minutos++;
            if(minutos == 60) {
                minutos = 0;
                horas++;
                if(horas == 24) {
                    horas = 0;
                }
            }
        }
    }

    public void run() {
        int cont = 1;
        while (cont <= 100) {
            tick();
            try {
                hilo.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            texto.setText(toString());
            cont++;
        } 
    }

    public static void main(String[] args) {
        Hora hora = new Hora(14,11,0, "CDMX");
        Hora hora2 = new Hora("New York");

    }
}    
