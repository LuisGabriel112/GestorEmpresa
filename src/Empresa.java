import java.util.ArrayList;
import java.util.Scanner;

public class Empresa extends Empleadop {
    Scanner sc = new Scanner(System.in);
    private ArrayList<String> empleados;

    private String Empleado;
    private int Salario;

    public Empresa(String nombreRecibido, String edadRecibida, String cargoRecibido) {
        this.nombre = nombreRecibido;
        this.edad = Integer.parseInt(edadRecibida);
        this.cargo = cargoRecibido;
    }


    public void agregarEmpleado(){
            System.out.println("¿Cual es el nombre del empleado?");
            nombre = sc.nextLine();

            System.out.println("¿Cual es su edad?");
            edad = Integer.parseInt(sc.nextLine());
            String edadS = String.valueOf(Integer.parseInt(String.valueOf(edad)));

            System.out.println("¿En que cargo entrara?");
            cargo = sc.nextLine();

    }


    //private int cantidadDeEmpleados = empleados.length;
}
