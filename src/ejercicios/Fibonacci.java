package ejercicios;

public class Fibonacci {
    public static void main(String[] args) {
    // Secuencia de Fibonacci
        int n = 10;
        int a = 0;
        int b = 1;

        System.out.println(a + " "+ b);
        for(int i = 2; i< n; i++){
            int suma = a + b;
            System.out.println("," + suma);
            a = b;
            b = suma;
        }

    }
}
