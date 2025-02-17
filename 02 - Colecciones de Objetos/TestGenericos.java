
/**
 * Write a description of class TestGenericos here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TestGenericos
{
    
    public static <E> void imprimeArreglo(E[] arregloEntrada) {
        for(E elemento : arregloEntrada) {
            System.out.print(elemento + ", ");
        }
        System.out.println();
    }
    
    public static void main(String[] args) {
        Double[] arrDouble = { 3.2, 2.3, 5.2, 7.4, 6.5 };
        Integer[] arrInteger = { 1,2,3,4,5,6,7,8,9 };
        Character[] arrCharacter = { 'a', 'b', 'c', 'd' };
        Boolean[] arrBoolean = { true, false, true, true, false };
        imprimeArreglo(arrDouble);
        imprimeArreglo(arrInteger);
        imprimeArreglo(arrCharacter);
        imprimeArreglo(arrBoolean);
    }

}
