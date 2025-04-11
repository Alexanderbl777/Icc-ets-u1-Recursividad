public class Ejercios {
    
    public int fibonasi(int n) {
        if (n <= 1) {
            return n;
        }
        return fibonasi(n - 1) + fibonasi(n - 2);
    }

    public int sumaCons(int n) {
        if (n == 1) {
            return 1;
        }
        return n + sumaCons(n - 1);
    }

    public int resolverEx(int base, int exp) {
        if (exp == 0) {
            return 1;
        }
        return base * resolverEx(base, exp - 1);
    }

    public int ejercicioCon(int n) {
        if (n < 10) {
            return n;
        }
        int ultimoDigito = n % 10;
        int resto = n / 10;
        return ejercicioCon(resto) + ultimoDigito;
    }

    public void imprimirDescendente(int n) {
        if (n < 1) {
            return;
        }
        System.out.print(n + " ");
        imprimirDescendente(n - 1);
    }

    public int reverso(int n) {
        return reversoAux(n, 0);
    }

    private int reversoAux(int n, int invertido) {
        if (n == 0) {
            return invertido;
        }
        return reversoAux(n / 10, invertido * 10 + n % 10);
    }

}
