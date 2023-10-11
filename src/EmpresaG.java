import java.util.ArrayList;
import java.util.Scanner;
import java.io.*;


public class EmpresaG extends Empleadop {
    Scanner sc = new Scanner(System.in);
    private ArrayList<Gestion> empleados = new ArrayList<>();



    public void setIdDeEmpleado(String idDeEmpleado) {
        IdDeEmpleado = idDeEmpleado;
    }
    String bienvenida = "*** HOLA BIENVENIDO AL GESTOR DE TU EMPRESA ***";

    String opciones = """
            ¿Que deseas realizar?
            [1] Insertar un nuevo usuario
            [2] Consultar lista de empleados 
            [3] pasar usuarios a archivo de texto
            [4] Buscar usuario por ID
            [5] Salir
            """;

    String despedida = "Hasta pronto";
    public void menuP(){
        int opcion;
        while (true){
            System.out.println(bienvenida);
            System.out.println(opciones);
            opcion = sc.nextInt();
            sc.nextLine(); // Consumir el carácter de salto de línea

            switch (opcion) {
                case 1 -> creaE();
                case 2 -> consultaE();
                case 3 -> pasar_txt();
                case 4 -> buscarPorId();
                case 5 -> {
                    System.out.println(despedida);
                    return; // Salir del método menuP() y, por lo tanto, del bucle
                }
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
        cargo.toLowerCase();
        switch (cargo) {
            case "jefe" -> sueldo = JefeSueldo;
            case "subjefe" -> sueldo = subjefeSueldo;
            case "gerente" -> sueldo = gerenteSueldo;
            case "maquinista" -> sueldo = maquinistaSueldo;
            case "intendente" -> sueldo = intendenteSueldo;
        }

        Gestion E1 = new Gestion(nombre, sueldo, idGenerado, edad, cargo);

        empleados.add(E1);

        numero ++;
        menuP();
    }

    public void consultaE(){
        System.out.println("EL numero total de empleados es: "+ empleados.size());
        System.out.println(empleados);
        menuP();
    }

    public void pasar_txt(){
        try {
            //Abre el archivo para la escritura
            FileWriter archivo = new FileWriter("usuarios.txt");
            BufferedWriter escritor = new BufferedWriter(archivo);

            //Escribiendo dentro del archivo
            escritor.write(String.valueOf(empleados));

            //Cierra el archivo despues de su uso
            escritor.close();
            menuP();

        }catch (IOException e){
            System.out.println("No se pudo");
        }
    }

    public void buscarPorId() {
        System.out.println("Ingrese el Id del empleado");
        String IdABuscar = sc.nextLine();
        boolean encontrado = false;

        for (int i = 0; i < empleados.size(); i++) {
            if (empleados.get(i).getIdDeEmpleado().equals(IdABuscar)) {
                System.out.println("El empleado con ID " + IdABuscar + " es: " + empleados.get(i));
                encontrado = true;
                break; // Termina el bucle cuando se encuentra el empleado
            }
        }

        if (!encontrado) {
            System.out.println("No se encontró ningún empleado con ID " + IdABuscar);
        }
    }

}