public class Empleado extends Persona{

    private String tipoContrato;
    private int sueldo;

    public Empleado(String nombre, int edad, String tipoContrato, int sueldo) {
        super(nombre, edad);
        this.sueldo = sueldo;
        this.tipoContrato = tipoContrato;
    }


    public String getTipoContrato() {
        return tipoContrato;
    }

    public void setTipoContrato(String tipoContrato) {
        this.tipoContrato = tipoContrato;
    }

    public int getSueldo() {
        return sueldo;
    }

    public void setSueldo(int sueldo) {
        this.sueldo = sueldo;
    }
}
