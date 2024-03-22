import java.util.ArrayList;

public class Basics{
    public static void imprimirNumeros(int numero){
        for(int i = 0; i < numero + 1; i++) {
            System.out.println(i);
        }
    }

    public static void imprimirImpares(int numero){
        for(int i=0; i< numero; i++){
            if(i%2 == 1){
                System.out.println(i);
            }
        }
    }

    public static int sumaNumeros(int numero){
        int suma = 0;
        for(int i=0; i<numero; i++){
            suma = suma + i;
        }
        return suma;
    }

    public static void iterarArreglo(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.println(arr[i]);
        }
    }
    
    public static int numeroMaximo(int arr[]){
        int numMayor = arr[0];
        for(int i=0; i<arr.length; i++){
            if(arr[i] > numMayor){
                numMayor = arr[i];
            }
        }
        return numMayor;
    }

    public static void obtenerPromedio(int arr[]){
        int suma = 0;

        for(int i = 0; i<arr.length; i++){
            suma = suma + arr[i];
        }

        System.out.println("Promedio de" + " " + suma/arr.length);
    }

    public static void arrImpares(int numero){

        ArrayList<Integer> y = new ArrayList<Integer>();

        for(int i = 0; i<numero + 1; i++){
            if(i%2 != 0){
                y.add(i);
            }
        }

        System.out.println(y);
    }

    public static void mayorQueY(int arr[], int Y){

        ArrayList<Integer> mayorQue = new ArrayList<Integer>();

        for(int i = 0; i<arr.length; i++){
            if(arr[i] > Y){
                mayorQue.add(arr[i]);
            }
        }

        System.out.println(mayorQue.size());
    }

    public static void alCuadrado(int arr[]){

        ArrayList<Integer> cuadrados = new ArrayList<Integer>();

        for(int i = 0; i<arr.length; i++){
            arr[i] = arr[i]*arr[i];
            cuadrados.add(arr[i]);
        } 

        System.out.println(cuadrados);
    }

    public static void noNegs(int arr[]){

        ArrayList<Integer> noNegativos = new ArrayList<Integer>();

        for(int i = 0; i<arr.length; i++){
            if( arr[i] < 0){
                arr[i] = 0;
            }
            noNegativos.add(arr[i]);
        }

        System.out.println(noNegativos);
    }

    public static void minMaxAvg(int arr[]){

        ArrayList<Integer> mmp = new ArrayList<Integer>();

        int max = arr[0];
    
            for(int i = 1; i < arr.length; i++){
                if(arr[i]>max){
                    max = arr[i];
                }
            } 
        int min = arr[0];
    
            for(int i = 1; i < arr.length; i++){
                if(arr[i]<min){
                    min = arr[i];
                }
            }
    
        int sum = 0;
    
            for(int i = 0; i < arr.length; i++){
                sum = sum + arr[i];
            }
            
        mmp.add(max);
        mmp.add(min);
        mmp.add(sum/arr.length);
        System.out.println(mmp);
    }

    public static void cambiarValores(int arr[]){

        ArrayList<Integer> newarr = new ArrayList<Integer>();

        for(int i = 0; i<arr.length; i++){

            if(i<arr.length - 1){
                arr[i] = arr[i+1];
                newarr.add(arr[i]);
            }

            else{
                arr[i] = 0;
                newarr.add(arr[i]);
            }
        }
        

        System.out.println(newarr);
    }
    
    
    public static void main(String[] args) {
        // imprimirNumeros(255);
        // imprimirImpares(255);
        // System.out.println(sumaNumeros(255));
        // int numeros[] = {1,3,5,7,9,13};
        // iterarArreglo(numeros);
        // int numMayor[] = {-1, 9, 2, 8, -15, 7}; 
        // System.out.println(numeroMaximo(numMayor));
        //int promedio[] = {2,10,3,7,8};
        //obtenerPromedio(promedio);
        //arrImpares(255);
        //int seraMayor [] = {1,3,5,7};
        //mayorQueY(seraMayor, 3);
        int x[] = {1,5,10,7,-2};
        //alCuadrado(x);
        //noNegs(x);
        //minMaxAvg(x);
        cambiarValores(x);
    }
}