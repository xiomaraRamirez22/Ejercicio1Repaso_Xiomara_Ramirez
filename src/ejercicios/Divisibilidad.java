package ejercicios;

public class Divisibilidad {
    public static void main(String[] args) {

        int a =45;
        if (a % 2 == 0) {
            System.out.println(a + "es divisible por 2 ");
        }else{
                System.out.println(a + " No es divisible por 2 ");
            }
            if(a % 3 == 0){
                System.out.println(a + " No es divisible por 3");
            }
            if (a % 5 == 0){
                System.out.println(a + " Es divisible por 5");
            }else{
                System.out.println(a + " No es divisible por 5");
            }
        }

    }

