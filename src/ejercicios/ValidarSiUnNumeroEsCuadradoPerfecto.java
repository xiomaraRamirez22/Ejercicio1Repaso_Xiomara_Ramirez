package ejercicios;

public class ValidarSiUnNumeroEsCuadradoPerfecto {
    public static void main(String[] args) {

        int a = 64;
        double raiz = Math.sqrt(a);

        if(raiz == (int)raiz){
            System.out.println(a + " Es un cuadrado perfecto");
        }else{
            System.out.println(a + " No es un cuadrado perfecto");
        }
    }
}
