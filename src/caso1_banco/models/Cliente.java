package caso1_banco.models;

public class Cliente {

    private String identificacion;
    private String nombres;
    private String apellidos;
    private String telefono;
    private String direccion;

    public Cliente() {
    }

    public Cliente(String identificacion, String nombres, String apellidos, String telefono, String direccion) {
        this.identificacion = identificacion;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.telefono = telefono;
        this.direccion = direccion;
    }

    public String getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }


    public String mostrarCliente() {
        return "===== DATOS DEL CLIENTE =====" +
                "\nIdentificación: " + identificacion +
                "\nNombres: " + nombres +
                "\nApellidos: " + apellidos +
                "\nTeléfono: " + telefono +
                "\nDirección: " + direccion;
    }


    @Override
    public String toString() {
        return "Cliente{" +
                "identificacion='" + identificacion + '\'' +
                ", nombres='" + nombres + '\'' +
                ", apellidos='" + apellidos + '\'' +
                ", telefono='" + telefono + '\'' +
                ", direccion='" + direccion + '\'' +
                '}';
    }
}