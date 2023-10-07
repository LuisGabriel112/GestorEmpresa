import java.util.ArrayList;
import java.util.Scanner;

public class EmpresaG extends Empleadop {
    Scanner sc = new Scanner(System.in);
    private ArrayList<Gestion> empleados = new ArrayList<>();



    private int Salario;



    public void setIdDeEmpleado(String idDeEmpleado) {
        IdDeEmpleado = idDeEmpleado;
    }
    String bienvenida = "*** HOLA BIENVENIDO AL GESTOR DE TU EMPRESA ***";

    String opciones = """
            ¿Que deseas realizar?
            [1] Insertar un nuevo usuario
            [2] Consultar lista de empleados 
            [3] Ir al panel de adminstrador
            [4] Salir
            """;

    String despedida = "Hasta pronto";
    public void menuP(){
        int encendedor = 1;
        int opcion;
        while (encendedor != 0){
            System.out.println(bienvenida);
            System.out.println(opciones);
            opcion = sc.nextInt();
            switch (opcion){
                case 1:
                    creaE();
                case 2:
                    consultaE();
                case 3:
                    System.out.println("Panel de Admin");
                    encendedor = 0;
                case 4:
                    //System.out.println(despedida);
                    encendedor = 0;
                    break;
            }
        }
    }

    public void creaE() {
        sc.nextLine();
        System.out.println("Ingrese el nombre del empleado");
        nombre = sc.nextLine();

        String idGenerado = Creaids();

        System.out.println("Su ID de empleado es: #" + idGenerado);
        setIdDeEmpleado(idGenerado);
        System.out.println("Ingrese su edad");
        edad = sc.nextInt();

        sc.nextLine();


        System.out.println("Cual sera su cargo?");
        cargo = sc.nextLine();

        Gestion E1 = new Gestion(nombre,idGenerado,edad,cargo);

        empleados.add(E1);

        numero ++;
        menuP();
    }

    public void consultaE(){
        System.out.println(empleados);
        menuP();
    }
}