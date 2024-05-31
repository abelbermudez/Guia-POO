abstract  class empleado {

    private  String nombre;
    private  String numIdentificacion;

    public empleado(String nombre, String numIdentificacion) {
        this.nombre = nombre;
        this.numIdentificacion = numIdentificacion;

    }

    public String getNombre() {
        return  nombre;
    }

    public String getNumIdentificacion() {
        return numIdentificacion;
    }

    //metodo abstracto
    public abstract double calculosalario(); 
}
