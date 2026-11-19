import java.util.HashMap;
import java.util.Map;

public class FatorialTopDown {
    private static Map<Integer, Long> memo = new HashMap<>();

    public static long calcular(int n) {
        if (n == 0 || n == 1) return 1;
        if (memo.containsKey(n)) return memo.get(n);
        
        long resultado = n * calcular(n - 1);
        memo.put(n, resultado);
        return resultado;
    }
}