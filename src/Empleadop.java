import java.util.Random;

public class Empleadop {
    int edad;
    String nombre;
    int tiempoEnEmpresa;
    String cargo;
    double sueldo;
    String IdDeEmpleado;

    double JefeSueldo = 10000.00;

    double subjefeSueldo = 1000.00;

    double gerenteSueldo = 950.00;

    double maquinistaSueldo = 800.00;

    double intendenteSueldo = 400.00;

    int numero = 0;

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getTiempoEnEmpresa() {
        return tiempoEnEmpresa;
    }

    public void setTiempoEnEmpresa(int tiempoEnEmpresa) {
        this.tiempoEnEmpresa = tiempoEnEmpresa;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(float sueldo) {
        this.sueldo = sueldo;
    }


    public String Creaids(){
        Random rnd = new Random();
        String []letras = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "ñ", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};
        String []numeros = {"1","2","3","4","5","6","7","8","9","10"};
        String id = "";
        for (int i = 0; i < 3; i++) {
            int letra = rnd.nextInt(letras.length);
            String idsL = letras[letra];
            int idsN = rnd.nextInt(numeros.length);
            String nums = numeros[idsN];
            id = id.concat(idsL);
            id = id.concat(nums);
        }
        return id;
    }
}
