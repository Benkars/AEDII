package Prova;

public class P2 {
    public static int FazAlgo(int v[], int a, int b) {
        int x = -1, y = 0, z = b;
        while (y < z) {
            int w = (z + y) / 2;
            System.out.printf("%d, ", v[w]);
            if (a == v[w]) {
                x = w;
                return x;
            } else {
                if (a < v[w]) {
                    z = w - 1;
                } else {
                    y = w + 1;
                }
            }
        }
        return x;
    }
}