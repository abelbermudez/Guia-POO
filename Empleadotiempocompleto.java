public class Empleadotiempocompleto extends empleado {

    private double salarioAnual;

    public Empleadotiempocompleto(String nombre, String numIdentificacion, double salarioAnual) {
        super(nombre, numIdentificacion);
        this.salarioAnual = salarioAnual;
    }


    

    @Override
    public double calculosalario() {
        return salarioAnual/12;
    }



}
