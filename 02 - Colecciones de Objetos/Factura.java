
/**
 * Write a description of class Factura here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.Vector;

public class Factura
{
    private String empresa;
    private String cliente;
    private static int num = 1;
    private Vector articulos;
    private int folio;
    
    public Factura(String nomC) {
        empresa = new String("Papeleria Sony");
        cliente = new String(nomC);
        folio = num++;
        articulos = new Vector();
    }
    
    public int getNumArticulos() {
        return articulos.size();
    }
    
    public void agregaArticulo(Object art) {
        articulos.add(art);
    }
    
    public Object getArticulo(int index) {
        return articulos.get(index);
    }
    
    
    
 
}




