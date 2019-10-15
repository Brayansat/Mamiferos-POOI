public class Personaje {

    private String nombre;

    private Integer codigo;
    

    public Personaje() {
    }

    public Personaje(String nombre, Integer codigo) {
        this.nombre = nombre;
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }
    
}
