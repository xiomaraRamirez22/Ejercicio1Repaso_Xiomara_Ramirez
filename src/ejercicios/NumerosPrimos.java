package ejercicios;

public class NumerosPrimos {
    public static void main(String[] args) {
        // Validar que el numero 29 es primo

        int a = 29;
        for (int i = 2; i < a; i++){
            if (a % i == 0){
                System.out.println("No es primo");
                break;
            } else if (i == a - 1) {
                System.out.println("Es primo");
            }
        }
    }
}
