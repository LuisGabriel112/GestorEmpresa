import java.util.ArrayList;
import java.util.Scanner;

public class EmpresaG extends Empleadop {
    Scanner sc = new Scanner(System.in);
    private ArrayList<Gestion> empleados = new ArrayList<>();


    private int Salario;

    public void creaE() {
        System.out.println("Ingrese el nombre del empleado");
        nombre = sc.nextLine();

        System.out.println("Su ID de empleado es: #" + Creaids());
        IdDeEmpleado = Creaids();

        System.out.println("Ingrese su edad");
        edad = sc.nextInt();

        sc.nextLine();


        System.out.println("Cual sera su cargo?");
        cargo = sc.nextLine();

        Gestion E1 = new Gestion(nombre,IdDeEmpleado,edad,cargo);

        empleados.add(E1);
    }

    public void consultaE(){
        System.out.println("Dame un numero de empleado para consultar");
        int numEm = sc.nextInt();
        Gestion personaC =  empleados.get(numEm);
        System.out.println(personaC);
    }
}