public class Gestion extends EmpresaG{
    public Gestion(String nombre,double sueldo,String IdDeEmpleado,int edad, String cargo){
        this.nombre = nombre;
        this.IdDeEmpleado = IdDeEmpleado;
        this.edad = edad;
        this.cargo = cargo;
        this.sueldo = sueldo;
    }

    public String getNombre(){
        return nombre;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public double getSueldo(){
        return sueldo;
    }

    public void setSueldo(double sueldo){
        this.sueldo = sueldo;
    }

    public String getIdDeEmpleado(){
        return IdDeEmpleado;
    }

    public void setIdDeEmpleado(String IdDeEmpleado){
        this.nombre = IdDeEmpleado;
    }

    public int getEdad(){
        return edad;
    }

    public void setEdad(int edad){
        this.edad = edad;
    }

    public String getCargo(){
        return cargo;
    }

    public void setCargo(String cargo){
        this.cargo = cargo;
    }


    @Override
    public String toString() {
        return"\n" +"=============================================" + "\n" +
                "edad: " + edad + "\n"+
                " nombre: " + nombre + "\n" +
                " tiempo En Empresa: " + tiempoEnEmpresa + "\n"+
                " cargo: " + cargo + "\n" +
                " sueldo: $" + sueldo + "\n"+
                " IdDeEmpleado: " +"#" + getIdDeEmpleado();
    }
}
