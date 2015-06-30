package examen;

/**
 * @author JoseVte
 * @version 1.0
 */

import java.util.Scanner;

public class Examen {

    public static int max3(int num1, int num2, int num3) {
        
        if(num1>num2 && num1>num2)
            return num1;
        else if (num2 > num3)
            return num2;
        else
            return num3;
    }

    public static int max5(int num1, int num2, int num3, int num4, int num5) {

        int max;
        max = num1;
        if (num2>max)
            max=num2;
        if (num3>max)
            max=num3;
        if (num4>max)
            max=num4;
        if (num5>max)
            max=num5;
        return max;
    }

    public static int min5(int num1, int num2, int num3, int num4, int num5) {

        int min;
        min = num1;
        if (num2<min)
            min=num2;
        if (num3<min)
            min=num3;
        if (num4<min)
            min=num4;
        if (num5<min)
            min=num5;
        return min;
    }

    public static int potencia(int base, int exponente) {
        
        int i, resultado;
        if(exponente==0)
            return 1;
        else{
            i = 0;
            resultado = 1;
            while (i<exponente){
                resultado = resultado * base;
                i = i + 1;
            }
            return resultado;
        }
    }

    public static int sumacifras(int num) {

        int resultado;
        resultado = 0;
        while(num>0){
            resultado = resultado + num%10;
            num=num/10;
        }
        return resultado;
    }
    /**
     * El siguiente método lo que hace es sumar todos los dígitos
     * hasta que solo aparezca uno, que sería tu número de la suerte
     * @param num
     * @return 
     */
    public static int numsuerte(int num) {

        int resultado;
        resultado = 0;
        while(num>9){
            resultado = 0;//Solución del error
            while(num>0){
                resultado = resultado + num%10;
                num=num/10;
            }
           num = resultado;
           
        }
        return num;
    }


    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int op, varaux, n1, n2, n3, n4, n5, base, exponente;

        do {
            do {
                System.out.println("Menu");
                System.out.println("1-Máximo de 3 números");
                System.out.println("2-Máximo de 5 números");
                System.out.println("3-Mínimo de 5 números");
                System.out.println("4-Potencia");
                System.out.println("5-Suma de cifras");
                System.out.println("6-Número de la suerte");
                System.out.println("7-Salir");
                op = teclado.nextInt();
            } while (op > 7 || op < 1);

            switch (op) {

                case 1:
                    System.out.println("Introduce el primer número");
                    n1 = teclado.nextInt();
                    System.out.println("Introduce el segundo número");
                    n2 = teclado.nextInt();
                    System.out.println("Introduce el tercer número");
                    n3 = teclado.nextInt();
                    varaux = Examen.max3(n1, n2, n3);
                    System.out.println("Máximo de tres números es: " + varaux);
                    break;
                case 2:
                    System.out.println("Introduce el primer número");
                    n1 = teclado.nextInt();
                    System.out.println("Introduce el segundo número");
                    n2 = teclado.nextInt();
                    System.out.println("Introduce el tercer número");
                    n3 = teclado.nextInt();
                    System.out.println("Introduce el cuarto número");
                    n4 = teclado.nextInt();
                    System.out.println("Introduce el quinto número");
                    n5 = teclado.nextInt();
                    varaux = Examen.max5(n1, n2, n3, n4, n5);
                    System.out.println("Máximo de cinco números es: " + varaux);
                    break;
                case 3:
                    System.out.println("Introduce el primer número");
                    n1 = teclado.nextInt();
                    System.out.println("Introduce el segundo número");
                    n2 = teclado.nextInt();
                    System.out.println("Introduce el tercer número");
                    n3 = teclado.nextInt();
                    System.out.println("Introduce el cuarto número");
                    n4 = teclado.nextInt();
                    System.out.println("Introduce el quinto número");
                    n5 = teclado.nextInt();
                    varaux = Examen.min5(n1, n2, n3, n4, n5);
                    System.out.println("Mínimo de cinco números es: " + varaux);
                    break;
                case 4:
                    System.out.println("Introduce la base");
                    base = teclado.nextInt();
                    System.out.println("Introduce el exponente");
                    exponente = teclado.nextInt();
                    varaux = Examen.potencia(base, exponente);
                    System.out.println("La potencia es: " + varaux);
                    break;
                case 5:
                    System.out.println("Introduce el número");
                    n1 = teclado.nextInt();
                    varaux = Examen.sumacifras(n1);
                    System.out.println("La suma de cifras es: " + varaux);
                    break;
                case 6:
                    System.out.println("Introduce el número");
                    n1 = teclado.nextInt();
                    varaux = Examen.numsuerte(n1);
                    System.out.println("El número de la suerte es: " + varaux);
                    break;
                case 7:
                    System.out.println("Hasta luego, Lucas");
                    break;

            }
System.out.println(" ");
        } while (op != 7);

    }
}
