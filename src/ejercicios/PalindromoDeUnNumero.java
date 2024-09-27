package ejercicios;

public class PalindromoDeUnNumero {
    public static void main(String[] args) {
        //Palindromo de un numero: se lee igual hacia adelante y hacia atras.

        int a = 1221;
        String numero = "1221";
        String.valueOf(1221);
        String reversa = new StringBuilder("1221").reverse().toString();
        if (numero.equals(reversa)) {
            System.out.println("El numero es un Palindromo: ");
        } else {
            System.out.println("No es un Palindromo");
        }
    }
}
