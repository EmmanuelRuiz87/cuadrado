import java.util.Scanner;


public class Main {
    public static void main(String[] args){
        System.out.println("Calcula rectangulos 30000 (y cuadrados)"); //imprimir titulo

        Scanner myObj = new Scanner(System.in); //crear un objeto scanner

        try {
            System.out.println("Ingrese la primer medida del lado (número entero)");
            int lado1 = myObj.nextInt(); // leer input

            System.out.println("Ingrese la segunda medida del lado (número entero)");
            int lado2 = myObj.nextInt(); // leer input

            if (lado1 <= 0 || lado2 <= 0) {
                System.out.println("El valor de los lados deben ser mayores a 0");
            } else {
                int perimetro = lado1 * 2 + lado2 * 2;
                int area = lado1 * lado2;

                System.out.println("Lados ingresados: " + lado1 + ", " + lado2);
                System.out.println("Perimetro: " + perimetro);
                System.out.println("Área: " + area);
            }
        }
        catch (Exception e){
            System.out.println("Error. El valor debe ser entero");
        }
    }
}
