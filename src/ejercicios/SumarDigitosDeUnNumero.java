package ejercicios;

public class SumarDigitosDeUnNumero {
    public static void main(String[] args) {
   //Sumar los digitos de un numero

   int a = 5678;
   int suma = 0;

   while (a > 0){
       suma += a % 10;
       a /= 10;
   }
        System.out.println("La suma de los digitos es: "+suma);


    }
}
