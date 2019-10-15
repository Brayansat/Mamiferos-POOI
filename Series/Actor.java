public class Actor {

    private String nombre;

    private Integer codigo;

    private Personaje personaje;
    
    private Capitulo capitulo;

    public Actor() {
    }
    
    public Actor(String nombre, Integer codigo, Capitulo capitulo) {
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
