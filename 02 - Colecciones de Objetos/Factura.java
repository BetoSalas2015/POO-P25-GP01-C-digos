
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
    
    public void agregaArticulo(Articulo art) {
        articulos.add(art);
    }
    
    public Object getArticulo(int index) {
        return articulos.get(index);
    }
    
    public void setArticulo(int index, Articulo art) {
        articulos.set(index, art);
    }
    
     public double calculaTotalArticulos() {
         Articulo recorre;
         double suma = 0.0;
         for(int i = 0; i < articulos.size(); i++) {
             recorre = (Articulo) getArticulo(i);
             suma += recorre.importe();
         }
         return suma;
     }
}




