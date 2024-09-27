package ejercicios;

public class SumarLosMultiploDeUnNumero {
    public static void main(String[] args) {
        int a = 3;
        int suma = 0;
        int rango = 50;

        for(int i = 1; i<= rango; i++){
            if(i % a == 0){
                suma += i;
            }
        }
        System.out.println("La suma de los multiplos de  "+ a + " dentro del rango de 1 a "+ rango + " es "+ suma);






    }
}
