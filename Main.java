import java.util.Scanner;


public class Main {
    public static void main(String[] args){
        System.out.println("Calcula cuadrados 20000"); //imprimir titulo

        Scanner myObj = new Scanner(System.in); //crear un objeto scanner

        try {
            System.out.println("Ingrese la medida del lado del cuadrado (número entero)");
            int lado = myObj.nextInt(); // leer input

            if (lado <= 0) {
                System.out.println("El valor debe ser mayor a 0");
            } else {
                int perimetro = lado * 4;
                int area = lado * lado;

                System.out.println("Lado ingresado: " + lado);
                System.out.println("Perimetro: " + perimetro);
                System.out.println("Área: " + area);
            }
        }
        catch (Exception e){
            System.out.println("Error. El valor debe ser entero");
        }
    }
}
