package pk01;

public class Main {

    public static void main(String[] args) {

        Libro libro1 = new Libro("1984", "George", 5, 2);

        Libro libro2 = new Libro();
        libro2.setTitulo("El Principito");
        libro2.setAutor("Antoine");
        libro2.setEjemplares(3);
        libro2.setEjemplaresPrestados(1);

        System.out.println("inicio:");
        System.out.println(libro1);
        System.out.println(libro2);

        if (libro1.prestar()) {
            System.out.println("Se ha prestado un ejemplar de '1984'.");
        } else {
            System.out.println("No hay ejemplares disponibles de '1984'.");
        }

        if (libro2.devolver()) {
            System.out.println("Se ha devuelto un ejemplar de 'El Principito'.");
        } else {
            System.out.println("No hay ejemplares prestados de 'El Principito'.");
        }

        System.out.println("final:");
        System.out.println(libro1);
        System.out.println(libro2);
    }
}


