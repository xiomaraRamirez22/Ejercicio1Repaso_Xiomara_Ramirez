package ejercicios;

public class NumeroArmstrong {
    public static void main(String[] args) {
//Potencia de 153  1(3) + 5(3) + 3(3) = 153

        int a = 153;
        int b = 1;
        int c = 5;
        int d = 3;
        int e = 3;
        int resultado1 = (int) Math.pow(b,e);
        int resultado2 = (int) Math.pow(c,e);
        int resultado3 = (int) Math.pow(d,e);
        int resultado = (resultado1 + resultado2 + resultado3);
        System.out.println("a: " + resultado);

    }
}
