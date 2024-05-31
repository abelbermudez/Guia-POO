public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        empleado[] empleados = new empleado[2];

        empleados[0] = new Empleadotiempocompleto("juana", "123", 3000);
        empleados[1] = new Empleadomediotiempo("pedro","345",3000, 16);
        

      

        for (empleado empleado : empleados) {

            System.out.println("empleados: "+ empleado.getNombre() +"salario mensual: $" + empleado.calculosalario());
         }
    }
}
