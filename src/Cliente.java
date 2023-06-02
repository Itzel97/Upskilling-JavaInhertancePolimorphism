public class Cliente extends Persona{

    private String categoria;
    private String codigo;

    public Cliente(String nombre, int edad, String categoria, String codigo
    ) {
        super(nombre, edad);
        this.categoria = categoria;
        this.codigo = codigo;
    }


    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = String.valueOf(codigo);
    }
}
