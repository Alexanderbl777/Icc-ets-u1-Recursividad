public class App {

    public static void main(String[] args) throws Exception {

        int base = 2;
        int exp = 2;
        Ejercios ej = new Ejercios();
        System.out.print("Resultado del número base " + base + ", con el exponente " + exp + " = ");
        int totalEx = ej.resolverEx(base, exp);
        System.out.println(totalEx);

        int num1 = 5;
        System.out.println("Suma del último dígito con los primeros dígitos");
        System.out.println("Número menor a 10 -> num = " + num1);
        System.out.print("Total = ");
        int totalR = ej.ejercicioCon(num1);
        System.out.println(totalR);

        int num2 = 125;
        System.out.println("Suma del último dígito con los primeros -> num = " + num2);
        System.out.print("Total = ");
        int totalR1 = ej.ejercicioCon(num2);
        System.out.println(totalR1);

        int numD = 10;
        System.out.print("Número " + numD + " hasta llegar a 1 -> ");
        ej.imprimirDescendente(numD);

        int numUL = 1234;
        System.out.print("Número en reversa -> de " + numUL + " = ");
        int reversoResultado = ej.reverso(numUL);  
        System.out.println(reversoResultado);

        int num = 5;
        int resultadoFinal = factorial(num);
        System.out.println("Factorial de " + num + " es: " + resultadoFinal);

        int numFibo = 5;
        int resultadoFibo = ej.fibonasi(numFibo);
        System.out.println("Fibonacci de " + numFibo + " es: " + resultadoFibo);

        int numSuma = 5;
        int resultadoSuma = ej.sumaCons(numSuma);
        System.out.println("Suma consecutiva hasta " + numSuma + " es: " + resultadoSuma);
    }

    public static int factorial(int num) {
        if (num == 0) {
            return 1;
        }
        return num * factorial(num - 1); 
    
    }

    
}



