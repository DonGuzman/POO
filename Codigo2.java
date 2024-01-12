import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        //declaracion de variables a usar en el codigo
        int numen;
        double numdbl, res1, res2, res3, res4, res5, res6;

        //mensaje de bienvenida
        System.out.printf("Bienvenido, por favor siga las instrucciones\n");
        /*Mediante un mensaje de salida solicitamos al usuario que siga las
        instrucciones que se le dictan */

        Scanner scanner = new Scanner(System.in);
        /*mediante esta linea de codigo creamos el objeto scanner, mediante
        el cual podemos leer datos ingresados por consola */

        System.out.println("Ingrese un numero entero:");
        numen = scanner.nextInt();
        System.out.println("Digite un numero decimal:");
        numdbl = scanner.nextDouble();
        /*Mediante la linea 16 mandamos uno mensaje por consola, indicandole al usuario
        que ingrese un dato de tipo entero, y mediante la linea 17 asignamos el valor que
        el usuario desee ingresar, siendo numen la variable a la que asignamos el valor
        y mediante scanner.next indicamos que el valor siguiente sera el ingresado, ademas
        le indicamos a la maquina que tipo de dato es(Int para entero, Double para decimal)
         */

        //operaciones matematicas
        res1= numdbl+numen;
        res2= numen+(int)numdbl;
        res3= numen/numdbl;
        res4= numdbl/numen;
        res5= (double) (int) numdbl /numen;
        res6= (int)numdbl+numen;
        /*se realizan las operaciones basicas con los numeros ingresados por el usuario
        siendo guardadas en diferentes variables para no confundir los resultados
         */

        System.out.println("\nEl valor de la operacion es="+res1);
        System.out.println("El valor de la operacion es="+res2);
        System.out.println("El valor de la operacion es="+res3);
        System.out.println("El valor de la operacion es="+res4);
        System.out.println("El valor de la operacion es="+res5);
        System.out.println("El valor de la operacion es="+res6);
        //Impresion de los resultados de las operaciones
    }
}