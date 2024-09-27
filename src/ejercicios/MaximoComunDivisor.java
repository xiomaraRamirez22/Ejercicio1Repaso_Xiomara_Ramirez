package ejercicios;

public class MaximoComunDivisor {
    public static void main(String[] args) {

        int a = 48;
        int b = 18;
        System.out.println("MCD(" + a + "," + b + ")=" + mcd(a, b));
    }
    public static int mcd(int a, int b){
        if(b == 0){
            return a;
        }else{
            return mcd(b,a % b);
        }
    }
}
