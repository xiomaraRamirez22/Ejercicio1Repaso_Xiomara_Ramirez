package ejercicios;

public class GenerarTablaDeMultiplicar {
    public static void main(String[] args) {

        int a = 7;
        int limite = 10;

        for(int i = 0; i <= limite; i++){
            System.out.println(a + " x "+ i+ " = "+(a * i));
        }
    }
}
