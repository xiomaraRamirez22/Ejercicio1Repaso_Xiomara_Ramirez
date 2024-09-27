package ejercicios;

public class SumaDeNumerosParesEnUnRango {
    public static void main(String[] args) {
     // suma  de numeros pares
     int a = 1;
     int b = 100;
     int suma = 0;

     for(int i = 2; i <= b; i += 2){
         suma +=i;
     }
        System.out.println("Suma de numeros impares: "+ suma);
    }
}
