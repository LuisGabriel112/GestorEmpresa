//creacion de la clase
public class Persona{
    //creacion de los atributos o propiedades
    private String nombre;

    private String apellidos;

    private int edad;

//creacion de los constructores

    //constructor por defecto
    public Persona(){
        this.nombre = "Usuario";
        this.apellidos = "Apellidos del usuario";
        this.edad = 18;
    }


    //getters y setters

    public String getNombre() {
        return nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public int getEdad() {
        return edad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void saludar(){
        System.out.println("Hola "+ this.nombre);
    }
}