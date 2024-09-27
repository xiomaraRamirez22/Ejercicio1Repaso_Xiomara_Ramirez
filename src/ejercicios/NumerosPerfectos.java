package ejercicios;

public class NumerosPerfectos {
    public static void main(String[] args) {
    //Numeros perfectos, la suma de sus divisores es igual al numero. Excluyendo el mismo numero
        int a = 28;
        int suma = 0;

        for (int i = 1; i < a; i++) {
            if (a % i == 0) {
                suma += i;
            }
        }
        if (suma == a) {
            System.out.println(a + " es un numero perfecto");
        } else {
            System.out.println(a + " no es un numero perfecto");
        }
    }
}
