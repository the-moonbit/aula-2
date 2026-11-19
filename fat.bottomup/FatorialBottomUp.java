public class FatorialBottomUp {
    public static long calcular(int n) {
        if (n == 0 || n == 1) return 1;
        long[] tabela = new long[n + 1];
        tabela[0] = 1;
        tabela[1] = 1;

        for (int i = 2; i <= n; i++) {
            tabela[i] = i * tabela[i - 1];
        }
        return tabela[n];
    }
}