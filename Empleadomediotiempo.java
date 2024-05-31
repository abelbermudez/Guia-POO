public class Empleadomediotiempo extends empleado {

    private double salarioporhora;
    private  int horastrabajadasporsemana;

    public Empleadomediotiempo(String nombre, String numIdentificacion, double  salarioporhora, int horastrabajadasporsemana) {
        super(nombre, numIdentificacion);
        this.salarioporhora=salarioporhora;
        this.horastrabajadasporsemana = horastrabajadasporsemana;

    }
    

    @Override
    public  double calculosalario() {
        return salarioporhora = horastrabajadasporsemana * 4;//salario mensual
    }




}
