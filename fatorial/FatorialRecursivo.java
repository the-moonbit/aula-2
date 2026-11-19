public class FatorialRecursivo {
    public static long calcularFatorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        return n * calcularFatorial(n - 1);
    }

    public static void main(String[] args) {
        System.out.println(calcularFatorial(3)); // Saída: 6
        System.out.println(calcularFatorial(7)); // Saída: 5040
    }
}