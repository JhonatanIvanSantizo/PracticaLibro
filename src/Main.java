import java.util.Scanner;
import libros.libro;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        libro libro1 = new libro();
        libro libro2 = new libro("Harry Potter","J. K. Rowling","Mr. John Rowling","Fantasía",264,290.00);
        System.out.println("Libro sin parametros:");
        libro1.imprimirDetalles();
        System.out.println("");
        System.out.println("Libro con parametros:");
        libro2.imprimirDetalles();
        System.out.println("");
        System.out.print("Actualizar precio del libro:");
        double precio = sc.nextDouble();
        libro2.actualizarPrecio(precio);
        libro2.imprimirDetalles();
    }
}