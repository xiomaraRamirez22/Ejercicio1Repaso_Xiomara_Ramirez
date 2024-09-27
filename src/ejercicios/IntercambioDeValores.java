package ejercicios;

public class IntercambioDeValores {
    public static void main(String[] args) {
        int a = 5;
        int b = 10;
        System.out.println("Antes de Intercambio");
        System.out.println("a = "+a);
        System.out.println("b = "+b);

        a = a+b;
        b = a-b;
        a = a-b;


        System.out.println("Despues de intercambio");
        System.out.println("a = "+a);
        System.out.println("b = "+b);
    }
}
