package ejercicios;

public class MaximoDeTresNumeros {
    public static void main(String[] args) {
        //Maximo de 3 numeros.
        int a = 5;
        int b = 12;
        int c = 9;

        if (b > a && b > c) {
            System.out.println("El mayor es " + b);
        } else if (a > b && a > c) {
            System.out.println("El mayor es " + a);
        } else if (c > a && c > b) {
            System.out.println("El mayor es " + c);
        }
    }
}
