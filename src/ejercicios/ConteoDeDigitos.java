package ejercicios;

public class ConteoDeDigitos {
    public static void main(String[] args) {
        int a = 987654;
        int digitos = String.valueOf(a).length();

        System.out.println("El numero "+ a + " tiene " + digitos+ " digitos");

    }
}
