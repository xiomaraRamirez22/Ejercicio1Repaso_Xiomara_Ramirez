package ejercicios;

public class RaizCuadrada {
    public static void main(String[] args) {
        // Raiz cuadrada de 49 = 7
        int a = 49;

        for (int i = 2; i < a; i++) {
            if (a % i == 0) {
                if (i * i == a) {
                    System.out.println("la raiz cuadrada de : " + a + " es " + i);
                    break;
                }
            } else if (i == a - 1) {
                System.out.println("la raiz cuadrada de " + a + " no es un numero entero");
            }
        }
    }
}
