/**
 * Write a description of class Articulo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

 public class Articulo {
    private int cantidad;
   private double precio;
   private String descrip;
   
   public Articulo(int cantidad, String desc, double precio) {
       setCantidad(cantidad);
       this.descrip = new String(desc);
       setPrecio(precio);
   }

   public void setCantidad(int cantidad) {
        //  (condicion) ? true : false
       this.cantidad = (cantidad > 0) ? cantidad : 1;
   }

   public void setPrecio(double precio) {
       this.precio = (precio > 0) ? precio : 1.0;
   }

   public void setDescrip(String descrip) {
       this.descrip = descrip;
   }

   public int getCantidad() {
       return cantidad;
   }

   public double getPrecio() {
       return precio;
   }

   public String getDescrip() {
       return new String(descrip);
   }
   
   public double importe() {
       return cantidad * precio;
   }
   
}
