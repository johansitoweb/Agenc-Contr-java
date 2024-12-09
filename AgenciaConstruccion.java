import java.util.ArrayList;
import java.util.Scanner;

class Proyecto {
    String nombre;
    String descripcion;
    String fechaInicio;
    String fechaFin;

    Proyecto(String nombre, String descripcion, String fechaInicio, String fechaFin) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
    }
}

public class AgenciaConstruccion {
    static ArrayList<Proyecto> proyectos = new ArrayList<>();

    public static void agregarProyecto(String nombre, String descripcion, String fechaInicio, String fechaFin) {
        Proyecto proyecto = new Proyecto(nombre, descripcion, fechaInicio, fechaFin);
        proyectos.add(proyecto);
        System.out.println("Proyecto agregado exitosamente.");
    }

    public static void listarProyectos() {
        System.out.println("Lista de Proyectos:");
        for (int i = 0; i < proyectos.size(); i++) {
            Proyecto proyecto = proyectos.get(i);
            System.out.printf("%d. %s - %s (Inicio: %s, Fin: %s)%n", i + 1, proyecto.nombre, proyecto.descripcion, proyecto.fechaInicio, proyecto.fechaFin);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("1. Agregar Proyecto");
            System.out.println("2. Listar Proyectos");
            System.out.println("3. Salir");
            System.out.print("Seleccione una opción: ");
            int opcion = scanner.nextInt();
            scanner.nextLine();  // Consumir el salto de línea

            switch (opcion) {
                case 1:
                    System.out.print("Nombre del Proyecto: ");
                    String nombre = scanner.nextLine();
                    System.out.print("Descripción del Proyecto: ");
                    String descripcion = scanner.nextLine();
                    System.out.print("Fecha de Inicio (YYYY-MM-DD): ");
                    String fechaInicio = scanner.nextLine();
                    System.out.print("Fecha de Fin (YYYY-MM-DD): ");
                    String fechaFin = scanner.nextLine();
                    agregarProyecto(nombre, descripcion, fechaInicio, fechaFin);
                    break;
                case 2:
                    listarProyectos();
                    break;
                case 3:
                    System.out.println("Saliendo...");
                    return;
                default:
                    System.out.println("Opción no válida, por favor intente de nuevo.");
            }
        }
    }
}
