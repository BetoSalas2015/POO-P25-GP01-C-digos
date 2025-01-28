public class TestArreglos {
    int arreglo[], arreglo6;
    int []arreglo2, arreglo5;
    int[] arr = { 1,2,3,4,5,6,7,8,9,0};         //  Inicializaciión directa
    int[][] matriz = { {1,2}, {3}, {4,5,6,7} };
    
    public TestArreglos() {
        
        arreglo5 = new int[15];
        arreglo = new int[20];
        
        arreglo[12] = 2000;
        llenaArreglo(5, arreglo5);

    }
    
    public void llenaArreglo(int valor) {
        for(int i = 0; i < arreglo.length; i++) {
            arreglo[i] = valor;       
        }
    }
    
    public void llenaArreglo(int valor, int[] arreglo) {
        for(int i = 0; i < arreglo.length; i++) {
            arreglo[i] = valor;       
        }
    }
}



